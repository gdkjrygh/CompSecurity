// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.text.TextUtils;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.AccountUtil;
import com.skype.android.util.CountryCode;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvUtil, MnvAnalytics, MnvStateData, MnvCases

public class MnvManagerEvents
{
    private static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a IS_FIRST_TIME;
        public static final a IS_MNV_COMPLETED;
        public static final a IS_MSA_SOURCE;
        public static final a IS_SKYPE_SOURCE;
        public static final a IS_VERIFICATION_QOS_ALERT;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/mnv/MnvManagerEvents$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        static 
        {
            IS_VERIFICATION_QOS_ALERT = new a("IS_VERIFICATION_QOS_ALERT", 0);
            IS_FIRST_TIME = new a("IS_FIRST_TIME", 1);
            IS_MNV_COMPLETED = new a("IS_MNV_COMPLETED", 2);
            IS_MSA_SOURCE = new a("IS_MSA_SOURCE", 3);
            IS_SKYPE_SOURCE = new a("IS_SKYPE_SOURCE", 4);
            $VALUES = (new a[] {
                IS_VERIFICATION_QOS_ALERT, IS_FIRST_TIME, IS_MNV_COMPLETED, IS_MSA_SOURCE, IS_SKYPE_SOURCE
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Logger log = Logger.getLogger("MnvManagerEvents");
    private final AccountProvider accountProvider;
    private final CountryCode countryCodeObject;
    private final String devicePhoneNumber;
    private final boolean hasDeviceNumber;
    private final SkyLib lib;
    private final MnvAnalytics mnvAnalytics;
    private final MnvCases mnvCases;
    private final MnvUtil mnvUtil;
    private final UserPreferences userPreferences;

    public MnvManagerEvents(AccountProvider accountprovider, MnvAnalytics mnvanalytics, MnvUtil mnvutil, MnvCases mnvcases, SkyLib skylib, UserPreferences userpreferences)
    {
        accountProvider = accountprovider;
        mnvAnalytics = mnvanalytics;
        mnvUtil = mnvutil;
        mnvCases = mnvcases;
        countryCodeObject = mnvutil.getCountryCode();
        hasDeviceNumber = mnvutil.hasDeviceNumber();
        devicePhoneNumber = mnvutil.stripPhoneNumber(mnvutil.getUserPhoneNumber());
        lib = skylib;
        userPreferences = userpreferences;
    }

    private boolean doesNotConflictWithDeviceNumber(ProfileServicesResponse.ProfileData.Entries entries)
    {
        return !hasDeviceNumber || isDeviceNumber(entries);
    }

    private ProfileServicesResponse.ProfileData.Entries getProfilePhoneEntryMatchingSignInName(String s, ProfileServicesResponse.ProfileData profiledata)
    {
        Object obj = null;
        Iterator iterator = profiledata.getEntries().iterator();
        profiledata = obj;
        do
        {
            Object obj1;
label0:
            {
                obj1 = profiledata;
                if (iterator.hasNext())
                {
                    obj1 = (ProfileServicesResponse.ProfileData.Entries)iterator.next();
                    if (!isProfilePhoneEntryPossibleMatchForSignInName(((ProfileServicesResponse.ProfileData.Entries) (obj1)), s))
                    {
                        continue;
                    }
                    log.info(String.format("Possible match for sign in name %s with profile entry name %s and country %s", new Object[] {
                        s, ((ProfileServicesResponse.ProfileData.Entries) (obj1)).getName(), ((ProfileServicesResponse.ProfileData.Entries) (obj1)).getCountry()
                    }));
                    if (profiledata == null)
                    {
                        break label0;
                    }
                    mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cQ);
                    log.warning("Multiple potential matching phone entries found in profile data so cannot disambiguate a match to determined normalized sign in phone number.");
                    obj1 = null;
                }
                return ((ProfileServicesResponse.ProfileData.Entries) (obj1));
            }
            profiledata = ((ProfileServicesResponse.ProfileData) (obj1));
        } while (true);
    }

    private ProfileServicesResponse.ProfileData.Entries getSkypeEntry(ProfileServicesResponse.ProfileData profiledata)
    {
        for (Iterator iterator = profiledata.getEntries().iterator(); iterator.hasNext();)
        {
            ProfileServicesResponse.ProfileData.Entries entries = (ProfileServicesResponse.ProfileData.Entries)iterator.next();
            if (profiledata.isSkypeSource(entries))
            {
                return entries;
            }
        }

        return null;
    }

    private ProfileServicesResponse.ProfileData.Entries getVerifiedMsaEntry(ProfileServicesResponse.ProfileData profiledata)
    {
        for (Iterator iterator = profiledata.getEntries().iterator(); iterator.hasNext();)
        {
            ProfileServicesResponse.ProfileData.Entries entries = (ProfileServicesResponse.ProfileData.Entries)iterator.next();
            if (profiledata.isMsaSource(entries) && profiledata.isVerified(entries))
            {
                return entries;
            }
        }

        return null;
    }

    private void initializeSignInPSTNWithCountry(MnvStateData mnvstatedata, ProfileServicesResponse.ProfileData profiledata)
    {
        Object obj = accountProvider.get();
        if (AccountUtil.b(((Account) (obj))))
        {
            log.info("Sign in name is not a phone number since account is a Skype name login.");
        } else
        {
            obj = ((Account) (obj)).getSigninNameProp();
            if (((String) (obj)).contains("@"))
            {
                log.info("Sign in name is not a phone number since it is an email.");
                return;
            }
            if (TextUtils.isEmpty(mnvUtil.stripPhoneNumber(((String) (obj)))))
            {
                log.info("Sign in name is not a phone number since it has no numeric characters.");
                return;
            }
            profiledata = getProfilePhoneEntryMatchingSignInName(((String) (obj)), profiledata);
            if (profiledata == null)
            {
                log.info("No matching phone entry found in profile data so sign in name not considered a phone number.");
                return;
            }
            if (!profiledata.isVerified())
            {
                log.warning("Sign in phone number entry not verified.");
                mnvAnalytics.report(AnalyticsEvent.cK);
            }
            profiledata = normalizeSignInNameMatchingProfilePhoneEntry(((String) (obj)), mnvUtil.getCountryCodeObjectFromString(profiledata.getCountry()));
            if (!TextUtils.isEmpty(profiledata))
            {
                mnvstatedata.setSignInPSTNWithCountry(profiledata);
                log.info((new StringBuilder("Initialized sign in PSTN with country as ")).append(profiledata).toString());
                return;
            }
        }
    }

    private boolean isDeviceNumber(ProfileServicesResponse.ProfileData.Entries entries)
    {
        CountryCode countrycode = mnvUtil.getCountryCodeObjectFromString(entries.getCountry());
        return mnvUtil.isDeviceNumber(countrycode, entries.getName());
    }

    private boolean isFirstTime(ProfileServicesResponse.ProfileData profiledata)
    {
        return profiledata.getEntries().size() == 0;
    }

    private boolean isMnvCompleted()
    {
        return mnvCases.isMnvCompleted();
    }

    private boolean isProfilePhoneEntryPossibleMatchForSignInName(ProfileServicesResponse.ProfileData.Entries entries, String s)
    {
        Integer integer = Integer.valueOf(mnvUtil.getCountryCodeFromString(entries.getCountry()));
        s = mnvUtil.cleanPhoneNumber(s, integer.intValue());
        entries = mnvUtil.stripPhoneNumber(entries.getName());
        if (!s.endsWith(entries))
        {
            return false;
        }
        if (s.equals(entries))
        {
            return true;
        } else
        {
            return (new StringBuilder()).append(integer.toString()).append(entries).toString().equals(s);
        }
    }

    private boolean isSignInPhoneNumber(String s, ProfileServicesResponse.ProfileData.Entries entries)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            entries = lib.normalizePSTNWithCountry(entries.getName(), mnvUtil.getCountryCodeFromString(entries.getCountry())).m_normalized;
            return mnvUtil.comparePhoneNumbers(s, entries);
        }
    }

