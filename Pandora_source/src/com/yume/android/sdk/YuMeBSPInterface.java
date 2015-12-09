// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.yume.android.sdk:
//            YuMeBSPException, YuMeConnectionType, YuMeDeviceInfo, YuMeDeviceType, 
//            YuMeStorageMode, YuMeSDKBSPInterface

public interface YuMeBSPInterface
{

    public abstract void YuMeBSP_AbortDownloads()
        throws YuMeBSPException;

    public abstract void YuMeBSP_ClearCookies()
        throws YuMeBSPException;

    public abstract void YuMeBSP_DeInit()
        throws YuMeBSPException;

    public abstract int YuMeBSP_GetAdConnectionTimeoutSec()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetCity()
        throws YuMeBSPException;

    public abstract YuMeConnectionType YuMeBSP_GetConnectionType()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetCountryCode()
        throws YuMeBSPException;

    public abstract int YuMeBSP_GetDeviceDisplayHeight()
        throws YuMeBSPException;

    public abstract int YuMeBSP_GetDeviceDisplayWidth()
        throws YuMeBSPException;

    public abstract YuMeDeviceInfo YuMeBSP_GetDeviceInfo()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetDeviceOrientation()
        throws YuMeBSPException;

    public abstract YuMeDeviceType YuMeBSP_GetDeviceType()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetDeviceUUID()
        throws YuMeBSPException;

    public abstract float YuMeBSP_GetFreeRAMSizeMB()
        throws YuMeBSPException;

    public abstract float YuMeBSP_GetFreeStorageSizeMB()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetHardwareVersion()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetLatitude()
        throws YuMeBSPException;

    public abstract int YuMeBSP_GetLineSpeedKbps()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetLongitude()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetMake()
        throws YuMeBSPException;

    public abstract float YuMeBSP_GetMaxPersistentStorageMB()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetModel()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetOSPlatform()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetPersistentStoragePath()
        throws YuMeBSPException;

    public abstract void YuMeBSP_GetPlaylist(String s, JSONObject jsonobject, String s1, int i)
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetPostalCode()
        throws YuMeBSPException;

    public abstract List YuMeBSP_GetPublicIPAddress()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetServiceProvider()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetSoftwareVersion()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetState()
        throws YuMeBSPException;

    public abstract YuMeStorageMode YuMeBSP_GetStorageMode()
        throws YuMeBSPException;

    public abstract List YuMeBSP_GetSupportedConnectionTypes()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetTempStoragePath()
        throws YuMeBSPException;

    public abstract float YuMeBSP_GetTotalRAMSizeMB()
        throws YuMeBSPException;

    public abstract float YuMeBSP_GetTotalStorageSizeMB()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetUserAgent()
        throws YuMeBSPException;

    public abstract String YuMeBSP_GetVersion()
        throws YuMeBSPException;

    public abstract void YuMeBSP_HandleBroadcastEvent(String s)
        throws YuMeBSPException;

    public abstract void YuMeBSP_Init(int i, float f, YuMeStorageMode yumestoragemode, boolean flag, boolean flag1, YuMeSDKBSPInterface yumesdkbspinterface)
        throws YuMeBSPException;

    public abstract boolean YuMeBSP_IsCallOperationSupported()
        throws YuMeBSPException;

    public abstract void YuMeBSP_MakeCall(String s)
        throws YuMeBSPException;

    public abstract void YuMeBSP_ModifyParams(int i, float f, YuMeStorageMode yumestoragemode, boolean flag, boolean flag1)
        throws YuMeBSPException;

    public abstract void YuMeBSP_PauseDownloads()
        throws YuMeBSPException;

    public abstract void YuMeBSP_ResumeDownloads()
        throws YuMeBSPException;

    public abstract void YuMeBSP_SendTracker(String s, int i)
        throws YuMeBSPException;
}
