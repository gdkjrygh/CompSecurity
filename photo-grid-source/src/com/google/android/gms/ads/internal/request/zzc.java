// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.pj;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            d, e, AdRequestInfoParcel

public final class zzc
{

    public static pj zza(Context context, AdRequestInfoParcel adrequestinfoparcel, zza zza1)
    {
        if ((new d(context)).a(adrequestinfoparcel))
        {
            zzb.zzaF("Fetching ad response from local ad request service.");
            context = new zzd.zza(context, adrequestinfoparcel, zza1);
            context.zzgz();
            return context;
        }
        zzb.zzaF("Fetching ad response from remote ad request service.");
        if (!zzl.zzcF().zzR(context))
        {
            zzb.zzaH("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new zzd.zzb(context, adrequestinfoparcel, zza1);
        }
    }
}
