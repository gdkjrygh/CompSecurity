// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import android.view.View;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.DriverAnalytics;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.driver:
//            LastRideConfirmationDialogView

class val.asyncActionAnalytics extends AsyncCall
{

    final esources this$1;
    final AsyncActionAnalytics val$asyncActionAnalytics;

    public void onFail(Throwable throwable)
    {
        val$asyncActionAnalytics.trackResponseFailure(throwable);
        viewErrorHandler.handle(throwable);
    }

    public void onStart()
    {
        progressController.hideProgress();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        val$asyncActionAnalytics.trackResponseSuccess();
        dialogFlow.dismiss();
        dialogFlow.show(new Toast(getResources().getString(0x7f0701eb), null));
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$asyncActionAnalytics = AsyncActionAnalytics.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/driver/LastRideConfirmationDialogView$1

/* anonymous class */
    class LastRideConfirmationDialogView._cls1
        implements android.view.View.OnClickListener
    {

        final LastRideConfirmationDialogView this$0;

        public void onClick(View view)
        {
            view = DriverAnalytics.trackEnterLastRide();
            progressController.showProgress();
            LastRideConfirmationDialogView.access$000(LastRideConfirmationDialogView.this).bind(driverRouteService.enterLastRide(), view. new LastRideConfirmationDialogView._cls1._cls1());
        }

            
            {
                this$0 = LastRideConfirmationDialogView.this;
                super();
            }
    }

}
