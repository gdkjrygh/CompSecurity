// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;

import android.telephony.TelephonyManager;
import com.facebook.debug.log.b;
import com.google.common.base.Strings;
import java.util.Locale;
import javax.inject.a;

public class p
    implements a
{

    private static final Class a = com/facebook/common/hardware/p;
    private final TelephonyManager b;
    private final a c;

    public p(TelephonyManager telephonymanager, a a1)
    {
        b = telephonymanager;
        c = a1;
    }

    public String a()
    {
        String s1 = b.getSimCountryIso();
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = b.getNetworkCountryIso();
        }
        s1 = s;
        if (Strings.isNullOrEmpty(s))
        {
            s1 = ((Locale)c.b()).getCountry();
        }
        if (!Strings.isNullOrEmpty(s1))
        {
            return s1.toUpperCase();
        } else
        {
            com.facebook.debug.log.b.e(a, "No ISO country code detected! This should never happen.");
            return null;
        }
    }

    public Object b()
    {
        return a();
    }

}
