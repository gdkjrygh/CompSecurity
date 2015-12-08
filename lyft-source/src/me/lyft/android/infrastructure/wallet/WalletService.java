// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.wallet;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet;
import com.google.gson.Gson;
import com.stripe.model.Card;
import com.stripe.model.Token;
import com.stripe.net.APIResource;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.activity.ActivityService;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import rx.Observable;
import rx.functions.Func1;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.infrastructure.wallet:
//            IWalletService, WalletServiceException, WalletStripeToken

public class WalletService extends ActivityService
    implements IWalletService
{

    private PublishSubject activityResultSubject;
    private IGoogleApiProvider googleApiProvider;
    private ILyftPreferences lyftPreferences;

    public WalletService(IGoogleApiProvider igoogleapiprovider, ILyftPreferences ilyftpreferences)
    {
        activityResultSubject = PublishSubject.create();
        googleApiProvider = igoogleapiprovider;
        lyftPreferences = ilyftpreferences;
    }

    private static MaskedWalletRequest createMaskedWalletRequest(String s)
    {
        return MaskedWalletRequest.a().a(PaymentMethodTokenizationParameters.a().a(1).a("gateway", "stripe").a("stripe:publishableKey", s).a("stripe:version", "1.31.0").a()).b("Lyft").a(false).d(false).b(true).a("USD").c(true).a();
    }

    private WalletServiceException createWalletException(Intent intent)
    {
        return new WalletServiceException(intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", -1));
    }

    public Observable getWalletToken()
    {
        return googleApiProvider.observeReady().flatMap(new Func1() {

            final WalletService this$0;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                unit = WalletService.createMaskedWalletRequest(lyftPreferences.getStripeKey());
                Wallet.b.a(googleApiProvider.getApi(), unit, 18);
                return activityResultSubject.first(new Func1() {

                    final _cls3 this$1;

                    public Boolean call(ActivityResult activityresult)
                    {
                        boolean flag;
                        if (activityresult.getRequestCode() == 18)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        return Boolean.valueOf(flag);
                    }

                    public volatile Object call(Object obj)
                    {
                        return call((ActivityResult)obj);
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
            }

            
            {
                this$0 = WalletService.this;
                super();
            }
        }).flatMap(new Func1() {

            final WalletService this$0;

            public volatile Object call(Object obj)
            {
                return call((ActivityResult)obj);
            }

            public Observable call(ActivityResult activityresult)
            {
                if (activityresult.getResultCode() == -1)
                {
                    activityresult = (MaskedWallet)activityresult.getIntent().getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
                    activityresult = FullWalletRequest.a().a(activityresult.b()).a();
                    Wallet.b.a(googleApiProvider.getApi(), activityresult, 19);
                    return activityResultSubject.first(new Func1() {

                        final _cls2 this$1;

                        public Boolean call(ActivityResult activityresult)
                        {
                            boolean flag;
                            if (activityresult.getRequestCode() == 19)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            return Boolean.valueOf(flag);
                        }

                        public volatile Object call(Object obj)
                        {
                            return call((ActivityResult)obj);
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                }
                if (activityresult.getResultCode() == 0)
                {
                    return Observable.empty();
                } else
                {
                    return Observable.error(createWalletException(activityresult.getIntent()));
                }
            }

            
            {
                this$0 = WalletService.this;
                super();
            }
        }).flatMap(new Func1() {

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
                    return Observable.error(createWalletException(activityresult.getIntent()));
                }
            }

            
            {
                this$0 = WalletService.this;
                super();
            }
        });
    }

    public void onActivityResult(Activity activity, ActivityResult activityresult)
    {
        super.onActivityResult(activity, activityresult);
        activityResultSubject.onNext(activityresult);
    }





}
