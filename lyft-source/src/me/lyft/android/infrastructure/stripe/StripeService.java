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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.ICard;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.infrastructure.stripe:
//            IStripeService, StripeInvalidCardException, StripeServiceException

public class StripeService
    implements IStripeService
{

    private static final String PREPAID_FUNDING = "prepaid";
    private ILyftPreferences preferences;

    public StripeService(ILyftPreferences ilyftpreferences)
    {
        preferences = ilyftpreferences;
    }

    static Map hashMapFromCard(ICard icard)
    {
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap();
        hashmap1.put("number", nullIfBlank(icard.getNumber()));
        hashmap1.put("cvc", nullIfBlank(icard.getCvc()));
        hashmap1.put("exp_month", icard.getExpMonth());
        hashmap1.put("exp_year", icard.getExpYear());
        hashmap1.put("name", nullIfBlank(icard.getName()));
        hashmap1.put("address_line1", nullIfBlank(icard.getAddressLine1()));
        hashmap1.put("address_line2", nullIfBlank(icard.getAddressLine2()));
        hashmap1.put("address_city", nullIfBlank(icard.getCity()));
        hashmap1.put("address_zip", nullIfBlank(icard.getAddressZip()));
        hashmap1.put("address_state", nullIfBlank(icard.getState()));
        hashmap1.put("address_country", nullIfBlank(icard.getAddressCountry()));
        icard = (new HashSet(hashmap1.keySet())).iterator();
        do
        {
            if (!icard.hasNext())
            {
                break;
            }
            String s = (String)icard.next();
            if (hashmap1.get(s) == null)
            {
                hashmap1.remove(s);
            }
        } while (true);
        hashmap.put("card", hashmap1);
        return hashmap;
    }

    static String nullIfBlank(String s)
    {
        String s1 = s;
        if (Strings.isNullOrBlank(s))
        {
            s1 = null;
        }
        return s1;
    }

    static void validateKey(String s)
    {
        if (s == null || s.length() == 0)
        {
            throw new AuthenticationException("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.");
        }
        if (s.startsWith("sk_"))
        {
            throw new AuthenticationException("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js");
        } else
        {
            return;
        }
    }

    public Observable createCardToken(final ICard card)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final StripeService this$0;
            final ICard val$card;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Object obj = preferences.getStripeKey();
                StripeService.validateKey(((String) (obj)));
                obj = RequestOptions.builder().setApiKey(((String) (obj))).build();
                subscriber.onNext(Token.create(StripeService.hashMapFromCard(card), ((RequestOptions) (obj))).getId());
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

            
            {
                this$0 = StripeService.this;
                card = icard;
                super();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

}
