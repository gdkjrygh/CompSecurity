// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import ctz;
import gcf;
import gib;

class StatefulPlayerQueue
{

    private static final long TRACK_CHANGE_GRACE_PERIOD_MILLISECONDS = 500L;
    private final gcf mClock;
    private PlayerContextIndex mIndex;
    private PlayerTrack mOffsetFuture[];
    private PlayerTrack mOffsetReverse[];
    private PlayerTrack mOffsetTrack;
    private String mPlaybackId;
    private int mPosition;
    private int mPositionOffset;
    private long mPositionOffsetTimestamp;
    private PlayerTrack mQueue[];

    public StatefulPlayerQueue()
    {
        this(new gcf());
    }

    public StatefulPlayerQueue(gcf gcf1)
    {
        mQueue = new PlayerTrack[1];
        mPositionOffsetTimestamp = -1L;
        mClock = gcf1;
    }

    private static PlayerTrack[] buildQueue(PlayerTrack aplayertrack[], PlayerTrack playertrack, PlayerTrack aplayertrack1[])
    {
        int i = 0;
        PlayerTrack aplayertrack2[] = new PlayerTrack[aplayertrack.length + 1 + aplayertrack1.length];
        System.arraycopy(aplayertrack, 0, aplayertrack2, 0, aplayertrack.length);
        aplayertrack2[aplayertrack.length] = playertrack;
        for (; i < aplayertrack1.length; i++)
        {
            aplayertrack2[aplayertrack.length + 1 + i] = aplayertrack1[i];
        }

        return aplayertrack2;
    }

    private boolean isInjectedTrack(PlayerTrack playertrack)
    {
        if (playertrack != null)
        {
            if ("context".equals(playertrack = playertrack.provider()) || "queue".equals(playertrack))
            {
                return false;
            }
        }
        return true;
    }

    private void updateReverseAndFuture()
    {
        boolean flag = false;
        int i = mPosition;
        int j = mPositionOffset + i;
        ctz.b(j, mQueue.length);
        PlayerTrack playertrack;
        int k;
        if (mQueue[mPosition] != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k = Math.max(0, mQueue.length - j - 1);
        mOffsetReverse = new PlayerTrack[j];
        System.arraycopy(mQueue, 0, mOffsetReverse, 0, j);
        if (i != 0)
        {
            playertrack = mQueue[j];
        } else
        {
            playertrack = null;
        }
        mOffsetTrack = playertrack;
        mOffsetFuture = new PlayerTrack[k];
        for (i = ((flag) ? 1 : 0); i < k; i++)
        {
            mOffsetFuture[i] = mQueue[j + 1 + i];
        }

    }

    public PlayerTrack[] getFuture()
    {
        return mOffsetFuture;
    }

    public PlayerContextIndex getIndex()
    {
        if (isInSync())
        {
            return mIndex;
        } else
        {
            return null;
        }
    }

    public String getPlaybackId()
    {
        if (isInSync())
        {
            return mPlaybackId;
        } else
        {
            return null;
        }
    }

    public PlayerTrack[] getReverse()
    {
        return mOffsetReverse;
    }

    public PlayerTrack getTrack()
    {
        return mOffsetTrack;
    }

    public boolean isInSync()
    {
        return mPositionOffsetTimestamp == -1L;
    }

    public void setPlayerState(PlayerState playerstate, boolean flag)
    {
        gib.a("Original queue tracks", playerstate.reverse(), playerstate.track(), playerstate.future());
        int i = mPositionOffset;
        long l = mPositionOffsetTimestamp;
        playerstate.timestamp();
        gib.a(mOffsetTrack);
        if (isInSync()) goto _L2; else goto _L1
_L1:
        if (playerstate.timestamp() >= mPositionOffsetTimestamp) goto _L4; else goto _L3
_L3:
        return;
_L4:
        Object obj = playerstate.track();
        String s;
        boolean flag1;
        if (mOffsetTrack != null)
        {
            s = mOffsetTrack.uri();
        } else
        {
            s = null;
        }
        if (obj != null)
        {
            obj = ((PlayerTrack) (obj)).uri();
        } else
        {
            obj = "";
        }
        flag1 = isInjectedTrack(playerstate.track());
        if (!flag && s != null && !s.equals(obj) && playerstate.timestamp() < mPositionOffsetTimestamp + 500L && !flag1) goto _L3; else goto _L2
_L2:
        mQueue = buildQueue(playerstate.reverse(), playerstate.track(), playerstate.future());
        mPosition = playerstate.reverse().length;
        mPositionOffset = 0;
        mPositionOffsetTimestamp = -1L;
        mPlaybackId = playerstate.playbackId();
        mIndex = playerstate.index();
        updateReverseAndFuture();
        return;
    }

    public void skipToNextTrack()
    {
        if (mPosition + mPositionOffset + 1 >= mQueue.length)
        {
            return;
        } else
        {
            mPositionOffset = mPositionOffset + 1;
            mPositionOffsetTimestamp = gcf.a();
            updateReverseAndFuture();
            return;
        }
    }

    public void skipToPreviousTrack()
    {
        if (mPosition + mPositionOffset <= 0)
        {
            return;
        } else
        {
            mPositionOffset = mPositionOffset - 1;
            mPositionOffsetTimestamp = gcf.a();
            updateReverseAndFuture();
            return;
        }
    }
}
