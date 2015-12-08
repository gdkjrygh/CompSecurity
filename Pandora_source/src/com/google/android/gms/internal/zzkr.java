// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzkr extends zzki
{

    private String zzMf;
    public int zzawH;
    public int zzawI;
    public int zzawJ;
    public int zzvR;
    public int zzvS;

    public zzkr()
    {
    }

    public String getLanguage()
    {
        return zzMf;
    }

    public void setLanguage(String s)
    {
        zzMf = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("language", zzMf);
        hashmap.put("screenColors", Integer.valueOf(zzawH));
        hashmap.put("screenWidth", Integer.valueOf(zzvR));
        hashmap.put("screenHeight", Integer.valueOf(zzvS));
        hashmap.put("viewportWidth", Integer.valueOf(zzawI));
        hashmap.put("viewportHeight", Integer.valueOf(zzawJ));
        return zzu(hashmap);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzkr)zzki1);
    }

    public void zza(zzkr zzkr1)
    {
        if (zzawH != 0)
        {
            zzkr1.zzgD(zzawH);
        }
        if (zzvR != 0)
        {
            zzkr1.zzgE(zzvR);
        }
        if (zzvS != 0)
        {
            zzkr1.zzgF(zzvS);
        }
        if (zzawI != 0)
        {
            zzkr1.zzgG(zzawI);
        }
        if (zzawJ != 0)
        {
            zzkr1.zzgH(zzawJ);
        }
        if (!TextUtils.isEmpty(zzMf))
        {
            zzkr1.setLanguage(zzMf);
        }
    }

    public void zzgD(int i)
    {
        zzawH = i;
    }

    public void zzgE(int i)
    {
        zzvR = i;
    }

    public void zzgF(int i)
    {
        zzvS = i;
    }

    public void zzgG(int i)
    {
        zzawI = i;
    }

    public void zzgH(int i)
    {
        zzawJ = i;
    }

    public int zzuA()
    {
        return zzvR;
    }

    public int zzuB()
    {
        return zzvS;
    }

    public int zzuC()
    {
        return zzawI;
    }

    public int zzuD()
    {
        return zzawJ;
    }

    public int zzuz()
    {
        return zzawH;
    }
}
