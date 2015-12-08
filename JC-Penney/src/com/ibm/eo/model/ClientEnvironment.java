// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import com.ibm.eo.util.LogInternal;
import java.io.Serializable;
import org.json.JSONObject;

// Referenced classes of package com.ibm.eo.model:
//            EOMessage, MobileEnvironment

public class ClientEnvironment extends EOMessage
    implements Serializable
{

    private static final long serialVersionUID = 0xba7f77c480b7fd17L;
    private float deviceHeight;
    private float deviceWidth;
    private int height;
    private MobileEnvironment mobileEnvironment;
    private String osVersion;
    private float pixelDensity;
    private int width;

    public ClientEnvironment()
    {
    }

    public final Boolean clean()
    {
        osVersion = null;
        height = 0;
        width = 0;
        if (mobileEnvironment != null)
        {
            mobileEnvironment.clean();
        }
        mobileEnvironment = null;
        return Boolean.valueOf(true);
    }

    public final float getDeviceHeight()
    {
        return deviceHeight;
    }

    public final float getDeviceWidth()
    {
        return deviceWidth;
    }

    public final int getHeight()
    {
        return height;
    }

    public final JSONObject getJSON()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("osVersion", getOsVersion());
            jsonobject.put("height", getHeight());
            jsonobject.put("width", getWidth());
            jsonobject.put("deviceWidth", getDeviceWidth());
            jsonobject.put("deviceHeight", getDeviceHeight());
            jsonobject.put("pixelDensity", getPixelDensity());
            jsonobject.put("mobileEnvironment", getMobileEnvironment().getJSON());
            jsonobject.put("osType", "Android");
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
            return jsonobject;
        }
        return jsonobject;
    }

    public final MobileEnvironment getMobileEnvironment()
    {
        return mobileEnvironment;
    }

    public final String getOsVersion()
    {
        return osVersion;
    }

    public final float getPixelDensity()
    {
        return pixelDensity;
    }

    public final int getWidth()
    {
        return width;
    }

    public final void setDeviceHeight(float f)
    {
        deviceHeight = f;
    }

    public final void setDeviceWidth(float f)
    {
        deviceWidth = f;
    }

    public final void setHeight(int i)
    {
        height = i;
    }

    public final void setMobileEnvironment(MobileEnvironment mobileenvironment)
    {
        mobileEnvironment = mobileenvironment;
    }

    public final void setOsVersion(String s)
    {
        osVersion = s;
    }

    public final void setPixelDensity(float f)
    {
        pixelDensity = f;
    }

    public final void setWidth(int i)
    {
        width = i;
    }
}
