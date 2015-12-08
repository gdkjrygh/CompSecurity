// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import av;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqy

public final class zzrf extends zzqy
{

    private String zzBa;
    private String zzBb;
    private String zzBc;
    private String zzBd;

    public zzrf()
    {
    }

    public final void setAppId(String s)
    {
        zzBc = s;
    }

    public final void setAppInstallerId(String s)
    {
        zzBd = s;
    }

    public final void setAppName(String s)
    {
        zzBa = s;
    }

    public final void setAppVersion(String s)
    {
        zzBb = s;
    }

    public final String toString()
    {
        av av1 = new av();
        av1.put("appName", zzBa);
        av1.put("appVersion", zzBb);
        av1.put("appId", zzBc);
        av1.put("appInstallerId", zzBd);
        return zzG(av1);
    }

    public final String zzga()
    {
        return zzBa;
    }

    public final String zzgc()
    {
        return zzBb;
    }

    public final String zznE()
    {
        return zzBc;
    }

    public final String zzra()
    {
        return zzBd;
    }
}
