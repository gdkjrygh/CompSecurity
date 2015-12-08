// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import cty;
import java.util.Arrays;

public class RadioStationTracksModel
    implements JacksonModel
{

    public final String nextPageUrl;
    public final PlayerTrack tracks[];

    public RadioStationTracksModel(PlayerTrack aplayertrack[], String s)
    {
        tracks = aplayertrack;
        nextPageUrl = s;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof RadioStationTracksModel))
        {
            obj = (RadioStationTracksModel)obj;
            if (Arrays.equals(tracks, ((RadioStationTracksModel) (obj)).tracks) && cty.a(nextPageUrl, ((RadioStationTracksModel) (obj)).nextPageUrl))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            nextPageUrl, Integer.valueOf(Arrays.hashCode(tracks))
        });
    }
}
