// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.application.ride.IRatingSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.EditTextWithoutEnter;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.animations.TransitionManagerCompat;
import me.lyft.android.ui.tooltips.TooltipContainerView;
import rx.functions.Action1;

public class DriverRideRatingAndEarningsView extends ScrollView
{

    public static final String DRIVER_PASSENGER_FEEDBACK = "driver_passenger_feedback";
    private Binder binder;
    DialogFlow dialogFlow;
    IDriverRouteService driverRouteService;
    TextView feedbackCaptionTextView;
    EditTextWithoutEnter feedbackCommentsInput;
    ImageLoader imageLoader;
    private final android.widget.RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = new android.widget.RatingBar.OnRatingBarChangeListener() {

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
            updateRatingAndFeedbackCaption(i);
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

            
            {
                this$0 = DriverRideRatingAndEarningsView.this;
                super();
            }
    };
    View passengerPhotoContainer;
    ImageView passengerPhotoImageView;
    RatingBar passengerRatingBar;
    TextView primeTimeLabel;
    IProgressController progressController;
    TextView ratingCaptionTextView;
    View ratingSectionFeedback;
    IRatingSession ratingSession;
    TextView ratingSubtitleTextView;
    LinearLayout rideEarningLayout;
    private ReactiveProperty rideIdProperty;
    TextView rideTotalTextView;
    IDriverRideProvider routeProvider;
    Button submitRatingButton;
    View tooltipAnchorRatingStar;
    TooltipContainerView tooltipContainer;
    IViewErrorHandler viewErrorHandler;

    public DriverRideRatingAndEarningsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private Passenger getPassenger()
    {
        return routeProvider.getDriverRide().getUnratedPassenger();
    }

    private void persistRatingData()
    {
        ratingSession.setRideId(getPassenger().getRideId());
        ratingSession.setFeedback(feedbackCommentsInput.getText().toString());
        ratingSession.setRating((int)passengerRatingBar.getRating());
    }

    private void resolveRatingButtonColor()
    {
        DriverRide driverride = routeProvider.getDriverRide();
        int i;
        if (driverride.isCourier())
        {
            i = 0x7f02005a;
        } else
        if (driverride.isPlus())
        {
            i = 0x7f02004d;
        } else
        {
            i = 0x7f020050;
        }
        submitRatingButton.setBackgroundResource(i);
    }

    private void restoreRatingData()
    {
        if (ratingSession.getRideId().equals(getPassenger().getRideId()) && ratingSession.getRating() > 0)
        {
            passengerRatingBar.setRating(ratingSession.getRating());
            updateRatingAndFeedbackCaption(ratingSession.getRating());
            feedbackCommentsInput.setText(ratingSession.getFeedback());
            if (ratingSession.getRating() > 0)
            {
                passengerPhotoContainer.setVisibility(8);
                ratingSubtitleTextView.setVisibility(8);
                ratingSectionFeedback.setVisibility(0);
                submitRatingButton.setVisibility(0);
            }
            ScreenAnalytics.trackScreenView("driver_passenger_rating");
            return;
        } else
        {
            ratingSectionFeedback.setVisibility(8);
            submitRatingButton.setVisibility(8);
            passengerPhotoContainer.setVisibility(0);
            ratingSubtitleTextView.setVisibility(0);
            ScreenAnalytics.trackScreenView("driver_passenger_feedback");
            return;
        }
    }

    private void showTooltips()
    {
        if (!routeProvider.getDriverRide().showHints())
        {
            return;
        } else
        {
            tooltipContainer.tryToShowAndMarkShown("star_5_button", tooltipAnchorRatingStar, 80);
            tooltipContainer.tryToShowAndMarkShown("submit_button", submitRatingButton, 48);
            return;
        }
    }

