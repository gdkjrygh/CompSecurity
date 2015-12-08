// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.model.chat.CashFeedItem;

final class ng.Object
    implements ng.Object
{

    private a a;

    public final void a()
    {
        a.a.l.a();
    }

    public final void b()
    {
        a.a.l.a();
    }

    ct(ct ct)
    {
        a = ct;
        super();
    }

    // Unreferenced inner class xd$1

/* anonymous class */
    final class xd._cls1
        implements android.view.View.OnClickListener
    {

        final xd a;
        private CashFeedItem b;

        public final void onClick(View view)
        {
            AnalyticsEvents.i(b.mCashTransaction.a());
            a.l.l();
            a.m.a(b, new xd._cls1._cls1(this));
        }

            
            {
                a = xd1;
                b = cashfeeditem;
                super();
            }
    }

}
