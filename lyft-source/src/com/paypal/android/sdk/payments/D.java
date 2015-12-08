// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.R;
import com.paypal.android.sdk.bR;
import com.paypal.android.sdk.bk;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.f;

class D
{

    private static final String a = com/paypal/android/sdk/payments/D.getSimpleName();

    D()
    {
    }

    static String a()
    {
        String s = bk.a().c().a();
        if (R.b(s) || s.equalsIgnoreCase("US"))
        {
            return "https://www.paypal.com/webapps/accountrecovery/passwordrecovery";
        } else
        {
            String s1 = cq.c(s);
            return String.format("https://www.paypal.com/%s/cgi-bin/webscr?cmd=_account-recovery&from=%s&locale.x=%s", new Object[] {
                s.toLowerCase(), "PayPalMPL", s1
            });
        }
    }

}
