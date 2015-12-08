// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.ui.animations.TransitionManagerCompat;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideRatingAndEarningsView

class this._cls0
    implements android.widget.r
{

    final DriverRideRatingAndEarningsView this$0;

    public void onRatingChanged(RatingBar ratingbar, float f, boolean flag)
    {
        int i = 1;
        int j = (int)f;
        if (j < 1)
        {
            passengerRatingBar.setRating(1);
        } else
        {
            i = j;
        }
        DriverRideRatingAndEarningsView.access$500(DriverRideRatingAndEarningsView.this, i);
        if (passengerPhotoContainer.getVisibility() != 8)
        {
            TransitionManagerCompat.beginDelayedTransition(DriverRideRatingAndEarningsView.this);
            passengerPhotoContainer.setVisibility(8);
            ratingSubtitleTextView.setVisibility(8);
            ratingSectionFeedback.setVisibility(0);
            submitRatingButton.setVisibility(0);
            ScreenAnalytics.trackScreenView("driver_passenger_feedback");
        }
        tooltipAnchorRatingStar.setVisibility(8);
    }

    A()
    {
        this$0 = DriverRideRatingAndEarningsView.this;
        super();
    }
}
