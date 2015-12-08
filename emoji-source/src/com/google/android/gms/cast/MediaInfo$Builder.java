// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaMetadata, TextTrackStyle

public static class AB
{

    private final MediaInfo AB;

    public MediaInfo build()
        throws IllegalArgumentException
    {
        AB.dY();
        return AB;
    }

    public AB setContentType(String s)
        throws IllegalArgumentException
    {
        AB.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        AB.setCustomData(jsonobject);
        return this;
    }

    public mData setMediaTracks(List list)
    {
        AB.b(list);
        return this;
    }

    public AB setMetadata(MediaMetadata mediametadata)
    {
        AB.a(mediametadata);
        return this;
    }

    public AB setStreamDuration(long l)
        throws IllegalArgumentException
    {
        AB.m(l);
        return this;
    }

    public AB setStreamType(int i)
        throws IllegalArgumentException
    {
        AB.setStreamType(i);
        return this;
    }

    public mType setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        AB.setTextTrackStyle(texttrackstyle);
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
            AB = new MediaInfo(s);
            return;
        }
    }
}
