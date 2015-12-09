// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.model;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;

public class RunningPlayerContextPage extends PlayerContextPage
{

    private final Boolean mPercentageMapping;
    private final Boolean mShuffle;
    private final PlayerSuppressions mSuppressions;

    public RunningPlayerContextPage(String s, String s1, PlayerTrack aplayertrack[], PlayerSuppressions playersuppressions, Boolean boolean1, Boolean boolean2, Map map)
    {
        super(s, s1, aplayertrack, map);
        mPercentageMapping = boolean1;
        mShuffle = boolean2;
        mSuppressions = playersuppressions;
    }

    public Boolean percentageMapping()
    {
        return mPercentageMapping;
    }

    public Boolean shuffle()
    {
        return mShuffle;
    }

    public PlayerSuppressions suppressions()
    {
        return mSuppressions;
    }
}
