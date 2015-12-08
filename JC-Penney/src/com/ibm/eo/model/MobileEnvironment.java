// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import com.ibm.eo.util.LogInternal;
import java.io.Serializable;
import org.json.JSONObject;

// Referenced classes of package com.ibm.eo.model:
//            EOMessage, AndroidArray, OrientationType

public class MobileEnvironment extends EOMessage
    implements Serializable
{

    private static final long serialVersionUID = 0xbf4676ceb8a07515L;
    private AndroidArray androidArray;
    private String appName;
    private String appVersion;
    private String deviceId;
    private String deviceModel;
    private String language;
    private String locale;
    private String manufacturer;
    private OrientationType orientationType;
    private long totalMemory;
    private long totalStorage;

    public MobileEnvironment()
    {
    }

    public final Boolean clean()
    {
        totalStorage = 0L;
        totalMemory = 0L;
        locale = null;
        language = null;
        manufacturer = null;
        deviceModel = null;
        appName = null;
        appVersion = null;
        deviceId = null;
        orientationType = null;
        if (androidArray != null)
        {
            androidArray.clean();
        }
        androidArray = null;
        return Boolean.valueOf(true);
    }

    public final AndroidArray getAndroidArray()
    {
        return androidArray;
    }

    public final String getAppName()
    {
        return appName;
    }

    public final String getAppVersion()
    {
        return appVersion;
    }

    public final String getDeviceId()
    {
        return deviceId;
    }

    public final String getDeviceModel()
    {
        return deviceModel;
    }

    public final JSONObject getJSON()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("totalStorage", getTotalStorage());
            jsonobject.put("totalMemory", getTotalMemory());
            jsonobject.put("locale", getLocale());
            jsonobject.put("language", getLanguage());
            jsonobject.put("manufacturer", getManufacturer());
            jsonobject.put("deviceModel", getDeviceModel());
            jsonobject.put("appName", getAppName());
            jsonobject.put("appVersion", getAppVersion());
            jsonobject.put("deviceId", getDeviceId());
            jsonobject.put("orientationType", getOrientationType());
            jsonobject.put("android", getAndroidArray().getJSON());
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
            return jsonobject;
        }
        return jsonobject;
    }

    public final String getLanguage()
    {
        return language;
    }

    public final String getLocale()
    {
        return locale;
    }

    public final String getManufacturer()
    {
        return manufacturer;
    }

    public final OrientationType getOrientationType()
    {
        return orientationType;
    }

    public final long getTotalMemory()
    {
        return totalMemory;
    }

    public final long getTotalStorage()
    {
        return totalStorage;
    }

    public final void setAndroidArray(AndroidArray androidarray)
    {
        androidArray = androidarray;
    }

    public final void setAppName(String s)
    {
        appName = s;
    }

    public final void setAppVersion(String s)
    {
        appVersion = s;
    }

    public final void setDeviceId(String s)
    {
        deviceId = s;
    }

    public final void setDeviceModel(String s)
    {
        deviceModel = s;
    }

    public final void setLanguage(String s)
    {
        language = s;
    }

    public final void setLocale(String s)
    {
        locale = s;
    }

    public final void setManufacturer(String s)
    {
        manufacturer = s;
    }

    public final void setOrientationType(OrientationType orientationtype)
    {
        orientationType = orientationtype;
    }

    public final void setTotalMemory(long l)
    {
        totalMemory = l;
    }

    public final void setTotalStorage(long l)
    {
        totalStorage = l;
    }
}
