// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaTrack

public static class zzMI
{

    private final MediaTrack zzMI;

    public MediaTrack build()
    {
        return zzMI;
    }

    public zzMI setContentId(String s)
    {
        zzMI.setContentId(s);
        return this;
    }

    public ntId setContentType(String s)
    {
        zzMI.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        zzMI.setCustomData(jsonobject);
        return this;
    }

    public mData setLanguage(String s)
    {
        zzMI.setLanguage(s);
        return this;
    }

    public age setLanguage(Locale locale)
    {
        zzMI.setLanguage(zzf.zzb(locale));
        return this;
    }

    public age setName(String s)
    {
        zzMI.setName(s);
        return this;
    }

    public zzMI setSubtype(int i)
        throws IllegalArgumentException
    {
        zzMI.zzaj(i);
        return this;
    }

    public (long l, int i)
        throws IllegalArgumentException
    {
        zzMI = new MediaTrack(l, i);
    }
}
