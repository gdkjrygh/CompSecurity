// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            PlayerOptions, PlayerContextIndex, PlayerSuppressions

public class PlayOptions
    implements JacksonModel
{

    private final boolean mInitiallyPaused;
    private final PlayerOptions mPlayerOptionsOverride;
    private final Long mSeekTo;
    private final PlayerContextIndex mSkipToIndex;
    private final PlayerSuppressions mSuppressions;

    public PlayOptions(PlayerContextIndex playercontextindex, Long long1, boolean flag, PlayerOptions playeroptions, PlayerSuppressions playersuppressions)
    {
        mSkipToIndex = playercontextindex;
        mSeekTo = long1;
        mInitiallyPaused = flag;
        mPlayerOptionsOverride = playeroptions;
        mSuppressions = playersuppressions;
    }

    public boolean initiallyPaused()
    {
        return mInitiallyPaused;
    }

    public PlayerOptions playerOptionsOverride()
    {
        return mPlayerOptionsOverride;
    }

    public Long seekTo()
    {
        return mSeekTo;
    }

    public PlayerContextIndex skipToIndex()
    {
        return mSkipToIndex;
    }

    public PlayerSuppressions suppressions()
    {
        return mSuppressions;
    }
}
