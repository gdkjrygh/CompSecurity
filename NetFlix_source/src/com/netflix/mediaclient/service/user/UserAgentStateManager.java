// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.content.Context;
import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.CallbackEvent;
import com.netflix.mediaclient.javabridge.ui.ActivationTokens;
import com.netflix.mediaclient.javabridge.ui.Callback;
import com.netflix.mediaclient.javabridge.ui.DeviceAccount;
import com.netflix.mediaclient.javabridge.ui.Registration;
import com.netflix.mediaclient.javabridge.ui.android.registration.CreateAccountCompleteCommand;
import com.netflix.mediaclient.javabridge.ui.android.registration.DeactivateCompleteCommand;
import com.netflix.mediaclient.javabridge.ui.android.registration.SelectedAccountCompleteCommand;
import com.netflix.mediaclient.service.configuration.drm.DrmManager;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserBoundCookies;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserProfileMap

public class UserAgentStateManager
    implements Callback
{
    static final class STATES extends Enum
    {

        private static final STATES $VALUES[];
        public static final STATES FATAL_ERROR;
        public static final STATES INIT;
        public static final STATES NEED_ACTIVATE_PROFILE;
        public static final STATES NEED_CHANGE_PROFILE;
        public static final STATES NEED_CHANGE_PROFILE_FROM_PRIMARY;
        public static final STATES NEED_CREATE_DEVACC;
        public static final STATES NEED_DEACTIVATE_ACC;
        public static final STATES NEED_EMAIL_ACTIVATE;
        public static final STATES NEED_ESN_MIGRATION;
        public static final STATES NEED_FETCH_PROFILE_DATA;
        public static final STATES NEED_SELECT_DEVACC;
        public static final STATES NEED_TOKEN_ACTIVATE;
        public static final STATES NEED_VALIDATE_PROFILE_DATA;
        public static final STATES PROFILE_ACTIVATED;
        public static final STATES WAIT_ACTIVATE_ACC;
        public static final STATES WAIT_SELECT_PROFILE;

        public static STATES valueOf(String s)
        {
            return (STATES)Enum.valueOf(com/netflix/mediaclient/service/user/UserAgentStateManager$STATES, s);
        }

        public static STATES[] values()
        {
            return (STATES[])$VALUES.clone();
        }

        static 
        {
            INIT = new STATES("INIT", 0);
            NEED_CREATE_DEVACC = new STATES("NEED_CREATE_DEVACC", 1);
            NEED_SELECT_DEVACC = new STATES("NEED_SELECT_DEVACC", 2);
            NEED_ESN_MIGRATION = new STATES("NEED_ESN_MIGRATION", 3);
            NEED_DEACTIVATE_ACC = new STATES("NEED_DEACTIVATE_ACC", 4);
            WAIT_ACTIVATE_ACC = new STATES("WAIT_ACTIVATE_ACC", 5);
            NEED_EMAIL_ACTIVATE = new STATES("NEED_EMAIL_ACTIVATE", 6);
            NEED_TOKEN_ACTIVATE = new STATES("NEED_TOKEN_ACTIVATE", 7);
            NEED_ACTIVATE_PROFILE = new STATES("NEED_ACTIVATE_PROFILE", 8);
            NEED_FETCH_PROFILE_DATA = new STATES("NEED_FETCH_PROFILE_DATA", 9);
            WAIT_SELECT_PROFILE = new STATES("WAIT_SELECT_PROFILE", 10);
            NEED_CHANGE_PROFILE = new STATES("NEED_CHANGE_PROFILE", 11);
            NEED_CHANGE_PROFILE_FROM_PRIMARY = new STATES("NEED_CHANGE_PROFILE_FROM_PRIMARY", 12);
            PROFILE_ACTIVATED = new STATES("PROFILE_ACTIVATED", 13);
            NEED_VALIDATE_PROFILE_DATA = new STATES("NEED_VALIDATE_PROFILE_DATA", 14);
            FATAL_ERROR = new STATES("FATAL_ERROR", 15);
            $VALUES = (new STATES[] {
                INIT, NEED_CREATE_DEVACC, NEED_SELECT_DEVACC, NEED_ESN_MIGRATION, NEED_DEACTIVATE_ACC, WAIT_ACTIVATE_ACC, NEED_EMAIL_ACTIVATE, NEED_TOKEN_ACTIVATE, NEED_ACTIVATE_PROFILE, NEED_FETCH_PROFILE_DATA, 
                WAIT_SELECT_PROFILE, NEED_CHANGE_PROFILE, NEED_CHANGE_PROFILE_FROM_PRIMARY, PROFILE_ACTIVATED, NEED_VALIDATE_PROFILE_DATA, FATAL_ERROR
            });
        }

        private STATES(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface StateManagerCallback
    {

        public abstract void fetchAccountData();

        public abstract void initialized(int i);

        public abstract void profileActivated(String s, DeviceAccount deviceaccount);

        public abstract void profileInactive();

        public abstract void readyToSelectProfile();

        public abstract void selectProfileResult(int i);

        public abstract void switchWebUserProfile(String s);

        public abstract void userAccountActivated(DeviceAccount deviceaccount);

        public abstract void userAccountDataResult(int i);

        public abstract void userAccountDeactivated();

        public abstract void userAccountInactive();
    }


    private static final String TAG = "nf_service_useragentstate";
    private DeviceAccount mCurrentDeviceAcc;
    private String mEmail;
    private ErrorLogging mErrorLogger;
    private boolean mInitilizationCompleted;
    private boolean mNeedLogout;
    private String mPassword;
    private final int mPrimaryAccountIndex = 0;
    private String mProfileId;
    private final UserProfileMap mProfileMap;
    private final Registration mRegistration;
    private STATES mState;
    private ActivationTokens mToken;
    private final StateManagerCallback mUserAgent;

    UserAgentStateManager(Registration registration, DrmManager drmmanager, StateManagerCallback statemanagercallback, Context context, ErrorLogging errorlogging)
    {
        mState = STATES.INIT;
        mRegistration = registration;
        mUserAgent = statemanagercallback;
        mProfileMap = new UserProfileMap(context);
        mErrorLogger = errorlogging;
        mInitilizationCompleted = false;
    }

    private void cleanupAfterDeactivation()
    {
        mUserAgent.userAccountInactive();
        mRegistration.deactivateAll(this);
        mUserAgent.userAccountDeactivated();
        mProfileMap.clear();
        transitionTo(STATES.INIT);
    }

    private void deviceAccountCreated(boolean flag, String s)
    {
label0:
        {
            Log.d("nf_service_useragentstate", "@event deviceAccountCreated");
            synchronized (mState)
            {
                if (validateState(STATES.NEED_CREATE_DEVACC, "deviceAccountCreated"))
                {
                    break label0;
                }
            }
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        mCurrentDeviceAcc = getAccountWithKey(mRegistration.getDeviceAccounts(), s);
        if (mCurrentDeviceAcc == null) goto _L2; else goto _L1
_L1:
        transitionTo(STATES.NEED_SELECT_DEVACC);
_L3:
        states;
        JVM INSTR monitorexit ;
        return;
        s;
        states;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        transitionTo(STATES.FATAL_ERROR);
          goto _L3
        transitionTo(STATES.FATAL_ERROR);
          goto _L3
    }

    private void deviceAccountDeactivated(boolean flag)
    {
        Log.d("nf_service_useragentstate", "@event deviceAccountDeactivated");
        STATES states = mState;
        states;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        transitionTo(STATES.NEED_DEACTIVATE_ACC);
_L2:
        states;
        JVM INSTR monitorexit ;
        return;
        cleanupAfterDeactivation();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        states;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void deviceAccountSelected(boolean flag)
    {
label0:
        {
            Log.d("nf_service_useragentstate", "@event deviceAccountSelected");
            synchronized (mState)
            {
                if (validateState(STATES.NEED_SELECT_DEVACC, "deviceAccountSelected"))
                {
                    break label0;
                }
            }
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        hasDeviceAccount();
_L1:
        states;
        JVM INSTR monitorexit ;
        return;
        exception;
        states;
        JVM INSTR monitorexit ;
        throw exception;
        transitionTo(STATES.FATAL_ERROR);
          goto _L1
    }

    private boolean fallbackToPrimaryAccount()
    {
        Log.d("nf_service_useragentstate", "fallbackToPrimaryAccount");
        Object obj = mProfileMap.getPrimaryAccountKey();
        DeviceAccount adeviceaccount[];
        if (!StringUtils.isEmpty(((String) (obj))))
        {
            if ((adeviceaccount = mRegistration.getDeviceAccounts()).length != 0 && (obj = getAccountWithKey(adeviceaccount, ((String) (obj)))) != null)
            {
                mCurrentDeviceAcc = ((DeviceAccount) (obj));
                mProfileId = null;
                transitionTo(STATES.NEED_SELECT_DEVACC);
                return true;
            }
        }
        return false;
    }

    private DeviceAccount getAccountWithKey(DeviceAccount adeviceaccount[], String s)
    {
        int j = adeviceaccount.length;
        for (int i = 0; i < j; i++)
        {
            DeviceAccount deviceaccount = adeviceaccount[i];
            if (deviceaccount.getAccountKey().equals(s))
            {
                return deviceaccount;
            }
        }

        return null;
    }

    private DeviceAccount getNextAccountToDeactivate()
    {
        DeviceAccount adeviceaccount[] = mRegistration.getDeviceAccounts();
        if (adeviceaccount.length == 0)
        {
            return null;
        } else
        {
            return adeviceaccount[adeviceaccount.length - 1];
        }
    }

    private void hasDeviceAccount()
    {
        if (mRegistration.isRegistered())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        mNeedLogout = false;
        mProfileMap.clearEsnMigrationForCurrentAccount();
        if (isProfileIdValid()) goto _L2; else goto _L1
_L1:
        transitionTo(STATES.WAIT_ACTIVATE_ACC);
_L4:
        return;
_L2:
        if (mToken != null)
        {
            transitionTo(STATES.NEED_ACTIVATE_PROFILE);
            return;
        }
        if (fallbackToPrimaryAccount()) goto _L4; else goto _L3
_L3:
        transitionTo(STATES.FATAL_ERROR);
        return;
        if (mProfileMap.isCurrentAccountNeedEsnMigration())
        {
            mProfileMap.clearEsnMigrationForCurrentAccount();
            if (!isProfileIdValid())
            {
                transitionTo(STATES.NEED_ESN_MIGRATION);
                return;
            }
            if (mToken != null)
            {
                transitionTo(STATES.NEED_ACTIVATE_PROFILE);
                return;
            } else
            {
                transitionTo(STATES.NEED_ESN_MIGRATION);
                return;
            }
        }
        if (mNeedLogout)
        {
            transitionTo(STATES.NEED_DEACTIVATE_ACC);
            mNeedLogout = false;
            return;
        }
        if (!isProfileIdValid())
        {
            transitionTo(STATES.NEED_FETCH_PROFILE_DATA);
            return;
        } else
        {
            transitionTo(STATES.NEED_VALIDATE_PROFILE_DATA);
            return;
        }
    }

    private void init()
    {
        Log.d("nf_service_useragentstate", "@init");
        STATES states = mState;
        states;
        JVM INSTR monitorenter ;
        Object obj;
        mProfileId = null;
        mCurrentDeviceAcc = null;
        obj = mRegistration.getCurrentDeviceAccount();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Log.d("nf_service_useragentstate", "@init has currentDeviceAccount");
        mCurrentDeviceAcc = ((DeviceAccount) (obj));
        hasDeviceAccount();
_L3:
        states;
        JVM INSTR monitorexit ;
        return;
_L2:
        DeviceAccount adeviceaccount[];
        mProfileId = (String)mProfileMap.getCurrentProfileIdAndKey().first;
        obj = (String)mProfileMap.getCurrentProfileIdAndKey().second;
        if (Log.isLoggable("nf_service_useragentstate", 3))
        {
            Log.d("nf_service_useragentstate", (new StringBuilder()).append("@init get from map [").append(mProfileId).append("] with key[").append(((String) (obj))).append("]").toString());
        }
        adeviceaccount = mRegistration.getDeviceAccounts();
        if (adeviceaccount.length != 0)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (StringUtils.isNotEmpty(((String) (obj))))
        {
            Log.w("nf_service_useragentstate", (new StringBuilder()).append("@init no device account but has current account key ").append(((String) (obj))).toString());
        }
        transitionTo(STATES.NEED_CREATE_DEVACC);
        states;
        JVM INSTR monitorexit ;
        return;
        obj;
        states;
        JVM INSTR monitorexit ;
        throw obj;
        if (StringUtils.isNotEmpty(((String) (obj))))
        {
            mCurrentDeviceAcc = getAccountWithKey(adeviceaccount, ((String) (obj)));
        }
        if (mCurrentDeviceAcc == null)
        {
            mCurrentDeviceAcc = adeviceaccount[0];
        }
        transitionTo(STATES.NEED_SELECT_DEVACC);
          goto _L3
    }

    private boolean isCurrentProfileValid(List list)
    {
        if (StringUtils.isEmpty(mProfileId))
        {
            Log.w("nf_service_useragentstate", "isCurrentProfileValid but mProfileId is null");
            return true;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            UserProfile userprofile = (UserProfile)list.next();
            if (mProfileId.equals(userprofile.getProfileId()))
            {
                return true;
            }
        }

        return false;
    }

    private boolean isProfileIdValid()
    {
        return StringUtils.isNotEmpty(mProfileId);
    }

    private void setNetflixIdToNrdpAccount(String s, String s1)
    {
        if (!StringUtils.isNotEmpty(s) || !StringUtils.isNotEmpty(s1)) goto _L2; else goto _L1
_L1:
        s = new ActivationTokens(s, s1);
        mRegistration.setActivationTokens(s);
_L7:
        return;
        s;
        Log.w("nf_service_useragentstate", "setNetflixIdToNrdpAccount failed will fallback thru primary account");
_L5:
        if (!fallbackToPrimaryAccount())
        {
            transitionTo(STATES.FATAL_ERROR);
            return;
        }
          goto _L3
_L2:
        Log.w("nf_service_useragentstate", "setNetflixIdToNrdpAccount has null NetflixId, will fallback thru primary account");
        if (true) goto _L5; else goto _L4
_L4:
_L3:
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void signalInitilizationCompleted()
    {
        if (!mInitilizationCompleted)
        {
            mUserAgent.initialized(0);
            mInitilizationCompleted = true;
        }
    }

    private void transitionTo(STATES states)
    {
        STATES states1;
        states1 = mState;
        mState = states;
        static class _cls1
        {

            static final int $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[];

            static 
            {
                $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES = new int[STATES.values().length];
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.INIT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_ACTIVATE_PROFILE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_CHANGE_PROFILE_FROM_PRIMARY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_CHANGE_PROFILE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_CREATE_DEVACC.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_DEACTIVATE_ACC.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_EMAIL_ACTIVATE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_ESN_MIGRATION.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_FETCH_PROFILE_DATA.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_SELECT_DEVACC.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_TOKEN_ACTIVATE.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.NEED_VALIDATE_PROFILE_DATA.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.PROFILE_ACTIVATED.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.WAIT_ACTIVATE_ACC.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.WAIT_SELECT_PROFILE.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[STATES.FATAL_ERROR.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.netflix.mediaclient.service.user.UserAgentStateManager.STATES[states.ordinal()];
        JVM INSTR tableswitch 1 16: default 96
    //                   1 106
    //                   2 120
    //                   3 155
    //                   4 178
    //                   5 231
    //                   6 269
    //                   7 304
    //                   8 338
    //                   9 364
    //                   10 396
    //                   11 438
    //                   12 473
    //                   13 505
    //                   14 536
    //                   15 550
    //                   16 573;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
        Log.d("nf_service_useragentstate", "@state default");
_L19:
        return;
_L2:
        Log.d("nf_service_useragentstate", "@state INIT");
        init();
        return;
_L3:
        Log.d("nf_service_useragentstate", "@state NEED_ACTIVATE_PROFILE");
        if (mRegistration != null)
        {
            mRegistration.tokenActivate(mToken);
        }
        mToken = null;
        return;
_L4:
        Log.d("nf_service_useragentstate", "@state NEED_CHANGE_PROFILE_FROM_PRIMARY");
        mUserAgent.switchWebUserProfile(mProfileId);
        return;
_L5:
        Log.d("nf_service_useragentstate", "@state NEED_CHANGE_PROFILE");
        if (mCurrentDeviceAcc != null)
        {
            mRegistration.deactivate(mCurrentDeviceAcc, null);
        }
        mUserAgent.profileInactive();
        mUserAgent.switchWebUserProfile(mProfileId);
        return;
_L6:
        Log.d("nf_service_useragentstate", "@state NEED_CREATE_DEVACC");
        mUserAgent.profileInactive();
        mUserAgent.userAccountInactive();
        mRegistration.createDeviceAccount(this);
        return;
_L7:
        Log.d("nf_service_useragentstate", "@state NEED_DEACTIVATE_ACC");
        states = getNextAccountToDeactivate();
        if (states != null)
        {
            mRegistration.deactivate(states, this);
            return;
        } else
        {
            cleanupAfterDeactivation();
            return;
        }
_L8:
        Log.d("nf_service_useragentstate", "@state NEED_EMAIL_ACTIVATE");
        if (mRegistration == null) goto _L19; else goto _L18
_L18:
        mRegistration.emailActivate(mEmail, mPassword);
        return;
_L9:
        Log.d("nf_service_useragentstate", "@state NEED_ESN_MIGRATION");
        if (mRegistration == null) goto _L19; else goto _L20
_L20:
        mRegistration.esnMigration();
        return;
_L10:
        Log.d("nf_service_useragentstate", "@state NEED_FETCH_PROFILE_DATA");
        mUserAgent.userAccountActivated(mCurrentDeviceAcc);
        mUserAgent.fetchAccountData();
        return;
_L11:
        Log.d("nf_service_useragentstate", "@state NEED_SELECT_DEVACC");
        mProfileMap.setCurrentAccount(mProfileId, mCurrentDeviceAcc.getAccountKey());
        mRegistration.selectDeviceAccount(mCurrentDeviceAcc, this);
        return;
_L12:
        Log.d("nf_service_useragentstate", "@state NEED_TOKEN_ACTIVATE");
        if (mRegistration != null)
        {
            mRegistration.tokenActivate(mToken);
        }
        mToken = null;
        return;
_L13:
        Log.d("nf_service_useragentstate", "@state NEED_VALIDATE_PROFILE_DATA");
        mUserAgent.userAccountActivated(mCurrentDeviceAcc);
        mUserAgent.fetchAccountData();
        return;
_L14:
        Log.d("nf_service_useragentstate", "@state PROFILE_ACTIVATED");
        mUserAgent.profileActivated(mProfileId, mCurrentDeviceAcc);
        signalInitilizationCompleted();
        return;
_L15:
        Log.d("nf_service_useragentstate", "@state WAIT_ACTIVATE_ACC");
        signalInitilizationCompleted();
        return;
_L16:
        Log.d("nf_service_useragentstate", "@state WAIT_SELECT_PROFILE");
        signalInitilizationCompleted();
        mUserAgent.readyToSelectProfile();
        return;
_L17:
        Log.d("nf_service_useragentstate", "@state FATAL_ERROR");
        mErrorLogger.logHandledException((new StringBuilder()).append("FATAL_ERROR in user agent state - prev state: ").append(states1).toString());
        transitionTo(STATES.NEED_DEACTIVATE_ACC);
        return;
    }

    private boolean validateState(STATES states, String s)
    {
        if (mState == states)
        {
            if (Log.isLoggable("nf_service_useragentstate", 3))
            {
                Log.d("nf_service_useragentstate", (new StringBuilder()).append(s).append(" in expected state").toString());
            }
            return true;
        } else
        {
            return false;
        }
    }

    void accountDataFetchFailed(int i, boolean flag)
    {
        Log.d("nf_service_useragentstate", "@event profileDataFetchFailed");
        STATES states = mState;
        states;
        JVM INSTR monitorenter ;
        if (!validateState(STATES.NEED_FETCH_PROFILE_DATA, "accountDataFetchFailed") || flag) goto _L2; else goto _L1
_L1:
        mUserAgent.userAccountDataResult(i);
_L5:
        if (i != -61) goto _L4; else goto _L3
_L3:
        if (!isProfileIdValid() || !fallbackToPrimaryAccount())
        {
            transitionTo(STATES.FATAL_ERROR);
        }
_L8:
        states;
        JVM INSTR monitorexit ;
        return;
_L2:
        mUserAgent.userAccountDataResult(0);
          goto _L5
        Exception exception;
        exception;
        states;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        if (!validateState(STATES.NEED_FETCH_PROFILE_DATA, "accountDataFetchFailed")) goto _L7; else goto _L6
_L6:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        transitionTo(STATES.WAIT_SELECT_PROFILE);
          goto _L8
        transitionTo(STATES.FATAL_ERROR);
          goto _L8
_L7:
        if (!validateState(STATES.NEED_VALIDATE_PROFILE_DATA, "accountDataFetchFailed")) goto _L8; else goto _L9
_L9:
        transitionTo(STATES.PROFILE_ACTIVATED);
          goto _L8
    }

    void accountDataFetched(AccountData accountdata)
    {
        Log.d("nf_service_useragentstate", "@event accountDataFetched");
        STATES states = mState;
        states;
        JVM INSTR monitorenter ;
        mUserAgent.userAccountDataResult(0);
        if (!validateState(STATES.NEED_FETCH_PROFILE_DATA, "accountDataFetched")) goto _L2; else goto _L1
_L1:
        transitionTo(STATES.WAIT_SELECT_PROFILE);
_L4:
        return;
_L2:
        if (!validateState(STATES.NEED_VALIDATE_PROFILE_DATA, "accountDataFetched")) goto _L4; else goto _L3
_L3:
        if (!isCurrentProfileValid(accountdata.getUserProfiles())) goto _L6; else goto _L5
_L5:
        transitionTo(STATES.PROFILE_ACTIVATED);
          goto _L4
        accountdata;
        states;
        JVM INSTR monitorexit ;
        throw accountdata;
_L6:
        if (fallbackToPrimaryAccount()) goto _L4; else goto _L7
_L7:
        transitionTo(STATES.FATAL_ERROR);
          goto _L4
    }

    void accountOrProfileActivated(boolean flag, String s, String s1)
    {
label0:
        {
            Log.d("nf_service_useragentstate", "@event accountOrProfileActivated");
            synchronized (mState)
            {
                if (validateState(STATES.NEED_TOKEN_ACTIVATE, "accountOrProfileActivated") || validateState(STATES.NEED_EMAIL_ACTIVATE, "accountOrProfileActivated") || validateState(STATES.NEED_ACTIVATE_PROFILE, "accountOrProfileActivated") || validateState(STATES.NEED_ESN_MIGRATION, "accountOrProfileActivated"))
                {
                    break label0;
                }
                Log.d("nf_service_useragentstate", "@event accountOrProfileActivated not expected, ignored");
            }
            return;
        }
        boolean flag1;
        if (StringUtils.isNotEmpty(s) && StringUtils.isNotEmpty(s1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        mCurrentDeviceAcc.setNetflixId(s);
        mCurrentDeviceAcc.setSecureId(s1);
        setNetflixIdToNrdpAccount(s, s1);
        if (!validateState(STATES.NEED_TOKEN_ACTIVATE, "accountOrProfileActivated") && !validateState(STATES.NEED_EMAIL_ACTIVATE, "accountOrProfileActivated")) goto _L4; else goto _L3
_L3:
        transitionTo(STATES.NEED_FETCH_PROFILE_DATA);
_L7:
        states;
        JVM INSTR monitorexit ;
        return;
        s;
        states;
        JVM INSTR monitorexit ;
        throw s;
_L4:
        if (!validateState(STATES.NEED_ACTIVATE_PROFILE, "accountOrProfileActivated")) goto _L6; else goto _L5
_L5:
        transitionTo(STATES.PROFILE_ACTIVATED);
          goto _L7
_L6:
        if (!validateState(STATES.NEED_ESN_MIGRATION, "accountOrProfileActivated")) goto _L7; else goto _L8
_L8:
        if (!isProfileIdValid())
        {
            break MISSING_BLOCK_LABEL_233;
        }
        transitionTo(STATES.PROFILE_ACTIVATED);
          goto _L7
        transitionTo(STATES.NEED_FETCH_PROFILE_DATA);
          goto _L7
_L2:
label1:
        {
            if (isProfileIdValid())
            {
                break label1;
            }
            transitionTo(STATES.WAIT_ACTIVATE_ACC);
        }
          goto _L7
        mUserAgent.selectProfileResult(-4);
        if (!fallbackToPrimaryAccount())
        {
            transitionTo(STATES.FATAL_ERROR);
        }
          goto _L7
    }

    public boolean activateAccByEmailPassword(String s, String s1)
    {
label0:
        {
            Log.d("nf_service_useragentstate", "@event activateAccByEmailPassword");
            synchronized (mState)
            {
                if (validateState(STATES.WAIT_ACTIVATE_ACC, "activateAccByEmailPassword"))
                {
                    break label0;
                }
            }
            return false;
        }
        mEmail = s;
        mPassword = s1;
        transitionTo(STATES.NEED_EMAIL_ACTIVATE);
        states;
        JVM INSTR monitorexit ;
        return true;
        s;
        states;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean activateAccByToken(ActivationTokens activationtokens)
    {
label0:
        {
            Log.d("nf_service_useragentstate", "@event activateAccByToken");
            synchronized (mState)
            {
                if (validateState(STATES.WAIT_ACTIVATE_ACC, "activateAccByToken"))
                {
                    break label0;
                }
            }
            return false;
        }
        mToken = activationtokens;
        transitionTo(STATES.NEED_TOKEN_ACTIVATE);
        states;
        JVM INSTR monitorexit ;
        return true;
        activationtokens;
        states;
        JVM INSTR monitorexit ;
        throw activationtokens;
    }

    public void done(CallbackEvent callbackevent)
    {
        Log.d("nf_service_useragentstate", (new StringBuilder()).append("account related callback ").append(callbackevent.toString()).toString());
        if (!(callbackevent instanceof CreateAccountCompleteCommand))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        Log.d("nf_service_useragentstate", "Received CreateAccountComplete callback");
        callbackevent = new CreateAccountCompleteCommand(callbackevent.getData());
        deviceAccountCreated(callbackevent.isCreatedSuccess(), String.valueOf(callbackevent.getKey()));
_L1:
        return;
        callbackevent;
        Log.e("nf_service_useragentstate", (new StringBuilder()).append("CreateAccount error ").append(callbackevent).toString());
        deviceAccountCreated(false, "");
        return;
        if (callbackevent instanceof SelectedAccountCompleteCommand)
        {
            Log.d("nf_service_useragentstate", "Received SelectedAccount callback");
            try
            {
                deviceAccountSelected((new SelectedAccountCompleteCommand(callbackevent.getData())).isSelectedSuccess());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CallbackEvent callbackevent)
            {
                Log.e("nf_service_useragentstate", (new StringBuilder()).append("SelectedAccount error ").append(callbackevent).toString());
            }
            deviceAccountSelected(false);
            return;
        }
        if (callbackevent instanceof DeactivateCompleteCommand)
        {
            Log.d("nf_service_useragentstate", "Received deactivate complete cmd");
            deviceAccountDeactivated(true);
            return;
        }
          goto _L1
    }

    public void initialize(boolean flag, boolean flag1)
    {
        mNeedLogout = flag;
        if (flag1)
        {
            mProfileMap.markAllAccountForEsnMigration();
        }
        init();
    }

    void profileSwitched(UserBoundCookies userboundcookies)
    {
        Log.d("nf_service_useragentstate", "@event profileSwitched");
        STATES states = mState;
        states;
        JVM INSTR monitorenter ;
        mToken = new ActivationTokens(userboundcookies.getUserBoundNetflixId(), userboundcookies.getUserBoundSecureNetflixId());
        mUserAgent.selectProfileResult(0);
        userboundcookies = mProfileMap.getAcccountKeyFromProfileId(mProfileId);
        if (StringUtils.isNotEmpty(userboundcookies))
        {
            mCurrentDeviceAcc = getAccountWithKey(mRegistration.getDeviceAccounts(), userboundcookies);
        }
        if (mCurrentDeviceAcc == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        transitionTo(STATES.NEED_SELECT_DEVACC);
_L1:
        return;
        JSONException jsonexception;
        jsonexception;
        Log.e("nf_service_useragentstate", (new StringBuilder()).append("profileSwitched failed with userBoundCookies ").append(userboundcookies).toString());
        mUserAgent.selectProfileResult(-2);
        if (!fallbackToPrimaryAccount())
        {
            transitionTo(STATES.FATAL_ERROR);
        }
        states;
        JVM INSTR monitorexit ;
        return;
        userboundcookies;
        states;
        JVM INSTR monitorexit ;
        throw userboundcookies;
        transitionTo(STATES.NEED_CREATE_DEVACC);
          goto _L1
    }

    void profileSwitchedFailed(int i)
    {
        STATES states = mState;
        states;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("nf_service_useragentstate", 2))
        {
            Log.v("nf_service_useragentstate", (new StringBuilder()).append("profileSwitchFailed, status: ").append(i).append(", state: ").append(mState).toString());
        }
        mUserAgent.selectProfileResult(i);
        if (i != -61) goto _L2; else goto _L1
_L1:
        if (!fallbackToPrimaryAccount())
        {
            transitionTo(STATES.FATAL_ERROR);
        }
_L3:
        states;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (i != -3)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        transitionTo(STATES.WAIT_SELECT_PROFILE);
          goto _L3
        Exception exception;
        exception;
        states;
        JVM INSTR monitorexit ;
        throw exception;
        if (!validateState(STATES.NEED_CHANGE_PROFILE_FROM_PRIMARY, "profileSwitchedFailed")) goto _L5; else goto _L4
_L4:
        if (!fallbackToPrimaryAccount())
        {
            transitionTo(STATES.FATAL_ERROR);
        }
          goto _L3
_L5:
        if (fallbackToPrimaryAccount()) goto _L3; else goto _L6
_L6:
        transitionTo(STATES.FATAL_ERROR);
          goto _L3
    }

    public void selectNewProfile(String s)
    {
label0:
        {
            Log.d("nf_service_useragentstate", "@event selectNewProfile");
            synchronized (mState)
            {
                if (validateState(STATES.WAIT_SELECT_PROFILE, "selectNewProfile") || validateState(STATES.PROFILE_ACTIVATED, "selectNewProfile"))
                {
                    break label0;
                }
            }
            return;
        }
        if (!isProfileIdValid())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        mCurrentDeviceAcc = null;
        mProfileId = s;
        transitionTo(STATES.NEED_CHANGE_PROFILE);
_L1:
        states;
        JVM INSTR monitorexit ;
        return;
        s;
        states;
        JVM INSTR monitorexit ;
        throw s;
        mCurrentDeviceAcc = null;
        mProfileId = s;
        transitionTo(STATES.NEED_CHANGE_PROFILE_FROM_PRIMARY);
          goto _L1
    }

    public void signoutAcc()
    {
        Log.d("nf_service_useragentstate", "@event signoutAcc");
        synchronized (mState)
        {
            transitionTo(STATES.NEED_DEACTIVATE_ACC);
        }
        return;
        exception;
        states;
        JVM INSTR monitorexit ;
        throw exception;
    }

    DeviceAccount updateAccountTokens(String s, String s1)
    {
        synchronized (mState)
        {
            if (mCurrentDeviceAcc != null)
            {
                mCurrentDeviceAcc.setNetflixId(s);
                mCurrentDeviceAcc.setSecureId(s1);
                setNetflixIdToNrdpAccount(s, s1);
            }
        }
        return mCurrentDeviceAcc;
        s;
        states;
        JVM INSTR monitorexit ;
        throw s;
    }
}
