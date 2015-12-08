// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.d;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;

public final class e
{

    private final TelephonyManager a;

    public e(Context context)
    {
        this((TelephonyManager)context.getSystemService("phone"));
    }

    private e(TelephonyManager telephonymanager)
    {
        a = telephonymanager;
    }

    public final String a()
    {
        String s1 = a.getLine1Number();
        b b1 = com.microsoft.onlineid.a.a.a();
        String s;
        if (TextUtils.isEmpty(s1))
        {
            s = "Does not exist in Telephony Manager";
        } else
        {
            s = "Exists in Telephony Manager";
        }
        b1.a("User data", "Mobile phone number", s);
        return s1;
    }

    public final String b()
    {
        String s1 = a.getSimCountryIso();
        b b1 = com.microsoft.onlineid.a.a.a();
        String s;
        if (TextUtils.isEmpty(s1))
        {
            s = "Does not exist in Telephony Manager";
        } else
        {
            s = "Exists in Telephony Manager";
        }
        b1.a("User data", "Country code", s);
        return s1;
    }
}
