// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.model.StationRecord;

class StationViewModel
{

    private boolean isPlaying;
    private final StationRecord station;

    StationViewModel(StationRecord stationrecord, boolean flag)
    {
        station = stationrecord;
        isPlaying = flag;
    }

    StationRecord getStation()
    {
        return station;
    }

    boolean isPlaying()
    {
        return isPlaying;
    }

    void setIsPlaying(boolean flag)
    {
        isPlaying = flag;
    }
}
