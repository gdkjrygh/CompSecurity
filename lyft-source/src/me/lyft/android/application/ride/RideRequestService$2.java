// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestService, IRideRequestSession

class this._cls0
    implements Action1
{

    final RideRequestService this$0;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        RideRequestService.access$000(RideRequestService.this).clearConfirmations();
        RideRequestService.access$100(RideRequestService.this).reset();
    }

    ()
    {
        this$0 = RideRequestService.this;
        super();
    }
}
