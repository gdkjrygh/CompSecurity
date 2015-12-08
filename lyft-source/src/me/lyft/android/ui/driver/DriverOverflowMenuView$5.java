// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.ride.Passenger;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverOverflowMenuView

class val.passenger
    implements android.view.owMenuView._cls5
{

    final DriverOverflowMenuView this$0;
    final Passenger val$passenger;

    public void onClick(View view)
    {
        dialogFlow.show(new ationDialog(val$passenger));
    }

    ationDialog()
    {
        this$0 = final_driveroverflowmenuview;
        val$passenger = Passenger.this;
        super();
    }
}
