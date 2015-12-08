// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.common.Objects;
import me.lyft.android.domain.passenger.Driver;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerClassicRideInProgressView

class this._cls0
    implements me.lyft.android.rx.essView._cls2
{

    final PassengerClassicRideInProgressView this$0;

    public volatile boolean equals(Object obj, Object obj1)
    {
        return equals((Driver)obj, (Driver)obj1);
    }

    public boolean equals(Driver driver, Driver driver1)
    {
        return driver != null && driver1 != null && Objects.equals(driver.getId(), driver1.getId());
    }

    ()
    {
        this$0 = PassengerClassicRideInProgressView.this;
        super();
    }
}
