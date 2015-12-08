// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.proxy.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

public class StreamInfo
{

    public static final int AUDIO_STREAM = 0;
    public static final int TIMEDTEXT_STREAM = 2;
    public static final int UNKNOWN_STREAM = -1;
    public static final int VIDEO_STREAM = 1;
    private int bitsPerSecond;
    private int displayAspectRatioX;
    private int displayAspectRatioY;
    private int frameHeight;
    private int frameWidth;
    private boolean isHighDefinition;
    private boolean isSuperHighDefinition;
    private int streamType;

    public StreamInfo(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            throw new IllegalArgumentException("JSON is null!");
        } else
        {
            populate(jsonobject);
            return;
        }
    }

    private void populate(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject.has("streamType"))
        {
            streamType = jsonobject.getInt("streamType");
        }
        if (jsonobject.has("bitsPerSecond"))
        {
            bitsPerSecond = jsonobject.getInt("bitsPerSecond");
        }
        if (jsonobject.has("isHighDefinition"))
        {
            isHighDefinition = jsonobject.getBoolean("isHighDefinition");
        }
        if (jsonobject.has("isSuperHighDefinition"))
        {
            isSuperHighDefinition = jsonobject.getBoolean("isSuperHighDefinition");
        }
        if (jsonobject.has("frameWidth"))
        {
            frameWidth = jsonobject.getInt("frameWidth");
        }
        if (jsonobject.has("frameHeight"))
        {
            frameHeight = jsonobject.getInt("frameHeight");
        }
        if (jsonobject.has("displayAspectRatioX"))
        {
            displayAspectRatioX = jsonobject.getInt("displayAspectRatioX");
        }
        if (jsonobject.has("displayAspectRatioY"))
        {
            displayAspectRatioY = jsonobject.getInt("displayAspectRatioY");
        }
    }

    public int getBitsPerSecond()
    {
        return bitsPerSecond;
    }

    public int getDisplayAspectRatioX()
    {
        return displayAspectRatioX;
    }

    public int getDisplayAspectRatioY()
    {
        return displayAspectRatioY;
    }

    public int getFrameHeight()
    {
        return frameHeight;
    }

    public int getFrameWidth()
    {
        return frameWidth;
    }

    public int getStreamType()
    {
        return streamType;
    }

    public boolean isHighDefinition()
    {
        return isHighDefinition;
    }

    public boolean isSuperHighDefinition()
    {
        return isSuperHighDefinition;
    }

    public String toString()
    {
        return (new StringBuilder()).append("StreamInfo [streamType=").append(streamType).append(", bitsPerSecond=").append(bitsPerSecond).append(", isHighDefinition=").append(isHighDefinition).append(", isSuperHighDefinition=").append(isSuperHighDefinition).append(", frameWidth=").append(frameWidth).append(", frameHeight=").append(frameHeight).append(", displayAspectRatioX=").append(displayAspectRatioX).append(", displayAspectRatioY=").append(displayAspectRatioY).append("]").toString();
    }
}
