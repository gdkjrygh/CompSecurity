// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SplitPaymentAddChargeAccountView

class this._cls0
    implements Action1
{

    final SplitPaymentAddChargeAccountView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        if (splitFareRequestRepository.hasPendingRequest())
        {
            appFlow.resetTo(new Screen());
        }
    }

    Screen()
    {
        this$0 = SplitPaymentAddChargeAccountView.this;
        super();
    }
}
