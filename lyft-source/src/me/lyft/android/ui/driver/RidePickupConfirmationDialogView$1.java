// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            RidePickupConfirmationDialogView

class this._cls0
    implements Action1
{

    final RidePickupConfirmationDialogView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        dialogFlow.dismiss();
    }

    ()
    {
        this$0 = RidePickupConfirmationDialogView.this;
        super();
    }
}
