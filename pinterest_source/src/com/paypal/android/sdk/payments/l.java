// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Build;
import com.paypal.android.sdk.c;
import com.paypal.android.sdk.d;

final class l
    implements c
{

    l()
    {
    }

    public final String a()
    {
        return "2.10.0";
    }

    public final String b()
    {
        String s = android.os.Build.VERSION.RELEASE;
        String s1 = (new StringBuilder()).append(Build.MANUFACTURER).append(" ").append(Build.MODEL).toString();
        StringBuilder stringbuilder = new StringBuilder();
        if (d.c("touch;"))
        {
            stringbuilder.append("touch; ");
        }
        return String.format("PayPalSDK/%s %s (%s %s; %s; %s)", new Object[] {
            "PayPal-Android-SDK", "2.10.0", "Android", s, s1, stringbuilder.toString().trim()
        });
    }

    public final String c()
    {
        return "eb2c9cf082a9a0bfa8402c96d2d5c799ad2648b5";
    }
}
