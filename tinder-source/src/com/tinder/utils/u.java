// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;

public final class u
{

    public static String a(Context context)
    {
        String s = ((TelephonyManager)context.getSystemService("phone")).getSimCountryIso().toUpperCase();
        context = context.getResources().getStringArray(0x7f070006);
        for (int i = 0; i < context.length; i++)
        {
            String as[] = context[i].split(",");
            if (as[1].trim().equals(s.trim()))
            {
                return as[0];
            }
        }

        return "1";
    }
}
