// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzdn, zzdm

class zzsI
    implements Runnable
{

    final zzdm zzsI;
    final zzdn zzsJ;

    public void run()
    {
label0:
        {
            synchronized (zzdn.zza(zzsJ))
            {
                if (zzdn.zzb(zzsJ) == -2)
                {
                    break label0;
                }
            }
            return;
        }
        zzdn.zza(zzsJ, zzdn.zzc(zzsJ));
        if (zzdn.zzd(zzsJ) != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zzsJ.zzm(4);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzsI.zza(zzsJ);
        zzdn.zza(zzsJ, zzsI);
        obj;
        JVM INSTR monitorexit ;
    }

    (zzdn zzdn1, zzdm zzdm1)
    {
        zzsJ = zzdn1;
        zzsI = zzdm1;
        super();
    }
}
