// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import gcf;
import java.util.Map;
import java.util.Set;

class StatefulPlayerPosition
{

    private final gcf mClock;
    private long mPendingSeekPosition;
    private long mPendingSeekTimestamp;
    private final Player mPlayer;
    private PlayerState mPlayerState;

    public StatefulPlayerPosition(Player player)
    {
        this(player, new gcf());
    }

    public StatefulPlayerPosition(Player player, gcf gcf1)
    {
        mPendingSeekPosition = -1L;
        mPlayer = player;
        mClock = gcf1;
    }

    public long currentPlaybackPosition(long l)
    {
        if (mPlayerState == null || mPlayerState.positionAsOfTimestamp() == -1L || mPlayerState.duration() == -1L)
        {
            return -1L;
        }
        if (mPendingSeekPosition != -1L)
        {
            return mPendingSeekPosition;
        } else
        {
            return mPlayerState.currentPlaybackPosition(l);
        }
    }

    public long getDuration()
    {
        if (mPlayerState == null)
        {
            return -1L;
        } else
        {
            return mPlayerState.duration();
        }
    }

    public float getPlaybackSpeed()
    {
        boolean flag;
        if (mPlayerState != null && mPlayerState.duration() != -1L && mPendingSeekPosition == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return mPlayerState.playbackSpeed();
        } else
        {
            return 0.0F;
        }
    }

    public boolean isSeekPending()
    {
        return mPendingSeekPosition != -1L;
    }

    public boolean isSeekingDisallowed()
    {
        long l = getDuration();
        if (l == 0L || l == -1L)
        {
            return true;
        }
        PlayerTrack playertrack = mPlayerState.track();
        if (playertrack != null && "true".equalsIgnoreCase((String)playertrack.metadata().get("is_advertisement")))
        {
            return true;
        }
        return !mPlayerState.restrictions().disallowSeekingReasons().isEmpty();
    }

    public void seekTo(long l)
    {
        if (isSeekingDisallowed())
        {
            return;
        } else
        {
            mPendingSeekPosition = l;
            mPendingSeekTimestamp = gcf.a();
            mPlayer.seekTo(l);
            return;
        }
    }

    public void setPlayerState(PlayerState playerstate)
    {
        if (isSeekPending() && mPendingSeekTimestamp >= playerstate.timestamp())
        {
            return;
        } else
        {
            mPlayerState = playerstate;
            mPendingSeekPosition = -1L;
            mPendingSeekTimestamp = 0L;
            return;
        }
    }
}
