// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.in;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaTrack

public static class Gv
{

    private final MediaTrack Gv;

    public MediaTrack build()
    {
        return Gv;
    }

    public Gv setContentId(String s)
    {
        Gv.setContentId(s);
        return this;
    }

    public ntId setContentType(String s)
    {
        Gv.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        Gv.setCustomData(jsonobject);
        return this;
    }

    public mData setLanguage(String s)
    {
        Gv.setLanguage(s);
        return this;
    }

    public age setLanguage(Locale locale)
    {
        Gv.setLanguage(in.b(locale));
        return this;
    }

    public age setName(String s)
    {
        Gv.setName(s);
        return this;
    }

    public Gv setSubtype(int i)
        throws IllegalArgumentException
    {
        Gv.ab(i);
        return this;
    }

    public (long l, int i)
        throws IllegalArgumentException
    {
        Gv = new MediaTrack(l, i);
    }
}
