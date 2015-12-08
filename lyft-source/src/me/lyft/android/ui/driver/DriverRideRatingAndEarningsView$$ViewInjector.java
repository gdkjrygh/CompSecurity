// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import me.lyft.android.controls.EditTextWithoutEnter;
import me.lyft.android.ui.tooltips.TooltipContainerView;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideRatingAndEarningsView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverRideRatingAndEarningsView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, DriverRideRatingAndEarningsView driverrideratingandearningsview, Object obj)
    {
        driverrideratingandearningsview.rideEarningLayout = (LinearLayout)viewinjector.rideEarningLayout((View)viewinjector.rideEarningLayout(obj, 0x7f0d01dd, "field 'rideEarningLayout'"), 0x7f0d01dd, "field 'rideEarningLayout'");
        driverrideratingandearningsview.rideTotalTextView = (TextView)viewinjector.rideTotalTextView((View)viewinjector.rideTotalTextView(obj, 0x7f0d01de, "field 'rideTotalTextView'"), 0x7f0d01de, "field 'rideTotalTextView'");
        driverrideratingandearningsview.primeTimeLabel = (TextView)viewinjector.primeTimeLabel((View)viewinjector.primeTimeLabel(obj, 0x7f0d01df, "field 'primeTimeLabel'"), 0x7f0d01df, "field 'primeTimeLabel'");
        driverrideratingandearningsview.passengerPhotoContainer = (View)viewinjector.passengerPhotoContainer(obj, 0x7f0d01e2, "field 'passengerPhotoContainer'");
        driverrideratingandearningsview.passengerPhotoImageView = (ImageView)viewinjector.passengerPhotoImageView((View)viewinjector.passengerPhotoImageView(obj, 0x7f0d01bc, "field 'passengerPhotoImageView'"), 0x7f0d01bc, "field 'passengerPhotoImageView'");
        driverrideratingandearningsview.ratingCaptionTextView = (TextView)viewinjector.ratingCaptionTextView((View)viewinjector.ratingCaptionTextView(obj, 0x7f0d01e4, "field 'ratingCaptionTextView'"), 0x7f0d01e4, "field 'ratingCaptionTextView'");
        driverrideratingandearningsview.passengerRatingBar = (RatingBar)viewinjector.passengerRatingBar((View)viewinjector.passengerRatingBar(obj, 0x7f0d01e5, "field 'passengerRatingBar'"), 0x7f0d01e5, "field 'passengerRatingBar'");
        driverrideratingandearningsview.ratingSectionFeedback = (View)viewinjector.ratingSectionFeedback(obj, 0x7f0d01e8, "field 'ratingSectionFeedback'");
        driverrideratingandearningsview.ratingSubtitleTextView = (TextView)viewinjector.ratingSubtitleTextView((View)viewinjector.ratingSubtitleTextView(obj, 0x7f0d01e7, "field 'ratingSubtitleTextView'"), 0x7f0d01e7, "field 'ratingSubtitleTextView'");
        driverrideratingandearningsview.feedbackCaptionTextView = (TextView)viewinjector.feedbackCaptionTextView((View)viewinjector.feedbackCaptionTextView(obj, 0x7f0d01e9, "field 'feedbackCaptionTextView'"), 0x7f0d01e9, "field 'feedbackCaptionTextView'");
        driverrideratingandearningsview.feedbackCommentsInput = (EditTextWithoutEnter)viewinjector.feedbackCommentsInput((View)viewinjector.feedbackCommentsInput(obj, 0x7f0d01ea, "field 'feedbackCommentsInput'"), 0x7f0d01ea, "field 'feedbackCommentsInput'");
        driverrideratingandearningsview.submitRatingButton = (Button)viewinjector.submitRatingButton((View)viewinjector.submitRatingButton(obj, 0x7f0d01eb, "field 'submitRatingButton'"), 0x7f0d01eb, "field 'submitRatingButton'");
        driverrideratingandearningsview.tooltipContainer = (TooltipContainerView)viewinjector.tooltipContainer((View)viewinjector.tooltipContainer(obj, 0x7f0d01b3, "field 'tooltipContainer'"), 0x7f0d01b3, "field 'tooltipContainer'");
        driverrideratingandearningsview.tooltipAnchorRatingStar = (View)viewinjector.tooltipAnchorRatingStar(obj, 0x7f0d01e6, "field 'tooltipAnchorRatingStar'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverRideRatingAndEarningsView)obj);
    }

    public void reset(DriverRideRatingAndEarningsView driverrideratingandearningsview)
    {
        driverrideratingandearningsview.rideEarningLayout = null;
        driverrideratingandearningsview.rideTotalTextView = null;
        driverrideratingandearningsview.primeTimeLabel = null;
        driverrideratingandearningsview.passengerPhotoContainer = null;
        driverrideratingandearningsview.passengerPhotoImageView = null;
        driverrideratingandearningsview.ratingCaptionTextView = null;
        driverrideratingandearningsview.passengerRatingBar = null;
        driverrideratingandearningsview.ratingSectionFeedback = null;
        driverrideratingandearningsview.ratingSubtitleTextView = null;
        driverrideratingandearningsview.feedbackCaptionTextView = null;
        driverrideratingandearningsview.feedbackCommentsInput = null;
        driverrideratingandearningsview.submitRatingButton = null;
        driverrideratingandearningsview.tooltipContainer = null;
        driverrideratingandearningsview.tooltipAnchorRatingStar = null;
    }

    public ()
    {
    }
}
