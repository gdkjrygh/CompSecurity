// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaMetadata, TextTrackStyle

public static class Ay
{

    private final MediaInfo Ay;

    public MediaInfo build()
        throws IllegalArgumentException
    {
        Ay.dT();
        return Ay;
    }

    public Ay setContentType(String s)
        throws IllegalArgumentException
    {
        Ay.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        Ay.setCustomData(jsonobject);
        return this;
    }

    public mData setMediaTracks(List list)
    {
        Ay.b(list);
        return this;
    }

    public Ay setMetadata(MediaMetadata mediametadata)
    {
        Ay.a(mediametadata);
        return this;
    }

    public Ay setStreamDuration(long l)
        throws IllegalArgumentException
    {
        Ay.m(l);
        return this;
    }

    public Ay setStreamType(int i)
        throws IllegalArgumentException
    {
        Ay.setStreamType(i);
        return this;
    }

    public mType setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        Ay.setTextTrackStyle(texttrackstyle);
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
            Ay = new MediaInfo(s);
            return;
        }
    }
}
