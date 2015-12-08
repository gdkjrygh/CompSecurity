// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import me.lyft.android.domain.ridehistory.PassengerRideHistoryItem;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryItemView

class view extends android.support.v7.widget.lder
{

    public PassengerRideHistoryItemView view;

    public void bindItem(PassengerRideHistoryItem passengerridehistoryitem)
    {
        view.setItem(passengerridehistoryitem);
    }

    public (PassengerRideHistoryItemView passengerridehistoryitemview)
    {
        super(passengerridehistoryitemview);
        view = passengerridehistoryitemview;
    }
}
