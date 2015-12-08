// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzab, zzhp, zzgq

public final class zzgz
{

    private int mOrientation;
    private String zzrm;
    private List zzwY;
    private String zzxC;
    private String zzxD;
    private List zzxE;
    private String zzxF;
    private String zzxG;
    private List zzxH;
    private long zzxI;
    private boolean zzxJ;
    private final long zzxK = -1L;
    private long zzxL;
    private boolean zzxM;
    private boolean zzxN;
    private boolean zzxO;
    private boolean zzxP;

    public zzgz()
    {
        zzxI = -1L;
        zzxJ = false;
        zzxL = -1L;
        mOrientation = -1;
        zzxM = false;
        zzxN = false;
        zzxO = false;
        zzxP = true;
    }

    static String zza(Map map, String s)
    {
        map = (List)map.get(s);
        if (map != null && !map.isEmpty())
        {
            return (String)map.get(0);
        } else
        {
            return null;
        }
    }

    static long zzb(Map map, String s)
    {
        map = (List)map.get(s);
        if (map == null || map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        map = (String)map.get(0);
        float f = Float.parseFloat(map);
        return (long)(f * 1000F);
        NumberFormatException numberformatexception;
        numberformatexception;
        zzhx.zzac((new StringBuilder("Could not parse float from ")).append(s).append(" header: ").append(map).toString());
        return -1L;
    }

    static List zzc(Map map, String s)
    {
        map = (List)map.get(s);
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if (map != null)
            {
                return Arrays.asList(map.trim().split("\\s+"));
            }
        }
        return null;
    }

    private boolean zzd(Map map, String s)
    {
        map = (List)map.get(s);
        return map != null && !map.isEmpty() && Boolean.valueOf((String)map.get(0)).booleanValue();
    }

    private void zzi(Map map)
    {
        zzxC = zza(map, "X-Afma-Ad-Size");
    }

    private void zzj(Map map)
    {
        map = zzc(map, "X-Afma-Click-Tracking-Urls");
        if (map != null)
        {
            zzxE = map;
        }
    }

    private void zzk(Map map)
    {
        map = (List)map.get("X-Afma-Debug-Dialog");
        if (map != null && !map.isEmpty())
        {
            zzxF = (String)map.get(0);
        }
    }

    private void zzl(Map map)
    {
        map = zzc(map, "X-Afma-Tracking-Urls");
        if (map != null)
        {
            zzxH = map;
        }
    }

    private void zzm(Map map)
    {
        long l = zzb(map, "X-Afma-Interstitial-Timeout");
        if (l != -1L)
        {
            zzxI = l;
        }
    }

    private void zzn(Map map)
    {
        zzxG = zza(map, "X-Afma-ActiveView");
    }

    private void zzo(Map map)
    {
        zzxN = zzxN | zzd(map, "X-Afma-Native");
    }

    private void zzp(Map map)
    {
        zzxM = zzxM | zzd(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void zzq(Map map)
    {
        zzxJ = zzxJ | zzd(map, "X-Afma-Mediation");
    }

    private void zzr(Map map)
    {
        map = zzc(map, "X-Afma-Manual-Tracking-Urls");
        if (map != null)
        {
            zzwY = map;
        }
    }

    private void zzs(Map map)
    {
        long l = zzb(map, "X-Afma-Refresh-Rate");
        if (l != -1L)
        {
            zzxL = l;
        }
    }

    private void zzt(Map map)
    {
        map = (List)map.get("X-Afma-Orientation");
        if (map != null && !map.isEmpty())
        {
            map = (String)map.get(0);
            if ("portrait".equalsIgnoreCase(map))
            {
                mOrientation = zzab.zzaO().zzey();
            } else
            if ("landscape".equalsIgnoreCase(map))
            {
                mOrientation = zzab.zzaO().zzex();
                return;
            }
        }
    }

    private void zzu(Map map)
    {
        map = (List)map.get("X-Afma-Use-HTTPS");
        if (map != null && !map.isEmpty())
        {
            zzxO = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    private void zzv(Map map)
    {
        map = (List)map.get("X-Afma-Content-Url-Opted-Out");
        if (map != null && !map.isEmpty())
        {
            zzxP = Boolean.valueOf((String)map.get(0)).booleanValue();
        }
    }

    public final void zza(String s, Map map, String s1)
    {
        zzxD = s;
        zzrm = s1;
        zzh(map);
    }

    public final void zzh(Map map)
    {
        zzi(map);
        zzj(map);
        zzk(map);
        zzl(map);
        zzm(map);
        zzq(map);
        zzr(map);
        zzs(map);
        zzt(map);
        zzn(map);
        zzu(map);
        zzp(map);
        zzo(map);
        zzv(map);
    }

    public final zzgq zzi(long l)
    {
        return new zzgq(zzxD, zzrm, zzxE, zzxH, zzxI, zzxJ, -1L, zzwY, zzxL, mOrientation, zzxC, l, zzxF, zzxG, zzxM, zzxN, zzxO, zzxP, false);
    }
}
