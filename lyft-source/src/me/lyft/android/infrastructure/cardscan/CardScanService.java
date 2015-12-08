// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.cardscan;

import android.app.Activity;
import android.content.Intent;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.domain.payment.Card;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.activity.ActivityService;
import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.infrastructure.cardscan:
//            ICardScanService

public class CardScanService extends ActivityService
    implements ICardScanService
{

    AsyncActionAnalytics scanCardAnalytics;
    PublishSubject scannedCardSubject;

    public CardScanService()
    {
        scannedCardSubject = PublishSubject.create();
        scanCardAnalytics = PaymentAnalytics.createScanCardAnalytics();
    }

    private ICard fromScanResult(CreditCard creditcard)
    {
        Integer integer = null;
        String s = creditcard.getFormattedCardNumber();
        String s1 = creditcard.postalCode;
        String s2 = creditcard.cvv;
        if (creditcard.isExpiryValid())
        {
            integer = Integer.valueOf(creditcard.expiryMonth);
            creditcard = Integer.valueOf(creditcard.expiryYear);
        } else
        {
            Object obj = null;
            creditcard = integer;
            integer = obj;
        }
        return Card.create(s, integer, creditcard, s2, s1);
    }

    public Observable observeScannedCard()
    {
        return scannedCardSubject.asObservable();
    }

    public void onActivityResult(Activity activity, ActivityResult activityresult)
    {
label0:
        {
            super.onActivityResult(activity, activityresult);
            if (activityresult.getRequestCode() == 21)
            {
                activity = activityresult.getIntent();
                if (activity == null || !activity.hasExtra("io.card.payment.scanResult"))
                {
                    break label0;
                }
                activity = fromScanResult((CreditCard)activity.getParcelableExtra("io.card.payment.scanResult"));
                scanCardAnalytics.trackResponseSuccess();
                scannedCardSubject.onNext(activity);
            }
            return;
        }
        scanCardAnalytics.trackResponseFailure("card_scan_canceled");
    }

    public void startCardScan()
    {
        scanCardAnalytics.trackRequest();
        Intent intent = new Intent(getCurrentActivity(), io/card/payment/CardIOActivity);
        intent.putExtra("io.card.payment.requireExpiry", false);
        intent.putExtra("io.card.payment.requireCVV", false);
        intent.putExtra("io.card.payment.requirePostalCode", false);
        intent.putExtra("io.card.payment.scanExpiry", true);
        intent.putExtra("io.card.payment.suppressManual", true);
        intent.putExtra("io.card.payment.keepApplicationTheme", true);
        getCurrentActivity().startActivityForResult(intent, 21);
    }
}
