// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.payments:
//            UpgradePresenter, PaymentErrorPresenter, PurchaseStatus

private class <init> extends DefaultSubscriber
{

    final UpgradePresenter this$0;

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
        UpgradePresenter.access$400(UpgradePresenter.this).onError(throwable);
    }

    public void onNext(PurchaseStatus purchasestatus)
    {
        switch (soundcloud.android.payments.PurchaseStatus[purchasestatus.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            UpgradePresenter.access$800(UpgradePresenter.this);
            return;

        case 2: // '\002'
            UpgradePresenter.access$400(UpgradePresenter.this).showVerifyFail();
            return;

        case 3: // '\003'
            UpgradePresenter.access$400(UpgradePresenter.this).showVerifyTimeout();
            return;

        case 4: // '\004'
            UpgradePresenter.access$900(UpgradePresenter.this);
            break;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((PurchaseStatus)obj);
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
