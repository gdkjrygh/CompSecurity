// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ridehistory;

import java.util.ArrayList;
import java.util.List;

public class PassengerRideHistory
{

    private boolean hasMore;
    private int limit;
    private int offset;
    private List rideHistory;

    public PassengerRideHistory(boolean flag, int i, int j)
    {
        rideHistory = new ArrayList();
        hasMore = flag;
        limit = i;
        offset = j;
    }

    public static PassengerRideHistory createEmptyPassengerRideHistory()
    {
        return new PassengerRideHistory(false, 0, 0);
    }

    public int getLimit()
    {
        return limit;
    }

    public int getOffset()
    {
        return offset;
    }

    public List getRideHistory()
    {
        return rideHistory;
    }

    public boolean hasMore()
    {
        return hasMore;
    }

    public void setHasMore(boolean flag)
    {
        hasMore = flag;
    }

    public void setLimit(int i)
    {
        limit = i;
    }

    public void setOffset(int i)
    {
        offset = i;
    }

    public void setRideHistory(List list)
    {
        rideHistory = list;
    }
}
