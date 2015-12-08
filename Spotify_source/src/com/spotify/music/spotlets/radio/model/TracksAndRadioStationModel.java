// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import cty;
import java.util.Arrays;

// Referenced classes of package com.spotify.music.spotlets.radio.model:
//            RadioStationTracksModel, RadioStationModel

public class TracksAndRadioStationModel extends RadioStationTracksModel
{

    public final RadioStationModel station;

    public TracksAndRadioStationModel(RadioStationModel radiostationmodel, PlayerTrack aplayertrack[], String s)
    {
        super(aplayertrack, s);
        station = radiostationmodel;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof TracksAndRadioStationModel)
        {
            obj = (TracksAndRadioStationModel)obj;
            flag = flag1;
            if (super.equals(obj))
            {
                flag = flag1;
                if (cty.a(station, ((TracksAndRadioStationModel) (obj)).station))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(super.hashCode()), station
        });
    }
}
