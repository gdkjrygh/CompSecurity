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

class val.binder
    implements android.view.DialogView._cls1
{

    final DriverSignOutConfirmationDialogView this$0;
    final Binder val$binder;

    public void onClick(final View asyncActionAnalytics)
    {
        DriverSignOutConfirmationAnalytics.signOut(System.currentTimeMillis() - DriverSignOutConfirmationDialogView.access$000(DriverSignOutConfirmationDialogView.this), DriverSignOutConfirmationDialogView.access$100(DriverSignOutConfirmationDialogView.this));
        progressController.disableUI();
        asyncActionAnalytics = DriverSignOutConfirmationAnalytics.createSignOutAnalytics();
        asyncActionAnalytics.trackRequest();
        val$binder.bind(apiFacade.switchMode(false), new AsyncCall() {

            final DriverSignOutConfirmationDialogView._cls1 this$1;
            final AsyncActionAnalytics val$asyncActionAnalytics;

            public void onFail(Throwable throwable)
            {
                asyncActionAnalytics.trackResponseFailure(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((AppStateDTO)obj);
            }

            public void onSuccess(AppStateDTO appstatedto)
            {
                asyncActionAnalytics.trackResponseSuccess();
                dialogFlow.dismiss();
            }

            public void onUnsubscribe()
            {
                progressController.enableUI();
            }

            
            {
                this$1 = DriverSignOutConfirmationDialogView._cls1.this;
                asyncActionAnalytics = asyncactionanalytics;
                super();
            }
        });
    }

    _cls1.val.asyncActionAnalytics()
    {
        this$0 = final_driversignoutconfirmationdialogview;
        val$binder = Binder.this;
        super();
    }
}
