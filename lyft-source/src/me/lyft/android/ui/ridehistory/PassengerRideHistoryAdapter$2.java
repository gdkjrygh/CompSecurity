// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.view.View;
import me.lyft.android.common.Unit;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryAdapter

class this._cls0
    implements android.view.eHistoryAdapter._cls2
{

    final PassengerRideHistoryAdapter this$0;

    public void onClick(View view)
    {
        PassengerRideHistoryAdapter.access$100(PassengerRideHistoryAdapter.this).onNext(Unit.create());
    }

    ()
    {
        this$0 = PassengerRideHistoryAdapter.this;
        super();
    }
}
