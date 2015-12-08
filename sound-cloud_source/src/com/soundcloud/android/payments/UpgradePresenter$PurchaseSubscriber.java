// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.payments:
//            UpgradePresenter, PaymentErrorPresenter, UpgradeView

private class <init> extends DefaultSubscriber
{

    final UpgradePresenter this$0;

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
        UpgradePresenter.access$400(UpgradePresenter.this).onError(throwable);
        UpgradePresenter.access$600(UpgradePresenter.this).enableBuyButton();
    }

    private I()
    {
        this$0 = UpgradePresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
