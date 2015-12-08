// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.ConcurAnalytics;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.driver.ExpressPayAccount;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.ChargeAccountMapper;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.lyft.coupon.CouponException;
import me.lyft.android.infrastructure.lyft.driver.ExpressPayAccountDTO;
import me.lyft.android.infrastructure.lyft.payment.ChargeAccountDTO;
import me.lyft.android.infrastructure.lyft.payment.PayPalClientTokenDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.paypal.IPayPalService;
import me.lyft.android.infrastructure.paypal.PayPalChargeData;
import me.lyft.android.infrastructure.paypal.PayPalServiceException;
import me.lyft.android.infrastructure.stripe.IStripeService;
import me.lyft.android.infrastructure.stripe.StripeInvalidCardException;
import me.lyft.android.infrastructure.stripe.StripeServiceException;
import me.lyft.android.infrastructure.wallet.IWalletService;
import me.lyft.android.infrastructure.wallet.WalletServiceException;
import me.lyft.android.infrastructure.wallet.WalletStripeToken;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.payment:
//            IPaymentService, InvalidCardException, PaymentException, InvalidWalletException, 
//            InvalidPayPalException

public class PaymentService
    implements IPaymentService
{

    private IExpressPayRepository expressPayRepository;
    private ILyftApi lyftApi;
    private IPayPalService payPalService;
    private IStripeService stripeService;
    private IUserProvider userProvider;
    private IWalletService walletService;

    public PaymentService(ILyftApi ilyftapi, IUserProvider iuserprovider, IStripeService istripeservice, IWalletService iwalletservice, IPayPalService ipaypalservice, IExpressPayRepository iexpresspayrepository)
    {
        lyftApi = ilyftapi;
        userProvider = iuserprovider;
        stripeService = istripeservice;
        walletService = iwalletservice;
        payPalService = ipaypalservice;
        expressPayRepository = iexpresspayrepository;
    }

    private Observable createOrUpdateDebitCard(ICard icard, final me.lyft.android.analytics.definitions.ActionEvent.Action analytics)
    {
        analytics = (ActionAnalytics)(new ActionAnalytics(analytics)).trackInitiation();
        return performClientValidation(icard).flatMap(new Func1() {

            final PaymentService this$0;

            public volatile Object call(Object obj)
            {
                return call((ICard)obj);
            }

            public Observable call(ICard icard1)
            {
                return stripeService.createCardToken(icard1);
            }

            
            {
                this$0 = PaymentService.this;
                super();
            }
        }).flatMap(new Func1() {

            final PaymentService this$0;

            public volatile Object call(Object obj)
            {
                return call((String)obj);
            }

            public Observable call(String s)
            {
                return lyftApi.createOrUpdateDebitCard(userProvider.getUser().getId(), s);
            }

            
            {
                this$0 = PaymentService.this;
                super();
            }
        }).doOnNext(new Action1() {

            final PaymentService this$0;
            final ActionAnalytics val$analytics;

            public volatile void call(Object obj)
            {
                call((ExpressPayAccountDTO)obj);
            }

            public void call(ExpressPayAccountDTO expresspayaccountdto)
            {
                analytics.trackSuccess();
                expressPayRepository.setExpressAccount(ExpressPayAccount.fromDTO(expresspayaccountdto));
            }

            
            {
                this$0 = PaymentService.this;
                analytics = actionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final PaymentService this$0;
            final ActionAnalytics val$analytics;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                analytics.trackFailure(throwable);
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                analytics = actionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    private Observable handleError(Throwable throwable)
    {
        if (!me/lyft/android/infrastructure/stripe/StripeServiceException.isAssignableFrom(throwable.getClass())) goto _L2; else goto _L1
_L1:
        throwable = (StripeServiceException)throwable;
        if (throwable instanceof StripeInvalidCardException)
        {
            throwable = new InvalidCardException(InvalidCardException.Reason.STRIPE_ERROR, throwable.getMessage(), throwable);
        } else
        {
            throwable = new PaymentException(throwable.getMessage(), throwable, "stripe_error");
        }
_L4:
        return Observable.error(throwable);
_L2:
        if (throwable instanceof LyftApiException)
        {
            LyftApiException lyftapiexception = (LyftApiException)throwable;
            if (lyftapiexception.getStatusCode() == 422)
            {
                if (CouponException.containsCouponValidationError(lyftapiexception))
                {
                    throwable = new CouponException(lyftapiexception);
                } else
                {
                    throwable = "Invalid card";
                    Object obj = InvalidCardException.Reason.INVALID_CARD_ERROR;
                    Iterator iterator = lyftapiexception.getValidationErrors().iterator();
                    while (iterator.hasNext()) 
                    {
                        Object obj1 = (me.lyft.android.infrastructure.lyft.LyftError.ValidationError)iterator.next();
                        if (!Strings.isNullOrEmpty(((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getMessage()))
                        {
                            obj = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getMessage();
                            throwable = InvalidCardException.Reason.SERVER_VALIDATION_ERROR;
                        } else
                        {
                            Throwable throwable1 = throwable;
                            throwable = ((Throwable) (obj));
                            obj = throwable1;
                        }
                        obj1 = obj;
                        obj = throwable;
                        throwable = ((Throwable) (obj1));
                    }
                    if (!Strings.isNullOrEmpty(lyftapiexception.getLyftErrorMessage()))
                    {
                        throwable = lyftapiexception.getLyftErrorMessage();
                        obj = InvalidCardException.Reason.SERVER_VALIDATION_ERROR;
                    }
                    throwable = new InvalidCardException(((InvalidCardException.Reason) (obj)), throwable, lyftapiexception);
                }
            } else
            {
                throwable = new PaymentException("Failed to save card", lyftapiexception, (new StringBuilder()).append("save_server_error_").append(lyftapiexception.getStatusCode()).toString());
            }
        } else
        if (throwable instanceof WalletServiceException)
        {
            throwable = new InvalidWalletException("Unable to create wallet card", throwable, ((WalletServiceException)throwable).getReason());
        } else
        if (throwable instanceof PayPalServiceException)
        {
            throwable = new InvalidPayPalException("Unable to link PayPal account", throwable, ((PayPalServiceException)throwable).getReason());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Observable makeDefault(Observable observable)
    {
        return observable.onErrorResumeNext(new Func1() {

            final PaymentService this$0;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                super();
            }
        }).map(Unit.func1());
    }

    private Observable payDebt(Observable observable, final String chargeAccountId, final String reason)
    {
        return observable.flatMap(new Func1() {

            final PaymentService this$0;
            final String val$chargeAccountId;
            final String val$reason;

            public volatile Object call(Object obj)
            {
                return call((AppStateDTO)obj);
            }

            public Observable call(AppStateDTO appstatedto)
            {
                appstatedto = ((List)Objects.firstNonNull(((UserDTO)Objects.firstNonNull(appstatedto.getUser(), NullUserDTO.getInstance())).getChargeAccounts(), new ArrayList())).iterator();
_L4:
                if (!appstatedto.hasNext()) goto _L2; else goto _L1
_L1:
                ChargeAccountDTO chargeaccountdto = (ChargeAccountDTO)appstatedto.next();
                if (!chargeAccountId.equals(chargeaccountdto.getId())) goto _L4; else goto _L3
_L3:
                appstatedto = ChargeAccountMapper.fromChargeAccountDTO(chargeaccountdto);
_L6:
                if (appstatedto != null && appstatedto.isFailed().booleanValue())
                {
                    return Observable.error(new PaymentException("Charging debt failed", null, reason));
                } else
                {
                    return Observable.just(Unit.create());
                }
_L2:
                appstatedto = null;
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                this$0 = PaymentService.this;
                chargeAccountId = s;
                reason = s1;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final PaymentService this$0;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                super();
            }
        });
    }

    private Observable performClientValidation(ICard icard)
    {
        boolean flag;
        if (userProvider.getUser().isBillingAddressRequired() && icard.isInvalidBillingAddress())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!icard.validateCard() || flag || !icard.validateZip())
        {
            return Observable.error(new InvalidCardException(InvalidCardException.Reason.CLIENT_VALIDATION_ERROR, "Client validation failed", null, icard, flag));
        } else
        {
            return Observable.just(icard);
        }
    }

    public Observable applyCoupon(String s)
    {
        final AsyncActionAnalytics couponAnalytics = PaymentAnalytics.createCouponAnalytics();
        couponAnalytics.trackRequest();
        return lyftApi.applyCoupon(userProvider.getUser().getId(), s).doOnNext(new Action1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$couponAnalytics;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                couponAnalytics.trackResponseSuccess();
            }

            
            {
                this$0 = PaymentService.this;
                couponAnalytics = asyncactionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$couponAnalytics;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                couponAnalytics.trackResponseFailure(throwable);
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                couponAnalytics = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable createCreditCard(ICard icard)
    {
        return createCreditCard(icard, null, null);
    }

    public Observable createCreditCard(ICard icard, final String nonNullLabel, final String nonNullLabelType)
    {
        final AsyncActionAnalytics addCardAnalytics = PaymentAnalytics.createAddCardAnalytics();
        addCardAnalytics.trackRequest();
        nonNullLabel = (String)Objects.firstNonNull(nonNullLabel, "Personal");
        nonNullLabelType = (String)Objects.firstNonNull(nonNullLabelType, "personal");
        return performClientValidation(icard).flatMap(new Func1() {

            final PaymentService this$0;

            public volatile Object call(Object obj)
            {
                return call((ICard)obj);
            }

            public Observable call(ICard icard1)
            {
                return stripeService.createCardToken(icard1);
            }

            
            {
                this$0 = PaymentService.this;
                super();
            }
        }).flatMap(new Func1() {

            final PaymentService this$0;
            final String val$nonNullLabel;
            final String val$nonNullLabelType;

            public volatile Object call(Object obj)
            {
                return call((String)obj);
            }

            public Observable call(String s)
            {
                return lyftApi.createCreditCardChargeAccount(userProvider.getUser().getId(), s, nonNullLabel, nonNullLabelType);
            }

            
            {
                this$0 = PaymentService.this;
                nonNullLabel = s;
                nonNullLabelType = s1;
                super();
            }
        }).doOnNext(new Action1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$addCardAnalytics;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                addCardAnalytics.trackResponseSuccess();
            }

            
            {
                this$0 = PaymentService.this;
                addCardAnalytics = asyncactionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$addCardAnalytics;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                addCardAnalytics.trackResponseFailure(throwable);
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                addCardAnalytics = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable createDebitCard(ICard icard)
    {
        return createOrUpdateDebitCard(icard, me.lyft.android.analytics.definitions.ActionEvent.Action.ADD_DEBIT_CARD);
    }

    public Observable deleteChargeAccount(String s)
    {
        return lyftApi.deleteChargeAccount(userProvider.getUser().getId(), s).onErrorResumeNext(new Func1() {

            final PaymentService this$0;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable makeCardDefault(String s)
    {
        return makeDefault(lyftApi.makeCardDefault(userProvider.getUser().getId(), s));
    }

    public Observable makeCreditLineDefault(String s)
    {
        return makeDefault(lyftApi.makeCreditLineDefault(userProvider.getUser().getId(), s));
    }

    public Observable makeFacebookDefault(String s)
    {
        final ActionAnalytics analytics = PaymentAnalytics.trackSetDefaultFacebook();
        return lyftApi.makeFacebookDefault(userProvider.getUser().getId(), s).doOnNext(new Action1() {

            final PaymentService this$0;
            final ActionAnalytics val$analytics;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                analytics.trackSuccess();
            }

            
            {
                this$0 = PaymentService.this;
                analytics = actionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final PaymentService this$0;
            final ActionAnalytics val$analytics;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                analytics.trackFailure(throwable);
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                analytics = actionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable makePayPalDefault(final String chargeAccountId)
    {
        return Observable.just(payPalService.obtainChargeToken()).flatMap(new Func1() {

            final PaymentService this$0;
            final String val$chargeAccountId;

            public volatile Object call(Object obj)
            {
                return call((String)obj);
            }

            public Observable call(String s)
            {
                s = lyftApi.makePayPalDefault(userProvider.getUser().getId(), chargeAccountId, s);
                return makeDefault(s);
            }

            
            {
                this$0 = PaymentService.this;
                chargeAccountId = s;
                super();
            }
        });
    }

    public Observable makeWalletDefault(String s)
    {
        return makeDefault(lyftApi.makeWalletDefault(userProvider.getUser().getId(), s));
    }

    public Observable payDebtWithCreditCard(String s)
    {
        return payDebt(lyftApi.payDebtWithCreditCard(userProvider.getUser().getId(), s), s, "debt_card_failed");
    }

    public Observable payDebtWithPayPal(final String chargeAccountId)
    {
        return Observable.just(payPalService.obtainChargeToken()).flatMap(new Func1() {

            final PaymentService this$0;
            final String val$chargeAccountId;

            public volatile Object call(Object obj)
            {
                return call((String)obj);
            }

            public Observable call(String s)
            {
                s = lyftApi.payDebtWithPayPal(userProvider.getUser().getId(), chargeAccountId, s);
                return payDebt(s, chargeAccountId, "debt_paypal_failed");
            }

            
            {
                this$0 = PaymentService.this;
                chargeAccountId = s;
                super();
            }
        });
    }

    public Observable payDebtWithWallet(String s)
    {
        return payDebt(lyftApi.payDebtWithWallet(userProvider.getUser().getId(), s), s, "debt_card_failed");
    }

    public Observable savePayPal()
    {
        final AsyncActionAnalytics paypalAnalytics = PaymentAnalytics.createPayPalAnalytics();
        paypalAnalytics.trackRequest();
        final String userId = userProvider.getUser().getId();
        return lyftApi.getPayPalClientToken(userId).flatMap(new Func1() {

            final PaymentService this$0;

            public volatile Object call(Object obj)
            {
                return call((PayPalClientTokenDTO)obj);
            }

            public Observable call(PayPalClientTokenDTO paypalclienttokendto)
            {
                return payPalService.obtainPayPalChargeData(paypalclienttokendto.getClientToken());
            }

            
            {
                this$0 = PaymentService.this;
                super();
            }
        }).flatMap(new Func1() {

            final PaymentService this$0;
            final String val$userId;

            public volatile Object call(Object obj)
            {
                return call((PayPalChargeData)obj);
            }

            public Observable call(PayPalChargeData paypalchargedata)
            {
                String s = paypalchargedata.getNonce();
                paypalchargedata = paypalchargedata.getDeviceData();
                return lyftApi.createPayPalChargeAccount(userId, s, paypalchargedata);
            }

            
            {
                this$0 = PaymentService.this;
                userId = s;
                super();
            }
        }).doOnNext(new Action1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$paypalAnalytics;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                paypalAnalytics.trackResponseSuccess();
            }

            
            {
                this$0 = PaymentService.this;
                paypalAnalytics = asyncactionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$paypalAnalytics;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                paypalAnalytics.trackResponseFailure(throwable);
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                paypalAnalytics = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable saveWalletCard()
    {
        final AsyncActionAnalytics walletAnalytics = PaymentAnalytics.createWalletAnalytics();
        walletAnalytics.trackRequest();
        return walletService.getWalletToken().flatMap(new Func1() {

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
                return lyftApi.createWalletChargeAccount(userProvider.getUser().getId(), s, s1, walletstripetoken);
            }

            
            {
                this$0 = PaymentService.this;
                super();
            }
        }).doOnNext(new Action1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$walletAnalytics;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                walletAnalytics.trackResponseSuccess();
            }

            
            {
                this$0 = PaymentService.this;
                walletAnalytics = asyncactionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$walletAnalytics;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                walletAnalytics.trackResponseFailure(throwable);
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                walletAnalytics = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable unlinkConcur()
    {
        final AsyncActionAnalytics concurAnalytics = ConcurAnalytics.unlinkAccountAnalytics();
        concurAnalytics.trackRequest();
        return lyftApi.unlinkConcur(userProvider.getUser().getId()).doOnNext(new Action1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$concurAnalytics;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                concurAnalytics.trackResponseSuccess();
            }

            
            {
                this$0 = PaymentService.this;
                concurAnalytics = asyncactionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$concurAnalytics;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                concurAnalytics.trackResponseFailure(throwable);
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                concurAnalytics = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable updateConcurSendRideReceipts(boolean flag)
    {
        final AsyncActionAnalytics concurAnalytics = ConcurAnalytics.sendReceiptsAnalytics();
        concurAnalytics.trackRequest();
        return lyftApi.updateConcurSendRideReceipts(userProvider.getUser().getId(), flag).doOnNext(new Action1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$concurAnalytics;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                concurAnalytics.trackResponseSuccess();
            }

            
            {
                this$0 = PaymentService.this;
                concurAnalytics = asyncactionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$concurAnalytics;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                concurAnalytics.trackResponseFailure(throwable);
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                concurAnalytics = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable updateCreditCard(String s, ICard icard)
    {
        return updateCreditCard(s, icard, "Personal", "personal");
    }

    public Observable updateCreditCard(final String chargeAccountId, ICard icard, final String label, final String labelType)
    {
        final AsyncActionAnalytics updateCardAnalytics = PaymentAnalytics.createEditCardAnalytics();
        updateCardAnalytics.trackRequest();
        if (icard.isEmpty())
        {
            icard = Observable.just(null);
        } else
        {
            icard = performClientValidation(icard).flatMap(new Func1() {

                final PaymentService this$0;

                public volatile Object call(Object obj)
                {
                    return call((ICard)obj);
                }

                public Observable call(ICard icard1)
                {
                    return stripeService.createCardToken(icard1);
                }

            
            {
                this$0 = PaymentService.this;
                super();
            }
            });
        }
        return icard.flatMap(new Func1() {

            final PaymentService this$0;
            final String val$chargeAccountId;
            final String val$label;
            final String val$labelType;

            public volatile Object call(Object obj)
            {
                return call((String)obj);
            }

            public Observable call(String s)
            {
                return lyftApi.updateCreditCardChargeAccount(userProvider.getUser().getId(), chargeAccountId, s, label, labelType);
            }

            
            {
                this$0 = PaymentService.this;
                chargeAccountId = s;
                label = s1;
                labelType = s2;
                super();
            }
        }).doOnNext(new Action1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$updateCardAnalytics;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                updateCardAnalytics.trackResponseSuccess();
            }

            
            {
                this$0 = PaymentService.this;
                updateCardAnalytics = asyncactionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final PaymentService this$0;
            final AsyncActionAnalytics val$updateCardAnalytics;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                updateCardAnalytics.trackResponseFailure(throwable);
                return handleError(throwable);
            }

            
            {
                this$0 = PaymentService.this;
                updateCardAnalytics = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable updateDebitCard(ICard icard)
    {
        if (icard.isEmpty())
        {
            return Unit.just();
        } else
        {
            return createOrUpdateDebitCard(icard, me.lyft.android.analytics.definitions.ActionEvent.Action.EDIT_DEBIT_CARD);
        }
    }








}
