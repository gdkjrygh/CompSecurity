// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.application.ride.IRatingSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.SimpleAnimationListener;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerSubmitRatingButton

public class PassengerRateView extends LinearLayout
{

    private static final String PASSENGER_DRIVER_FEEDBACK = "passenger_driver_feedback";
    AppFlow appFlow;
    private Binder binder;
    ICheckoutSession checkoutSession;
    TextView driverImproveCaption;
    RatingBar driverRatingBar;
    IEtaAnalyticService etaAnalyticService;
    IExpenseNoteSession expenseNoteSession;
    private AnimatorSet feedbackAnimation;
    EditText feedbackText;
    ImageLoader imageLoader;
    ToggleButton improveCleanliness;
    ToggleButton improveFriendliness;
    private android.view.View.OnClickListener improveListener;
    ToggleButton improveNavigation;
    View improveOptions;
    ToggleButton improveSafety;
    final Set improvementAreas = new HashSet();
    private final android.widget.RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = new android.widget.RatingBar.OnRatingBarChangeListener() {

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
                showFeedbackArea(true);
                hideDriverPhoto();
                ScreenAnalytics.trackScreenView("passenger_driver_feedback");
            }
        }

            
            {
                this$0 = PassengerRateView.this;
                super();
            }
    };
    final ReactiveProperty onRatingChange = ReactiveProperty.create();
    final PassengerScreens.PassengerRateRideScreen params;
    IPassengerRideProvider passengerRideProvider;
    TextView ratingCaption;
    private final Action1 ratingChange = new Action1() {

        final PassengerRateView this$0;

        public void call(Integer integer)
        {
            updateRatingCaptionAndToggles(integer.intValue());
            if (integer.intValue() <= 0)
            {
                driverRatingBar.setRating(1.0F);
            }
        }

        public volatile void call(Object obj)
        {
            call((Integer)obj);
        }

            
            {
                this$0 = PassengerRateView.this;
                super();
            }
    };
    TextView ratingDriverNameTxt;
    ImageView ratingDriverPhotoImageView;
    View ratingPhotoContainer;
    View ratingSectionFeedback;
    IRatingSession ratingSession;
    TextView ratingSubtitle;
    PassengerSubmitRatingButton submitDriverRatingButton;
    Toolbar toolbar;
    TextView whatYouLovedCaption;

    public PassengerRateView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        improveListener = new android.view.View.OnClickListener() {

            final PassengerRateView this$0;

            public void onClick(View view)
            {
                ToggleButton togglebutton = (ToggleButton)view;
                view = (String)view.getTag();
                if (togglebutton.isChecked())
                {
                    improvementAreas.add(view);
                    return;
                } else
                {
                    improvementAreas.remove(view);
                    return;
                }
            }

            
            {
                this$0 = PassengerRateView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        params = (PassengerScreens.PassengerRateRideScreen)context.a();
    }

    private ObjectAnimator createFadeInAnimator(View view)
    {
        view = ObjectAnimator.ofFloat(view, "alpha", new float[] {
            0.0F, 1.0F
        });
        view.setDuration(300L);
        return view;
    }

    private ObjectAnimator createFadeOutAnimator(View view)
    {
        view = ObjectAnimator.ofFloat(view, "alpha", new float[] {
            1.0F, 0.0F
        });
        view.setDuration(300L);
        return view;
    }

    private void hideDriverPhoto()
    {
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            ratingPhotoContainer.getHeight(), 0
        });
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final PassengerRateView this$0;

            public void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                if (ratingPhotoContainer != null)
                {
                    android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)ratingPhotoContainer.getLayoutParams();
                    layoutparams.height = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                    ratingPhotoContainer.setLayoutParams(layoutparams);
                }
            }

            
            {
                this$0 = PassengerRateView.this;
                super();
            }
        });
        valueanimator.addListener(new SimpleAnimationListener() {

            final PassengerRateView this$0;

            public void onAnimationEnd(Animator animator)
            {
                ratingPhotoContainer.setVisibility(8);
            }

            
            {
                this$0 = PassengerRateView.this;
                super();
            }
        });
        valueanimator.setInterpolator(new DecelerateInterpolator(1.25F));
        valueanimator.setDuration(400L);
        valueanimator.start();
    }

    private void hideFeedbackArea()
    {
        ratingPhotoContainer.setVisibility(0);
        ratingSubtitle.setAlpha(1.0F);
        ratingSectionFeedback.setAlpha(0.0F);
        ratingSectionFeedback.setVisibility(8);
        submitDriverRatingButton.setAlpha(0.0F);
        submitDriverRatingButton.setVisibility(8);
        ratingSubtitle.setVisibility(0);
    }

    private void initView()
    {
        ButterKnife.a(this);
        improveSafety.setOnClickListener(improveListener);
        improveCleanliness.setOnClickListener(improveListener);
        improveNavigation.setOnClickListener(improveListener);
        improveFriendliness.setOnClickListener(improveListener);
        resetRatingToggles();
        driverRatingBar.setRating(0.0F);
        feedbackText.setText("");
        etaAnalyticService.clear();
        Object obj = passengerRideProvider.getPassengerRide().getDriver();
        imageLoader.load(((Driver) (obj)).getPhoto()).placeholder(0x7f020207).centerInside().fit().into(ratingDriverPhotoImageView);
        obj = ((Driver) (obj)).getName();
        driverImproveCaption.setText(String.format(getContext().getString(0x7f0702ec), new Object[] {
            obj
        }));
        ratingCaption.setText(String.format(getContext().getString(0x7f0702f2), new Object[] {
            obj
        }));
        ratingDriverNameTxt.setText(((CharSequence) (obj)));
        if (showExpenseNoteScreen())
        {
            submitDriverRatingButton.setText(0x7f07020d);
        } else
        {
            submitDriverRatingButton.setText(0x7f07035b);
        }
        restoreRatingData();
        driverRatingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
    }

    private boolean isSameRide()
    {
        return ratingSession.getRideId().equals(passengerRideProvider.getPassengerRide().getId()) && ratingSession.getRating() > 0;
    }

    private void persistRatingData()
    {
        ratingSession.setRideId(passengerRideProvider.getPassengerRide().getId());
        ratingSession.setFeedback(feedbackText.getText().toString());
        ratingSession.setRating((int)driverRatingBar.getRating());
        ratingSession.setImprovementAreas(improvementAreas);
    }

    private void resetRatingToggles()
    {
        improveFriendliness.setChecked(false);
        improveNavigation.setChecked(false);
        improveCleanliness.setChecked(false);
        improveSafety.setChecked(false);
        improvementAreas.clear();
    }

    private void restoreRatingData()
    {
        if (isSameRide())
        {
            ratingPhotoContainer.setVisibility(8);
            driverRatingBar.setRating(ratingSession.getRating());
            updateRatingCaptionAndToggles(ratingSession.getRating());
            feedbackText.setText(ratingSession.getFeedback());
            improvementAreas.addAll(ratingSession.getImprovementAreas());
            Iterator iterator = ratingSession.getImprovementAreas().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ToggleButton togglebutton = (ToggleButton)findViewWithTag((String)iterator.next());
                if (togglebutton != null)
                {
                    togglebutton.setChecked(true);
                }
            } while (true);
            showFeedbackArea(false);
            ScreenAnalytics.trackScreenView("passenger_rate_driver");
            return;
        } else
        {
            hideFeedbackArea();
            ScreenAnalytics.trackScreenView("passenger_driver_feedback");
            return;
        }
    }

    private boolean showExpenseNoteScreen()
    {
        return checkoutSession.requireExpenseNote() || expenseNoteSession.isConcurEnabled();
    }

    private void showFeedbackArea(boolean flag)
    {
        if (ratingSectionFeedback.getVisibility() == 0)
        {
            return;
        }
        if (flag)
        {
            ObjectAnimator objectanimator = createFadeOutAnimator(ratingSubtitle);
            objectanimator.addListener(new SimpleAnimationListener() {

                final PassengerRateView this$0;

                public void onAnimationEnd(Animator animator)
                {
                    ratingSubtitle.setVisibility(8);
                }

            
            {
                this$0 = PassengerRateView.this;
                super();
            }
            });
            ObjectAnimator objectanimator1 = createFadeInAnimator(ratingSectionFeedback);
            ObjectAnimator objectanimator2 = createFadeInAnimator(submitDriverRatingButton);
            if (feedbackAnimation != null)
            {
                feedbackAnimation.cancel();
            }
            feedbackAnimation = new AnimatorSet();
            feedbackAnimation.play(objectanimator1).with(objectanimator2).after(objectanimator);
            feedbackAnimation.start();
        } else
        {
            ratingSubtitle.setAlpha(0.0F);
            submitDriverRatingButton.setAlpha(1.0F);
            ratingSectionFeedback.setAlpha(1.0F);
            ratingSubtitle.setVisibility(8);
        }
        ratingSectionFeedback.setVisibility(0);
        submitDriverRatingButton.setVisibility(0);
    }

    private void updateRatingCaptionAndToggles(int i)
    {
        i;
        JVM INSTR tableswitch 1 5: default 36
    //                   1 37
    //                   2 88
    //                   3 95
    //                   4 102
    //                   5 109;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        int j = 0x7f0702e5;
_L7:
        ratingCaption.setText(getContext().getString(j));
        if (i < 5)
        {
            whatYouLovedCaption.setVisibility(8);
            improveOptions.setVisibility(0);
        } else
        {
            whatYouLovedCaption.setVisibility(0);
            improveOptions.setVisibility(8);
        }
        if (i >= 5)
        {
            resetRatingToggles();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        j = 0x7f0702e6;
          goto _L7
_L4:
        j = 0x7f0702e7;
          goto _L7
_L5:
        j = 0x7f0702e8;
          goto _L7
_L6:
        j = 0x7f0702e9;
          goto _L7
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        toolbar.setTitle(getContext().getString(0x7f0702dd));
        binder = Binder.attach(this);
        binder.bind(onRatingChange.distinctUntilChanged(), ratingChange);
        binder.bind(submitDriverRatingButton.observeOnSubmitPressed(), new Action1() {

            final PassengerRateView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                persistRatingData();
                if (showExpenseNoteScreen())
                {
                    appFlow.goTo(new PassengerScreens.PassengerRideExpenseNoteScreen());
                    return;
                } else
                {
                    submitDriverRatingButton.submitRating();
                    return;
                }
            }

            
            {
                this$0 = PassengerRateView.this;
                super();
            }
        });
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        persistRatingData();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        initView();
    }





}
