// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import rx.functions.Action0;

// Referenced classes of package me.lyft.android.ui.passenger.v2.pickup:
//            SetPickupView, RideTypeSwitcherPresenter

class this._cls0
    implements Action0
{

    final SetPickupView this$0;

    public void call()
    {
        rideTypeSwitcherController.onThumbClick();
    }

    Presenter()
    {
        this$0 = SetPickupView.this;
        super();
    }
}
