// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.splitfare.SplitFareServiceException;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SplitPaymentRequestView

class val.successAction extends AsyncCall
{

    final SplitPaymentRequestView this$0;
    final Action0 val$successAction;

    public void onFail(Throwable throwable)
    {
        viewErrorHandler.handle(throwable);
        if ((throwable instanceof SplitFareServiceException) && "splitfare_request_lapsed".equals(((SplitFareServiceException)throwable).getReason()))
        {
            appFlow.goBack();
            showInactiveSplitDialog();
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        val$successAction.call();
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
    }

    ceException()
    {
        this$0 = final_splitpaymentrequestview;
        val$successAction = Action0.this;
        super();
    }
}
