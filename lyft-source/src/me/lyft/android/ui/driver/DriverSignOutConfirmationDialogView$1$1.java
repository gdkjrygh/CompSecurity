// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.DriverSignOutConfirmationAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverSignOutConfirmationDialogView

class val.asyncActionAnalytics extends AsyncCall
{

    final ressController this$1;
    final AsyncActionAnalytics val$asyncActionAnalytics;

    public void onFail(Throwable throwable)
    {
        val$asyncActionAnalytics.trackResponseFailure(throwable);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((AppStateDTO)obj);
    }

    public void onSuccess(AppStateDTO appstatedto)
    {
        val$asyncActionAnalytics.trackResponseSuccess();
        dialogFlow.dismiss();
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
    }

    l.binder()
    {
        this$1 = final_binder;
        val$asyncActionAnalytics = AsyncActionAnalytics.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/driver/DriverSignOutConfirmationDialogView$1

/* anonymous class */
    class DriverSignOutConfirmationDialogView._cls1
        implements android.view.View.OnClickListener
    {

        final DriverSignOutConfirmationDialogView this$0;
        final Binder val$binder;

        public void onClick(View view)
        {
            DriverSignOutConfirmationAnalytics.signOut(System.currentTimeMillis() - DriverSignOutConfirmationDialogView.access$000(DriverSignOutConfirmationDialogView.this), DriverSignOutConfirmationDialogView.access$100(DriverSignOutConfirmationDialogView.this));
            progressController.disableUI();
            view = DriverSignOutConfirmationAnalytics.createSignOutAnalytics();
            view.trackRequest();
            binder.bind(apiFacade.switchMode(false), view. new DriverSignOutConfirmationDialogView._cls1._cls1());
        }

            
            {
                this$0 = final_driversignoutconfirmationdialogview;
                binder = Binder.this;
                super();
            }
    }

}
