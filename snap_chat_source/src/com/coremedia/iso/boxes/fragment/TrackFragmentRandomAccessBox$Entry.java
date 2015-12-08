// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;


// Referenced classes of package com.coremedia.iso.boxes.fragment:
//            TrackFragmentRandomAccessBox

public static class trunNumber
{

    private long moofOffset;
    private long sampleNumber;
    private long time;
    private long trafNumber;
    private long trunNumber;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (trunNumber)obj;
            if (moofOffset != ((moofOffset) (obj)).moofOffset)
            {
                return false;
            }
            if (sampleNumber != ((sampleNumber) (obj)).sampleNumber)
            {
                return false;
            }
            if (time != ((time) (obj)).time)
            {
                return false;
            }
            if (trafNumber != ((trafNumber) (obj)).trafNumber)
            {
                return false;
            }
            if (trunNumber != ((trunNumber) (obj)).trunNumber)
            {
                return false;
            }
        }
        return true;
    }

    public long getMoofOffset()
    {
        return moofOffset;
    }

    public long getSampleNumber()
    {
        return sampleNumber;
    }

    public long getTime()
    {
        return time;
    }

    public long getTrafNumber()
    {
        return trafNumber;
    }

    public long getTrunNumber()
    {
        return trunNumber;
    }

    public int hashCode()
    {
        return ((((int)(time ^ time >>> 32) * 31 + (int)(moofOffset ^ moofOffset >>> 32)) * 31 + (int)(trafNumber ^ trafNumber >>> 32)) * 31 + (int)(trunNumber ^ trunNumber >>> 32)) * 31 + (int)(sampleNumber ^ sampleNumber >>> 32);
    }

    public void setMoofOffset(long l)
    {
        moofOffset = l;
    }

    public void setSampleNumber(long l)
    {
        sampleNumber = l;
    }

    public void setTime(long l)
    {
        time = l;
    }

    public void setTrafNumber(long l)
    {
        trafNumber = l;
    }

    public void setTrunNumber(long l)
    {
        trunNumber = l;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{time=")).append(time).append(", moofOffset=").append(moofOffset).append(", trafNumber=").append(trafNumber).append(", trunNumber=").append(trunNumber).append(", sampleNumber=").append(sampleNumber).append('}').toString();
    }











    public I()
    {
    }

    public I(long l, long l1, long l2, long l3, long l4)
    {
        moofOffset = l1;
        sampleNumber = l4;
        time = l;
        trafNumber = l2;
        trunNumber = l3;
    }
}
