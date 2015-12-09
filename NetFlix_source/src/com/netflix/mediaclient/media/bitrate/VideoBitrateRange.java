// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.bitrate;


// Referenced classes of package com.netflix.mediaclient.media.bitrate:
//            BitrateRange

public final class VideoBitrateRange extends BitrateRange
{

    private String mProfile;

    public VideoBitrateRange(int i, int j, String s)
    {
        super(i, j);
        mProfile = s;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof VideoBitrateRange))
            {
                return false;
            }
            obj = (VideoBitrateRange)obj;
            if (maximal != ((VideoBitrateRange) (obj)).maximal)
            {
                return false;
            }
            if (minimal != ((VideoBitrateRange) (obj)).minimal)
            {
                return false;
            }
            if (mProfile != ((VideoBitrateRange) (obj)).mProfile)
            {
                return false;
            }
        }
        return true;
    }

    public String getProfile()
    {
        return mProfile;
    }

    public int hashCode()
    {
        int i = maximal;
        int j = minimal;
        if ((new StringBuilder()).append(((i + 31) * 31 + j) * 31).append(mProfile).toString() == null)
        {
            i = 0;
        } else
        {
            i = mProfile.hashCode();
        }
        return i * 31 + 1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("VideoBitrateRange [profile=").append(mProfile).append("minimal=").append(minimal).append(", maximal=").append(maximal).append("]").toString();
    }
}
