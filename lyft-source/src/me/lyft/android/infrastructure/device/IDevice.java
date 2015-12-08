// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.device;


// Referenced classes of package me.lyft.android.infrastructure.device:
//            BatteryStatus

public interface IDevice
{

    public abstract String getAndroidId();

    public abstract long getApplicationInstallTimestamp();

    public abstract String getApplicationVersion();

    public abstract int getApplicationVersionCode();

    public abstract BatteryStatus getBatteryStatus();

    public abstract Integer getDensity();

    public abstract int getDensityDpi();

    public abstract String getDeviceInfo();

    public abstract String getDeviceLocale();

    public abstract String getDeviceName();

    public abstract int getDisplayRotation();

    public abstract long getElapsedRealtime();

    public abstract String getGoogleAccountEmail();

    public abstract String getLocaleCountryIso();

    public abstract String getMobileCountryCode();

    public abstract String getMobileNetworkCode();

    public abstract boolean getNetworkConnected();

    public abstract String getNetworkIso();

    public abstract boolean getNetworkLocationEnabled();

    public abstract String getNetworkType();

    public abstract String getOSVersion();

    public abstract String getOperatorName();

    public abstract String getPhoneNumber();

    public abstract String getPlatform();

    public abstract String getRadioType();

    public abstract int getSDKVersion();

    public abstract Integer getScreenHeight();

    public abstract Integer getScreenWidth();

    public abstract String getSimCountryIso();

    public abstract String getUserAgent();

    public abstract String getUuid();

    public abstract float getXDensity();

    public abstract float getYDensity();

    public abstract boolean hasCamera();

    public abstract boolean hasCameraFlash();

    public abstract boolean isGPSEnabled();

    public abstract boolean isModel(String s);

    public abstract boolean isPackageInstalled(String s);

    public abstract boolean isTabletScreenSize();
}
