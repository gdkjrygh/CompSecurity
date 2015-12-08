// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

public class ExplicitQueue
    implements JacksonModel
{

    public PlayerTrack tracks[];

    ExplicitQueue(PlayerTrack aplayertrack[])
    {
        tracks = aplayertrack;
    }

    public void addItem(PlayerTrack playertrack)
    {
        PlayerTrack aplayertrack[] = new PlayerTrack[tracks.length + 1];
        System.arraycopy(tracks, 0, aplayertrack, 0, tracks.length);
        aplayertrack[aplayertrack.length - 1] = playertrack;
        tracks = aplayertrack;
    }

    public void removeItem(int i)
    {
        PlayerTrack aplayertrack[] = new PlayerTrack[tracks.length - 1];
        int j = 0;
        while (j < tracks.length) 
        {
            if (j != i)
            {
                int k;
                if (j < i)
                {
                    k = j;
                } else
                {
                    k = j - 1;
                }
                aplayertrack[k] = tracks[j];
            }
            j++;
        }
        tracks = aplayertrack;
    }
}
