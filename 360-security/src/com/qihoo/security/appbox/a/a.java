// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.a;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

public class a
{

    public static String a()
    {
        return Locale.getDefault().getLanguage();
    }

    public static String a(Context context)
    {
        return "1.0.8.3742";
    }

    public static String b(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        String s = context.getSimCountryIso();
        if (!TextUtils.isEmpty(s))
        {
            return s.toUpperCase(Locale.ENGLISH);
        }
        context = context.getSimOperator();
        if (!TextUtils.isEmpty(context) && context.length() > 3)
        {
            return context.substring(0, 3);
        } else
        {
            return Locale.getDefault().getCountry().toUpperCase(Locale.ENGLISH);
        }
    }
}
