// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCancellationConfirmationDialogView

class val.cancellationOption extends AsyncCall
{

    final DriverCancellationConfirmationDialogView this$0;
    final AsyncActionAnalytics val$cancelRideAnalytics;
    final CancellationOption val$cancellationOption;

    public void onFail(Throwable throwable)
    {
        viewErrorHandler.handle(throwable);
        val$cancelRideAnalytics.trackResponseFailure((new StringBuilder()).append(val$cancellationOption).append("|").append(throwable).toString());
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        dialogFlow.show(new Toast(getResources().getString(0x7f07030b)));
        val$cancelRideAnalytics.trackResponseSuccess(val$cancellationOption.getStatus());
        dialogFlow.dismiss();
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
    }

    ()
    {
        this$0 = final_drivercancellationconfirmationdialogview;
        val$cancelRideAnalytics = asyncactionanalytics;
        val$cancellationOption = CancellationOption.this;
        super();
    }
}
