// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.res.Resources;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui:
//            PassengerMyPhotoView

class this._cls0 extends AsyncCall
{

    final PassengerMyPhotoView this$0;

    public void onFail(Throwable throwable)
    {
        dialogFlow.show(new Toast(getResources().getString(0x7f070219)));
        PassengerMyPhotoView.access$200(PassengerMyPhotoView.this, null);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        PassengerMyPhotoView.access$200(PassengerMyPhotoView.this, PassengerMyPhotoView.access$000(PassengerMyPhotoView.this));
    }

    public void onUnsubscribe()
    {
        PassengerMyPhotoView.access$300(PassengerMyPhotoView.this, false);
    }

    ()
    {
        this$0 = PassengerMyPhotoView.this;
        super();
    }
}
