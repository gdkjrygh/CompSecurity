// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.ride.RequestRideType;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.ride:
//            RequestRideTypeProvider

class val.rideTypeId
    implements Func1
{

    final RequestRideTypeProvider this$0;
    final String val$rideTypeId;

    public Boolean call(RequestRideType requestridetype)
    {
        return Boolean.valueOf(requestridetype.getId().equalsIgnoreCase(val$rideTypeId));
    }

    public volatile Object call(Object obj)
    {
        return call((RequestRideType)obj);
    }

    ()
    {
        this$0 = final_requestridetypeprovider;
        val$rideTypeId = String.this;
        super();
    }
}
