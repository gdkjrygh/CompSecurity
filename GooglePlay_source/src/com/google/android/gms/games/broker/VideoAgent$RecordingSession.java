// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.net.Uri;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.video.VideoConfiguration;

// Referenced classes of package com.google.android.gms.games.broker:
//            VideoAgent

private final class reset
{

    boolean keepRecordingAlive;
    VideoConfiguration mConfiguration;
    final Game mGame;
    public final String mPackageName;
    long mStoppingInitiatedMillis;
    boolean mWarnedAboutTimeRemaining;
    Uri mediaStoreUri;
    Uri outputUri;
    boolean reachedActiveState;
    long startClickInMillis;
    final VideoAgent this$0;
    public boolean wasThirdPartyLaunch;

    final boolean isStopTimeout()
    {
        if (mStoppingInitiatedMillis == 0L)
        {
            mStoppingInitiatedMillis = VideoAgent.getClock().currentTimeMillis();
            return false;
        }
        return VideoAgent.getClock().currentTimeMillis() - mStoppingInitiatedMillis > ((Long)G.videoStoppingTimeoutMillis.get()).longValue();
    }

    final void reset()
    {
        mStoppingInitiatedMillis = 0L;
        keepRecordingAlive = false;
        reachedActiveState = false;
        mWarnedAboutTimeRemaining = false;
        mediaStoreUri = null;
        outputUri = null;
    }

    (String s, Game game, VideoConfiguration videoconfiguration, boolean flag)
    {
        this$0 = VideoAgent.this;
        super();
        mStoppingInitiatedMillis = 0L;
        keepRecordingAlive = false;
        reachedActiveState = false;
        wasThirdPartyLaunch = true;
        startClickInMillis = 0L;
        mPackageName = s;
        mGame = game;
        wasThirdPartyLaunch = flag;
        mConfiguration = videoconfiguration;
        reset();
    }
}
