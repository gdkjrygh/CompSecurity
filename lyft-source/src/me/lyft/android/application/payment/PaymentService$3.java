// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.wallet.WalletStripeToken;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentService

class this._cls0
    implements Func1
{

    final PaymentService this$0;

    public volatile Object call(Object obj)
    {
        return call((WalletStripeToken)obj);
    }

    public Observable call(WalletStripeToken walletstripetoken)
    {
        String s = walletstripetoken.getToken();
        String s1 = walletstripetoken.getOriginalType();
        walletstripetoken = walletstripetoken.getOriginalLastFour();
        return PaymentService.access$200(PaymentService.this).createWalletChargeAccount(PaymentService.access$100(PaymentService.this).getUser().getId(), s, s1, walletstripetoken);
    }

    en()
    {
        this$0 = PaymentService.this;
        super();
    }
}
