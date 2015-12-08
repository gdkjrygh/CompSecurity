// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.gi;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaTrack

public static class AV
{

    private final MediaTrack AV;

    public MediaTrack build()
    {
        return AV;
    }

    public AV setContentId(String s)
    {
        AV.setContentId(s);
        return this;
    }

    public ntId setContentType(String s)
    {
        AV.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        AV.setCustomData(jsonobject);
        return this;
    }

    public mData setLanguage(String s)
    {
        AV.setLanguage(s);
        return this;
    }

    public age setLanguage(Locale locale)
    {
        AV.setLanguage(gi.b(locale));
        return this;
    }

    public age setName(String s)
    {
        AV.setName(s);
        return this;
    }

    public AV setSubtype(int i)
        throws IllegalArgumentException
    {
        AV.R(i);
        return this;
    }

    public (long l, int i)
        throws IllegalArgumentException
    {
        AV = new MediaTrack(l, i);
    }
}
