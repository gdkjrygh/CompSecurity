// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.content.res.Resources;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitView

class this._cls0 extends AsyncCall
{

    final InviteToSplitView this$0;

    public void onFail(Throwable throwable)
    {
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        unit = (new me.lyft.android.ui.<init>("split_invites_sent_dialog")).setTitle(getResources().getString(0x7f07034a)).setMessage(getResources().getString(0x7f070349)).setTitleColorResource(0x7f0c0025).addPositiveButton(getResources().getString(0x7f070212));
        dialogFlow.show(unit);
        appFlow.goBack();
    }

    public void onUnsubscribe()
    {
        progressController.hideProgress();
    }

    ()
    {
        this$0 = InviteToSplitView.this;
        super();
    }
}
