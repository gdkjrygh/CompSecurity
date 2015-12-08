// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.AsyncCall;
import rx.Observer;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class val.addressObserver extends AsyncCall
{

    final PassengerRequestRideView this$0;
    final Observer val$addressObserver;
    final Location val$location;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        val$addressObserver.onNext(getResources().getString(0x7f070064));
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Location)obj);
    }

    public void onSuccess(Location location1)
    {
        location1 = val$location.getDisplayName();
        if (!Strings.isNullOrEmpty(location1))
        {
            val$addressObserver.onNext(location1);
            return;
        } else
        {
            val$addressObserver.onNext(getResources().getString(0x7f070064));
            return;
        }
    }

    ()
    {
        this$0 = final_passengerrequestrideview;
        val$location = location1;
        val$addressObserver = Observer.this;
        super();
    }
}
