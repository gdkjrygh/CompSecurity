// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.confirm:
//            ConfirmPickupView, ConfirmPresenter

class this._cls0
    implements Action1
{

    final ConfirmPickupView this$0;

    public void call(Integer integer)
    {
        if (integer.intValue() == 0x7f0d0005)
        {
            confirmPresenter.resetToPickupStep();
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    A()
    {
        this$0 = ConfirmPickupView.this;
        super();
    }
}
