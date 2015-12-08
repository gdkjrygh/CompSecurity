// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.res.Resources;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.profile:
//            UpdatePassengerProfilePhotoView

class this._cls0 extends AsyncCall
{

    final UpdatePassengerProfilePhotoView this$0;

    public void onFail(Throwable throwable)
    {
        dialogFlow.show(new Toast(getResources().getString(0x7f0702d3)));
        viewErrorHandler.handle(throwable);
        UpdatePassengerProfilePhotoView.access$300(UpdatePassengerProfilePhotoView.this, null);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        UpdatePassengerProfilePhotoView.access$300(UpdatePassengerProfilePhotoView.this, UpdatePassengerProfilePhotoView.access$000(UpdatePassengerProfilePhotoView.this));
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    ()
    {
        this$0 = UpdatePassengerProfilePhotoView.this;
        super();
    }
}
