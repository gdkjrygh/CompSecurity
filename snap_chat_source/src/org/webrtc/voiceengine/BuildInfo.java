// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.os.Build;

public final class BuildInfo
{

    public BuildInfo()
    {
    }

    public static String getAndroidBuildId()
    {
        return Build.ID;
    }

    public static String getBrand()
    {
        return Build.BRAND;
    }

    public static String getBuildRelease()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public static String getBuildType()
    {
        return Build.TYPE;
    }

    public static String getDevice()
    {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer()
    {
        return Build.MANUFACTURER;
    }

    public static String getDeviceModel()
    {
        return Build.MODEL;
    }

    public static String getProduct()
    {
        return Build.PRODUCT;
    }

    public static String getSdkVersion()
    {
        return Integer.toString(android.os.Build.VERSION.SDK_INT);
    }
}
