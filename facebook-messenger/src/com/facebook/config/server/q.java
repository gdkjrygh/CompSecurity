// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.server;

import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.common.w.m;
import com.facebook.common.w.n;
import com.facebook.config.b.a;
import java.util.Locale;

public class q
{

    private final a a;
    private final TelephonyManager b;
    private final Locale c;
    private final String d;

    public q(a a1, TelephonyManager telephonymanager, Locale locale, String s)
    {
        a = a1;
        b = telephonymanager;
        c = locale;
        d = s;
    }

    private static String a(String s)
    {
        if (n.a(s))
        {
            return "null";
        } else
        {
            return s.replace("/", "-").replace(";", "-");
        }
    }

    public String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(System.getProperty("http.agent"));
        stringbuilder.append(" [");
        stringbuilder.append(m.a("%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s", new Object[] {
            "FBAN", d, "FBAV", a(a.a()), "FBLC", a(c.toString()), "FBBV", Integer.valueOf(a.b()), "FBCR", a(b.getNetworkOperatorName()), 
            "FBMF", a(Build.MANUFACTURER), "FBBD", a(Build.BRAND), "FBDV", a(Build.MODEL), "FBSV", a(android.os.Build.VERSION.RELEASE)
        }));
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
