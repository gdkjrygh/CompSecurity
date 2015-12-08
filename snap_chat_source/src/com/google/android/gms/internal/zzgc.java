// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            zzgq, zzgg, zzai, zzhl, 
//            zzgf, zzga, zzca, zzbx, 
//            zzme, zzic, zzba, zzge, 
//            zzgd, zzt, zzdr, zzhe

public class zzgc
{
    public static interface zza
    {

        public abstract void zza(zzhe zzhe);
    }


    public zzgc()
    {
    }

    public zzhl zza(Context context, zzt zzt, zzhe.zza zza1, zzic zzic1, zzdr zzdr, zza zza2)
    {
        zzgq zzgq1 = zza1.zzyz;
        if (zzgq1.zzwS)
        {
            context = new zzgg(context, zzt, new zzai(), zza1, zza2);
        } else
        if (zzgq1.zzwI)
        {
            context = new zzgf(context, zza1, zzic1, zzdr, zza2);
        } else
        if (zzgq1.zzwO)
        {
            context = new zzga(context, zza1, zzic1, zza2);
        } else
        if (((Boolean)zzca.zzqI.get()).booleanValue() && zzme.zzkj() && !zzme.zzkk() && zzic1.zzad().zzpb)
        {
            context = new zzge(context, zza1, zzic1, zza2);
        } else
        {
            context = new zzgd(context, zza1, zzic1, zza2);
        }
        context.start();
        return context;
    }
}
