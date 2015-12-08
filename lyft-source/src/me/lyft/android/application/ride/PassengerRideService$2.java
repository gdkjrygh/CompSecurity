// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.infrastructure.lyft.ride.ShareRouteDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.ride:
//            PassengerRideService

class this._cls0
    implements Func1
{

    final PassengerRideService this$0;

    public volatile Object call(Object obj)
    {
        return call((ShareRouteDTO)obj);
    }

    public String call(ShareRouteDTO shareroutedto)
    {
        return shareroutedto.getShareUrl();
    }

    ()
    {
        this$0 = PassengerRideService.this;
        super();
    }
}
