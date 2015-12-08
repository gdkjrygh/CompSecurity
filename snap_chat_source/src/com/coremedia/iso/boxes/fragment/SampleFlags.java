// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import cv;
import cx;
import java.nio.ByteBuffer;

public class SampleFlags
{

    private byte is_leading;
    private byte reserved;
    private int sampleDegradationPriority;
    private byte sampleDependsOn;
    private byte sampleHasRedundancy;
    private byte sampleIsDependedOn;
    private boolean sampleIsDifferenceSample;
    private byte samplePaddingValue;

    public SampleFlags()
    {
    }

    public SampleFlags(ByteBuffer bytebuffer)
    {
        long l = cv.a(bytebuffer);
        reserved = (byte)(int)((0xfffffffff0000000L & l) >> 28);
        is_leading = (byte)(int)((0xc000000L & l) >> 26);
        sampleDependsOn = (byte)(int)((0x3000000L & l) >> 24);
        sampleIsDependedOn = (byte)(int)((0xc00000L & l) >> 22);
        sampleHasRedundancy = (byte)(int)((0x300000L & l) >> 20);
        samplePaddingValue = (byte)(int)((0xe0000L & l) >> 17);
        boolean flag;
        if ((0x10000L & l) >> 16 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        sampleIsDifferenceSample = flag;
        sampleDegradationPriority = (int)(65535L & l);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SampleFlags)obj;
            if (is_leading != ((SampleFlags) (obj)).is_leading)
            {
                return false;
            }
            if (reserved != ((SampleFlags) (obj)).reserved)
            {
                return false;
            }
            if (sampleDegradationPriority != ((SampleFlags) (obj)).sampleDegradationPriority)
            {
                return false;
            }
            if (sampleDependsOn != ((SampleFlags) (obj)).sampleDependsOn)
            {
                return false;
            }
            if (sampleHasRedundancy != ((SampleFlags) (obj)).sampleHasRedundancy)
            {
                return false;
            }
            if (sampleIsDependedOn != ((SampleFlags) (obj)).sampleIsDependedOn)
            {
                return false;
            }
            if (sampleIsDifferenceSample != ((SampleFlags) (obj)).sampleIsDifferenceSample)
            {
                return false;
            }
            if (samplePaddingValue != ((SampleFlags) (obj)).samplePaddingValue)
            {
                return false;
            }
        }
        return true;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        long l = reserved << 28;
        long l1 = is_leading << 26;
        long l2 = sampleDependsOn << 24;
        long l3 = sampleIsDependedOn << 22;
        long l4 = sampleHasRedundancy << 20;
        long l5 = samplePaddingValue << 17;
        int i;
        if (sampleIsDifferenceSample)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        cx.b(bytebuffer, (long)(i << 16) | (l5 | (0L | l | l1 | l2 | l3 | l4)) | (long)sampleDegradationPriority);
    }

    public int getReserved()
    {
        return reserved;
    }

    public int getSampleDegradationPriority()
    {
        return sampleDegradationPriority;
    }

    public int getSampleDependsOn()
    {
        return sampleDependsOn;
    }

    public int getSampleHasRedundancy()
    {
        return sampleHasRedundancy;
    }

    public int getSampleIsDependedOn()
    {
        return sampleIsDependedOn;
    }

    public int getSamplePaddingValue()
    {
        return samplePaddingValue;
    }

    public int hashCode()
    {
        byte byte0 = reserved;
        byte byte1 = is_leading;
        byte byte2 = sampleDependsOn;
        byte byte3 = sampleIsDependedOn;
        byte byte4 = sampleHasRedundancy;
        byte byte5 = samplePaddingValue;
        int i;
        if (sampleIsDifferenceSample)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return (i + (((((byte0 * 31 + byte1) * 31 + byte2) * 31 + byte3) * 31 + byte4) * 31 + byte5) * 31) * 31 + sampleDegradationPriority;
    }

    public boolean isSampleIsDifferenceSample()
    {
        return sampleIsDifferenceSample;
    }

    public void setReserved(int i)
    {
        reserved = (byte)i;
    }

    public void setSampleDegradationPriority(int i)
    {
        sampleDegradationPriority = i;
    }

    public void setSampleDependsOn(int i)
    {
        sampleDependsOn = (byte)i;
    }

    public void setSampleHasRedundancy(int i)
    {
        sampleHasRedundancy = (byte)i;
    }

    public void setSampleIsDependedOn(int i)
    {
        sampleIsDependedOn = (byte)i;
    }

    public void setSampleIsDifferenceSample(boolean flag)
    {
        sampleIsDifferenceSample = flag;
    }

    public void setSamplePaddingValue(int i)
    {
        samplePaddingValue = (byte)i;
    }

    public String toString()
    {
        return (new StringBuilder("SampleFlags{reserved=")).append(reserved).append(", isLeading=").append(is_leading).append(", depOn=").append(sampleDependsOn).append(", isDepOn=").append(sampleIsDependedOn).append(", hasRedundancy=").append(sampleHasRedundancy).append(", padValue=").append(samplePaddingValue).append(", isDiffSample=").append(sampleIsDifferenceSample).append(", degradPrio=").append(sampleDegradationPriority).append('}').toString();
    }
}
