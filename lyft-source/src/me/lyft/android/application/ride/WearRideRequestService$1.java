// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            WearRideRequestService

class this._cls0
    implements Action1
{

    final WearRideRequestService this$0;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        WearRideRequestService.access$000(WearRideRequestService.this).reset();
    }

    ()
    {
        this$0 = WearRideRequestService.this;
        super();
    }
}
