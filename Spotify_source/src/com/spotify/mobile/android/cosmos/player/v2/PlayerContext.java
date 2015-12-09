// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            PlayerContextPage, PlayerRestrictions, PlayerTrack

public class PlayerContext
    implements JacksonModel
{

    private final String mEntityUri;
    private final PlayerContextPage mFallbackPages[];
    private final ImmutableMap mMetadata;
    private final PlayerContextPage mPages[];
    private final PlayerRestrictions mRestrictions;

    public PlayerContext(String s, Map map, PlayerRestrictions playerrestrictions, PlayerContextPage aplayercontextpage[], PlayerContextPage aplayercontextpage1[])
    {
        mEntityUri = s;
        if (map == null || map.isEmpty())
        {
            mMetadata = ImmutableMap.h();
        } else
        {
            mMetadata = ImmutableMap.a(map);
        }
        mRestrictions = playerrestrictions;
        mPages = aplayercontextpage;
        mFallbackPages = aplayercontextpage1;
    }

    public static PlayerContext create(String s, String s1)
    {
        return create(s, s1, Collections.EMPTY_MAP);
    }

    public static PlayerContext create(String s, String s1, Map map)
    {
        return new PlayerContext(s, map, null, new PlayerContextPage[] {
            new PlayerContextPage(s1, null, null, null)
        }, null);
    }

    public static PlayerContext create(String s, PlayerTrack aplayertrack[])
    {
        return create(s, aplayertrack, Collections.EMPTY_MAP);
    }

    public static PlayerContext create(String s, PlayerTrack aplayertrack[], PlayerRestrictions playerrestrictions, Map map)
    {
        return new PlayerContext(s, map, playerrestrictions, new PlayerContextPage[] {
            new PlayerContextPage(null, null, aplayertrack, null)
        }, null);
    }

    public static PlayerContext create(String s, PlayerTrack aplayertrack[], Map map)
    {
        return new PlayerContext(s, map, null, new PlayerContextPage[] {
            new PlayerContextPage(null, null, aplayertrack, null)
        }, null);
    }

    public String entityUri()
    {
        return mEntityUri;
    }

    public PlayerContextPage[] fallbackPages()
    {
        return mFallbackPages;
    }

    public Map metadata()
    {
        return mMetadata;
    }

    public PlayerContextPage[] pages()
    {
        return mPages;
    }

    public PlayerRestrictions restrictions()
    {
        return mRestrictions;
    }
}
