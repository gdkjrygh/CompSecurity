// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaMetadata, TextTrackStyle

public static class Fm
{

    private final MediaInfo Fm;

    public MediaInfo build()
        throws IllegalArgumentException
    {
        Fm.fv();
        return Fm;
    }

    public Fm setContentType(String s)
        throws IllegalArgumentException
    {
        Fm.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        Fm.setCustomData(jsonobject);
        return this;
    }

    public mData setMediaTracks(List list)
    {
        Fm.c(list);
        return this;
    }

    public Fm setMetadata(MediaMetadata mediametadata)
    {
        Fm.a(mediametadata);
        return this;
    }

    public Fm setStreamDuration(long l)
        throws IllegalArgumentException
    {
        Fm.m(l);
        return this;
    }

    public Fm setStreamType(int i)
        throws IllegalArgumentException
    {
        Fm.setStreamType(i);
        return this;
    }

    public mType setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        Fm.setTextTrackStyle(texttrackstyle);
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
            Fm = new MediaInfo(s);
            return;
        }
    }
}
