// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.settings.ITrainingRideService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import rx.Observable;
import rx.functions.Func1;

public class TrainingRideStartView extends RelativeLayout
{

    AppFlow appFlow;
    private Binder binder;
    ILocationService locationService;
    IProgressController progressController;
    Button startPracticeRideButton;
    Toolbar toolbar;
    ITrainingRideService trainingRideService;
    IViewErrorHandler viewErrorHandler;

    public TrainingRideStartView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void startTrainingRide()
    {
        progressController.showProgress();
        binder.bind(locationService.getLastLocation().flatMap(new Func1() {

            final TrainingRideStartView this$0;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                return trainingRideService.startTrainingRide(location);
            }

            
            {
                this$0 = TrainingRideStartView.this;
                super();
            }
        }), new AsyncCall() {

            final TrainingRideStartView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
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
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = TrainingRideStartView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            toolbar.setTitle(getContext().getString(0x7f070378));
            binder = Binder.attach(this);
            startPracticeRideButton.setOnClickListener(new android.view.View.OnClickListener() {

                final TrainingRideStartView this$0;

                public void onClick(View view)
                {
                    startTrainingRide();
                }

            
            {
                this$0 = TrainingRideStartView.this;
                super();
            }
            });
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

}
