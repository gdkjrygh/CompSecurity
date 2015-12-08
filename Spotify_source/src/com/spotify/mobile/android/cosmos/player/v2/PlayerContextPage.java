// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            PlayerTrack

public class PlayerContextPage
    implements JacksonModel
{

    private final ImmutableMap mMetadata;
    private final String mNextPageUrl;
    private final String mPageUrl;
    private final PlayerTrack mTracks[];

    public PlayerContextPage(String s, String s1, PlayerTrack aplayertrack[], Map map)
    {
        mPageUrl = s;
        mNextPageUrl = s1;
        mTracks = aplayertrack;
        if (map == null || map.isEmpty())
        {
            mMetadata = ImmutableMap.h();
            return;
        } else
        {
            mMetadata = ImmutableMap.a(map);
            return;
        }
    }

    public Map metadata()
    {
        return mMetadata;
    }

    public String nextPageUrl()
    {
        return mNextPageUrl;
    }

    public String pageUrl()
    {
        return mPageUrl;
    }

    public PlayerTrack[] tracks()
    {
        return mTracks;
    }
}
