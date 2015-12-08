// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ridehistory;

import java.util.List;

public class PassengerRideHistoryDTO
{

    public final List data;
    public final boolean hasMore;
    public final int limit;
    public final int skip;

    public PassengerRideHistoryDTO(boolean flag, int i, int j, List list)
    {
        hasMore = flag;
        skip = i;
        limit = j;
        data = list;
    }
}
