// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRateView, PassengerSubmitRatingButton

class this._cls0
    implements Action1
{

    final PassengerRateView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        PassengerRateView.access$000(PassengerRateView.this);
        if (PassengerRateView.access$100(PassengerRateView.this))
        {
            appFlow.goTo(new sengerRideExpenseNoteScreen());
            return;
        } else
        {
            submitDriverRatingButton.submitRating();
            return;
        }
    }

    gButton()
    {
        this$0 = PassengerRateView.this;
        super();
    }
}
