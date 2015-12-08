// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;


// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            RateShareEntry

public static class targetRateShare
{

    int availableBitrate;
    short targetRateShare;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (targetRateShare)obj;
            if (availableBitrate != ((availableBitrate) (obj)).availableBitrate)
            {
                return false;
            }
            if (targetRateShare != ((targetRateShare) (obj)).targetRateShare)
            {
                return false;
            }
        }
        return true;
    }

    public int getAvailableBitrate()
    {
        return availableBitrate;
    }

    public short getTargetRateShare()
    {
        return targetRateShare;
    }

    public int hashCode()
    {
        return availableBitrate * 31 + targetRateShare;
    }

    public void setAvailableBitrate(int i)
    {
        availableBitrate = i;
    }

    public void setTargetRateShare(short word0)
    {
        targetRateShare = word0;
    }

    public String toString()
    {
        return (new StringBuilder("{availableBitrate=")).append(availableBitrate).append(", targetRateShare=").append(targetRateShare).append('}').toString();
    }

    public (int i, short word0)
    {
        availableBitrate = i;
        targetRateShare = word0;
    }
}
