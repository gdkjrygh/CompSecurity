// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaMetadata, TextTrackStyle

public static class zzMp
{

    private final MediaInfo zzMp;

    public MediaInfo build()
        throws IllegalArgumentException
    {
        zzMp.zzjS();
        return zzMp;
    }

    public zzMp setContentType(String s)
        throws IllegalArgumentException
    {
        zzMp.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        zzMp.setCustomData(jsonobject);
        return this;
    }

    public mData setMediaTracks(List list)
    {
        zzMp.zzk(list);
        return this;
    }

    public zzMp setMetadata(MediaMetadata mediametadata)
    {
        zzMp.zza(mediametadata);
        return this;
    }

    public zzMp setStreamDuration(long l)
        throws IllegalArgumentException
    {
        zzMp.zzv(l);
        return this;
    }

    public zzMp setStreamType(int i)
        throws IllegalArgumentException
    {
        zzMp.setStreamType(i);
        return this;
    }

    public mType setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        zzMp.setTextTrackStyle(texttrackstyle);
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
            zzMp = new MediaInfo(s);
            return;
        }
    }
}
