// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.media;

import java.util.HashMap;
import java.util.Map;

public final class MediaFormat
{

    private Map mMap;

    public MediaFormat()
    {
        mMap = new HashMap();
    }

    public static final MediaFormat createAudioFormat(String s, int i, int j)
    {
        MediaFormat mediaformat = new MediaFormat();
        mediaformat.setString("mime", s);
        mediaformat.setInteger("sample-rate", i);
        mediaformat.setInteger("channel-count", j);
        return mediaformat;
    }

    public static final MediaFormat createSubtitleFormat(String s, String s1)
    {
        MediaFormat mediaformat = new MediaFormat();
        mediaformat.setString("mime", s);
        mediaformat.setString("language", s1);
        return mediaformat;
    }

    public static final MediaFormat createVideoFormat(String s, int i, int j)
    {
        MediaFormat mediaformat = new MediaFormat();
        mediaformat.setString("mime", s);
        mediaformat.setInteger("width", i);
        mediaformat.setInteger("height", j);
        return mediaformat;
    }

    public final boolean containsKey(String s)
    {
        return mMap.containsKey(s);
    }

    public final int getInteger(String s)
    {
        return ((Integer)mMap.get(s)).intValue();
    }

    public final long getLong(String s)
    {
        return ((Long)mMap.get(s)).longValue();
    }

    public final String getString(String s)
    {
        return (String)mMap.get(s);
    }

    public final void setInteger(String s, int i)
    {
        mMap.put(s, new Integer(i));
    }

    public final void setLong(String s, long l)
    {
        mMap.put(s, new Long(l));
    }

    public final void setString(String s, String s1)
    {
        mMap.put(s, s1);
    }

    public final String toString()
    {
        return mMap.toString();
    }
}
