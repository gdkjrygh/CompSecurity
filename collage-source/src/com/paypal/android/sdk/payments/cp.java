// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.Intent;
import android.os.Bundle;
import com.paypal.android.sdk.ed;
import com.paypal.android.sdk.ek;
import com.paypal.android.sdk.em;
import com.paypal.android.sdk.eu;
import com.paypal.android.sdk.fo;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ah, PaymentConfirmActivity, PayPalService, al, 
//            bd, cu, di, ProofOfPayment, 
//            PaymentConfirmation, aw

final class cp
    implements ah
{

    private PaymentConfirmActivity a;

    cp(PaymentConfirmActivity paymentconfirmactivity)
    {
        a = paymentconfirmactivity;
        super();
    }

    public final void a(al al1)
    {
        PaymentConfirmActivity.c(a).c().a();
        PaymentConfirmActivity.f(a);
        if (al1.a() && !"UNAUTHORIZED_PAYMENT".equals(al1.b))
        {
            switch (bd.a[PaymentConfirmActivity.g(a).ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                di.a(a, ek.a(em.aL), 4);
                return;

            case 2: // '\002'
            case 3: // '\003'
                a.showDialog(2);
                break;
            }
            PaymentConfirmActivity.a();
            (new StringBuilder("server thinks token is expired, get new one. AccessToken: ")).append(PaymentConfirmActivity.c(a).c().c);
            PaymentConfirmActivity.c(a).a(PaymentConfirmActivity.h(a), true);
            return;
        }
        switch (bd.a[PaymentConfirmActivity.g(a).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_ERROR_CODE", al1.b);
            a.showDialog(5, bundle);
            return;

        case 2: // '\002'
        case 3: // '\003'
            PaymentConfirmActivity.i(a).b(true);
            break;
        }
        di.a(a, ek.a(al1.b), 1);
    }

    public final void a(Object obj)
    {
        if (obj instanceof ProofOfPayment)
        {
            obj = (ProofOfPayment)obj;
            obj = new PaymentConfirmation(PaymentConfirmActivity.c(a).e(), PaymentConfirmActivity.d(a).a(), ((ProofOfPayment) (obj)));
            Intent intent = a.getIntent();
            intent.putExtra("com.paypal.android.sdk.paymentConfirmation", ((android.os.Parcelable) (obj)));
            PaymentConfirmActivity.e(a);
            a.setResult(-1, intent);
            a.finish();
        } else
        if (obj instanceof fo)
        {
            PaymentConfirmActivity.a(a, (fo)obj);
            return;
        }
    }
}
