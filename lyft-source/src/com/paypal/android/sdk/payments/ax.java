// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.bn;
import com.paypal.android.sdk.bu;
import com.paypal.android.sdk.bx;

// Referenced classes of package com.paypal.android.sdk.payments:
//            aA, PayPalService, PayPalConfiguration, aB

final class ax
    implements aA
{

    private PayPalService a;

    ax(PayPalService paypalservice)
    {
        a = paypalservice;
        super();
    }

    public final void a()
    {
        if (!PayPalService.a(a).i() && a.a != null)
        {
            a.doDeleteTokenizedCreditCard(a.d().c.a(), a.a.e());
            a.a = null;
        }
    }

    public final void a(aB ab)
    {
    }
}
