// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzkp extends zzki
{

    private String zzHY;
    private String zzHZ;
    private String zzawA;
    private String zzawz;

    public zzkp()
    {
    }

    public void setAppId(String s)
    {
        zzawz = s;
    }

    public void setAppInstallerId(String s)
    {
        zzawA = s;
    }

    public void setAppName(String s)
    {
        zzHY = s;
    }

    public void setAppVersion(String s)
    {
        zzHZ = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("appName", zzHY);
        hashmap.put("appVersion", zzHZ);
        hashmap.put("appId", zzawz);
        hashmap.put("appInstallerId", zzawA);
        return zzu(hashmap);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzkp)zzki1);
    }

    public void zza(zzkp zzkp1)
    {
        if (!TextUtils.isEmpty(zzHY))
        {
            zzkp1.setAppName(zzHY);
        }
        if (!TextUtils.isEmpty(zzHZ))
        {
            zzkp1.setAppVersion(zzHZ);
        }
        if (!TextUtils.isEmpty(zzawz))
        {
            zzkp1.setAppId(zzawz);
        }
        if (!TextUtils.isEmpty(zzawA))
        {
            zzkp1.setAppInstallerId(zzawA);
        }
    }

    public String zziE()
    {
        return zzHY;
    }

    public String zziG()
    {
        return zzHZ;
    }

    public String zzqT()
    {
        return zzawz;
    }

    public String zzus()
    {
        return zzawA;
    }
}
