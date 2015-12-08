// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzhg, zzcb, zzhy, zzab, 
//            zzcd, zzhx

class zzyY
    implements Runnable
{

    final zzhg zzyY;

    public void run()
    {
        zzcb zzcb1 = new zzcb();
        zzcb1.zzb(zzhg.zza(zzyY), zzhg.zzb(zzyY).zzzH);
        try
        {
            zzhg.zza(zzyY, zzab.zzaR().zza(zzcb1));
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            zzhx.zzac((new StringBuilder("Cannot initialize CSI reporter.")).append(illegalargumentexception.getMessage()).toString());
        }
    }

    (zzhg zzhg1)
    {
        zzyY = zzhg1;
        super();
    }
}
