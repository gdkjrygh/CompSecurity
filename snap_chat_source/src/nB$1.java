// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.api2.cash.blockers.CardInputError;
import com.snapchat.android.api2.cash.square.data.CashPayment;
import com.snapchat.android.api2.cash.square.data.ErrorType;
import com.snapchat.android.model.CashTransaction;
import java.util.List;

final class lang.Object
    implements lang.Object
{

    final nB this$0;
    final nq val$callback;
    final String val$cvv;
    final String val$expiry;
    final String val$pan;
    final String val$zip;

    public final void a(np np)
    {
        Timber.c("SQCardFormBlocker", "CASH-LOG: SQCardFormBlocker dismissed when trying to get access token", new Object[0]);
        val$callback.a(CardInputError.UNKNOWN);
    }

    public final void a(np np, List list, boolean flag)
    {
        np = new ob.a() {

            final nB._cls1 this$1;

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
                    if (nB.a(this$0) != null && oc1.payment != null)
                    {
                        nB.a(this$0).a(oh.a(oc1.payment.mState, oc1.payment.mCancellationReason));
                    }
                    mSquareProvider.a();
                    callback.a();
                    nB.a(this$0, ((List) (obj)));
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
                if (i == 404 && nB.a(this$0) != null)
                {
                    nB.b(this$0);
                    (new nX(pan, expiry, cvv, zip, this)).execute();
                    return;
                }
                if (i == 401 && !nB.c(this$0))
                {
                    nB.d(this$0);
                    nB.a(this$0, pan, expiry, cvv, zip, callback);
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
                this$1 = nB._cls1.this;
                super();
            }
        };
        if (nB.a(nB.this) != null && !nB.a(nB.this).mIsInFlight)
        {
            (new nX(nB.a(nB.this).mTransactionId, val$pan, val$expiry, val$cvv, val$zip, np)).execute();
            return;
        } else
        {
            (new nX(val$pan, val$expiry, val$cvv, val$zip, np)).execute();
            return;
        }
    }

    public final void b(np np)
    {
        Timber.c("SQCardFormBlocker", "CASH-LOG: SQCardFormBlocker hard failed when trying to get access token", new Object[0]);
        val$callback.a(CardInputError.UNKNOWN);
    }

    public final void b(np np, List list, boolean flag)
    {
        Timber.c("SQCardFormBlocker", "CASH-LOG: SQCardFormBlocker failed to get access token", new Object[0]);
        val$callback.a(CardInputError.UNKNOWN);
        nB.a(nB.this, list, flag);
    }

    >()
    {
        this$0 = final_nb;
        val$callback = nq1;
        val$pan = s;
        val$expiry = s1;
        val$cvv = s2;
        val$zip = String.this;
        super();
    }
}
