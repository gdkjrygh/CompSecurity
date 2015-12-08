// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.StatefulChatFeedItem;
import com.squareup.otto.Bus;
import java.util.Iterator;
import java.util.List;

public class si
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    private static final String c = si.getSimpleName();
    protected nb a;
    protected mX b;

    public si()
    {
        SnapchatApplication.getDIComponent().a(this);
    }

    static String b()
    {
        return c;
    }

    protected final void a()
    {
        CashFeedItem cashfeeditem;
        for (Iterator iterator = sz.a().iterator(); iterator.hasNext(); b.f(cashfeeditem, new mX.a(cashfeeditem) {

        private CashFeedItem a;

        public final void a()
        {
            Mf.a().a(new Mp(a.ac()));
        }

        public final void b()
        {
            Mf.a().a(new Mp(a.ac()));
        }

            
            {
                a = cashfeeditem;
                super();
            }
    }))
        {
            cashfeeditem = (CashFeedItem)iterator.next();
            Timber.b(c, "CASH-LOG: UPDATING pending received cash id[%s] sender[%s] amount[%s]", new Object[] {
                cashfeeditem.d(), cashfeeditem.j(), cashfeeditem.mCashTransaction.a()
            });
        }

    }

    public final void a(CashFeedItem cashfeeditem, a a1)
    {
        if (cashfeeditem.mCashTransaction.mTransactionStatus != com.snapchat.android.model.CashTransaction.TransactionStatus.WAITING_ON_RECIPIENT && cashfeeditem.mCashTransaction.mTransactionStatus != com.snapchat.android.model.CashTransaction.TransactionStatus.INITIATED)
        {
            throw new RuntimeException("ReceivingCashManager resolveBlockers should only be called on INITIATED or WAITING_ON_RECIPIENT CashFeedItems!");
        } else
        {
            Timber.b(c, "CASH-LOG: ReceivingCashManager RESOLVE blockers id[%s] sender[%s] amount[%s]", new Object[] {
                cashfeeditem.d(), cashfeeditem.j(), cashfeeditem.mCashTransaction.a()
            });
            cashfeeditem.mSendReceiveStatus = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.RECEIVING;
            Mf.a().a(new Mp(cashfeeditem.ac(), cashfeeditem.d()));
            b.e(cashfeeditem, new mX.a(cashfeeditem, a1) {

                private CashFeedItem a;
                private a b;
                private si c;

                public final void a()
                {
                    Timber.b(si.b(), "CASH-LOG: ReceivingCashManager SUCCESS RESOLVED blockers id[%s], sender[%s] amount[%s]", new Object[] {
                        a.d(), a.j(), a.mCashTransaction.a()
                    });
                    c.a();
                    Mf.a().a(new Mp(a.ac(), a.d()));
                    b.a();
                }

                public final void b()
                {
                    Timber.b(si.b(), "CASH-LOG: ReceivingCashManager CANCELED RESOLVED blockers id[%s], sender[%s] amount[%s]", new Object[] {
                        a.d(), a.j(), a.mCashTransaction.a()
                    });
                    Mf.a().a(new Mp(a.ac(), a.d()));
                    b.b();
                }

            
            {
                c = si.this;
                a = cashfeeditem;
                b = a1;
                super();
            }
            });
            return;
        }
    }

    public final void a(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            CashFeedItem cashfeeditem = (CashFeedItem)list.next();
            if (((StatefulChatFeedItem) (cashfeeditem)).mSendReceiveStatus == com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.RECEIVED && cashfeeditem.mCashTransaction.mTransactionStatus == com.snapchat.android.model.CashTransaction.TransactionStatus.WAITING_ON_RECIPIENT && a.b(cashfeeditem.mCashTransaction.mProvider))
            {
                Timber.b(c, "CASH-LOG: DELETING pending received cash id[%s] sender[%s] amount[%s]", new Object[] {
                    cashfeeditem.d(), cashfeeditem.j(), cashfeeditem.mCashTransaction.a()
                });
                ni ni1 = a.a(cashfeeditem.mCashTransaction.mProvider);
                if (ni1 != null)
                {
                    ni1.a(cashfeeditem);
                }
            }
        } while (true);
    }

}
