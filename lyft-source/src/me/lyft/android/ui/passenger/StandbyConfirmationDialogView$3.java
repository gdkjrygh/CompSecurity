// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.passenger:
//            StandbyConfirmationDialogView

class this._cls0 extends AsyncCall
{

    final StandbyConfirmationDialogView this$0;

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
        dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$StandbyConfirmationDialog);
    }

    tionDialog()
    {
        this$0 = StandbyConfirmationDialogView.this;
        super();
    }
}
