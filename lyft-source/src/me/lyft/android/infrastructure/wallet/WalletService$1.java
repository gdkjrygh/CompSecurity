// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.wallet;

import android.content.Intent;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.gson.Gson;
import com.stripe.model.Card;
import com.stripe.model.Token;
import com.stripe.net.APIResource;
import me.lyft.android.infrastructure.activity.ActivityResult;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.wallet:
//            WalletService, WalletStripeToken

class this._cls0
    implements Func1
{

    final WalletService this$0;

    public volatile Object call(Object obj)
    {
        return call((ActivityResult)obj);
    }

    public Observable call(ActivityResult activityresult)
    {
        if (activityresult.getResultCode() == -1)
        {
            activityresult = ((FullWallet)activityresult.getIntent().getParcelableExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET")).b().b();
            activityresult = (Token)APIResource.GSON.a(activityresult, com/stripe/model/Token);
            Card card = activityresult.getCard();
            return Observable.just(new WalletStripeToken(activityresult.getId(), card.getType(), card.getLast4()));
        }
        if (activityresult.getResultCode() == 0)
        {
            return Observable.empty();
        } else
        {
            return Observable.error(WalletService.access$000(WalletService.this, activityresult.getIntent()));
        }
    }

    ()
    {
        this$0 = WalletService.this;
        super();
    }
}
