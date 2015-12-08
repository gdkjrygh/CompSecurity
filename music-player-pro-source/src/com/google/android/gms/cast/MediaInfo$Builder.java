// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaMetadata, TextTrackStyle

public static class Gb
{

    private final MediaInfo Gb;

    public MediaInfo build()
        throws IllegalArgumentException
    {
        Gb.fQ();
        return Gb;
    }

    public Gb setContentType(String s)
        throws IllegalArgumentException
    {
        Gb.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        Gb.setCustomData(jsonobject);
        return this;
    }

    public mData setMediaTracks(List list)
    {
        Gb.d(list);
        return this;
    }

    public Gb setMetadata(MediaMetadata mediametadata)
    {
        Gb.a(mediametadata);
        return this;
    }

    public Gb setStreamDuration(long l)
        throws IllegalArgumentException
    {
        Gb.m(l);
        return this;
    }

    public Gb setStreamType(int i)
        throws IllegalArgumentException
    {
        Gb.setStreamType(i);
        return this;
    }

    public mType setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        Gb.setTextTrackStyle(texttrackstyle);
        return this;
    }

    public (String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Content ID cannot be empty");
        } else
        {
            Gb = new MediaInfo(s);
            return;
        }
    }
}
