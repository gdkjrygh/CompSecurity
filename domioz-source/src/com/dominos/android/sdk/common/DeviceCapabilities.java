// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.telephony.TelephonyManager;

public class DeviceCapabilities
{

    private static final String SYSTEM_FEATURE_MICROPHONE = "android.hardware.microphone";
    private final Context mContext;

    public DeviceCapabilities(Context context)
    {
        mContext = context;
    }

    public DeviceType getDeviceTypeByCapabilities()
    {
        if (hasTelephonyCapabilities())
        {
            return DeviceType.MOBILE;
        } else
        {
            return DeviceType.TABLET;
        }
    }

    public DeviceType getDeviceTypeByScreenSize()
    {
        if (mContext.getResources().getBoolean(com.dominos.android.sdk.R.bool.isTablet))
        {
            return DeviceType.TABLET;
        } else
        {
            return DeviceType.MOBILE;
        }
    }

    public boolean hasMicrophone()
    {
        return mContext.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public boolean hasSpeechCapabilities()
    {
        return hasMicrophone() && getDeviceTypeByCapabilities() != DeviceType.TABLET;
    }

    public boolean hasTelephonyCapabilities()
    {
        return ((TelephonyManager)mContext.getSystemService("phone")).getPhoneType() != 0;
    }

    public boolean isDeviceTablet()
    {
        return getDeviceTypeByScreenSize() == DeviceType.TABLET;
    }

    private class DeviceType extends Enum
    {

        private static final DeviceType $VALUES[];
        public static final DeviceType MOBILE;
        public static final DeviceType TABLET;

        public static DeviceType valueOf(String s)
        {
            return (DeviceType)Enum.valueOf(com/dominos/android/sdk/common/DeviceCapabilities$DeviceType, s);
        }

        public static DeviceType[] values()
        {
            return (DeviceType[])$VALUES.clone();
        }

        static 
        {
            TABLET = new DeviceType("TABLET", 0);
            MOBILE = new DeviceType("MOBILE", 1);
            $VALUES = (new DeviceType[] {
                TABLET, MOBILE
            });
        }

        private DeviceType(String s, int i)
        {
            super(s, i);
        }
    }

}
