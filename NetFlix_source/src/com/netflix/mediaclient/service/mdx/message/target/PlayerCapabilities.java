// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlayerCapabilities extends MdxMessage
{

    private static final String PROPERTY_autoAdvanceMax = "autoAdvanceMax";
    private static final String PROPERTY_is3dSupported = "is3dSupported";
    private static final String PROPERTY_is5dot1Supported = "is5dot1Supported";
    private static final String PROPERTY_isHdSupported = "isHdSupported";
    private static final String PROPERTY_volumeControl = "volumeControl";
    private static final String PROPERTY_volumeStep = "volumeStep";
    private int mAutoAdvanceMax;
    private boolean mIs3dSupported;
    private boolean mIs5dot1Supported;
    private boolean mIsHdSupported;
    private boolean mVolumeControl;
    private int mVolumeStep;

    public PlayerCapabilities(JSONObject jsonobject)
        throws JSONException
    {
        boolean flag1 = true;
        super("PLAYER_CAPABILITIES");
        mJson = jsonobject;
        String s = JsonUtils.getString(jsonobject, "is3dSupported", null);
        boolean flag;
        if (s != null && "true".equalsIgnoreCase(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIs3dSupported = flag;
        s = JsonUtils.getString(jsonobject, "isHdSupported", null);
        if (s != null && "true".equalsIgnoreCase(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsHdSupported = flag;
        s = JsonUtils.getString(jsonobject, "is5dot1Supported", null);
        if (s != null && "true".equalsIgnoreCase(s))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mIs5dot1Supported = flag;
        mAutoAdvanceMax = JsonUtils.getInt(jsonobject, "autoAdvanceMax", 0);
        if (jsonobject.has("volumeControl"))
        {
            mVolumeControl = jsonobject.getBoolean("volumeControl");
        }
        if (jsonobject.has("volumeStep"))
        {
            mVolumeStep = jsonobject.getInt("volumeStep");
        }
    }

    public int getAutoAdvanceMax()
    {
        return mAutoAdvanceMax;
    }

    public int getVolumeStep()
    {
        return mVolumeStep;
    }

    public boolean is3dSupported()
    {
        return mIs3dSupported;
    }

    public boolean is5dot1Supported()
    {
        return mIs5dot1Supported;
    }

    public boolean isHdSupported()
    {
        return mIsHdSupported;
    }

    public boolean isVolumeControl()
    {
        return mVolumeControl;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PlayerCapabilities [isHdSupported=").append(mIsHdSupported).append(", is5dot1Supported=").append(mIs5dot1Supported).append(", is3dSupported=").append(mIs3dSupported).append(", autoAdvanceMax=").append(mAutoAdvanceMax).toString();
    }
}
