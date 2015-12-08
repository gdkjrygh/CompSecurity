// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.HashSet;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.application.ride.IRatingSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRideExpense;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.SocialSharing;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import rx.Observable;
import rx.subjects.PublishSubject;

public class PassengerSubmitRatingButton extends Button
{

    AppFlow appFlow;
    private Binder binder;
    IConstantsProvider constantsProvider;
    DialogFlow dialogFlow;
    final Set improvementAreas = new HashSet();
    ILyftPreferences lyftPreferences;
    PublishSubject onSubmitPressedSubject;
    IPassengerRideProvider passengerRideProvider;
    IPassengerRideService passengerRideService;
    IProgressController progressController;
    IRatingSession ratingSession;
    IViewErrorHandler viewErrorHandler;

    public PassengerSubmitRatingButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onSubmitPressedSubject = PublishSubject.create();
        Scoop.a(this).b(this);
    }

    private boolean shouldShowPostRideInviteDialog()
    {
        SocialSharing socialsharing = constantsProvider.getConstants().getSocialSharing();
        return socialsharing != SocialSharing.NULL && socialsharing.getInviteRecommendedPromptDTO() != null;
    }

    private boolean shouldShowPostRideSocialDialog(int i)
    {
        while (constantsProvider.getConstants().getSocialSharing() == SocialSharing.NULL || i != 5 || lyftPreferences.getShareDialogShowCount() != 0) 
        {
            return false;
        }
        return true;
    }

    public Observable observeOnSubmitPressed()
    {
        return onSubmitPressedSubject.asObservable();
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
            return;
        }
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

    public boolean performClick()
    {
        super.performClick();
        onSubmitPressedSubject.onNext(Unit.create());
        return true;
    }

    protected void submitRating()
    {
        submitRating(PassengerRideExpense.empty());
    }

    protected void submitRating(PassengerRideExpense passengerrideexpense)
    {
        final AsyncActionAnalytics analytics = RideAnalytics.trackRateAndDonateDriver();
        final int rating = ratingSession.getRating();
        String s = Strings.nullToEmpty(ratingSession.getFeedback());
        improvementAreas.addAll(ratingSession.getImprovementAreas());
        progressController.disableUI();
        binder.bind(passengerRideService.rateAndDonateDriver(Integer.valueOf(rating), s, improvementAreas, passengerrideexpense), new AsyncCall() {

            final PassengerSubmitRatingButton this$0;
            final AsyncActionAnalytics val$analytics;
            final int val$rating;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analytics.trackResponseFailure(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
                if (shouldShowPostRideSocialDialog(rating))
                {
                    if (shouldShowPostRideInviteDialog())
                    {
                        dialogFlow.show(new PassengerDialogs.InviteRecommendedDialog());
                        unit = "show_invite_recommended";
                    } else
                    {
                        dialogFlow.show(new PassengerDialogs.PromptToInviteDialog());
                        unit = "show_prompt_to_invite";
                    }
                } else
                {
                    unit = "done";
                }
                analytics.trackResponseSuccess(unit);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.enableUI();
            }

            
            {
                this$0 = PassengerSubmitRatingButton.this;
                rating = i;
                analytics = asyncactionanalytics;
                super();
            }
        });
    }


}
