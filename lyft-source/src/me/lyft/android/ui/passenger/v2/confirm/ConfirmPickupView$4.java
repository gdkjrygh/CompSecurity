// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import android.view.View;

// Referenced classes of package me.lyft.android.ui.passenger.v2.confirm:
//            ConfirmPickupView, ConfirmPresenter

class this._cls0
    implements android.view.
{

    final ConfirmPickupView this$0;

    public void onClick(View view)
    {
        confirmPresenter.onPickupAddressClick();
    }

    A()
    {
        this$0 = ConfirmPickupView.this;
        super();
    }
}
