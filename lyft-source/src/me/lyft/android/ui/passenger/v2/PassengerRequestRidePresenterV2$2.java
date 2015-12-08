// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.rx.SimpleSubscriber;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerRequestRidePresenterV2

class this._cls0 extends SimpleSubscriber
{

    final PassengerRequestRidePresenterV2 this$0;

    public void onCompleted()
    {
        super.onCompleted();
        locationUpdateServiceState.onNext(Boolean.valueOf(false));
    }

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
        defaultErrorHandler.handle(throwable);
        locationUpdateServiceState.onNext(Boolean.valueOf(false));
    }

    ()
    {
        this$0 = PassengerRequestRidePresenterV2.this;
        super();
    }
}
