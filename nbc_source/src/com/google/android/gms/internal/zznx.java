// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zznx extends zznq
{

    private String zzLU;
    private String zzLV;
    private String zzaEw;
    private String zzaEx;

    public zznx()
    {
    }

    public void setAppId(String s)
    {
        zzaEw = s;
    }

    public void setAppInstallerId(String s)
    {
        zzaEx = s;
    }

    public void setAppName(String s)
    {
        zzLU = s;
    }

    public void setAppVersion(String s)
    {
        zzLV = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("appName", zzLU);
        hashmap.put("appVersion", zzLV);
        hashmap.put("appId", zzaEw);
        hashmap.put("appInstallerId", zzaEx);
        return zzy(hashmap);
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zznx)zznq1);
    }

    public void zza(zznx zznx1)
    {
        if (!TextUtils.isEmpty(zzLU))
        {
            zznx1.setAppName(zzLU);
        }
        if (!TextUtils.isEmpty(zzLV))
        {
            zznx1.setAppVersion(zzLV);
        }
        if (!TextUtils.isEmpty(zzaEw))
        {
            zznx1.setAppId(zzaEw);
        }
        if (!TextUtils.isEmpty(zzaEx))
        {
            zznx1.setAppInstallerId(zzaEx);
        }
    }

    public String zzjL()
    {
        return zzLU;
    }

    public String zzjN()
    {
        return zzLV;
    }

    public String zzsK()
    {
        return zzaEw;
    }

    public String zzwi()
    {
        return zzaEx;
    }
}
