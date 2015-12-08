// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import android.content.Context;

// Referenced classes of package com.yume.android.sdk:
//            YuMeException, YuMePlaybackStatus, YuMePlayerEventType, YuMePlayerInfo, 
//            YuMeTimelineEventType

public interface YuMeSDKPlayerInterface
{

    public abstract void YuMeSDKPlayer_ClickEventOccured(int i)
        throws YuMeException;

    public abstract Context YuMeSDKPlayer_GetActivityContext();

    public abstract Context YuMeSDKPlayer_GetApplicationContext();

    public abstract String YuMeSDKPlayer_GetUserAgent()
        throws YuMeException;

    public abstract void YuMeSDKPlayer_PlaybackFinished(YuMePlaybackStatus yumeplaybackstatus, boolean flag)
        throws YuMeException;

    public abstract void YuMeSDKPlayer_PlayerEventOccured(YuMePlayerEventType yumeplayereventtype)
        throws YuMeException;

    public abstract void YuMeSDKPlayer_SetBaseAssetDuration(int i)
        throws YuMeException;

    public abstract void YuMeSDKPlayer_SetPlayerInfo(YuMePlayerInfo yumeplayerinfo)
        throws YuMeException;

    public abstract void YuMeSDKPlayer_SwipeEventOccured(int i)
        throws YuMeException;

    public abstract void YuMeSDKPlayer_TimelineEventOccured(YuMeTimelineEventType yumetimelineeventtype, int i)
        throws YuMeException;

    public abstract void YuMeSDKPlayer_TransitionEffectShown()
        throws YuMeException;

    public abstract void YuMeSDKPlayer_UserActionViewClosed()
        throws YuMeException;
}
