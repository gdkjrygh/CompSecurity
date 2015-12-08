// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media.search;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.List;

public class mItems
    implements JacksonModel
{

    private final List mItems;

    public PlayerTrack[] convertToPlayerTracks()
    {
        PlayerTrack aplayertrack[] = new PlayerTrack[mItems.size()];
        for (int i = 0; i < mItems.size(); i++)
        {
            aplayertrack[i] = ((em)mItems.get(i)).convertToPlayerTrack();
        }

        return aplayertrack;
    }

    public List getItems()
    {
        return mItems;
    }

    public em(List list)
    {
        mItems = list;
    }
}
