// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.ui.dialogs.Toast;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCourierPickupView

class this._cls0
    implements Action1
{

    final DriverCourierPickupView this$0;

    public void call(Integer integer)
    {
        dialogFlow.queue(new Toast(getResources().getString(0x7f070241, new Object[] {
            DriverCourierPickupView.access$000(DriverCourierPickupView.this).getFirstName()
        })));
        DriverCourierPickupView.access$1700(DriverCourierPickupView.this, integer);
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ()
    {
        this$0 = DriverCourierPickupView.this;
        super();
    }
}
