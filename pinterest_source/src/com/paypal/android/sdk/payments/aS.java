// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.by;
import com.paypal.android.sdk.cF;
import com.paypal.android.sdk.cf;
import com.paypal.android.sdk.g;

class aS
{

    private static final String a = com/paypal/android/sdk/payments/aS.getSimpleName();

    aS()
    {
    }

    static String a()
    {
        String s = by.a().c().a();
        return String.format("https://www.paypal.com/signup/account?country.x=%s&locale.x=%s", new Object[] {
            s, cF.c(s)
        });
    }

}
