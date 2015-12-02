// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentConfirmActivity;
import com.paypal.android.sdk.payments.PaymentConfirmation;
import com.paypal.android.sdk.payments.ProofOfPayment;

public final class cbr
    implements bzt
{

    private PaymentConfirmActivity a;

    public cbr(PaymentConfirmActivity paymentconfirmactivity)
    {
        a = paymentconfirmactivity;
        super();
    }

    public final void a(bzw bzw1)
    {
        PaymentConfirmActivity.c(a).c().a();
        PaymentConfirmActivity.f(a);
        if (bzw1.a() && !"UNAUTHORIZED_PAYMENT".equals(bzw1.b))
        {
            switch (cal.a[PaymentConfirmActivity.g(a).ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                ccm.a(a, bux.a(buz.aL), 4);
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
        switch (cal.a[PaymentConfirmActivity.g(a).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_ERROR_CODE", bzw1.b);
            a.showDialog(5, bundle);
            return;

        case 2: // '\002'
        case 3: // '\003'
            PaymentConfirmActivity.i(a).b(true);
            break;
        }
        ccm.a(a, bux.a(bzw1.b), 1);
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
        if (obj instanceof bwb)
        {
            PaymentConfirmActivity.a(a, (bwb)obj);
            return;
        }
    }
}
