// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvUtil, MnvCases

public class MnvPostRequest
{

    private static final Logger log = Logger.getLogger("MnvPostRequest");
    private String inputCountry;
    private String inputPhoneNumber;
    private final MnvCases mnvCases;
    private final MnvUtil mnvUtil;
    private ProfileServicesResponse.ProfileData profileData;
    private MnvManager.States state;

    public MnvPostRequest(MnvUtil mnvutil, MnvCases mnvcases)
    {
        mnvUtil = mnvutil;
        mnvCases = mnvcases;
    }

    private void deriveStateFromPhoneNumber()
    {
        ProfileServicesResponse.ProfileData.Entries entries = getMatchingEntry();
        if (entries == null) goto _L2; else goto _L1
_L1:
        boolean flag = profileData.isVerified(entries);
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesResponse$Source[];

            static 
            {
                $SwitchMap$com$skype$android$app$mnv$ProfileServicesResponse$Source = new int[ProfileServicesResponse.a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesResponse$Source[ProfileServicesResponse.a.MSA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesResponse$Source[ProfileServicesResponse.a.SKYPE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.android.app.mnv.ProfileServicesResponse.Source[entries.getSource().ordinal()];
        JVM INSTR tableswitch 1 2: default 52
    //                   1 53
    //                   2 73;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        if (flag)
        {
            state = MnvManager.States.ADD_VERIFIED_SOURCE_MSA;
            return;
        } else
        {
            state = MnvManager.States.ADD_PHONE_VERIFY_BY_SMS;
            return;
        }
_L4:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        state = MnvManager.States.VERIFIED;
        com.skype.android.util.CountryCode countrycode = mnvUtil.getCountryCodeObjectFromString(entries.getCountry());
        if (mnvUtil.isDeviceNumber(countrycode, entries.getName()))
        {
            mnvCases.setCompleted();
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        state = MnvManager.States.EDIT_PHONE_VERIFY_BY_SMS;
        if (profileData.isSuggestedVerifyMethod(entries, MnvUtil.VERIFY_METHOD.VOICE))
        {
            state = MnvManager.States.ADD_PHONE_VERIFY_BY_VOICE;
            if (profileData.isStateVerificationPending(entries))
            {
                state = MnvManager.States.EDIT_PHONE_VERIFY_BY_VOICE;
                return;
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    private ProfileServicesResponse.ProfileData.Entries getMatchingEntry()
    {
label0:
        {
            if (profileData == null)
            {
                break label0;
            }
            int i = mnvUtil.getCountryCodeFromString(inputCountry);
            inputPhoneNumber = mnvUtil.cleanPhoneNumber(inputPhoneNumber, i);
            Iterator iterator = profileData.getEntries().iterator();
            ProfileServicesResponse.ProfileData.Entries entries;
            String s;
            int j;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    entries = (ProfileServicesResponse.ProfileData.Entries)iterator.next();
                } while (TextUtils.isEmpty(entries.getCountry()));
                j = mnvUtil.getCountryCodeFromString(entries.getCountry());
                s = mnvUtil.cleanPhoneNumber(entries.getName(), j);
            } while (i != j || !mnvUtil.comparePhoneNumbers(inputPhoneNumber, s));
            log.info((new StringBuilder("MNV getMatchingEntry phone number matches: ")).append(inputPhoneNumber).toString());
            return entries;
        }
        return null;
    }

    public MnvManager.States getStateFromProfileData(MnvManager.States states, ProfileServicesResponse.ProfileData profiledata, String s, String s1)
    {
        state = states;
        profileData = profiledata;
        inputCountry = s1;
        inputPhoneNumber = s;
        deriveStateFromPhoneNumber();
        return state;
    }

}
