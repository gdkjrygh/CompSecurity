// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryListView, PassengerRideHistoryAdapter

class  extends android.support.v7.widget.ew._cls7
{

    private static final int VISIBLE_THRESHOLD = 2;
    final PassengerRideHistoryListView this$0;

    public void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        i = PassengerRideHistoryListView.access$400(PassengerRideHistoryListView.this).y();
        j = PassengerRideHistoryListView.access$400(PassengerRideHistoryListView.this).i();
        if (!PassengerRideHistoryListView.access$300(PassengerRideHistoryListView.this) && PassengerRideHistoryListView.access$200(PassengerRideHistoryListView.this).hasMore() && i <= j + 2)
        {
            PassengerRideHistoryListView.access$000(PassengerRideHistoryListView.this);
        }
    }

    ()
    {
        this$0 = PassengerRideHistoryListView.this;
        super();
    }
}
