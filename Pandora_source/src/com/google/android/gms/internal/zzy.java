// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.overlay.zzi;
import com.google.android.gms.ads.internal.zzb;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbq, zzbu, zzbw, zzdh, 
//            zzbs

public interface zzy
{
    public static interface zza
    {

        public abstract void zzbq();
    }


    public abstract void destroy();

    public abstract void zza(com.google.android.gms.ads.internal.client.zza zza1, zzf zzf, zzbq zzbq, zzi zzi1, boolean flag, zzbu zzbu, zzbw zzbw, 
            zzb zzb1, zzdh zzdh);

    public abstract void zza(zza zza1);

    public abstract void zza(String s, zzbs zzbs);

    public abstract void zza(String s, JSONObject jsonobject);

    public abstract void zzb(String s, zzbs zzbs);

    public abstract void zzb(String s, String s1);

    public abstract void zzg(String s);

    public abstract void zzh(String s);

    public abstract void zzi(String s);
}
