// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaMetadata

public static class yo
{

    private final MediaInfo yo;

    public MediaInfo build()
        throws IllegalArgumentException
    {
        yo.dA();
        return yo;
    }

    public yo setContentType(String s)
        throws IllegalArgumentException
    {
        yo.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        yo.b(jsonobject);
        return this;
    }

    public yo setMetadata(MediaMetadata mediametadata)
    {
        yo.a(mediametadata);
        return this;
    }

    public yo setStreamDuration(long l)
        throws IllegalArgumentException
    {
        yo.k(l);
        return this;
    }

    public yo setStreamType(int i)
        throws IllegalArgumentException
    {
        yo.setStreamType(i);
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
            yo = new MediaInfo(s);
            return;
        }
    }
}
