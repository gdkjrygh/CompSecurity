// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zznz extends zznq
{

    private String zzRA;
    public int zzaEE;
    public int zzaEF;
    public int zzaEG;
    public int zzyW;
    public int zzyX;

    public zznz()
    {
    }

    public String getLanguage()
    {
        return zzRA;
    }

    public void setLanguage(String s)
    {
        zzRA = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("language", zzRA);
        hashmap.put("screenColors", Integer.valueOf(zzaEE));
        hashmap.put("screenWidth", Integer.valueOf(zzyW));
        hashmap.put("screenHeight", Integer.valueOf(zzyX));
        hashmap.put("viewportWidth", Integer.valueOf(zzaEF));
        hashmap.put("viewportHeight", Integer.valueOf(zzaEG));
        return zzy(hashmap);
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zznz)zznq1);
    }

    public void zza(zznz zznz1)
    {
        if (zzaEE != 0)
        {
            zznz1.zzhF(zzaEE);
        }
        if (zzyW != 0)
        {
            zznz1.zzhG(zzyW);
        }
        if (zzyX != 0)
        {
            zznz1.zzhH(zzyX);
        }
        if (zzaEF != 0)
        {
            zznz1.zzhI(zzaEF);
        }
        if (zzaEG != 0)
        {
            zznz1.zzhJ(zzaEG);
        }
        if (!TextUtils.isEmpty(zzRA))
        {
            zznz1.setLanguage(zzRA);
        }
    }

    public void zzhF(int i)
    {
        zzaEE = i;
    }

    public void zzhG(int i)
    {
        zzyW = i;
    }

    public void zzhH(int i)
    {
        zzyX = i;
    }

    public void zzhI(int i)
    {
        zzaEF = i;
    }

    public void zzhJ(int i)
    {
        zzaEG = i;
    }

    public int zzwp()
    {
        return zzaEE;
    }

    public int zzwq()
    {
        return zzyW;
    }

    public int zzwr()
    {
        return zzyX;
    }

    public int zzws()
    {
        return zzaEF;
    }

    public int zzwt()
    {
        return zzaEG;
    }
}
