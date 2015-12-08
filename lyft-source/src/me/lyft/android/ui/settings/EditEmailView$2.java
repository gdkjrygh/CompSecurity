// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.settings:
//            EditEmailView

class this._cls0 extends AsyncCall
{

    final EditEmailView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        if (!EditEmailView.access$200(EditEmailView.this, throwable))
        {
            defaultErrorHandler.handle(throwable);
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        dialogFlow.show(new Toast(getContext().getString(0x7f0702ca)));
        EditEmailView.access$100(EditEmailView.this);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    andler()
    {
        this$0 = EditEmailView.this;
        super();
    }
}
