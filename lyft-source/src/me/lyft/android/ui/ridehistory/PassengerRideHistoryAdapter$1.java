// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.view.View;
import me.lyft.android.domain.ridehistory.PassengerRideHistoryItem;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryAdapter

class val.passengerRideHistoryItem
    implements android.view.eHistoryAdapter._cls1
{

    final PassengerRideHistoryAdapter this$0;
    final PassengerRideHistoryItem val$passengerRideHistoryItem;

    public void onClick(View view)
    {
        PassengerRideHistoryAdapter.access$000(PassengerRideHistoryAdapter.this).onNext(val$passengerRideHistoryItem);
    }

    ()
    {
        this$0 = final_passengerridehistoryadapter;
        val$passengerRideHistoryItem = PassengerRideHistoryItem.this;
        super();
    }
}
