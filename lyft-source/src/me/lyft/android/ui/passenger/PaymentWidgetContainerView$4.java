// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PaymentWidgetContainerView

class this._cls0
    implements Action1
{

    final PaymentWidgetContainerView this$0;

    public void call(Boolean boolean1)
    {
        PaymentWidgetContainerView.access$200(PaymentWidgetContainerView.this);
        PaymentWidgetContainerView.access$300(PaymentWidgetContainerView.this);
        if (boolean1.booleanValue())
        {
            PaymentWidgetContainerView.access$400(PaymentWidgetContainerView.this);
            return;
        } else
        {
            PaymentWidgetContainerView.access$500(PaymentWidgetContainerView.this);
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = PaymentWidgetContainerView.this;
        super();
    }
}
