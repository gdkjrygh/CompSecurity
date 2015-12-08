// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver:
//            TrainingRideCompletedDialogView

class this._cls0 extends AsyncCall
{

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

    A()
    {
        this$0 = TrainingRideCompletedDialogView.this;
        super();
    }
}
