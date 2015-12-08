// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import android.widget.FrameLayout;

// Referenced classes of package com.yume.android.sdk:
//            YuMeException, YuMeAdParams, YuMeDownloadStatus, YuMeAppInterface, 
//            YuMeBSPInterface, YuMePlayerInterface, YuMeAdBlockType

public interface YuMeSDKInterface
{

    public abstract void YuMeSDK_AbortDownload()
        throws YuMeException;

    public abstract void YuMeSDK_BackKeyPressed()
        throws YuMeException;

    public abstract void YuMeSDK_ClearCache()
        throws YuMeException;

    public abstract void YuMeSDK_ClearCookies()
        throws YuMeException;

    public abstract void YuMeSDK_DeInit()
        throws YuMeException;

    public abstract YuMeAdParams YuMeSDK_GetAdParams()
        throws YuMeException;

    public abstract YuMeDownloadStatus YuMeSDK_GetDownloadStatus()
        throws YuMeException;

    public abstract float YuMeSDK_GetDownloadedPercentage()
        throws YuMeException;

    public abstract String YuMeSDK_GetVersion()
        throws YuMeException;

    public abstract void YuMeSDK_Init(YuMeAdParams yumeadparams, YuMeAppInterface yumeappinterface)
        throws YuMeException;

    public abstract void YuMeSDK_Init(YuMeAdParams yumeadparams, YuMeAppInterface yumeappinterface, YuMeBSPInterface yumebspinterface, YuMePlayerInterface yumeplayerinterface)
        throws YuMeException;

    public abstract void YuMeSDK_Init(YuMeAdParams yumeadparams, YuMeAppInterface yumeappinterface, YuMePlayerInterface yumeplayerinterface)
        throws YuMeException;

    public abstract void YuMeSDK_InitAd(YuMeAdBlockType yumeadblocktype)
        throws YuMeException;

    public abstract boolean YuMeSDK_IsAutoPrefetchEnabled()
        throws YuMeException;

    public abstract boolean YuMeSDK_IsCacheEnabled()
        throws YuMeException;

    public abstract void YuMeSDK_ModifyAdParams(YuMeAdParams yumeadparams)
        throws YuMeException;

    public abstract void YuMeSDK_PauseDownload()
        throws YuMeException;

    public abstract void YuMeSDK_ResumeDownload()
        throws YuMeException;

    public abstract void YuMeSDK_SetAutoPrefetch(boolean flag)
        throws YuMeException;

    public abstract void YuMeSDK_SetCacheEnabled(boolean flag)
        throws YuMeException;

    public abstract void YuMeSDK_SetControlBarToggle(boolean flag)
        throws YuMeException;

    public abstract void YuMeSDK_SetParentView(FrameLayout framelayout)
        throws YuMeException;

    public abstract void YuMeSDK_ShowAd(YuMeAdBlockType yumeadblocktype)
        throws YuMeException;

    public abstract void YuMeSDK_StartAd(YuMeAdBlockType yumeadblocktype)
        throws YuMeException;

    public abstract void YuMeSDK_StopAd()
        throws YuMeException;
}
