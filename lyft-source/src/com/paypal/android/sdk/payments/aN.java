// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.bR;
import com.paypal.android.sdk.bk;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.f;

class aN
{

    private static final String a = com/paypal/android/sdk/payments/aN.getSimpleName();

    aN()
    {
    }

    static String a()
    {
        String s = bk.a().c().a();
        return String.format("https://www.paypal.com/signup/account?country.x=%s&locale.x=%s", new Object[] {
            s, cq.c(s)
        });
    }

}
