// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.payments:
//            UpgradePresenter, ConnectionStatus, PaymentErrorPresenter

private class <init> extends DefaultSubscriber
{

    final UpgradePresenter this$0;

    public void onNext(ConnectionStatus connectionstatus)
    {
        if (connectionstatus.isReady())
        {
            UpgradePresenter.access$300(UpgradePresenter.this);
        } else
        if (connectionstatus.isUnsupported())
        {
            UpgradePresenter.access$400(UpgradePresenter.this).showBillingUnavailable();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((ConnectionStatus)obj);
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
