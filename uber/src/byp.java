// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.util.Log;
import com.paypal.android.sdk.payments.PayPalConfiguration;

public abstract class byp
{

    private Intent a;
    private PayPalConfiguration b;

    byp(Intent intent, PayPalConfiguration paypalconfiguration)
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

    public final boolean d()
    {
        if (!b.o())
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
