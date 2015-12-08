// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.payments:
//            UpgradePresenter, PaymentErrorPresenter, ProductStatus, ProductDetails, 
//            UpgradeView

private class <init> extends DefaultSubscriber
{

    final UpgradePresenter this$0;

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
        UpgradePresenter.access$400(UpgradePresenter.this).onError(throwable);
    }

    public void onNext(ProductStatus productstatus)
    {
        if (productstatus.isSuccess())
        {
            UpgradePresenter.access$502(UpgradePresenter.this, productstatus.getDetails());
            UpgradePresenter.access$600(UpgradePresenter.this).showBuyButton(UpgradePresenter.access$500(UpgradePresenter.this).getPrice());
            UpgradePresenter.access$700(UpgradePresenter.this).publish(EventQueue.TRACKING, UpgradeTrackingEvent.forUpgradeButtonImpression());
            return;
        } else
        {
            UpgradePresenter.access$400(UpgradePresenter.this).showConnectionError();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((ProductStatus)obj);
    }

    private ()
    {
        this$0 = UpgradePresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
