// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzip extends zznq
{

    private String zzEO;
    private String zzJc;
    private String zzJd;
    private String zzJe;
    private boolean zzJf;
    private String zzJg;
    private boolean zzJh;
    private double zzJi;

    public zzip()
    {
    }

    public String getClientId()
    {
        return zzJd;
    }

    public String getUserId()
    {
        return zzEO;
    }

    public void setClientId(String s)
    {
        zzJd = s;
    }

    public void setSampleRate(double d)
    {
        boolean flag;
        if (d >= 0.0D && d <= 100D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Sample rate must be between 0% and 100%");
        zzJi = d;
    }

    public void setUserId(String s)
    {
        zzEO = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("hitType", zzJc);
        hashmap.put("clientId", zzJd);
        hashmap.put("userId", zzEO);
        hashmap.put("androidAdId", zzJe);
        hashmap.put("AdTargetingEnabled", Boolean.valueOf(zzJf));
        hashmap.put("sessionControl", zzJg);
        hashmap.put("nonInteraction", Boolean.valueOf(zzJh));
        hashmap.put("sampleRate", Double.valueOf(zzJi));
        return zzy(hashmap);
    }

    public void zzE(boolean flag)
    {
        zzJf = flag;
    }

    public void zzF(boolean flag)
    {
        zzJh = flag;
    }

    public void zza(zzip zzip1)
    {
        if (!TextUtils.isEmpty(zzJc))
        {
            zzip1.zzaN(zzJc);
        }
        if (!TextUtils.isEmpty(zzJd))
        {
            zzip1.setClientId(zzJd);
        }
        if (!TextUtils.isEmpty(zzEO))
        {
            zzip1.setUserId(zzEO);
        }
        if (!TextUtils.isEmpty(zzJe))
        {
            zzip1.zzaO(zzJe);
        }
        if (zzJf)
        {
            zzip1.zzE(true);
        }
        if (!TextUtils.isEmpty(zzJg))
        {
            zzip1.zzaP(zzJg);
        }
        if (zzJh)
        {
            zzip1.zzF(zzJh);
        }
        if (zzJi != 0.0D)
        {
            zzip1.setSampleRate(zzJi);
        }
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zzip)zznq1);
    }

    public void zzaN(String s)
    {
        zzJc = s;
    }

    public void zzaO(String s)
    {
        zzJe = s;
    }

    public void zzaP(String s)
    {
        zzJg = s;
    }

    public boolean zzhA()
    {
        return zzJh;
    }

    public double zzhB()
    {
        return zzJi;
    }

    public String zzhw()
    {
        return zzJc;
    }

    public String zzhx()
    {
        return zzJe;
    }

    public boolean zzhy()
    {
        return zzJf;
    }

    public String zzhz()
    {
        return zzJg;
    }
}
