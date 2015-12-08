// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import av;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqy

public final class zzrg extends zzqy
{

    private String zzIO;
    public int zzasn;
    public int zzaso;
    public int zzasp;
    public int zztI;
    public int zztJ;

    public zzrg()
    {
    }

    public final void setLanguage(String s)
    {
        zzIO = s;
    }

    public final String toString()
    {
        av av1 = new av();
        av1.put("language", zzIO);
        av1.put("screenColors", Integer.valueOf(zzasn));
        av1.put("screenWidth", Integer.valueOf(zztI));
        av1.put("screenHeight", Integer.valueOf(zztJ));
        av1.put("viewportWidth", Integer.valueOf(zzaso));
        av1.put("viewportHeight", Integer.valueOf(zzasp));
        return zzG(av1);
    }

    public final void zzgp(int i)
    {
        zztI = i;
    }

    public final void zzgq(int i)
    {
        zztJ = i;
    }

    public final int zzrb()
    {
        return zztI;
    }

    public final int zzrc()
    {
        return zztJ;
    }
}
