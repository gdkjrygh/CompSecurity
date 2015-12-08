// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.format;

import android.media.MediaFormat;
import android.util.Range;
import java.io.Serializable;
import java.util.Set;

public class Capabilities
    implements Serializable
{

    private static final long serialVersionUID = 0x57176f19df67b511L;
    private Range bitrateRange;
    private final String codecName;
    private final Set colorFormats;
    private MediaFormat extCaps;
    private Range heightRange;
    private final Set levels;
    private final Set profiles;
    private Boolean supportQCExtensions;
    private final Range widthRange;

    public Capabilities(String s, Set set, Set set1, Set set2, Range range, Range range1, Range range2, 
            MediaFormat mediaformat)
    {
        codecName = s;
        profiles = set;
        levels = set1;
        colorFormats = set2;
        bitrateRange = range2;
        widthRange = range;
        heightRange = range1;
        boolean flag;
        if (mediaformat != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        supportQCExtensions = Boolean.valueOf(flag);
        extCaps = mediaformat;
    }

    public Range getBitrateRange()
    {
        return bitrateRange;
    }

    public String getCodecName()
    {
        return codecName;
    }

    public Set getColorFormats()
    {
        return colorFormats;
    }

    public MediaFormat getExtCapabilities()
    {
        return extCaps;
    }

    public Range getHeightRange()
    {
        return heightRange;
    }

    public Set getLevels()
    {
        return levels;
    }

    public Set getProfiles()
    {
        return profiles;
    }

    public Range getWidthRange()
    {
        return widthRange;
    }

    public Boolean isQCExtensionSupported()
    {
        return supportQCExtensions;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [codecName=").append(codecName).append(", profiles=").append(profiles).append(", levels=").append(levels).append(", colorFormats=").append(colorFormats).append(", widthRange=").append(widthRange).append(", heightRange=").append(heightRange).append(", bitrateRange=").append(bitrateRange).append(", supportQCExtensions=").append(supportQCExtensions).append("]").toString();
    }
}
