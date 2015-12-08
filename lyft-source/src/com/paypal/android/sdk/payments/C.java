// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalConfiguration

abstract class C
{

    private Intent a;
    private PayPalConfiguration b;

    C(Intent intent, PayPalConfiguration paypalconfiguration)
    {
        a = intent;
        b = paypalconfiguration;
        if (!a.hasExtra("com.paypal.android.sdk.paypalConfiguration"))
        {
            Log.w(a(), "Please add PayPalService.EXTRA_PAYPAL_CONFIGURATION to this activity for restart resiliency.");
        }
    }

    abstract String a();

    protected final void a(boolean flag, String s)
    {
        if (!flag)
        {
            Log.e(a(), (new StringBuilder()).append(s).append(" is invalid.  Please see the docs.").toString());
        }
    }

    final Intent b()
    {
        return a;
    }

    final PayPalConfiguration c()
    {
        return b;
    }

    protected final boolean d()
    {
        if (!b.n())
        {
            Log.e(a(), "Service extra invalid.");
            return false;
        } else
        {
            return true;
        }
    }

    abstract boolean e();
}
