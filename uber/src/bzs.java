// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.bF;
import com.paypal.android.sdk.bI;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalService;

public final class bzs
    implements bzv
{

    private PayPalService a;

    public bzs(PayPalService paypalservice)
    {
        a = paypalservice;
        super();
    }

    public final void a()
    {
        if (!PayPalService.a(a).j() && a.b != null)
        {
            a.a(a.c().c.b(), a.b.e());
            a.b = null;
            a.t();
        }
    }

    public final void a(bzw bzw)
    {
    }
}
