// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzbe, zzhw, zzgo, 
//            zzhl, zzgq, zzhy

public final class zzgl
{
    public static interface zza
    {

        public abstract void zzb(zzgq zzgq);
    }

    static interface zzb
    {

        public abstract boolean zzc(zzgo zzgo);
    }


    public static zzhl zza(Context context, zzgo zzgo, zza zza1)
    {
        return zza(context, zzgo, zza1, new zzb() {

            public final boolean zzc(zzgo zzgo1)
            {
                return zzgo1.zzlP.zzzK;
            }

        });
    }

    static zzhl zza(Context context, zzgo zzgo, zza zza1, zzb zzb1)
    {
        if (zzb1.zzc(zzgo))
        {
            return zzb(context, zzgo, zza1);
        } else
        {
            return zzc(context, zzgo, zza1);
        }
    }

    private static zzhl zzb(Context context, zzgo zzgo, zza zza1)
    {
        zzhx.zzY("Fetching ad response from local ad request service.");
        context = new zzgm.zza(context, zzgo, zza1);
        context.start();
        return context;
    }

    private static zzhl zzc(Context context, zzgo zzgo, zza zza1)
    {
        zzhx.zzY("Fetching ad response from remote ad request service.");
        if (!zzbe.zzbD().zzA(context))
        {
            zzhx.zzac("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new zzgm.zzb(context, zzgo, zza1);
        }
    }
}
