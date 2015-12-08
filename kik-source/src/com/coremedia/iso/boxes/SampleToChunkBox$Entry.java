// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;


// Referenced classes of package com.coremedia.iso.boxes:
//            SampleToChunkBox

public static class sampleDescriptionIndex
{

    long firstChunk;
    long sampleDescriptionIndex;
    long samplesPerChunk;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (sampleDescriptionIndex)obj;
            if (firstChunk != ((firstChunk) (obj)).firstChunk)
            {
                return false;
            }
            if (sampleDescriptionIndex != ((sampleDescriptionIndex) (obj)).sampleDescriptionIndex)
            {
                return false;
            }
            if (samplesPerChunk != ((samplesPerChunk) (obj)).samplesPerChunk)
            {
                return false;
            }
        }
        return true;
    }

    public long getFirstChunk()
    {
        return firstChunk;
    }

    public long getSampleDescriptionIndex()
    {
        return sampleDescriptionIndex;
    }

    public long getSamplesPerChunk()
    {
        return samplesPerChunk;
    }

    public int hashCode()
    {
        return ((int)(firstChunk ^ firstChunk >>> 32) * 31 + (int)(samplesPerChunk ^ samplesPerChunk >>> 32)) * 31 + (int)(sampleDescriptionIndex ^ sampleDescriptionIndex >>> 32);
    }

    public void setFirstChunk(long l)
    {
        firstChunk = l;
    }

    public void setSampleDescriptionIndex(long l)
    {
        sampleDescriptionIndex = l;
    }

    public void setSamplesPerChunk(long l)
    {
        samplesPerChunk = l;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{firstChunk=")).append(firstChunk).append(", samplesPerChunk=").append(samplesPerChunk).append(", sampleDescriptionIndex=").append(sampleDescriptionIndex).append('}').toString();
    }

    public (long l, long l1, long l2)
    {
        firstChunk = l;
        samplesPerChunk = l1;
        sampleDescriptionIndex = l2;
    }
}
