// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzcn

public class zzcl extends zzco.zza
    implements zzcn.zza
{

    private final Object zznh = new Object();
    private final String zzrk;
    private final Drawable zzrl;
    private final String zzrm;
    private final Drawable zzrn;
    private final String zzro;
    private final double zzrp;
    private final String zzrq;
    private final String zzrr;
    private zzcn zzrs;

    public zzcl(String s, Drawable drawable, String s1, Drawable drawable1, String s2, double d, 
            String s3, String s4)
    {
        zzrk = s;
        zzrl = drawable;
        zzrm = s1;
        zzrn = drawable1;
        zzro = s2;
        zzrp = d;
        zzrq = s3;
        zzrr = s4;
    }

    public String getBody()
    {
        return zzrm;
    }

    public void recordImpression()
    {
label0:
        {
            synchronized (zznh)
            {
                if (zzrs != null)
                {
                    break label0;
                }
                zzhx.zzZ("Attempt to record impression before app install ad initialized.");
            }
            return;
        }
        zzrs.recordImpression();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzcn zzcn1)
    {
        synchronized (zznh)
        {
            zzrs = zzcn1;
        }
        return;
        zzcn1;
        obj;
        JVM INSTR monitorexit ;
        throw zzcn1;
    }

    public double zzcA()
    {
        return zzrp;
    }

    public String zzcB()
    {
        return zzrq;
    }

    public String zzcC()
    {
        return zzrr;
    }

    public String zzcw()
    {
        return zzrk;
    }

    public zzd zzcx()
    {
        return zze.zzn(zzrl);
    }

    public zzd zzcy()
    {
        return zze.zzn(zzrn);
    }

    public String zzcz()
    {
        return zzro;
    }

    public void zzl(int i)
    {
label0:
        {
            synchronized (zznh)
            {
                if (zzrs != null)
                {
                    break label0;
                }
                zzhx.zzZ("Attempt to perform click before app install ad initialized.");
            }
            return;
        }
        zzrs.zzb("2", i);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
