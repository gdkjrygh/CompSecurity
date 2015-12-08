// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import java.util.List;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PaymentWidgetContainerView

class this._cls0
    implements Action1
{

    final PaymentWidgetContainerView this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        list = FixedFare.findFareByPartySize(list, 1);
        rideFare.onNext(list);
    }

    ()
    {
        this$0 = PaymentWidgetContainerView.this;
        super();
    }
}
