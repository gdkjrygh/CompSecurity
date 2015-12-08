// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCancelRideDialogView

class this._cls0 extends AsyncCall
{

    final PassengerCancelRideDialogView this$0;

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
        dialogFlow.show(new Toast(getResources().getString(0x7f07030b)));
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.enableUI();
    }

    ()
    {
        this$0 = PassengerCancelRideDialogView.this;
        super();
    }
}
