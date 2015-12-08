// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.api2.cash.square.data.CashPayment;
import com.snapchat.android.model.CashTransaction;

final class ng.Object
    implements ng.Object
{

    final is._cls0 this$1;

    public final void a(oc oc1)
    {
        java.util.List list1 = null;
        Object obj = null;
        if (oc1 != null)
        {
            java.util.List list = obj;
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
        nK.a(_fld0, list1);
    }

    public final void a(oc oc1, int i)
    {
        Timber.b("SQPhoneNumberBlocker", "CASH-LOG: FAILED resolve SQPhoneNumberBlocker statusCode[%d]", new Object[] {
            Integer.valueOf(i)
        });
        nK.b(_fld0);
    }

    ct()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class nK$1

/* anonymous class */
    final class nK._cls1
        implements mW.a
    {

        final nK this$0;
        final CashTransaction val$transaction;

        public final void a(TD.a a1, int i)
        {
            a1 = oh.a(nK.this, i);
            if (a1 != null)
            {
                nK.b(nK.this, a1);
                return;
            }
            if (transaction != null)
            {
                a1 = transaction.mSenderUsername;
                if (TextUtils.equals(Bt.q(), a1))
                {
                    AnalyticsEvents.a("SQUARE_PHONE_VERIFICATION_FAILED", i);
                    na.a(0x7f0801d4, new Object[0]);
                } else
                {
                    AnalyticsEvents.b("SQUARE_PHONE_VERIFICATION_FAILED", i);
                }
            }
            nK.c(nK.this);
        }

        public final void a(TD td)
        {
            Timber.b("SQPhoneNumberBlocker", "CASH-LOG: SUCCESS received phone signature", new Object[0]);
            td = (TH)td;
            if (!td.c() || !td.e())
            {
                nK.a(nK.this);
                return;
            }
            nK._cls1._cls1 _lcls1 = new nK._cls1._cls1();
            if (transaction != null && !transaction.mIsInFlight)
            {
                (new nY(transaction.mTransactionId, td.b(), td.d(), _lcls1)).execute();
                return;
            } else
            {
                (new nY(td.b(), td.d(), _lcls1)).execute();
                return;
            }
        }

            
            {
                this$0 = final_nk;
                transaction = CashTransaction.this;
                super();
            }
    }

}
