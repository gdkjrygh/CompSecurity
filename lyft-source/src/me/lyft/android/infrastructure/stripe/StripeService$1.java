// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.stripe;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.Token;
import com.stripe.net.RequestOptions;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.domain.payment.ICard;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.stripe:
//            StripeService, StripeInvalidCardException, StripeServiceException

class val.card
    implements rx.scribe
{

    final StripeService this$0;
    final ICard val$card;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Object obj = StripeService.access$000(StripeService.this).getStripeKey();
        StripeService.validateKey(((String) (obj)));
        obj = RequestOptions.builder().setApiKey(((String) (obj))).build();
        subscriber.onNext(Token.create(StripeService.hashMapFromCard(val$card), ((RequestOptions) (obj))).getId());
        subscriber.onCompleted();
        return;
        Object obj1;
        obj1;
        if (!(obj1 instanceof CardException)) goto _L2; else goto _L1
_L1:
        obj1 = new StripeInvalidCardException(((Exception) (obj1)).getMessage(), ((Throwable) (obj1)));
_L4:
        subscriber.onError(((Throwable) (obj1)));
        return;
_L2:
        if (obj1 instanceof InvalidRequestException)
        {
            obj1 = new StripeServiceException(((Exception) (obj1)).getMessage(), ((Throwable) (obj1)));
        } else
        if (obj1 instanceof AuthenticationException)
        {
            obj1 = new StripeServiceException(((Exception) (obj1)).getMessage(), ((Throwable) (obj1)));
        } else
        if (obj1 instanceof APIConnectionException)
        {
            obj1 = new StripeServiceException(((Exception) (obj1)).getMessage(), ((Throwable) (obj1)));
        } else
        if (obj1 instanceof StripeException)
        {
            obj1 = new StripeServiceException(((Exception) (obj1)).getMessage(), ((Throwable) (obj1)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    eption()
    {
        this$0 = final_stripeservice;
        val$card = ICard.this;
        super();
    }
}
