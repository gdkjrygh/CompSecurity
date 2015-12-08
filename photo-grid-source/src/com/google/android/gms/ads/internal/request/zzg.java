// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel

public final class zzg extends zzk.zza
{

    private final WeakReference a;

    public zzg(zzc.zza zza)
    {
        a = new WeakReference(zza);
    }

    public final void zzb(AdResponseParcel adresponseparcel)
    {
        zzc.zza zza = (zzc.zza)a.get();
        if (zza != null)
        {
            zza.zzb(adresponseparcel);
        }
    }
}
