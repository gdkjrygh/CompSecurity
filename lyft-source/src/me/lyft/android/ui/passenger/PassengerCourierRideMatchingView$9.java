// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.domain.ride.FixedFare;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideMatchingView

class this._cls0
    implements Func1
{

    final PassengerCourierRideMatchingView this$0;

    public volatile Object call(Object obj)
    {
        return call((FixedFare)obj);
    }

    public me.lyft.android.controls. call(FixedFare fixedfare)
    {
        return new me.lyft.android.controls.(fixedfare);
    }

    ()
    {
        this$0 = PassengerCourierRideMatchingView.this;
        super();
    }
}
