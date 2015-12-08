// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzkq extends zzki
{

    private String mName;
    private String zzGM;
    private String zzarQ;
    private String zzawB;
    private String zzawC;
    private String zzawD;
    private String zzawE;
    private String zzawF;
    private String zzawG;
    private String zzsu;

    public zzkq()
    {
    }

    public String getContent()
    {
        return zzsu;
    }

    public String getId()
    {
        return zzGM;
    }

    public String getName()
    {
        return mName;
    }

    public String getSource()
    {
        return zzarQ;
    }

    public void setName(String s)
    {
        mName = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("name", mName);
        hashmap.put("source", zzarQ);
        hashmap.put("medium", zzawB);
        hashmap.put("keyword", zzawC);
        hashmap.put("content", zzsu);
        hashmap.put("id", zzGM);
        hashmap.put("adNetworkId", zzawD);
        hashmap.put("gclid", zzawE);
        hashmap.put("dclid", zzawF);
        hashmap.put("aclid", zzawG);
        return zzu(hashmap);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzkq)zzki1);
    }

    public void zza(zzkq zzkq1)
    {
        if (!TextUtils.isEmpty(mName))
        {
            zzkq1.setName(mName);
        }
        if (!TextUtils.isEmpty(zzarQ))
        {
            zzkq1.zzcR(zzarQ);
        }
        if (!TextUtils.isEmpty(zzawB))
        {
            zzkq1.zzcS(zzawB);
        }
        if (!TextUtils.isEmpty(zzawC))
        {
            zzkq1.zzcT(zzawC);
        }
        if (!TextUtils.isEmpty(zzsu))
        {
            zzkq1.zzcU(zzsu);
        }
        if (!TextUtils.isEmpty(zzGM))
        {
            zzkq1.zzcV(zzGM);
        }
        if (!TextUtils.isEmpty(zzawD))
        {
            zzkq1.zzcW(zzawD);
        }
        if (!TextUtils.isEmpty(zzawE))
        {
            zzkq1.zzcX(zzawE);
        }
        if (!TextUtils.isEmpty(zzawF))
        {
            zzkq1.zzcY(zzawF);
        }
        if (!TextUtils.isEmpty(zzawG))
        {
            zzkq1.zzcZ(zzawG);
        }
    }

    public void zzcR(String s)
    {
        zzarQ = s;
    }

    public void zzcS(String s)
    {
        zzawB = s;
    }

    public void zzcT(String s)
    {
        zzawC = s;
    }

    public void zzcU(String s)
    {
        zzsu = s;
    }

    public void zzcV(String s)
    {
        zzGM = s;
    }

    public void zzcW(String s)
    {
        zzawD = s;
    }

    public void zzcX(String s)
    {
        zzawE = s;
    }

    public void zzcY(String s)
    {
        zzawF = s;
    }

    public void zzcZ(String s)
    {
        zzawG = s;
    }

    public String zzut()
    {
        return zzawB;
    }

    public String zzuu()
    {
        return zzawC;
    }

    public String zzuv()
    {
        return zzawD;
    }

    public String zzuw()
    {
        return zzawE;
    }

    public String zzux()
    {
        return zzawF;
    }

    public String zzuy()
    {
        return zzawG;
    }
}