    private void submitRating()
    {
        int i = (int)passengerRatingBar.getRating();
        String s = feedbackCommentsInput.getText().toString();
        progressController.disableUI();
        binder.bind(driverRouteService.rate(getPassenger(), Integer.valueOf(i).intValue(), s), new AsyncCall() {

            final DriverRideRatingAndEarningsView this$0;

            public void onFail(Throwable throwable)
            {
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                if (routeProvider.getDriverRide().isCourier())
                {
                    rideIdProperty.onNext(getPassenger().getId());
                }
            }

            public void onUnsubscribe()
            {
                progressController.enableUI();
            }

            
            {
                this$0 = DriverRideRatingAndEarningsView.this;
                super();
            }
        });
        if (routeProvider.getDriverRide().isTrainingRide())
        {
            dialogFlow.show(new DriverDialogs.TrainingRideCompletedDialog(getPassenger().getPhotoUrl()));
        }
    }

    private void updateRatingAndFeedbackCaption(int i)
    {
        i;
        JVM INSTR tableswitch 1 5: default 36
    //                   1 37
    //                   2 93
    //                   3 100
    //                   4 107
    //                   5 114;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_114;
_L1:
        return;
_L2:
        int j = 0x7f0702e4;
_L7:
        ratingCaptionTextView.setText(getContext().getString(j));
        if (i < 5)
        {
            feedbackCaptionTextView.setText(getContext().getString(0x7f0702ec, new Object[] {
                getPassenger().getFirstName()
            }));
            return;
        } else
        {
            feedbackCaptionTextView.setText(getContext().getString(0x7f0702f3));
            return;
        }
_L3:
        j = 0x7f0702e6;
          goto _L7
_L4:
        j = 0x7f0702e7;
          goto _L7
_L5:
        j = 0x7f0702e8;
          goto _L7
        j = 0x7f0702e9;
          goto _L7
    }

    private void updateRatingBar()
    {
        passengerRatingBar.setOnRatingBarChangeListener(null);
        passengerRatingBar.setRating(0.0F);
        passengerRatingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
    }

    private void updateRideEarnings()
    {
        Money money = routeProvider.getDriverRide().getProfitMinusTip();
        if (money.isNull())
        {
            rideEarningLayout.setVisibility(8);
            return;
        }
        rideTotalTextView.setText(money.format());
        rideEarningLayout.setVisibility(0);
        int i = routeProvider.getDriverRide().getPrimeTimePercent();
        if (i != 0)
        {
            primeTimeLabel.setText(getContext().getString(0x7f070150, new Object[] {
                Integer.valueOf(i)
            }));
            primeTimeLabel.setVisibility(0);
            return;
        } else
        {
            primeTimeLabel.setVisibility(8);
            return;
        }
    }

    private void updateView()
    {
        imageLoader.load(getPassenger().getPhotoUrl()).placeholder(0x7f0201fc).fit().centerCrop().into(passengerPhotoImageView);
        updateRideEarnings();
        resolveRatingButtonColor();
        updateRatingBar();
        submitRatingButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverRideRatingAndEarningsView this$0;

            public void onClick(View view)
            {
                submitRating();
            }

            
            {
                this$0 = DriverRideRatingAndEarningsView.this;
                super();
            }
        });
        feedbackCommentsInput.setText("");
        ratingSubtitleTextView.setVisibility(0);
        passengerPhotoContainer.setVisibility(0);
        ratingSectionFeedback.setVisibility(8);
        submitRatingButton.setVisibility(8);
        ratingCaptionTextView.setText(getContext().getString(0x7f070151, new Object[] {
            getPassenger().getFirstName()
        }));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            rideIdProperty = ReactiveProperty.create(getPassenger().getRideId());
            binder.bind(rideIdProperty, new Action1() {

                final DriverRideRatingAndEarningsView this$0;

                public volatile void call(Object obj)
                {
                    call((String)obj);
                }

                public void call(String s)
                {
                    TransitionManagerCompat.beginDelayedTransition(DriverRideRatingAndEarningsView.this);
                    updateView();
                    restoreRatingData();
                }

            
            {
                this$0 = DriverRideRatingAndEarningsView.this;
                super();
            }
            });
            showTooltips();
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        persistRatingData();
        binder.detach();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }






}
