// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.bitrate;


// Referenced classes of package com.netflix.mediaclient.media.bitrate:
//            BitrateRange

public class AudioBitrateRange extends BitrateRange
{

    public AudioBitrateRange(int i, int j)
    {
        super(i, j);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof AudioBitrateRange))
            {
                return false;
            }
            obj = (AudioBitrateRange)obj;
            if (maximal != ((AudioBitrateRange) (obj)).maximal)
            {
                return false;
            }
            if (minimal != ((AudioBitrateRange) (obj)).minimal)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((maximal + 31) * 31 + minimal) * 31 + 2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AudioBitrateRange [minimal=").append(minimal).append(", maximal=").append(maximal).append("]").toString();
    }
}
