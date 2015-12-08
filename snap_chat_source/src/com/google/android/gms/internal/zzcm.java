// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzcn

public class zzcm extends zzcp.zza
    implements zzcn.zza
{

    private final Object zznh = new Object();
    private final String zzrk;
    private final Drawable zzrl;
    private final String zzrm;
    private final String zzro;
    private zzcn zzrs;
    private final Drawable zzrt;
    private final String zzru;

    public zzcm(String s, Drawable drawable, String s1, Drawable drawable1, String s2, String s3)
    {
        zzrk = s;
        zzrl = drawable;
        zzrm = s1;
        zzrt = drawable1;
        zzro = s2;
        zzru = s3;
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
                zzhx.zzZ("Attempt to record impression before content ad initialized.");
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

    public zzd zzcD()
    {
        return zze.zzn(zzrt);
    }

    public String zzcE()
    {
        return zzru;
    }

    public String zzcw()
    {
        return zzrk;
    }

    public zzd zzcx()
    {
        return zze.zzn(zzrl);
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
                zzhx.zzZ("Attempt to perform click before content ad initialized.");
            }
            return;
        }
        zzrs.zzb("1", i);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
