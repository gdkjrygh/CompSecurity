// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.widget.LinearLayout;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.RideStatus;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            MenuView

class this._cls0
    implements Action1
{

    final MenuView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        boolean flag = passengerRideProvider.getPassengerRide().getStatus().isActive();
        unit = driverModeSwitcherView;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        unit.setVisibility(byte0);
        MenuView.access$300(MenuView.this, flag);
        MenuView.access$200(MenuView.this);
    }

    deStatus()
    {
        this$0 = MenuView.this;
        super();
    }
}
