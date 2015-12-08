// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzkw extends zzki
{

    public String zzawU;
    public String zzawV;
    public String zzso;

    public zzkw()
    {
    }

    public String getAction()
    {
        return zzso;
    }

    public String getTarget()
    {
        return zzawV;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("network", zzawU);
        hashmap.put("action", zzso);
        hashmap.put("target", zzawV);
        return zzu(hashmap);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzkw)zzki1);
    }

    public void zza(zzkw zzkw1)
    {
        if (!TextUtils.isEmpty(zzawU))
        {
            zzkw1.zzdf(zzawU);
        }
        if (!TextUtils.isEmpty(zzso))
        {
            zzkw1.zzdb(zzso);
        }
        if (!TextUtils.isEmpty(zzawV))
        {
            zzkw1.zzdg(zzawV);
        }
    }

    public void zzdb(String s)
    {
        zzso = s;
    }

    public void zzdf(String s)
    {
        zzawU = s;
    }

    public void zzdg(String s)
    {
        zzawV = s;
    }

    public String zzuS()
    {
        return zzawU;
    }
}
