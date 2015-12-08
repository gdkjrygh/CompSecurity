// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.widget.RatingBar;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRateView

class this._cls0
    implements Action1
{

    final PassengerRateView this$0;

    public void call(Integer integer)
    {
        PassengerRateView.access$200(PassengerRateView.this, integer.intValue());
        if (integer.intValue() <= 0)
        {
            driverRatingBar.setRating(1.0F);
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ()
    {
        this$0 = PassengerRateView.this;
        super();
    }
}
