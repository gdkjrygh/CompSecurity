// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import java.util.concurrent.TimeUnit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.ReactiveProperty;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class val.nearbyDriversCount extends AsyncCall
{

    final PassengerRequestRideView this$0;
    final int val$nearbyDriversCount;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        PassengerRequestRideView.access$3500(PassengerRequestRideView.this).onNext(getResources().getQuantityString(0x7f0f0003, val$nearbyDriversCount, new Object[] {
            Integer.valueOf(val$nearbyDriversCount)
        }));
    }

    public void onSuccess(Long long1)
    {
        super.onSuccess(long1);
        int j = (int)TimeUnit.SECONDS.toMinutes(long1.longValue());
        int i = j;
        if (j < 1)
        {
            i = 1;
        }
        PassengerRequestRideView.access$3500(PassengerRequestRideView.this).onNext(getResources().getString(0x7f07023b, new Object[] {
            Integer.valueOf(i)
        }));
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Long)obj);
    }

    ()
    {
        this$0 = final_passengerrequestrideview;
        val$nearbyDriversCount = I.this;
        super();
    }
}
