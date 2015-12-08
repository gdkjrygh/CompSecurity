// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import me.lyft.android.analytics.studies.ConcurAnalytics;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            ConcurSendRideReceiptsView

class this._cls0
    implements Action1
{

    final ConcurSendRideReceiptsView this$0;

    public void call(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            ConcurAnalytics.sendReceiptsEnabled();
        } else
        {
            ConcurAnalytics.sendReceiptsDisabled();
        }
        ConcurSendRideReceiptsView.access$000(ConcurSendRideReceiptsView.this, boolean1.booleanValue());
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = ConcurSendRideReceiptsView.this;
        super();
    }
}
