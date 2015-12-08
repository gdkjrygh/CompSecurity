// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.gj;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaTrack

public static class AS
{

    private final MediaTrack AS;

    public MediaTrack build()
    {
        return AS;
    }

    public AS setContentId(String s)
    {
        AS.setContentId(s);
        return this;
    }

    public ntId setContentType(String s)
    {
        AS.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        AS.setCustomData(jsonobject);
        return this;
    }

    public mData setLanguage(String s)
    {
        AS.setLanguage(s);
        return this;
    }

    public age setLanguage(Locale locale)
    {
        AS.setLanguage(gj.b(locale));
        return this;
    }

    public age setName(String s)
    {
        AS.setName(s);
        return this;
    }

    public AS setSubtype(int i)
        throws IllegalArgumentException
    {
        AS.R(i);
        return this;
    }

    public (long l, int i)
        throws IllegalArgumentException
    {
        AS = new MediaTrack(l, i);
    }
}
