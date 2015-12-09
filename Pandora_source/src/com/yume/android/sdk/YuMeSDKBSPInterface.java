// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import android.content.Context;
import java.util.List;

// Referenced classes of package com.yume.android.sdk:
//            YuMeException, YuMeConnectionType, YuMeDeviceInfo, YuMeDeviceType

public interface YuMeSDKBSPInterface
{

    public abstract Context YuMeSDKBSP_GetActivityContext();

    public abstract Context YuMeSDKBSP_GetApplicationContext();

    public abstract void YuMeSDKBSP_GetPlaylistComplete(int i, int j, String s, long l)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SendTrackerComplete(int i, int j)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetCity(String s)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetConnectionType(YuMeConnectionType yumeconnectiontype)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetCountryCode(String s)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetDeviceDisplayHeight(int i)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetDeviceDisplayWidth(int i)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetDeviceInfo(YuMeDeviceInfo yumedeviceinfo)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetDeviceOrientation(String s)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetDeviceType(YuMeDeviceType yumedevicetype)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetDeviceUUID(String s)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetFreeRAMSizeMB(float f)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetFreeStorageSizeMB(float f)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetLatitude(String s)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetLineSpeedKbps(int i)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetLongitude(String s)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetMaxPersistentStorageMB(float f)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetPostalCode(String s)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetPublicIPAddress(String s, String s1)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetServiceProvider(String s)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetState(String s)
        throws YuMeException;

    public abstract void YuMeSDKBSP_SetSupportedConnectionTypes(List list)
        throws YuMeException;
}
