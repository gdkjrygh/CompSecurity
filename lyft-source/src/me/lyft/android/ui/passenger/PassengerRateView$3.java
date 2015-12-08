// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.RatingBar;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.rx.ReactiveProperty;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRateView

class this._cls0
    implements android.widget.rChangeListener
{

    final PassengerRateView this$0;

    public void onRatingChanged(RatingBar ratingbar, float f, boolean flag)
    {
        int j = (int)f;
        int i = j;
        if (j < 1)
        {
            driverRatingBar.setRating(1);
            i = 1;
        }
        onRatingChange.onNext(Integer.valueOf(i));
        if (ratingPhotoContainer.getVisibility() != 8)
        {
            PassengerRateView.access$300(PassengerRateView.this, true);
            PassengerRateView.access$400(PassengerRateView.this);
            ScreenAnalytics.trackScreenView("passenger_driver_feedback");
        }
    }

    r()
    {
        this$0 = PassengerRateView.this;
        super();
    }
}
