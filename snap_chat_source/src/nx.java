// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.api2.cash.blockers.BlockerOrder;
import com.snapchat.android.api2.cash.square.data.CashPayment;
import com.snapchat.android.model.CashTransaction;
import java.util.List;

public final class nx extends np
{

    protected na mCashErrorReporter;

    public nx()
    {
        SnapchatApplication.getDIComponent().a(this);
    }

    static void a(nx nx1)
    {
        nx1.b(null, false);
    }

    static void a(nx nx1, List list)
    {
        nx1.a(list, true);
    }

    static void b(nx nx1, List list)
    {
        nx1.b(list, true);
    }

    public final void a(final CashTransaction transaction)
    {
        ob.a a1 = new ob.a() {

            final nx this$0;
            final CashTransaction val$transaction;

            public final void a(oc oc1)
            {
                List list1 = null;
                Object obj = null;
                if (oc1 != null)
                {
                    List list = obj;
                    if (oc1.blockers != null)
                    {
                        list = obj;
                        if (oc1.blockers.a())
                        {
                            list = oc1.blockers.b();
                        }
                    }
                    list1 = list;
                    if (transaction != null)
                    {
                        list1 = list;
                        if (oc1.payment != null)
                        {
                            transaction.a(oh.a(oc1.payment.mState, oc1.payment.mCancellationReason));
                            list1 = list;
                        }
                    }
                }
                Bt.ax();
                nx.a(nx.this, list1);
            }

            public final void a(oc oc1, int i)
            {
                oc1 = oh.a(nx.this, i);
                if (oc1 != null)
                {
                    nx.b(nx.this, oc1);
                    return;
                }
                if (transaction != null)
                {
                    oc1 = transaction.mSenderUsername;
                    if (TextUtils.equals(Bt.q(), oc1))
                    {
                        AnalyticsEvents.a("SQUARE_ACCEPT_TERMS_FAILED", i);
                        na.a(0x7f0801d4, new Object[0]);
                    } else
                    {
                        AnalyticsEvents.b("SQUARE_ACCEPT_TERMS_FAILED", i);
                    }
                }
                nx.a(nx.this);
            }

            
            {
                this$0 = nx.this;
                transaction = cashtransaction;
                super();
            }
        };
        if (transaction != null && !transaction.mIsInFlight)
        {
            (new nT(transaction.mTransactionId, a1)).execute();
            return;
        } else
        {
            (new nT(a1)).execute();
            return;
        }
    }

    public final BlockerOrder c()
    {
        return BlockerOrder.SQ_ACCEPT_TERMS_BLOCKER;
    }

    public final boolean d()
    {
        return true;
    }
}
