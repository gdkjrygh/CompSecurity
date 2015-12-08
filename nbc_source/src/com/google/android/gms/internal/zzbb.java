// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.ads.internal.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzbe, zzde, zzdi, zzdk, 
//            zzev, zzbf

public interface zzbb
    extends zzbe
{
    public static interface zza
    {

        public abstract void zzcf();
    }


    public abstract void destroy();

    public abstract void zza(com.google.android.gms.ads.internal.client.zza zza1, zzf zzf, zzde zzde, zzk zzk, boolean flag, zzdi zzdi, zzdk zzdk, 
            zzd zzd, zzev zzev);

    public abstract void zza(zza zza1);

    public abstract zzbf zzce();

    public abstract void zzr(String s);

    public abstract void zzs(String s);

    public abstract void zzt(String s);
}
