// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.ea;
import com.paypal.android.sdk.ek;
import com.paypal.android.sdk.fi;
import com.paypal.android.sdk.g;
import com.paypal.android.sdk.gd;

class i
{

    private static final String a = com/paypal/android/sdk/payments/i.getSimpleName();

    i()
    {
    }

    static String a()
    {
        String s = ea.a().c().a();
        if (gd.c(s) || s.equalsIgnoreCase("US"))
        {
            return "https://www.paypal.com/webapps/accountrecovery/passwordrecovery";
        } else
        {
            String s1 = ek.c(s);
            return String.format("https://www.paypal.com/%s/cgi-bin/webscr?cmd=_account-recovery&from=%s&locale.x=%s", new Object[] {
                s.toLowerCase(), "PayPalMPL", s1
            });
        }
    }

}
