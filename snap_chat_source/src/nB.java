// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.api2.cash.blockers.BlockerOrder;
import com.snapchat.android.api2.cash.blockers.CardInputError;
import com.snapchat.android.api2.cash.square.data.CardStatus;
import com.snapchat.android.api2.cash.square.data.CashPayment;
import com.snapchat.android.api2.cash.square.data.ErrorType;
import com.snapchat.android.fragments.cash.CardLinkFragment;
import com.snapchat.android.model.CashTransaction;
import com.squareup.otto.Bus;
import java.util.List;

public final class nB extends np
    implements com.snapchat.android.fragments.cash.CardLinkFragment.a
{

    private static final String TAG = "SQCardFormBlocker";
    CardStatus mCardStatus;
    protected sc mCashCardManager;
    private boolean mRetriedFrom401;
    protected oh mSquareProvider;
    private CashTransaction mTransactionContext;
    private boolean mUseDefaultGreen;

    public nB()
    {
        mCardStatus = CardStatus.NOT_LINKED;
        mUseDefaultGreen = false;
        SnapchatApplication.getDIComponent().a(this);
    }

    public nB(byte byte0)
    {
        this();
        mUseDefaultGreen = true;
    }

    static CardInputError a(ErrorType errortype)
    {
        if (errortype == null) goto _L2; else goto _L1
_L1:
        static final class _cls2
        {

            static final int $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType[];

            static 
            {
                $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType = new int[ErrorType.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType[ErrorType.CARD_TYPE_UNSUPPORTED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType[ErrorType.INVALID_CARD_NUMBER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType[ErrorType.INVALID_EXPIRATION.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType[ErrorType.INVALID_SECURITY_CODE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType[ErrorType.UNSUPPORTED_REGION.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType[ErrorType.INVALID_POSTAL_CODE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType[ErrorType.TOO_MANY_ATTEMPTS.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType[ErrorType.BLOCKED_CARD.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$ErrorType[ErrorType.NETWORK_FAILURE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.snapchat.android.api2.cash.square.data.ErrorType[errortype.ordinal()];
        JVM INSTR tableswitch 1 9: default 64
    //                   1 68
    //                   2 72
    //                   3 76
    //                   4 80
    //                   5 84
    //                   6 88
    //                   7 92
    //                   8 96
    //                   9 100;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L2:
        return CardInputError.UNKNOWN;
_L3:
        return CardInputError.CARD_TYPE_UNSUPPORTED;
_L4:
        return CardInputError.INVALID_CARD_NUMBER;
_L5:
        return CardInputError.INVALID_EXPIRATION;
_L6:
        return CardInputError.INVALID_SECURITY_CODE;
_L7:
        return CardInputError.UNSUPPORTED_REGION;
_L8:
        return CardInputError.INVALID_POSTAL_CODE;
_L9:
        return CardInputError.TOO_MANY_ATTEMPTS;
_L10:
        return CardInputError.BLOCKED_CARD;
_L11:
        return CardInputError.NETWORK_FAILURE;
    }

    static CashTransaction a(nB nb)
    {
        return nb.mTransactionContext;
    }

    private void a(final String pan, final String expiry, final String cvv, final String zip, final nq callback, boolean flag)
    {
        Timber.b("SQCardFormBlocker", "CASH-LOG: SQCardBlocker onValidateCardInputEvent", new Object[0]);
        nz nz1 = new nz(flag);
        nz1.mListener = new np.a() {

            final nB this$0;
            final nq val$callback;
            final String val$cvv;
            final String val$expiry;
            final String val$pan;
            final String val$zip;

            public final void a(np np1)
            {
                Timber.c("SQCardFormBlocker", "CASH-LOG: SQCardFormBlocker dismissed when trying to get access token", new Object[0]);
                callback.a(CardInputError.UNKNOWN);
            }

            public final void a(np np1, List list, boolean flag1)
            {
                np1 = new ob.a() {

                    final _cls1 this$1;

                    public final void a(oc oc1)
                    {
                        Timber.b("SQCardFormBlocker", "CASH-LOG: SUCCESS resolve SQCardFormBlocker", new Object[0]);
                        if (oc1 != null)
                        {
                            Object obj = (nX.b)oc1;
                            mCashCardManager.a(((nX.b) (obj)).cardToken);
                            if (oc1.blockers != null && oc1.blockers.a())
                            {
                                obj = oc1.blockers.b();
                            } else
                            {
                                obj = null;
                            }
                            if (nB.a(_fld0) != null && oc1.payment != null)
                            {
                                nB.a(_fld0).a(oh.a(oc1.payment.mState, oc1.payment.mCancellationReason));
                            }
                            mSquareProvider.a();
                            callback.a();
                            nB.a(_fld0, ((List) (obj)));
                            return;
                        } else
                        {
                            callback.a(nB.a(null));
                            return;
                        }
                    }

                    public final void a(oc oc1, int i)
                    {
                        ErrorType errortype;
                        Timber.b("SQCardFormBlocker", "CASH-LOG: FAILED resolve SQCardFormBlocker statusCode[%d]", new Object[] {
                            Integer.valueOf(i)
                        });
                        if (i == 404 && nB.a(_fld0) != null)
                        {
                            nB.b(_fld0);
                            (new nX(pan, expiry, cvv, zip, this)).execute();
                            return;
                        }
                        if (i == 401 && !nB.c(_fld0))
                        {
                            nB.d(_fld0);
                            nB.a(_fld0, pan, expiry, cvv, zip, callback);
                            return;
                        }
                        errortype = null;
                        if (i != 429) goto _L2; else goto _L1
_L1:
                        errortype = ErrorType.TOO_MANY_ATTEMPTS;
_L4:
                        callback.a(nB.a(errortype));
                        return;
_L2:
                        if (i == 0)
                        {
                            errortype = ErrorType.NETWORK_FAILURE;
                        } else
                        if (oc1 != null)
                        {
                            errortype = oc1.type;
                        }
                        if (true) goto _L4; else goto _L3
_L3:
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                };
                if (nB.a(nB.this) != null && !nB.a(nB.this).mIsInFlight)
                {
                    (new nX(nB.a(nB.this).mTransactionId, pan, expiry, cvv, zip, np1)).execute();
                    return;
                } else
                {
                    (new nX(pan, expiry, cvv, zip, np1)).execute();
                    return;
                }
            }

            public final void b(np np1)
            {
                Timber.c("SQCardFormBlocker", "CASH-LOG: SQCardFormBlocker hard failed when trying to get access token", new Object[0]);
                callback.a(CardInputError.UNKNOWN);
            }

            public final void b(np np1, List list, boolean flag1)
            {
                Timber.c("SQCardFormBlocker", "CASH-LOG: SQCardFormBlocker failed to get access token", new Object[0]);
                callback.a(CardInputError.UNKNOWN);
                nB.a(nB.this, list, flag1);
            }

            
            {
                this$0 = nB.this;
                callback = nq1;
                pan = s;
                expiry = s1;
                cvv = s2;
                zip = s3;
                super();
            }
        };
        nz1.a(null);
    }

    static void a(nB nb, String s, String s1, String s2, String s3, nq nq)
    {
        nb.a(s, s1, s2, s3, nq, true);
    }

    static void a(nB nb, List list)
    {
        nb.a(list, true);
    }

    static void a(nB nb, List list, boolean flag)
    {
        nb.b(list, flag);
    }

    static CashTransaction b(nB nb)
    {
        nb.mTransactionContext = null;
        return null;
    }

    static boolean c(nB nb)
    {
        return nb.mRetriedFrom401;
    }

    static boolean d(nB nb)
    {
        nb.mRetriedFrom401 = true;
        return true;
    }

    public final void a(CashTransaction cashtransaction)
    {
        Timber.b("SQCardFormBlocker", "CASH-LOG: ATTEMPT resolve SQCardFormBlocker", new Object[0]);
        mTransactionContext = cashtransaction;
        if (mCardStatus == CardStatus.NOT_LINKED && mCashCardManager.a() != null)
        {
            Timber.b("SQCardFormBlocker", "CASH-LOG: Exists card token. Resolving card blocker without linking flow.", new Object[0]);
            a(null, true);
            return;
        } else
        {
            cashtransaction = new CardLinkFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("use_default_green", mUseDefaultGreen);
            cashtransaction.setArguments(bundle);
            cashtransaction.a = this;
            Mf.a().a(new Oi(cashtransaction));
            return;
        }
    }

    public final void a(String s, String s1, String s2, String s3, nq nq)
    {
        a(s, s1, s2, s3, nq, false);
    }

    public final BlockerOrder c()
    {
        return BlockerOrder.SQ_CARD_BLOCKER;
    }

    public final void e()
    {
        Timber.b("SQCardFormBlocker", "CASH-LOG: SQCardFormBlocker onCanceled", new Object[0]);
        AnalyticsEvents.t();
        a();
    }
}
