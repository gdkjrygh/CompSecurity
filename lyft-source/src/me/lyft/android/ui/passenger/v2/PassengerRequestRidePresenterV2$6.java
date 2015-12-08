// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import me.lyft.android.domain.splitfare.SplitFareRequest;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerRequestRidePresenterV2, PassengerRequestRideRouter

class this._cls0
    implements Action1
{

    final PassengerRequestRidePresenterV2 this$0;

    public volatile void call(Object obj)
    {
        call((SplitFareRequest)obj);
    }

    public void call(SplitFareRequest splitfarerequest)
    {
        if (splitFareRequestRepository.hasPendingRequest())
        {
            router.showAcceptDeclineSplitFareScreen();
        }
    }

    ry()
    {
        this$0 = PassengerRequestRidePresenterV2.this;
        super();
    }
}
