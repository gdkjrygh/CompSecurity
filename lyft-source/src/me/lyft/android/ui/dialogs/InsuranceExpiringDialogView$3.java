// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            InsuranceExpiringDialogView

class this._cls0 extends AsyncCall
{

    final InsuranceExpiringDialogView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        viewErrorHandler.handle(throwable);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.enableUI();
    }

    ()
    {
        this$0 = InsuranceExpiringDialogView.this;
        super();
    }
}
