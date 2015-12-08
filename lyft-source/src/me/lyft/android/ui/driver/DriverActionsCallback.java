// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

class DriverActionsCallback extends AsyncCall
{

    private IProgressController progressController;
    private IViewErrorHandler viewErrorHandler;

    public DriverActionsCallback(IProgressController iprogresscontroller, IViewErrorHandler iviewerrorhandler)
    {
        progressController = iprogresscontroller;
        viewErrorHandler = iviewerrorhandler;
    }

    public void onFail(Throwable throwable)
    {
        viewErrorHandler.handle(throwable);
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
    }
}
