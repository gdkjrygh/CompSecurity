// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import android.os.Build;
import com.netflix.mediaclient.service.configuration.esn.BaseEsnProvider;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.DeviceUtils;

public class DeviceModel
{

    private static final String APP_NAME = "samurai";
    int apiLevel;
    int apkVersion;
    String appType;
    String buildPropBoard;
    String buildPropDisplay;
    DeviceCategory category;
    String device;
    String esnModelId;
    String fingerprint;
    String manufacturer;
    String model;

    public DeviceModel(int i, Context context)
    {
        appType = "";
        model = "";
        esnModelId = "";
        manufacturer = "";
        fingerprint = "";
        device = "";
        buildPropBoard = "";
        buildPropDisplay = "";
        appType = "samurai";
        if (Build.MANUFACTURER != null)
        {
            manufacturer = Build.MANUFACTURER.trim();
        }
        if (Build.MODEL != null)
        {
            model = Build.MODEL.trim();
        }
        esnModelId = BaseEsnProvider.buildFesnModelId();
        if (Build.FINGERPRINT != null)
        {
            fingerprint = Build.FINGERPRINT.trim();
        }
        apiLevel = AndroidUtils.getAndroidVersion();
        apkVersion = i;
        if (DeviceUtils.isTabletByContext(context))
        {
            category = DeviceCategory.TABLET;
        } else
        {
            category = DeviceCategory.PHONE;
        }
        if (Build.DEVICE != null)
        {
            device = Build.DEVICE;
        }
        if (Build.BOARD != null)
        {
            buildPropBoard = Build.BOARD;
        }
        if (Build.DISPLAY != null)
        {
            buildPropDisplay = Build.DISPLAY;
        }
    }

    public int getApiLevel()
    {
        return apiLevel;
    }

    public int getApkVer()
    {
        return apkVersion;
    }

    public String getAppType()
    {
        return appType;
    }

    public String getBuildPropBoard()
    {
        return buildPropBoard;
    }

    public String getBuildPropDevice()
    {
        return device;
    }

    public String getBuildPropDisplay()
    {
        return buildPropDisplay;
    }

    public String getEsnModelId()
    {
        return esnModelId;
    }

    public String getFingerprint()
    {
        return fingerprint;
    }

    public String getFormFactor()
    {
        return category.getValue();
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public String getModel()
    {
        return model;
    }
}
