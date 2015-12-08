// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.ea;
import com.paypal.android.sdk.ek;
import com.paypal.android.sdk.fi;
import com.paypal.android.sdk.g;

class cj
{

    private static final String a = com/paypal/android/sdk/payments/cj.getSimpleName();

    cj()
    {
    }

    static String a()
    {
        String s = ea.a().c().a();
        return String.format("https://www.paypal.com/signup/account?country.x=%s&locale.x=%s", new Object[] {
            s, ek.c(s)
        });
    }

}
