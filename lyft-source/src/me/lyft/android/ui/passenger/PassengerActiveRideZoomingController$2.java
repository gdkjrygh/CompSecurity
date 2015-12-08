// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.analytics.studies.PassengerAnalytics;
import me.lyft.android.common.Unit;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerActiveRideZoomingController

class this._cls0
    implements Action1
{

    final PassengerActiveRideZoomingController this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        PassengerAnalytics.trackMapMove();
        PassengerActiveRideZoomingController.access$000(PassengerActiveRideZoomingController.this).onNext(de.USER_INTERACTION);
    }

    de()
    {
        this$0 = PassengerActiveRideZoomingController.this;
        super();
    }
}
