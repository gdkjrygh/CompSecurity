// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.telephony.TelephonyManager;

// Referenced classes of package com.soundcloud.android.utils:
//            CountryProvider

public class TelphonyBasedCountryProvider
    implements CountryProvider
{

    private TelephonyManager telephonyManager;

    public TelphonyBasedCountryProvider(TelephonyManager telephonymanager)
    {
        telephonyManager = telephonymanager;
    }

    public String getCountryCode()
    {
        if (telephonyManager != null)
        {
            String s1 = telephonyManager.getSimCountryIso();
            String s = s1;
            if (s1 == null)
            {
                s = telephonyManager.getNetworkCountryIso();
            }
            return s;
        } else
        {
            return null;
        }
    }
}
