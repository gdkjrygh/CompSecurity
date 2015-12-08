// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.ik;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaTrack

public static class FF
{

    private final MediaTrack FF;

    public MediaTrack build()
    {
        return FF;
    }

    public FF setContentId(String s)
    {
        FF.setContentId(s);
        return this;
    }

    public ntId setContentType(String s)
    {
        FF.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        FF.setCustomData(jsonobject);
        return this;
    }

    public mData setLanguage(String s)
    {
        FF.setLanguage(s);
        return this;
    }

    public age setLanguage(Locale locale)
    {
        FF.setLanguage(ik.b(locale));
        return this;
    }

    public age setName(String s)
    {
        FF.setName(s);
        return this;
    }

    public FF setSubtype(int i)
        throws IllegalArgumentException
    {
        FF.aa(i);
        return this;
    }

    public (long l, int i)
        throws IllegalArgumentException
    {
        FF = new MediaTrack(l, i);
    }
}
