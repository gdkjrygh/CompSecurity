// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.res.Resources;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.profile:
//            EditProfileView

class this._cls0 extends AsyncCall
{

    final EditProfileView this$0;

    public void onFail(Throwable throwable)
    {
        dialogFlow.show(new Toast(getResources().getString(0x7f0702d3)));
        viewErrorHandler.handle(throwable);
        EditProfileView.access$300(EditProfileView.this, null);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        dialogFlow.show(new Toast(getResources().getString(0x7f0702ca)));
        appFlow.goBack();
    }

    public void onUnsubscribe()
    {
        progressController.hideProgress();
    }

    ()
    {
        this$0 = EditProfileView.this;
        super();
    }
}
