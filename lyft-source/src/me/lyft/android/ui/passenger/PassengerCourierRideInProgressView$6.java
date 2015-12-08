// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.ride.RideFare;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideInProgressView

class this._cls0
    implements android.view.nProgressView._cls6
{

    final PassengerCourierRideInProgressView this$0;

    public void onClick(View view)
    {
        dialogFlow.show(new ialog(rideFareRepository.getFare().getTotalMoney(), null, null));
    }

    ialog()
    {
        this$0 = PassengerCourierRideInProgressView.this;
        super();
    }
}
