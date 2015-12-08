// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.DriverAnalytics;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.dialogs.Toast;

public class LastRideExitDialogView extends DialogContainerView
{

    private Binder binder;
    DialogFlow dialogFlow;
    IDriverRouteService driverRouteService;
    Button exitLastRideButton;
    IProgressController progressController;
    IViewErrorHandler viewErrorHandler;

    public LastRideExitDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
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
            exitLastRideButton.setOnClickListener(new android.view.View.OnClickListener() {

                final LastRideExitDialogView this$0;

                public void onClick(View view)
                {
                    view = DriverAnalytics.trackExitLastRide();
                    binder.bind(driverRouteService.exitLastRide(), view. new AsyncCall() {

                        final _cls1 this$1;
                        final AsyncActionAnalytics val$asyncActionAnalytics;

                        public void onFail(Throwable throwable)
                        {
                            asyncActionAnalytics.trackResponseFailure(throwable);
                            viewErrorHandler.handle(throwable);
                        }

                        public void onStart()
                        {
                            progressController.showProgress();
                        }

                        public volatile void onSuccess(Object obj)
                        {
                            onSuccess((Unit)obj);
                        }

                        public void onSuccess(Unit unit)
                        {
                            asyncActionAnalytics.trackResponseSuccess();
                            dialogFlow.dismiss();
                            dialogFlow.show(new Toast(getResources().getString(0x7f0701e7), null));
                        }

                        public void onUnsubscribe()
                        {
                            progressController.hideProgress();
                        }

            
            {
                this$1 = final__pcls1;
                asyncActionAnalytics = AsyncActionAnalytics.this;
                super();
            }
                    });
                }

            
            {
                this$0 = LastRideExitDialogView.this;
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
