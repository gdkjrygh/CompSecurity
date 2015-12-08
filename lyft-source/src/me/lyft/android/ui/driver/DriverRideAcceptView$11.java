// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideAcceptView

class this._cls0 extends AsyncCall
{

    final DriverRideAcceptView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        defaultErrorHandler.handle(throwable);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.enableUI();
    }

    ()
    {
        this$0 = DriverRideAcceptView.this;
        super();
    }
}
