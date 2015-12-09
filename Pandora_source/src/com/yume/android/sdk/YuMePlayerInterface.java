// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import android.widget.FrameLayout;
import java.util.List;

// Referenced classes of package com.yume.android.sdk:
//            YuMePlayerException, YuMePlayerInfo, YuMeSDKPlayerInterface, YuMeClickType, 
//            YuMeAdInfo, YuMeAssetType, YuMeTransitionEffect

public interface YuMePlayerInterface
{

    public abstract void YuMePlayer_AddEventToCalendar(String s)
        throws YuMePlayerException;

    public abstract void YuMePlayer_DeInit()
        throws YuMePlayerException;

    public abstract YuMePlayerInfo YuMePlayer_GetPlayerInfo()
        throws YuMePlayerException;

    public abstract int YuMePlayer_GetProgressiveDownloadTimeoutSec()
        throws YuMePlayerException;

    public abstract List YuMePlayer_GetSupportedFileFormats()
        throws YuMePlayerException;

    public abstract List YuMePlayer_GetSupportedMimeTypes()
        throws YuMePlayerException;

    public abstract String YuMePlayer_GetVersion()
        throws YuMePlayerException;

    public abstract void YuMePlayer_HandleBroadcastEvent(String s)
        throws YuMePlayerException;

    public abstract void YuMePlayer_HideImage(int i)
        throws YuMePlayerException;

    public abstract void YuMePlayer_Init(int i, boolean flag, boolean flag1, YuMeSDKPlayerInterface yumesdkplayerinterface)
        throws YuMePlayerException;

    public abstract boolean YuMePlayer_IsCalendarOperationsSupported()
        throws YuMePlayerException;

    public abstract void YuMePlayer_ModifyParams(int i, boolean flag, boolean flag1)
        throws YuMePlayerException;

    public abstract void YuMePlayer_OpenClickURL(String s, String s1, YuMeClickType yumeclicktype, String s2)
        throws YuMePlayerException;

    public abstract void YuMePlayer_PauseAd()
        throws YuMePlayerException;

    public abstract void YuMePlayer_ReplayAdVideo()
        throws YuMePlayerException;

    public abstract void YuMePlayer_ResumeAd()
        throws YuMePlayerException;

    public abstract void YuMePlayer_SetAdInfo(YuMeAdInfo yumeadinfo, boolean flag, boolean flag1)
        throws YuMePlayerException;

    public abstract void YuMePlayer_SetControlBarVisibility(boolean flag, boolean flag1, boolean flag2)
        throws YuMePlayerException;

    public abstract void YuMePlayer_SetOverlaysVisibility(boolean flag)
        throws YuMePlayerException;

    public abstract void YuMePlayer_SetParentView(FrameLayout framelayout)
        throws YuMePlayerException;

    public abstract void YuMePlayer_ShowCountdown(int i, YuMeAssetType yumeassettype)
        throws YuMePlayerException;

    public abstract void YuMePlayer_ShowImage(int i)
        throws YuMePlayerException;

    public abstract void YuMePlayer_ShowLinkedAd(int i, YuMeAdInfo yumeadinfo, boolean flag)
        throws YuMePlayerException;

    public abstract void YuMePlayer_ShowTransitionEffect(YuMeTransitionEffect yumetransitioneffect)
        throws YuMePlayerException;

    public abstract void YuMePlayer_StartPlay(boolean flag)
        throws YuMePlayerException;

    public abstract void YuMePlayer_StopPlay()
        throws YuMePlayerException;

    public abstract void YuMePlayer_TearDownAssets()
        throws YuMePlayerException;
}
