// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzbi, zzbe

public class zzbh extends zzbl.zza
    implements zzbi.zza
{

    private final Object zzoe = new Object();
    private final String zzsG;
    private final Drawable zzsH;
    private final String zzsI;
    private final String zzsK;
    private final zzbe zzsO;
    private zzbi zzsP;
    private final Drawable zzsQ;
    private final String zzsR;

    public zzbh(String s, Drawable drawable, String s1, Drawable drawable1, String s2, String s3, zzbe zzbe)
    {
        zzsG = s;
        zzsH = drawable;
        zzsI = s1;
        zzsQ = drawable1;
        zzsK = s2;
        zzsR = s3;
        zzsO = zzbe;
    }

    public String getBody()
    {
        return zzsI;
    }

    public void zza(zzbi zzbi1)
    {
        synchronized (zzoe)
        {
            zzsP = zzbi1;
        }
        return;
        zzbi1;
        obj;
        JVM INSTR monitorexit ;
        throw zzbi1;
    }

    public void zza(String s, zzd zzd)
    {
label0:
        {
            synchronized (zzoe)
            {
                if (zzsP != null)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzak("Attempt to perform setAssetView before ad initialization.");
            }
            return;
        }
        zzsP.zza(s, (View)zze.zzg(zzd));
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public zzd zzb(zzd zzd)
    {
label0:
        {
            synchronized (zzoe)
            {
                if (zzsP != null)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzak("Attempt to perform wrapAndTrackView before ad initialization.");
            }
            return null;
        }
        zzd = (View)zze.zzg(zzd);
        zzd = zze.zzt(zzsP.zzh(zzd));
        obj;
        JVM INSTR monitorexit ;
        return zzd;
        zzd;
        obj;
        JVM INSTR monitorexit ;
        throw zzd;
    }

    public String zzcB()
    {
        return zzsG;
    }

    public zzd zzcC()
    {
        return zze.zzt(zzsH);
    }

    public String zzcE()
    {
        return zzsK;
    }

    public void zzcI()
    {
label0:
        {
            synchronized (zzoe)
            {
                if (zzsP != null)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzak("Attempt to perform clearViewMapping before ad initialized.");
            }
            return;
        }
        zzsP.zzcI();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzcJ()
    {
        return "1";
    }

    public zzbe zzcK()
    {
        return zzsO;
    }

    public zzd zzcL()
    {
        return zze.zzt(zzsQ);
    }

    public String zzcM()
    {
        return zzsR;
    }
}
