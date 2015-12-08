// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.bB;
import com.paypal.android.sdk.bI;
import com.paypal.android.sdk.bL;

// Referenced classes of package com.paypal.android.sdk.payments:
//            aG, PayPalService, PayPalConfiguration, aH

final class aD
    implements aG
{

    private PayPalService a;

    aD(PayPalService paypalservice)
    {
        a = paypalservice;
        super();
    }

    public final void a()
    {
        if (!PayPalService.a(a).i() && a.b != null)
        {
            a.a(a.c().c.a(), a.b.e());
            a.b = null;
            a.p();
        }
    }

    public final void a(aH ah)
    {
    }
}
