// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.infrastructure.lyft.AppStateDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            PassengerRideService, IRideRequestSession, IRatingSession, IExpenseNoteSession

class this._cls0
    implements Action1
{

    final PassengerRideService this$0;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        PassengerRideService.access$000(PassengerRideService.this).clearRideRequest();
        PassengerRideService.access$100(PassengerRideService.this).reset();
        PassengerRideService.access$200(PassengerRideService.this).reset();
    }

    ()
    {
        this$0 = PassengerRideService.this;
        super();
    }
}
