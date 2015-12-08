// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.event.nrdp.registration.ActivateEvent;
import com.netflix.mediaclient.javabridge.ui.ActivationTokens;
import com.netflix.mediaclient.javabridge.ui.DeviceAccount;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.javabridge.ui.Registration;
import com.netflix.mediaclient.repository.UserLocale;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.NrdController;
import com.netflix.mediaclient.service.ServiceAgent;
import com.netflix.mediaclient.service.configuration.ConfigurationAgentWebCallback;
import com.netflix.mediaclient.service.configuration.SimpleConfigurationAgentWebCallback;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.player.subtitles.TextStyle;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistry;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.User;
import com.netflix.mediaclient.service.webclient.model.leafs.UserBoundCookies;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;
import com.netflix.mediaclient.servicemgr.BreadcrumbLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.ui.profiles.RestrictedProfilesReceiver;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            PartnerReceiver, UserWebClient, UserAgentBroadcastIntents, UserLocaleRepository, 
//            UserWebClientFactory, UserAgentStateManager, UserAgentWebCallback, SimpleUserAgentWebCallback

public class UserAgent extends ServiceAgent
    implements com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface, UserCredentialRegistry, UserAgentStateManager.StateManagerCallback
{
    private class ActivateListener
        implements EventListener
    {

        final UserAgent this$0;

        public void received(UIEvent uievent)
        {
label0:
            {
                Log.d("nf_service_useragent", "Received a activate event ");
                if (uievent instanceof ActivateEvent)
                {
                    uievent = (ActivateEvent)uievent;
                    if (uievent.failed())
                    {
                        break label0;
                    }
                    String s = uievent.getCookies();
                    uievent = extractToken((new StringBuilder()).append(getNetflixIdName()).append("=").toString(), s);
                    s = extractToken((new StringBuilder()).append(getSecureNetflixIdName()).append("=").toString(), s);
                    if (StringUtils.isNotEmpty(uievent) && StringUtils.isNotEmpty(s))
                    {
                        mUserAgentStateManager.accountOrProfileActivated(true, uievent, s);
                    }
                }
                return;
            }
            if (uievent.isActionId())
            {
                mUserAgentStateManager.accountOrProfileActivated(false, null, null);
                int i = uievent.getActionID();
                Log.d("nf_service_useragent", (new StringBuilder()).append("Received a activate event with ActionID error: ").append(i).append(" Received msg ").append(uievent.getMessage()).toString());
                switch (i)
                {
                default:
                    notifyLoginComplete(-4, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -4, null);
                    return;

                case 1: // '\001'
                    notifyLoginComplete(-200, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -200, null);
                    return;

                case 2: // '\002'
                    notifyLoginComplete(-201, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -201, null);
                    return;

                case 3: // '\003'
                    notifyLoginComplete(-202, uievent.getMessage());
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -202, uievent.getMessage());
                    return;

                case 4: // '\004'
                    notifyLoginComplete(-203, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -203, null);
                    return;

                case 5: // '\005'
                    notifyLoginComplete(-204, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -204, null);
                    return;

                case 6: // '\006'
                    notifyLoginComplete(-205, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -205, null);
                    return;

                case 7: // '\007'
                    notifyLoginComplete(-206, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -206, null);
                    return;

                case 8: // '\b'
                    notifyLoginComplete(-207, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -207, null);
                    return;

                case 9: // '\t'
                    notifyLoginComplete(-208, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -208, null);
                    return;

                case 10: // '\n'
                    notifyLoginComplete(-209, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -209, null);
                    return;

                case 11: // '\013'
                    notifyLoginComplete(-210, null);
                    UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -210, null);
                    return;

                case 12: // '\f'
                    notifyLoginComplete(-211, null);
                    break;
                }
                UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -211, null);
                return;
            }
            if (uievent.isNetworkError())
            {
                Log.d("nf_service_useragent", "Received a activate event with Network error");
                mUserAgentStateManager.accountOrProfileActivated(false, null, null);
                notifyLoginComplete(-3, uievent.getMessage());
                UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), -3, null);
                return;
            } else
            {
                Log.e("nf_service_useragent", "Received a unexpected Activate event");
                return;
            }
        }

        private ActivateListener()
        {
            this$0 = UserAgent.this;
            super();
        }

    }

    private class AppResetListener
        implements EventListener
    {

        final UserAgent this$0;

        public void received(UIEvent uievent)
        {
            Log.d("nf_service_useragent", "Received an App reset event ");
            AndroidUtils.clearApplicationData(getContext());
            NetflixActivity.finishAllActivities(getContext());
            uievent = new Intent();
            uievent.setClass(getContext(), com/netflix/mediaclient/service/NetflixService);
            getContext().stopService(uievent);
        }

        private AppResetListener()
        {
            this$0 = UserAgent.this;
            super();
        }

    }

    private class BindListener
        implements EventListener
    {

        final UserAgent this$0;

        public void received(UIEvent uievent)
        {
            Log.d("nf_service_useragent", "Received a bind event ");
        }

        private BindListener()
        {
            this$0 = UserAgent.this;
            super();
        }

    }

    private class ConnectWithFacebookTask extends FetchTask
    {

        final String accessToken;
        final UserAgent this$0;
        private final UserAgentWebCallback webClientCallback = new _cls1();

        public void run()
        {
            mUserWebClient.connectWithFacebook(accessToken, webClientCallback);
        }

        public ConnectWithFacebookTask(String s, UserAgentCallback useragentcallback)
        {
            this$0 = UserAgent.this;
            super(useragentcallback);
            accessToken = s;
        }
    }

    private class DeactivateListener
        implements EventListener
    {

        final UserAgent this$0;

        public void received(UIEvent uievent)
        {
            Log.d("nf_service_useragent", "Received a deactivate event ");
        }

        private DeactivateListener()
        {
            this$0 = UserAgent.this;
            super();
        }

    }

    private class DoDummyWebCallTask
        implements Runnable
    {

        UserAgentWebCallback mCallback;
        final UserAgent this$0;
        private final UserAgentWebCallback webClientCallback = new _cls1();

        public void run()
        {
            mUserWebClient.doDummyWebCall(webClientCallback);
        }

        public DoDummyWebCallTask(UserAgentWebCallback useragentwebcallback)
        {
            this$0 = UserAgent.this;
            super();
            mCallback = useragentwebcallback;
        }
    }

    private class FetchAccountDataTask
        implements Runnable
    {

        final UserAgent this$0;
        private final UserAgentWebCallback webClientCallback = new _cls1();

        public void run()
        {
            mUserWebClient.fetchAccountData(webClientCallback);
        }

        public FetchAccountDataTask(UserAgentWebCallback useragentwebcallback)
        {
            this$0 = UserAgent.this;
            super();
        }
    }

    private class FetchProfileDataTask
        implements Runnable
    {

        String profileId;
        final UserAgent this$0;
        private final UserAgentWebCallback webClientCallback = new _cls1();

        public void run()
        {
            mUserWebClient.fetchProfileData(profileId, webClientCallback);
        }

        public FetchProfileDataTask(String s, UserAgentWebCallback useragentwebcallback)
        {
            this$0 = UserAgent.this;
            super();
            profileId = s;
        }
    }

    private static abstract class FetchTask
        implements Runnable
    {

        private final UserAgentCallback callback;

        protected UserAgentCallback getCallback()
        {
            return callback;
        }

        public FetchTask(UserAgentCallback useragentcallback)
        {
            callback = useragentcallback;
        }
    }

    public final class PlayStopReceiver extends BroadcastReceiver
    {

        final UserAgent this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null)
            {
                context = intent.getAction();
                Log.i("nf_service_useragent", (new StringBuilder()).append("PlayStopReceiver inovoked and received Intent with Action ").append(context).toString());
                if ("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_STOP".equals(context))
                {
                    if (getCurrentProfileId() != null && mCurrentUserProfile != null)
                    {
                        Log.i("nf_service_useragent", "Starting userProfile fetch ");
                        fetchProfileData(getCurrentProfileId());
                        return;
                    } else
                    {
                        Log.i("nf_service_useragent", "canDoDataFetches false - skipping fetchProfileData request");
                        return;
                    }
                }
            }
        }

        public PlayStopReceiver()
        {
            this$0 = UserAgent.this;
            super();
        }
    }

    private class SwitchWebUserProfilesTask
        implements Runnable
    {

        String profileId;
        final UserAgent this$0;
        private final UserAgentWebCallback webClientCallback = new _cls1();

        public void run()
        {
            mUserWebClient.switchWebUserProfile(profileId, webClientCallback);
        }

        public SwitchWebUserProfilesTask(String s)
        {
            this$0 = UserAgent.this;
            super();
            profileId = s;
        }
    }

    public static interface UserAgentCallback
    {

        public abstract void onConnectWithFacebook(int i, String s);

        public abstract void onLoginComplete(int i, String s);

        public abstract void onLogoutComplete(int i);

        public abstract void onPinVerified(boolean flag, int i);
    }

    private class VerifyPinTask extends FetchTask
    {

        final String enteredPin;
        final UserAgent this$0;
        private final UserAgentWebCallback webClientCallback = new _cls1();

        public void run()
        {
            mUserWebClient.verifyPin(enteredPin, webClientCallback);
        }

        public VerifyPinTask(String s, UserAgentCallback useragentcallback)
        {
            this$0 = UserAgent.this;
            super(useragentcallback);
            enteredPin = s;
        }
    }


    private static final String ACTIVATE = "activate";
    private static final String ACTIVATE_COMPLETE = "activateComplete";
    private static final String APP_RESET_Required = "appResetRequired";
    private static final String BIND = "bind";
    private static final String DEACTIVATED = "deactivated";
    private static final String NETFLIX_ID = "NetflixId";
    private static final String NETFLIX_ID_TEST = "NetflixIdTest";
    private static final String SECURE_NETFLIX_ID = "SecureNetflixId";
    private static final String SECURE_NETFLIX_ID_TEST = "SecureNetflixIdTest";
    private static final String TAG = "nf_service_useragent";
    private final ConfigurationAgentWebCallback configDataCallback = new SimpleConfigurationAgentWebCallback() {

        final UserAgent this$0;

        public void onConfigDataFetched(ConfigData configdata, int i)
        {
            if (i == 0)
            {
                Log.d("nf_service_useragent", "pfetchUserData");
                launchWebTask(new FetchAccountDataTask(null));
                return;
            } else
            {
                mUserAgentStateManager.accountDataFetchFailed(i, isAccountDataAvailable());
                return;
            }
        }

            
            {
                this$0 = UserAgent.this;
                super();
            }
    };
    private boolean isProfileSwitchingDisabled;
    private EventListener mActivateListener;
    private EventListener mAppResetListener;
    private EventListener mBindListener;
    private DeviceAccount mCurrentUserAccount;
    private UserProfile mCurrentUserProfile;
    private EventListener mDeactivateListener;
    private List mListOfUserProfiles;
    private UserAgentCallback mLoginCallback;
    private UserAgentCallback mLogoutCallback;
    private Nrdp mNrdp;
    private PlayStopReceiver mPlayStopReceiver;
    private Registration mRegistration;
    private TextStyle mSubtitleDefaults;
    private TextStyle mSubtitleSettings;
    private User mUser;
    private UserAgentStateManager mUserAgentStateManager;
    private UserWebClient mUserWebClient;
    private UserLocaleRepository userLocaleRepository;

    public UserAgent()
    {
    }

    private List buildListOfUserProfiles(String s)
    {
        if (Log.isLoggable("nf_service_useragent", 3))
        {
            Log.d("nf_service_useragent", (new StringBuilder()).append("populateListOfUserProfiles with json ").append(s).toString());
        }
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        ArrayList arraylist = new ArrayList();
        JSONArray jsonarray;
        int i;
        try
        {
            jsonarray = (JSONArray)(new JSONTokener(s)).nextValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_service_useragent", (new StringBuilder()).append("error while populateListOfUserProfiles ").append(s).toString());
            return arraylist;
        }
        i = 0;
        s = arraylist;
        if (i >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        s = new UserProfile(jsonarray.opt(i).toString());
        if (Log.isLoggable("nf_service_useragent", 3))
        {
            Log.d("nf_service_useragent", (new StringBuilder()).append("has userprofile ").append(s).toString());
        }
        arraylist.add(s);
        i++;
        break MISSING_BLOCK_LABEL_72;
    }

    private void doLoginComplete()
    {
        notifyLoginComplete(0, null);
        getApplication().setSignedInOnce();
        PreferenceUtils.putBooleanPref(getContext(), "nf_user_status_loggedin", true);
    }

    private void doLogoutComplete()
    {
        notifyLogoutComplete(0);
        Log.d("nf_service_useragent", "Logout complete");
        getService().getClientLogging().getBreadcrumbLogging().leaveBreadcrumb("Logout complete");
        mCurrentUserProfile = null;
        mListOfUserProfiles = null;
        mUser = null;
        mSubtitleSettings = null;
        mSubtitleDefaults = null;
        PreferenceUtils.removePref(getContext(), "useragent_userprofiles_data");
        PreferenceUtils.removePref(getContext(), "useragent_user_data");
        PreferenceUtils.putBooleanPref(getContext(), "nf_user_status_loggedin", false);
        PartnerReceiver.broadcastUserStatus(getContext(), false);
    }

    private String extractToken(String s, String s1)
    {
        Log.d("nf_service_useragent", (new StringBuilder()).append("Extracting token: ").append(s).toString());
        Object obj = null;
        if (s1 == null)
        {
            return null;
        }
        int i = s1.indexOf(s, 0);
        String s2 = obj;
        if (i >= 0)
        {
            int j = s1.indexOf(";", i);
            s2 = obj;
            if (j > i)
            {
                s2 = s1.substring(s.length() + i, j);
            }
        }
        return s2;
    }

    private boolean isAccountDataAvailable()
    {
        return mListOfUserProfiles != null && !mListOfUserProfiles.isEmpty() && mUser != null;
    }

    private boolean isLatestProfileDataValid(UserProfile userprofile)
    {
        return userprofile != null && StringUtils.safeEquals(getCurrentProfileId(), userprofile.getProfileId());
    }

    private void launchTask(FetchTask fetchtask)
    {
        if (Log.isLoggable("nf_service_useragent", 2))
        {
            Log.v("nf_service_useragent", (new StringBuilder()).append("Launching task: ").append(fetchtask.getClass().getSimpleName()).toString());
        }
        if (mUserWebClient.isSynchronous())
        {
            (new BackgroundTask()).execute(fetchtask);
            return;
        } else
        {
            fetchtask.run();
            return;
        }
    }

    private void launchWebTask(Runnable runnable)
    {
        if (Log.isLoggable("nf_service_useragent", 2))
        {
            Log.v("nf_service_useragent", (new StringBuilder()).append("Launching task: ").append(runnable.getClass().getSimpleName()).toString());
        }
        if (mUserWebClient.isSynchronous())
        {
            (new BackgroundTask()).execute(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    private void notifyLoginComplete(final int status, final String msg)
    {
        getMainHandler().post(new Runnable() {

            final UserAgent this$0;
            final String val$msg;
            final int val$status;

            public void run()
            {
                if (mLoginCallback != null)
                {
                    mLoginCallback.onLoginComplete(status, msg);
                    mLoginCallback = null;
                }
            }

            
            {
                this$0 = UserAgent.this;
                status = i;
                msg = s;
                super();
            }
        });
    }

    private void notifyLogoutComplete(int i)
    {
        getMainHandler().post(new Runnable() {

            final UserAgent this$0;

            public void run()
            {
                if (mLogoutCallback != null)
                {
                    mLogoutCallback.onLogoutComplete(0);
                    Log.d("nf_service_useragent", "Received deactivate complete and notified UI");
                    mLogoutCallback = null;
                }
            }

            
            {
                this$0 = UserAgent.this;
                super();
            }
        });
    }

    private void notifyOtherOfProfileActivated()
    {
        UserAgentBroadcastIntents.signalProfileActive(getContext());
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.PUSH_ONLOGIN");
        intent.addCategory("com.netflix.mediaclient.intent.category.PUSH");
        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
        getService().getClientLogging().getBreadcrumbLogging().leaveBreadcrumb("Login complete");
        PartnerReceiver.broadcastUserStatus(getContext(), true);
    }

    private void persistListOfUserProfiles(List list)
    {
        JSONArray jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext(); jsonarray.put(((UserProfile)list.next()).toString())) { }
        if (Log.isLoggable("nf_service_useragent", 3))
        {
            Log.d("nf_service_useragent", (new StringBuilder()).append("persistListOfUserProfiles ").append(jsonarray.toString()).toString());
        }
        PreferenceUtils.putStringPref(getContext(), "useragent_userprofiles_data", jsonarray.toString());
    }

    private void persistUser(User user)
    {
        if (Log.isLoggable("nf_service_useragent", 3))
        {
            Log.d("nf_service_useragent", (new StringBuilder()).append("persistUser ").append(user.toString()).toString());
        }
        PreferenceUtils.putStringPref(getContext(), "useragent_user_data", user.toString());
    }

    private User populateUser(String s)
    {
        if (Log.isLoggable("nf_service_useragent", 3))
        {
            Log.d("nf_service_useragent", (new StringBuilder()).append("populateUser with json ").append(s).toString());
        }
        if (StringUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            User user = new User(s);
            s = user;
            if (Log.isLoggable("nf_service_useragent", 3))
            {
                Log.d("nf_service_useragent", (new StringBuilder()).append("has user ").append(user).toString());
                return user;
            }
        }
        return s;
    }

    private void registerPlayStopReceiver()
    {
        IntentFilter intentfilter = new IntentFilter("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_STOP");
        getContext().registerReceiver(mPlayStopReceiver, intentfilter);
    }

    private void setUserPreferredLanguages(String as[])
    {
        String s = StringUtils.joinArray(as);
        userLocaleRepository.setPreferredLanguages(s);
        getNrdController().setPreferredLanguages(as);
        getNrdController().setDeviceLocale(userLocaleRepository.getCurrentAppLocale().getLocale());
    }

    private void unregisterPlayStopReceiver()
    {
        try
        {
            getContext().unregisterReceiver(mPlayStopReceiver);
            return;
        }
        catch (Exception exception)
        {
            Log.i("nf_service_useragent", (new StringBuilder()).append("unregisterPlayStopReceiver ").append(exception).toString());
        }
    }

    private void updateAndPersistProfilesList(UserProfile userprofile)
    {
        Object obj = null;
        Iterator iterator = mListOfUserProfiles.iterator();
        UserProfile userprofile1;
        do
        {
            userprofile1 = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            userprofile1 = (UserProfile)iterator.next();
        } while (!StringUtils.safeEquals(userprofile1.getProfileId(), userprofile.getProfileId()));
        if (userprofile1 != null)
        {
            mListOfUserProfiles.remove(userprofile1);
        }
        mListOfUserProfiles.add(userprofile);
        persistListOfUserProfiles(mListOfUserProfiles);
    }

    public void connectWithFacebook(String s, UserAgentCallback useragentcallback)
    {
        launchTask(new ConnectWithFacebookTask(s, useragentcallback));
    }

    public void destroy()
    {
        if (mRegistration != null)
        {
            mRegistration.removeEventListener("activateComplete", mActivateListener);
            mRegistration.removeEventListener("activate", mActivateListener);
            mRegistration.removeEventListener("deactivated", mDeactivateListener);
            mRegistration.removeEventListener("bind", mBindListener);
            mRegistration.removeEventListener("appResetRequired", mAppResetListener);
        }
        userLocaleRepository = null;
        unregisterPlayStopReceiver();
        super.destroy();
    }

    public void doDummyWebCall(UserAgentWebCallback useragentwebcallback)
    {
        launchWebTask(new DoDummyWebCallTask(useragentwebcallback));
    }

    public void doInit()
    {
        refreshProfileSwitchingStatus();
        mCurrentUserAccount = null;
        mCurrentUserProfile = null;
        mSubtitleSettings = null;
        mPlayStopReceiver = new PlayStopReceiver();
        String s = PreferenceUtils.getStringPref(getContext(), "useragent_userprofiles_data", null);
        if (s != null)
        {
            getApplication().setSignedInOnce();
            mListOfUserProfiles = buildListOfUserProfiles(s);
        }
        s = PreferenceUtils.getStringPref(getContext(), "useragent_user_data", null);
        if (s != null)
        {
            mUser = populateUser(s);
            mSubtitleDefaults = TextStyle.buildSubtitleSettings(mUser.getSubtitleDefaults());
        }
        mUserWebClient = UserWebClientFactory.create(getService(), getResourceFetcher().getApiNextWebClient());
        userLocaleRepository = new UserLocaleRepository();
        s = UserLocale.getRawDeviceLocale(getContext());
        if (Log.isLoggable("nf_service_useragent", 3))
        {
            Log.d("nf_service_useragent", (new StringBuilder()).append("Current device locale as raw user locale: ").append(s).toString());
        }
        userLocaleRepository.setApplicationLanguage(new UserLocale(s));
        mNrdp = getNrdController().getNrdp();
        if (mNrdp == null || !mNrdp.isReady())
        {
            initCompleted(-4);
            Log.e("nf_service_useragent", "NRDP is NOT READY");
            return;
        } else
        {
            mRegistration = mNrdp.getRegistration();
            mActivateListener = new ActivateListener();
            mDeactivateListener = new DeactivateListener();
            mBindListener = new BindListener();
            mAppResetListener = new AppResetListener();
            mRegistration.addEventListener("activateComplete", mActivateListener);
            mRegistration.addEventListener("activate", mActivateListener);
            mRegistration.addEventListener("deactivated", mDeactivateListener);
            mRegistration.addEventListener("bind", mBindListener);
            mRegistration.addEventListener("appResetRequired", mAppResetListener);
            mUserAgentStateManager = new UserAgentStateManager(mRegistration, getConfigurationAgent().getDrmManager(), this, getContext(), getService().getClientLogging().getErrorLogging());
            mUserAgentStateManager.initialize(getConfigurationAgent().isLogoutRequired(), getConfigurationAgent().isEsnMigrationRequired());
            registerPlayStopReceiver();
            return;
        }
    }

    public void fetchAccountData()
    {
        Log.d("nf_service_useragent", "fetch account level config data");
        getConfigurationAgent().fetchAccountConfigData(configDataCallback);
    }

    public void fetchProfileData(String s)
    {
        Log.d("nf_service_useragent", "fetchProfileData");
        launchWebTask(new FetchProfileDataTask(s, null));
    }

    public List getAllProfiles()
    {
        return mListOfUserProfiles;
    }

    public String getCurrentAppLocale()
    {
        return userLocaleRepository.getCurrentAppLocale().getRaw();
    }

    public UserProfile getCurrentProfile()
    {
        return mCurrentUserProfile;
    }

    public volatile com.netflix.mediaclient.servicemgr.UserProfile getCurrentProfile()
    {
        return getCurrentProfile();
    }

    public String getCurrentProfileEmail()
    {
        Log.d("nf_service_useragent", "getCurrentProfileEmail called");
        if (mCurrentUserProfile == null)
        {
            Log.d("nf_service_useragent", "getCurrentProfileEmail  is null");
            return null;
        } else
        {
            return mCurrentUserProfile.getEmail();
        }
    }

    public String getCurrentProfileFirstName()
    {
        Log.d("nf_service_useragent", "getCurrentProfileFirstName called");
        if (mCurrentUserProfile == null)
        {
            Log.d("nf_service_useragent", "getCurrentProfileFirstName is null");
            return null;
        } else
        {
            return mCurrentUserProfile.getFirstName();
        }
    }

    public String getCurrentProfileId()
    {
        Log.d("nf_service_useragent", "getCurrentProfileId called");
        if (mCurrentUserProfile == null)
        {
            return null;
        } else
        {
            return mCurrentUserProfile.getProfileId();
        }
    }

    public String getCurrentProfileLastName()
    {
        Log.d("nf_service_useragent", "getCurrentProfileLastName called");
        if (mCurrentUserProfile == null)
        {
            Log.d("nf_service_useragent", "getCurrentProfileLastName is null");
            return null;
        } else
        {
            return mCurrentUserProfile.getLastName();
        }
    }

    public String getCurrentProfileUserId()
    {
        Log.d("nf_service_useragent", "getCurrentProfileUserId called");
        if (mCurrentUserProfile == null)
        {
            Log.d("nf_service_useragent", "getCurrentProfileUserId is null");
            return null;
        } else
        {
            return mCurrentUserProfile.getUserId();
        }
    }

    public String getGeoCountry()
    {
        if (mCurrentUserProfile == null)
        {
            Log.d("nf_service_useragent", "getGeoCountry is null");
            return null;
        } else
        {
            return mCurrentUserProfile.getGeoCountry();
        }
    }

    public String getLanguagesInCsv()
    {
        if (mCurrentUserProfile != null)
        {
            return mCurrentUserProfile.getLanguagesInCsv();
        } else
        {
            return null;
        }
    }

    public String getNetflixID()
    {
        Log.d("nf_service_useragent", "getNetfilxID request");
        if (!isUserLoggedIn())
        {
            return null;
        } else
        {
            return mCurrentUserAccount.getNetflixId();
        }
    }

    public String getNetflixIdName()
    {
        return "NetflixId";
    }

    public String getReqCountry()
    {
        if (mCurrentUserProfile == null)
        {
            Log.d("nf_service_useragent", "getReqCountry is null");
            return null;
        } else
        {
            return mCurrentUserProfile.getReqCountry();
        }
    }

    public String getSecureNetflixID()
    {
        Log.d("nf_service_useragent", "getSecureNetfilxID request");
        if (!isUserLoggedIn())
        {
            return null;
        } else
        {
            return mCurrentUserAccount.getSecureId();
        }
    }

    public String getSecureNetflixIdName()
    {
        return "SecureNetflixId";
    }

    public TextStyle getSubtitleDefaults()
    {
        return mSubtitleDefaults;
    }

    public UserCredentialRegistry getUserCredentialRegistry()
    {
        return this;
    }

    public String getUserId()
    {
        Log.d("nf_service_useragent", "getUserId called");
        if (mUser == null)
        {
            return null;
        } else
        {
            return mUser.getUserId();
        }
    }

    public TextStyle getUserSubtitlePreferences()
    {
        return mSubtitleSettings;
    }

    public void initialized(int i)
    {
        initCompleted(i);
    }

    public boolean isCurrentProfileFacebookConnected()
    {
        Log.d("nf_service_useragent", "isCurrentProfileFacebookConnected called");
        if (mCurrentUserProfile == null)
        {
            return false;
        } else
        {
            return mCurrentUserProfile.isSocialConnected();
        }
    }

    public boolean isCurrentProfileIQEnabled()
    {
        if (mCurrentUserProfile == null)
        {
            Log.d("nf_service_useragent", "isCurrentProfileIQEnabled is null");
            return false;
        } else
        {
            Log.d("nf_service_useragent", String.format("isCurrentProfileIQEnabled %s called: %b ", new Object[] {
                mCurrentUserProfile.getFirstName(), Boolean.valueOf(mCurrentUserProfile.isIQEnabled())
            }));
            return mCurrentUserProfile.isIQEnabled();
        }
    }

    public boolean isProfileSwitchingDisabled()
    {
        return isProfileSwitchingDisabled;
    }

    public boolean isUserLoggedIn()
    {
        return mCurrentUserAccount != null;
    }

    public void loginUser(String s, String s1, UserAgentCallback useragentcallback)
    {
        Log.d("nf_service_useragent", "loginUser activateAccByEmailPassword");
        if (mUserAgentStateManager == null)
        {
            notifyLoginComplete(-4, null);
            return;
        }
        if (!mUserAgentStateManager.activateAccByEmailPassword(s, s1))
        {
            notifyLoginComplete(-41, null);
            return;
        } else
        {
            mLoginCallback = useragentcallback;
            return;
        }
    }

    public void logoutUser()
    {
        logoutUser(null);
    }

    public void logoutUser(UserAgentCallback useragentcallback)
    {
        mLogoutCallback = useragentcallback;
        getService().getClientLogging().flush();
        if (!isUserLoggedIn())
        {
            notifyLogoutComplete(0);
            return;
        }
        if (mCurrentUserProfile != null)
        {
            useragentcallback = new Intent("com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT");
            useragentcallback.addCategory("com.netflix.mediaclient.intent.category.PUSH");
            useragentcallback.putExtra("uid", getService().getUserId());
            useragentcallback.putExtra("nid", getNetflixID());
            useragentcallback.putExtra("sid", getSecureNetflixID());
            useragentcallback.putExtra("esn", getConfigurationAgent().getEsnProvider().getEsn());
            useragentcallback.putExtra("device_cat", getConfigurationAgent().getDeviceCategory().getValue());
            useragentcallback.putExtra("uid", getService().getCurrentProfileUserId());
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(useragentcallback);
        }
        mUserAgentStateManager.signoutAcc();
    }

    public void profileActivated(String s, DeviceAccount deviceaccount)
    {
        mCurrentUserAccount = deviceaccount;
        for (deviceaccount = mListOfUserProfiles.iterator(); deviceaccount.hasNext();)
        {
            UserProfile userprofile = (UserProfile)deviceaccount.next();
            if (userprofile.getProfileId().equals(s))
            {
                mCurrentUserProfile = userprofile;
                if (mCurrentUserProfile != null && mCurrentUserProfile.getSubtitlePreference() != null)
                {
                    mSubtitleSettings = TextStyle.buildSubtitleSettings(getCurrentProfile().getSubtitlePreference());
                }
                setUserPreferredLanguages(mCurrentUserProfile.getLanguages());
                notifyOtherOfProfileActivated();
                return;
            }
        }

        Log.e("nf_service_useragent", "profileActivated cannot find profileId");
        mCurrentUserProfile = null;
        mSubtitleSettings = null;
    }

    public void profileInactive()
    {
        mCurrentUserProfile = null;
        mSubtitleSettings = null;
        UserAgentBroadcastIntents.signalProfileDeactivated(getContext());
    }

    public void readyToSelectProfile()
    {
        UserAgentBroadcastIntents.signalProfileReady2Select(getContext());
    }

    public void refreshProfileSwitchingStatus()
    {
        if (AndroidUtils.getAndroidVersion() >= 18)
        {
            isProfileSwitchingDisabled = RestrictedProfilesReceiver.isProfileSwitchingDisabled(getContext());
        } else
        {
            isProfileSwitchingDisabled = false;
        }
        if (Log.isLoggable("nf_service_useragent", 3))
        {
            Log.d("nf_service_useragent", (new StringBuilder()).append("Is profile switching disabled: ").append(isProfileSwitchingDisabled).toString());
        }
    }

    public void selectProfile(String s)
    {
        mUserAgentStateManager.selectNewProfile(s);
    }

    public void selectProfileResult(int i)
    {
        UserAgentBroadcastIntents.signalProfileSelectionResult(getContext(), i, null);
    }

    public void setCurrentAppLocale(String s)
    {
        if (userLocaleRepository != null)
        {
            userLocaleRepository.setApplicationLanguage(new UserLocale(s));
        }
    }

    public void switchWebUserProfile(String s)
    {
        Log.d("nf_service_useragent", "switchWebUserProfile");
        getService().getClientLogging().flush();
        launchWebTask(new SwitchWebUserProfilesTask(s));
    }

    public void tokenActivate(ActivationTokens activationtokens, UserAgentCallback useragentcallback)
    {
        Log.d("nf_service_useragent", "loginUser tokenActivate");
        if (mUserAgentStateManager == null)
        {
            notifyLoginComplete(-4, null);
            return;
        }
        if (!mUserAgentStateManager.activateAccByToken(activationtokens))
        {
            notifyLoginComplete(-41, null);
            return;
        } else
        {
            mLoginCallback = useragentcallback;
            return;
        }
    }

    public boolean updateUserCredentials(String s, String s1)
    {
        if (!isUserLoggedIn())
        {
            return false;
        } else
        {
            mCurrentUserAccount = mUserAgentStateManager.updateAccountTokens(s, s1);
            return true;
        }
    }

    public void userAccountActivated(DeviceAccount deviceaccount)
    {
        mCurrentUserAccount = deviceaccount;
        UserAgentBroadcastIntents.signalUserAccountActive(getContext());
    }

    public void userAccountDataResult(int i)
    {
        if (i == 0)
        {
            doLoginComplete();
            return;
        } else
        {
            notifyLoginComplete(i, null);
            return;
        }
    }

    public void userAccountDeactivated()
    {
        UserAgentBroadcastIntents.signalUserAccountDeactivated(getContext());
        getConfigurationAgent().clearAccountConfigData();
        doLogoutComplete();
    }

    public void userAccountInactive()
    {
        mCurrentUserAccount = null;
    }

    public void verifyPin(String s, UserAgentCallback useragentcallback)
    {
        launchTask(new VerifyPinTask(s, useragentcallback));
    }





















/*
    static List access$2802(UserAgent useragent, List list)
    {
        useragent.mListOfUserProfiles = list;
        return list;
    }

*/



/*
    static User access$2902(UserAgent useragent, User user)
    {
        useragent.mUser = user;
        return user;
    }

*/


/*
    static TextStyle access$3002(UserAgent useragent, TextStyle textstyle)
    {
        useragent.mSubtitleDefaults = textstyle;
        return textstyle;
    }

*/







/*
    static UserProfile access$3502(UserAgent useragent, UserProfile userprofile)
    {
        useragent.mCurrentUserProfile = userprofile;
        return userprofile;
    }

*/




/*
    static TextStyle access$3802(UserAgent useragent, TextStyle textstyle)
    {
        useragent.mSubtitleSettings = textstyle;
        return textstyle;
    }

*/





/*
    static UserAgentCallback access$402(UserAgent useragent, UserAgentCallback useragentcallback)
    {
        useragent.mLoginCallback = useragentcallback;
        return useragentcallback;
    }

*/




/*
    static UserAgentCallback access$502(UserAgent useragent, UserAgentCallback useragentcallback)
    {
        useragent.mLogoutCallback = useragentcallback;
        return useragentcallback;
    }

*/





    // Unreferenced inner class com/netflix/mediaclient/service/user/UserAgent$ConnectWithFacebookTask$1

/* anonymous class */
    class ConnectWithFacebookTask._cls1 extends SimpleUserAgentWebCallback
    {

        final ConnectWithFacebookTask this$1;

        public void onConnectWithFacebook(final int statusCode, String s)
        {
            if (statusCode == 0)
            {
                mCurrentUserProfile.setFacebookConnectStatus(true);
            }
            getMainHandler().post(s. new Runnable() {

                final ConnectWithFacebookTask._cls1 this$2;
                final String val$errorMsg;
                final int val$statusCode;

                public void run()
                {
    class ConnectWithFacebookTask._cls1 extends SimpleUserAgentWebCallback
    {
                    getCallback().onConnectWithFacebook(statusCode, errorMsg);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = i;
                errorMsg = String.this;
                super();
            }
            });
        }

            
            {
                this$1 = ConnectWithFacebookTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/user/UserAgent$DoDummyWebCallTask$1

/* anonymous class */
    class DoDummyWebCallTask._cls1 extends SimpleUserAgentWebCallback
    {

        final DoDummyWebCallTask this$1;

        public void onDummyWebCallDone(int i)
        {
            if (mCallback != null)
            {
                mCallback.onDummyWebCallDone(i);
                mCallback = null;
            }
            Log.d("nf_service_useragent", "dummy web call done");
        }

            
            {
                this$1 = DoDummyWebCallTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/user/UserAgent$FetchAccountDataTask$1

/* anonymous class */
    class FetchAccountDataTask._cls1 extends SimpleUserAgentWebCallback
    {

        final FetchAccountDataTask this$1;

        public void onAccountDataFetched(AccountData accountdata, int i)
        {
            if (i == 0)
            {
                mListOfUserProfiles = accountdata.getUserProfiles();
                mUser = accountdata.getUser();
                mSubtitleDefaults = TextStyle.buildSubtitleSettings(mUser.getSubtitleDefaults());
                UserProfile userprofile;
                for (Iterator iterator = mListOfUserProfiles.iterator(); iterator.hasNext(); Log.d("nf_service_useragent", String.format("fetchAccountData profileName %s profileId %s socialStatus %s", new Object[] {
        userprofile.getFirstName(), userprofile.getProfileId(), Boolean.valueOf(userprofile.isSocialConnected())
    })))
                {
                    userprofile = (UserProfile)iterator.next();
                }

                if (mUserAgentStateManager != null)
                {
                    mUserAgentStateManager.accountDataFetched(accountdata);
                }
                persistListOfUserProfiles(mListOfUserProfiles);
                persistUser(mUser);
            } else
            {
                Log.e("nf_service_useragent", (new StringBuilder()).append("fetchAccountData failed (skipping user info update) with statusCode=").append(i).toString());
                if (mUserAgentStateManager != null)
                {
                    mUserAgentStateManager.accountDataFetchFailed(i, isAccountDataAvailable());
                    return;
                }
            }
        }

            
            {
                this$1 = FetchAccountDataTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/user/UserAgent$FetchProfileDataTask$1

/* anonymous class */
    class FetchProfileDataTask._cls1 extends SimpleUserAgentWebCallback
    {

        final FetchProfileDataTask this$1;

        public void onProfileDataFetched(UserProfile userprofile, int i)
        {
            if (i == 0 && isLatestProfileDataValid(userprofile))
            {
                if (!StringUtils.safeEquals(mCurrentUserProfile.toString(), userprofile.toString()))
                {
                    updateAndPersistProfilesList(userprofile);
                    if (!StringUtils.safeEquals(mCurrentUserProfile.getLanguagesInCsv(), userprofile.getLanguagesInCsv()))
                    {
                        Log.d("nf_service_useragent", "onProfileDataFetched language changed, update ");
                        setUserPreferredLanguages(userprofile.getLanguages());
                    }
                    mSubtitleSettings = TextStyle.buildSubtitleSettings(userprofile.getSubtitlePreference());
                    mCurrentUserProfile = userprofile;
                    return;
                } else
                {
                    Log.d("nf_service_useragent", "onProfileDataFetched nothing changed ignore.. ");
                    return;
                }
            } else
            {
                Log.e("nf_service_useragent", (new StringBuilder()).append("Ignore onProfileDataFetched failed (skipping userProfile update) with statusCode=").append(i).toString());
                return;
            }
        }

            
            {
                this$1 = FetchProfileDataTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/user/UserAgent$SwitchWebUserProfilesTask$1

/* anonymous class */
    class SwitchWebUserProfilesTask._cls1 extends SimpleUserAgentWebCallback
    {

        final SwitchWebUserProfilesTask this$1;

        public void onUserProfileSwitched(UserBoundCookies userboundcookies, int i)
        {
            if (i == 0)
            {
                Log.d("nf_service_useragent", String.format("switchWebUserProfile  netflixId %s secureNetflixId %s", new Object[] {
                    userboundcookies.getUserBoundNetflixId(), userboundcookies.getUserBoundSecureNetflixId()
                }));
                if (mUserAgentStateManager != null)
                {
                    mUserAgentStateManager.profileSwitched(userboundcookies);
                }
            } else
            {
                Log.e("nf_service_useragent", (new StringBuilder()).append("switchWebUserProfile failed  with statusCode=").append(i).toString());
                if (mUserAgentStateManager != null)
                {
                    mUserAgentStateManager.profileSwitchedFailed(i);
                    return;
                }
            }
        }

            
            {
                this$1 = SwitchWebUserProfilesTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/user/UserAgent$VerifyPinTask$1

/* anonymous class */
    class VerifyPinTask._cls1 extends SimpleUserAgentWebCallback
    {

        final VerifyPinTask this$1;

        public void onPinVerified(final boolean isPinValid, int i)
        {
            getMainHandler().post(i. new Runnable() {

                final VerifyPinTask._cls1 this$2;
                final boolean val$isPinValid;
                final int val$statusCode;

                public void run()
                {
    class VerifyPinTask._cls1 extends SimpleUserAgentWebCallback
    {
                    getCallback().onPinVerified(isPinValid, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                isPinValid = flag;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = VerifyPinTask.this;
                super();
            }
    }

}
