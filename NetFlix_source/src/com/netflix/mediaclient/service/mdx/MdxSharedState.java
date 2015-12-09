// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.IMdxSharedState;
import com.netflix.mediaclient.ui.mdx.MdxTargetCapabilities;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

public class MdxSharedState
    implements IMdxSharedState
{

    private static final long INVALID_TIME = -1L;
    private static final int INVALID_VOLUME = -1;
    private static final Map MDX_PLAYBACK_STATE_NAME = new HashMap() {

            
            {
                put(com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Playing, "Playing");
                put(com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Paused, "Paused");
                put(com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Stopped, "Stopped");
                put(com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Loading, "Loading");
                put(com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Transitioning, "Transitioning");
            }
    };
    private static final String TAG = com/netflix/mediaclient/service/mdx/MdxSharedState.getSimpleName();
    private boolean mAllowVolume;
    private boolean mHasActivePlayback;
    private com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState mPlaybackState;
    private long mReportedPlaybackPositionInMs;
    private long mTimePositionReorptedInMs;
    private String mUuid;
    private int mVolume;

    MdxSharedState(String s)
    {
        mPlaybackState = com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Stopped;
        mReportedPlaybackPositionInMs = -1L;
        mVolume = -1;
        mUuid = s;
    }

    private void reset()
    {
        mHasActivePlayback = false;
        mPlaybackState = com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Stopped;
        mReportedPlaybackPositionInMs = -1L;
        mVolume = -1;
    }

    public com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState getMdxPlaybackState()
    {
        this;
        JVM INSTR monitorenter ;
        com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState mdxplaybackstate = mPlaybackState;
        this;
        JVM INSTR monitorexit ;
        return mdxplaybackstate;
        Exception exception;
        exception;
        throw exception;
    }

    public long getPlaybackPositionInMs()
    {
        long l1 = -1L;
        this;
        JVM INSTR monitorenter ;
        long l = l1;
        if (mReportedPlaybackPositionInMs <= -1L) goto _L2; else goto _L1
_L1:
        l = l1;
        if (!mHasActivePlayback) goto _L2; else goto _L3
_L3:
        if (mPlaybackState != com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Playing) goto _L5; else goto _L4
_L4:
        long l2;
        l = System.currentTimeMillis();
        l1 = mTimePositionReorptedInMs;
        l2 = mReportedPlaybackPositionInMs;
        l = (l - l1) + l2;
_L2:
        this;
        JVM INSTR monitorexit ;
        return l;
_L5:
        l = mReportedPlaybackPositionInMs;
        if (true) goto _L2; else goto _L6
_L6:
        Exception exception;
        exception;
        throw exception;
    }

    public int getRecentVolume()
    {
        return mVolume;
    }

    String getTargetUuid()
    {
        return mUuid;
    }

    public boolean hasActivePlayback()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mHasActivePlayback;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isVolumeEnabled()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mAllowVolume;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    void notifyPlayCommandReceived()
    {
        mPlaybackState = com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Loading;
        Log.d(TAG, (new StringBuilder()).append("state: ").append((String)MDX_PLAYBACK_STATE_NAME.get(mPlaybackState)).append(", pos: ").append(mReportedPlaybackPositionInMs).append(", volume: ").append(mVolume).toString());
    }

    void notifyPlaybackEnd()
    {
        reset();
        Log.d(TAG, (new StringBuilder()).append("state: ").append((String)MDX_PLAYBACK_STATE_NAME.get(mPlaybackState)).append(", pos: ").append(mReportedPlaybackPositionInMs).append(", volume: ").append(mVolume).toString());
    }

    void notifyPlaybackStart()
    {
        mHasActivePlayback = true;
        mPlaybackState = com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Playing;
        Log.d(TAG, (new StringBuilder()).append("state: ").append((String)MDX_PLAYBACK_STATE_NAME.get(mPlaybackState)).append(", pos: ").append(mReportedPlaybackPositionInMs).append(", volume: ").append(mVolume).toString());
    }

    void notifyPlaybackState(String s, int i, int j)
    {
        mReportedPlaybackPositionInMs = i;
        mTimePositionReorptedInMs = System.currentTimeMillis();
        mVolume = j;
        if ("prepause".equals(s) || "preplay".equals(s) || "preseek".equals(s))
        {
            mPlaybackState = com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Transitioning;
        } else
        if ("PROGRESS".equals(s) || "AUTO_ADVANCE".equals(s) || "STALLED".equals(s))
        {
            mPlaybackState = com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Transitioning;
        } else
        if ("PLAY".equals(s) || "PLAYING".equals(s))
        {
            mPlaybackState = com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Playing;
        } else
        if ("PAUSE".equals(s))
        {
            mPlaybackState = com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Paused;
        } else
        {
            mPlaybackState = com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Stopped;
        }
        Log.d(TAG, (new StringBuilder()).append("state: ").append((String)MDX_PLAYBACK_STATE_NAME.get(mPlaybackState)).append(", pos: ").append(mReportedPlaybackPositionInMs).append(", volume: ").append(mVolume).toString());
    }

    void notifyTargetCapability(String s)
    {
        try
        {
            mAllowVolume = (new MdxTargetCapabilities(s)).isVolumeControl();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w(TAG, "ignore capability data ", s);
        }
    }

}
