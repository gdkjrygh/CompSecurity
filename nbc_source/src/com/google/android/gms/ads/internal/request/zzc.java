// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.zzhh;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel, AdResponseParcel

public final class zzc
{
    public static interface zza
    {

        public abstract void zzb(AdResponseParcel adresponseparcel);
    }

    static interface zzb
    {

        public abstract boolean zzd(AdRequestInfoParcel adrequestinfoparcel);
    }


    public static zzhh zza(Context context, AdRequestInfoParcel adrequestinfoparcel, zza zza1)
    {
        return zza(context, adrequestinfoparcel, zza1, new zzb(context) {

            final Context zzqV;

            public boolean zzd(AdRequestInfoParcel adrequestinfoparcel1)
            {
                return adrequestinfoparcel1.zzpJ.zzGJ || GooglePlayServicesUtil.zzae(zzqV);
            }

            
            {
                zzqV = context;
                super();
            }
        });
    }

    static zzhh zza(Context context, AdRequestInfoParcel adrequestinfoparcel, zza zza1, zzb zzb1)
    {
        if (zzb1.zzd(adrequestinfoparcel))
        {
            return zzb(context, adrequestinfoparcel, zza1);
        } else
        {
            return zzc(context, adrequestinfoparcel, zza1);
        }
    }

    private static zzhh zzb(Context context, AdRequestInfoParcel adrequestinfoparcel, zza zza1)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Fetching ad response from local ad request service.");
        context = new zzd.zza(context, adrequestinfoparcel, zza1);
        context.zzgi();
        return context;
    }

    private static zzhh zzc(Context context, AdRequestInfoParcel adrequestinfoparcel, zza zza1)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Fetching ad response from remote ad request service.");
        if (!zzk.zzcA().zzP(context))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new zzd.zzb(context, adrequestinfoparcel, zza1);
        }
    }
}
