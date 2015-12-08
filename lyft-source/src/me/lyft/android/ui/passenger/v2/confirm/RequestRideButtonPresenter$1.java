// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.passenger.v2.confirm:
//            RequestRideButtonPresenter

class this._cls0 extends AsyncCall
{

    final RequestRideButtonPresenter this$0;

    public void onFail(Throwable throwable)
    {
        RequestRideButtonPresenter.access$000(RequestRideButtonPresenter.this, throwable);
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
    }

    ()
    {
        this$0 = RequestRideButtonPresenter.this;
        super();
    }
}
