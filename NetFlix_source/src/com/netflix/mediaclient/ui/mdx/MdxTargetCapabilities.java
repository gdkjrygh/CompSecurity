// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class MdxTargetCapabilities
{

    protected static String PROPERTY_autoAdvanceMax = "autoAdvanceMax";
    protected static String PROPERTY_is3dSupported = "is3dSupported";
    protected static String PROPERTY_is5dot1Supported = "is5dot1Supported";
    protected static String PROPERTY_isHdSupported = "isHdSupported";
    protected static String PROPERTY_volumeControl = "volumeControl";
    protected static String PROPERTY_volumeStep = "volumeStep";
    private int autoAdvanceMax;
    private boolean is3dSupported;
    private boolean is5dot1Supported;
    private boolean isHdSupported;
    private boolean volumeControl;
    private int volumeStep;

    public MdxTargetCapabilities(String s)
        throws JSONException
    {
        this(new JSONObject(s));
    }

    public MdxTargetCapabilities(JSONObject jsonobject)
        throws JSONException
    {
        boolean flag1 = true;
        super();
        String s = JsonUtils.getString(jsonobject, PROPERTY_is3dSupported, null);
        boolean flag;
        if (s != null && "true".equalsIgnoreCase(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        is3dSupported = flag;
        s = JsonUtils.getString(jsonobject, PROPERTY_isHdSupported, null);
        if (s != null && "true".equalsIgnoreCase(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isHdSupported = flag;
        s = JsonUtils.getString(jsonobject, PROPERTY_is5dot1Supported, null);
        if (s != null && "true".equalsIgnoreCase(s))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        is5dot1Supported = flag;
        autoAdvanceMax = JsonUtils.getInt(jsonobject, PROPERTY_autoAdvanceMax, 0);
        if (jsonobject.has(PROPERTY_volumeControl))
        {
            volumeControl = jsonobject.getBoolean(PROPERTY_volumeControl);
        }
        if (jsonobject.has(PROPERTY_volumeStep))
        {
            volumeStep = jsonobject.getInt(PROPERTY_volumeStep);
        }
    }

    public int getAutoAdvanceMax()
    {
        return autoAdvanceMax;
    }

    public int getVolumeStep()
    {
        return volumeStep;
    }

    public boolean is3dSupported()
    {
        return is3dSupported;
    }

    public boolean is5dot1Supported()
    {
        return is5dot1Supported;
    }

    public boolean isHdSupported()
    {
        return isHdSupported;
    }

    public boolean isVolumeControl()
    {
        return volumeControl;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MdxTargetCapabilities [isHdSupported=").append(isHdSupported).append(", is5dot1Supported=").append(is5dot1Supported).append(", is3dSupported=").append(is3dSupported).append(", autoAdvanceMax=").append(autoAdvanceMax).append(", volumeControl=").append(volumeControl).append(", volumeStep=").append(volumeStep).append("]").toString();
    }

}
