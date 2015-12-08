// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.api2.cash.blockers.BlockerOrder;
import com.snapchat.android.api2.cash.square.data.CashPayment;
import com.snapchat.android.model.CashTransaction;
import java.util.List;

public final class nM extends np
{

    public nM()
    {
    }

    protected final void a()
    {
        super.a();
    }

    public final void a(final CashTransaction transaction)
    {
        (new oa(transaction.mTransactionId, new oe() {

            final nM this$0;
            final CashTransaction val$transaction;

            public final void a(int i)
            {
                List list = oh.a(nM.this, i);
                if (list != null)
                {
                    b(list, true);
                    return;
                } else
                {
                    b(null, false);
                    return;
                }
            }

            public final void a(CashPayment cashpayment)
            {
                transaction.a(oh.a(cashpayment.mState, cashpayment.mCancellationReason));
                Object obj = null;
                ou ou1 = cashpayment.mBlockers;
                cashpayment = obj;
                if (ou1 != null)
                {
                    cashpayment = ou1.b();
                }
                if (cashpayment != null && !cashpayment.isEmpty())
                {
                    nM.this.a(cashpayment, true);
                    return;
                } else
                {
                    nM.this.a();
                    return;
                }
            }

            
            {
                this$0 = nM.this;
                transaction = cashtransaction;
                super();
            }
        })).execute();
    }

    protected final void a(List list, boolean flag)
    {
        super.a(list, flag);
    }

    protected final void b(List list, boolean flag)
    {
        super.b(list, flag);
    }

    public final BlockerOrder c()
    {
        return BlockerOrder.SQ_RETRIEVE_RECEIVING_CASH_PAYMENT_BLOCKER;
    }
}
