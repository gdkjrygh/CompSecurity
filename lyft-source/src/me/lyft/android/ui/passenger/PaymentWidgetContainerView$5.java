// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.domain.ride.RequestRideType;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PaymentWidgetContainerView

class this._cls0
    implements Action1
{

    final PaymentWidgetContainerView this$0;

    public volatile void call(Object obj)
    {
        call((RequestRideType)obj);
    }

    public void call(RequestRideType requestridetype)
    {
        PaymentWidgetContainerView.access$200(PaymentWidgetContainerView.this);
        PaymentWidgetContainerView.access$600(PaymentWidgetContainerView.this);
    }

    ()
    {
        this$0 = PaymentWidgetContainerView.this;
        super();
    }
}
