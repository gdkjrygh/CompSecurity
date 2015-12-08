// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.application.settings.ITrainingRideService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.Observable;
import rx.functions.Func1;

public class TrainingRideCompletedDialogView extends DialogContainerView
{

    private Binder binder;
    DialogFlow dialogFlow;
    Button dismissButton;
    ImageLoader imageLoader;
    ILocationService locationService;
    private String passengerPhotoUrl;
    IProgressController progressController;
    Button replayWalkthroughButton;
    ITrainingRideService trainingRideService;
    RoundedImageView userImageView;
    IViewErrorHandler viewErrorHandler;

    public TrainingRideCompletedDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        passengerPhotoUrl = ((DriverDialogs.TrainingRideCompletedDialog)context.a()).getPassengerPhotoUrl();
    }

    private void startTrainingRide()
    {
        progressController.showProgress();
        binder.bind(locationService.getLastLocation().flatMap(new Func1() {

            final TrainingRideCompletedDialogView this$0;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                return trainingRideService.startTrainingRide(location);
            }

            
            {
                this$0 = TrainingRideCompletedDialogView.this;
                super();
            }
        }), new AsyncCall() {

            final TrainingRideCompletedDialogView this$0;

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
                dialogFlow.dismiss();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = TrainingRideCompletedDialogView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        binder = Binder.attach(this);
        imageLoader.load(passengerPhotoUrl).fit().centerCrop().placeholder(0x7f0201fc).into(userImageView);
        replayWalkthroughButton.setOnClickListener(new android.view.View.OnClickListener() {

            final TrainingRideCompletedDialogView this$0;

            public void onClick(View view)
            {
                startTrainingRide();
            }

            
            {
                this$0 = TrainingRideCompletedDialogView.this;
                super();
            }
        });
        dismissButton.setOnClickListener(new android.view.View.OnClickListener() {

            final TrainingRideCompletedDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = TrainingRideCompletedDialogView.this;
                super();
            }
        });
    }

}
