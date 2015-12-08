// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.format;

import java.io.Serializable;
import java.nio.ByteBuffer;

// Referenced classes of package com.skype.android.video.hw.format:
//            ColorFormat, H264Level, Resolution, H264Profile, 
//            RateControlMode

public class VideoFormat
    implements Serializable
{

    private static final long serialVersionUID = 0x36d1674fc4fb80c1L;
    private int baseLayerPriorityId;
    private int bitrate;
    private ColorFormat colorFormat;
    private int frameRate;
    private int iFrameInterval;
    private H264Level level;
    private Resolution maxResolution;
    private int minNumSlices;
    private int numLayers;
    private H264Profile profile;
    private RateControlMode rcMode;
    private int refCount;
    private Resolution resolution;
    private ByteBuffer spsPps;
    private boolean svcAlways;

    public VideoFormat()
    {
    }

    public int getBaseLayerPriorityId()
    {
        return baseLayerPriorityId;
    }

    public int getBitrate()
    {
        return bitrate;
    }

    public ColorFormat getColorFormat()
    {
        return colorFormat;
    }

    public int getFrameRate()
    {
        return frameRate;
    }

    public H264Level getLevel()
    {
        return level;
    }

    public Resolution getMaxResolution()
    {
        return maxResolution;
    }

    public int getMinNumSlices()
    {
        return minNumSlices;
    }

    public int getNumLayers()
    {
        return numLayers;
    }

    public H264Profile getProfile()
    {
        return profile;
    }

    public RateControlMode getRCMode()
    {
        return rcMode;
    }

    public int getRefCount()
    {
        return refCount;
    }

    public Resolution getResolution()
    {
        return resolution;
    }

    public ByteBuffer getSpsPps()
    {
        return spsPps;
    }

    public boolean getSvcAlways()
    {
        return svcAlways;
    }

    public int getiFrameInterval()
    {
        return iFrameInterval;
    }

    public void setBaseLayerPriorityId(int i)
    {
        baseLayerPriorityId = i;
    }

    public void setBitrate(int i)
    {
        bitrate = i;
    }

    public void setColorFormat(ColorFormat colorformat)
    {
        colorFormat = colorformat;
    }

    public void setFrameRate(int i)
    {
        frameRate = i;
    }

    public void setLevel(H264Level h264level)
    {
        level = h264level;
    }

    public void setMaxResolution(Resolution resolution1)
    {
        maxResolution = resolution1;
    }

    public void setMinNumSlices(int i)
    {
        minNumSlices = i;
    }

    public void setNumLayers(int i)
    {
        numLayers = i;
    }

    public void setProfile(H264Profile h264profile)
    {
        profile = h264profile;
    }

    public void setRCMode(RateControlMode ratecontrolmode)
    {
        rcMode = ratecontrolmode;
    }

    public void setRefCount(int i)
    {
        refCount = i;
    }

    public void setResolution(Resolution resolution1)
    {
        resolution = resolution1;
    }

    public void setSpsPps(ByteBuffer bytebuffer)
    {
        spsPps = bytebuffer;
    }

    public void setSvcAlways(boolean flag)
    {
        svcAlways = flag;
    }

    public void setiFrameInterval(int i)
    {
        iFrameInterval = i;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [resolution=").append(resolution).append(", maxResolution=").append(maxResolution).append(", colorFormat=").append(colorFormat).append(", bitrate=").append(bitrate).append(", frameRate=").append(frameRate).append(", iFrameInterval=").append(iFrameInterval).append(", profile=").append(profile).append(", level=").append(level).append(", rcMode=").append(rcMode).append(", refCount").append(refCount).append(", numLayers").append(numLayers).append(", baseLayerPriorityId").append(baseLayerPriorityId).append(", minNumSlices").append(minNumSlices).append(", svcAlways").append(svcAlways).append("]").toString();
    }
}