    private boolean isVerificationQosAlert(ProfileServicesResponse.ProfileData profiledata)
    {
        return profiledata.isQosAlert();
    }

    private String normalizeSignInNameMatchingProfilePhoneEntry(String s, CountryCode countrycode)
    {
        if (TextUtils.isEmpty(s))
        {
            log.severe("Sign in name is empty.");
        } else
        if (lib.getIdentityType(s) != com.skype.SkyLib.IDENTITYTYPE.SKYPE_MYSELF)
        {
            s = lib.normalizePSTNWithCountry(s, countrycode.c());
            if (((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (s)).m_return != com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK)
            {
                mnvAnalytics.reportWithValue(((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (s)).m_return.toString(), AnalyticsEvent.cR);
                return null;
            } else
            {
                return ((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (s)).m_normalized;
            }
        }
        return null;
    }

    private void setAlreadyVerified()
    {
        mnvCases.setAlreadyVerified();
    }

    private void setFirstTimeState(MnvStateData mnvstatedata)
    {
        MnvStateData.PHONE_TYPE phone_type = MnvStateData.PHONE_TYPE.USER_ENTERED;
        if (hasDeviceNumber)
        {
            phone_type = MnvStateData.PHONE_TYPE.DEVICE_ENTERED;
        }
        if (mnvCases.isAutoBuddyEnabled())
        {
            mnvstatedata.setNextState(MnvManager.States.ADD_PHONE_VERIFY_BY_SMS);
        }
        mnvstatedata.setType(phone_type);
    }

    private void setMnvCompletedState(MnvStateData mnvstatedata)
    {
        mnvstatedata.setNextState(MnvManager.States.COMPLETED);
    }

    private void setMsaSourceState(MnvStateData mnvstatedata, ProfileServicesResponse.ProfileData.Entries entries)
    {
        mnvstatedata.setSource(MnvStateData.PHONE_SOURCE.MSA);
        mnvstatedata.setSkipAddFriendsView(false);
        if (isSignInPhoneNumber(mnvstatedata.getSignInPSTNWithCountry(), entries) && doesNotConflictWithDeviceNumber(entries))
        {
            log.info("Configuring MSA verified PH# for background short circuiting");
            mnvstatedata.setSkipAddNumberFlow(true);
            mnvstatedata.setNextState(MnvManager.States.ADD_VERIFIED_SOURCE_MSA);
            mnvstatedata.setCountryCode(mnvUtil.getCountryCodeObjectFromString(entries.getCountry()));
            mnvstatedata.setPhoneNumber(entries.getName());
        } else
        {
            mnvstatedata.setType(MnvStateData.PHONE_TYPE.SERVER_ENTERED);
            mnvstatedata.setPhoneNumber(entries.getName());
            mnvstatedata.setCountryCode(mnvUtil.getCountryCodeObjectFromString(entries.getCountry()));
            mnvstatedata.setNextState(MnvManager.States.ADD_VERIFIED_SOURCE_MSA);
            if (hasDeviceNumber && !isDeviceNumber(entries))
            {
                mnvstatedata.setType(MnvStateData.PHONE_TYPE.DEVICE_ENTERED);
                mnvstatedata.setNextState(MnvManager.States.ADD_PHONE_VERIFY_BY_SMS);
                return;
            }
        }
    }

    private void setSkypeSourceState(MnvStateData mnvstatedata, ProfileServicesResponse.ProfileData.Entries entries)
    {
        mnvstatedata.setType(MnvStateData.PHONE_TYPE.SERVER_ENTERED);
        MnvManager.States states1 = MnvManager.States.ADD_PHONE_VERIFY_BY_SMS;
        MnvManager.States states;
        if (entries.isVerified())
        {
            states = states1;
            if (doesNotConflictWithDeviceNumber(entries))
            {
                if (!mnvCases.isAutoBuddyEnabled())
                {
                    mnvstatedata.setSkipAddNumberFlow(true);
                    states = states1;
                } else
                {
                    states = MnvManager.States.COMPLETED;
                    setAlreadyVerified();
                }
            }
        } else
        {
            mnvstatedata.setPhoneNumber(entries.getName());
            mnvstatedata.setCountryCode(mnvUtil.getCountryCodeObjectFromString(entries.getCountry()));
            states = states1;
        }
        mnvstatedata.setNextState(states);
    }

    private void setVerificationQosAlertState(MnvStateData mnvstatedata)
    {
        mnvstatedata.setNextState(MnvManager.States.QOS_ALERT);
    }

    public void processPhoneEntry(MnvStateData mnvstatedata, ProfileServicesResponse.ProfileData profiledata)
    {
        mnvstatedata.setPhoneNumber(devicePhoneNumber);
        if (isVerificationQosAlert(profiledata))
        {
            setVerificationQosAlertState(mnvstatedata);
            return;
        } else
        {
            mnvstatedata.setNextState(MnvManager.States.EDIT_VERIFY_PIN);
            return;
        }
    }

    public void processPinEntry(MnvStateData mnvstatedata, ProfileServicesResponse.ProfileData profiledata)
    {
        if (isVerificationQosAlert(profiledata))
        {
            setVerificationQosAlertState(mnvstatedata);
            return;
        } else
        {
            mnvstatedata.setNextState(MnvManager.States.VERIFIED);
            return;
        }
    }

    public void processPreCheck(MnvStateData mnvstatedata, ProfileServicesResponse.ProfileData profiledata)
    {
        a aa[];
        int i;
        int j;
        if (hasDeviceNumber)
        {
            mnvstatedata.setSource(MnvStateData.PHONE_SOURCE.DEVICE);
            mnvstatedata.setPhoneNumber(devicePhoneNumber);
        }
        mnvstatedata.setCountryCode(countryCodeObject);
        mnvstatedata.setNextState(MnvManager.States.ADD_PHONE_VERIFY_BY_SMS);
        mnvstatedata.setSkipAddFriendsView(mnvCases.isAutoBuddyEnabled());
        log.info((new StringBuilder("MNV MnvManagerEvents isAutoBuddyEnabled: ")).append(mnvCases.isAutoBuddyEnabled()).toString());
        initializeSignInPSTNWithCountry(mnvstatedata, profiledata);
        aa = a.values();
        j = aa.length;
        i = 0;
_L9:
        if (i >= j) goto _L2; else goto _L1
_L1:
        a a1;
        a1 = aa[i];
        log.info((new StringBuilder("MNV MnvManagerEvents processing pre-check event: ")).append(a1.name()).toString());
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[];
            static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[];

            static 
            {
                $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code = new int[ProfileServicesErrors.a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[ProfileServicesErrors.a.RETRY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[ProfileServicesErrors.a.UNABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[ProfileServicesErrors.a.PHONE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[ProfileServicesErrors.a.PIN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[ProfileServicesErrors.a.INVALID.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[ProfileServicesErrors.a.UNSUPPORTED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents = new int[a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[a.IS_VERIFICATION_QOS_ALERT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[a.IS_FIRST_TIME.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[a.IS_MNV_COMPLETED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[a.IS_MSA_SOURCE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[a.IS_SKYPE_SOURCE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.android.app.mnv.MnvManagerEvents.PreCheckEvents[a1.ordinal()];
        JVM INSTR tableswitch 1 5: default 176
    //                   1 212
    //                   2 253
    //                   3 294
    //                   4 334
    //                   5 381;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_381;
_L3:
        log.info((new StringBuilder("MNV MnvManagerEvents unknown pre-check event: ")).append(a1.name()).toString());
_L11:
        i++;
          goto _L9
_L4:
        if (!isVerificationQosAlert(profiledata)) goto _L11; else goto _L10
_L10:
        log.info((new StringBuilder("MNV MnvManagerEvents processed pre-check event: ")).append(a1.name()).toString());
        setVerificationQosAlertState(mnvstatedata);
_L2:
        return;
_L5:
        if (!isFirstTime(profiledata)) goto _L11; else goto _L12
_L12:
        log.info((new StringBuilder("MNV MnvManagerEvents processed pre-check event: ")).append(a1.name()).toString());
        setFirstTimeState(mnvstatedata);
        return;
_L6:
        if (!isMnvCompleted()) goto _L11; else goto _L13
_L13:
        log.info((new StringBuilder("MNV MnvManagerEvents processed pre-check event: ")).append(a1.name()).toString());
        setMnvCompletedState(mnvstatedata);
        return;
_L7:
        ProfileServicesResponse.ProfileData.Entries entries = getVerifiedMsaEntry(profiledata);
        if (entries == null) goto _L11; else goto _L14
_L14:
        log.info((new StringBuilder("MNV MnvManagerEvents processed pre-check event: ")).append(a1.name()).toString());
        setMsaSourceState(mnvstatedata, entries);
        return;
        ProfileServicesResponse.ProfileData.Entries entries1 = getSkypeEntry(profiledata);
        if (entries1 != null)
        {
            log.info((new StringBuilder("MNV MnvManagerEvents processed pre-check event: ")).append(a1.name()).toString());
            setSkypeSourceState(mnvstatedata, entries1);
            return;
        }
          goto _L11
    }

    public void processResendPinBySms(MnvStateData mnvstatedata, ProfileServicesResponse.ProfileData profiledata)
    {
        mnvstatedata.setNextState(MnvManager.States.EDIT_RESEND_PIN_BY_SMS);
    }

    public void processResendPinByVoice(MnvStateData mnvstatedata, ProfileServicesResponse.ProfileData profiledata)
    {
        mnvstatedata.setNextState(MnvManager.States.EDIT_RESEND_PIN_BY_VOICE);
    }

    public void processServiceError(MnvStateData mnvstatedata, ProfileServicesResponse.ProfileError profileerror)
    {
        profileerror = ProfileServicesErrors.ErrorState.fromErrorString(profileerror.getCode());
        mnvstatedata.setErrorState(profileerror);
        _cls1..SwitchMap.com.skype.android.app.mnv.ProfileServicesErrors.Code[((ProfileServicesErrors.ErrorState) (profileerror)).code.ordinal()];
        JVM INSTR tableswitch 1 6: default 64
    //                   1 98
    //                   2 106
    //                   3 114
    //                   4 140
    //                   5 148
    //                   6 163;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        log.info((new StringBuilder("MNV MnvManagerEvents unknown error: ")).append(((ProfileServicesErrors.ErrorState) (profileerror)).code).toString());
        mnvstatedata.setNextState(MnvManager.States.ERRORS_UNKNOWN);
_L9:
        return;
_L2:
        mnvstatedata.setNextState(MnvManager.States.ERRORS_RETRY);
        return;
_L3:
        mnvstatedata.setNextState(MnvManager.States.ERRORS_UNABLE);
        return;
_L4:
        mnvstatedata.setNextState(MnvManager.States.ERRORS_PHONE);
        if (profileerror != ProfileServicesErrors.ErrorState.ALREADY_VERIFIED) goto _L9; else goto _L8
_L8:
        mnvstatedata.setNextState(MnvManager.States.VERIFIED);
        setAlreadyVerified();
        return;
_L5:
        mnvstatedata.setNextState(MnvManager.States.ERRORS_PIN);
        return;
_L6:
        if (profileerror != ProfileServicesErrors.ErrorState.INVALID_PHONE_NUMBER) goto _L9; else goto _L10
_L10:
        mnvstatedata.setNextState(MnvManager.States.ERRORS_PHONE);
        return;
_L7:
        mnvstatedata.setNextState(MnvManager.States.ERRORS_UNSUPPORTED);
        return;
    }

}
