// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel

public static final class zzzp
{

    public final ApplicationInfo applicationInfo;
    public final String zzmG;
    public final VersionInfoParcel zzmJ;
    public final AdSizeParcel zzmP;
    public final List zzmZ;
    public final Bundle zzyV;
    public final AdRequestParcel zzyW;
    public final PackageInfo zzyX;
    public final String zzyZ;
    public final String zzza;
    public final Bundle zzzb;
    public final int zzzc;
    public final Bundle zzzd;
    public final boolean zzze;
    public final Messenger zzzf;
    public final int zzzg;
    public final int zzzh;
    public final float zzzi;
    public final String zzzj;
    public final boolean zzzk;
    public final int zzzl;
    public final long zzzn;
    public final String zzzo;
    public final List zzzp;

    public I(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, VersionInfoParcel versioninfoparcel, Bundle bundle1, List list, Bundle bundle2, boolean flag, Messenger messenger, 
            int i, int j, float f, String s3, boolean flag1, int k, long l, String s4, List list1)
    {
        zzyV = bundle;
        zzyW = adrequestparcel;
        zzmP = adsizeparcel;
        zzmG = s;
        applicationInfo = applicationinfo;
        zzyX = packageinfo;
        zzyZ = s1;
        zzza = s2;
        zzmJ = versioninfoparcel;
        zzzb = bundle1;
        zzze = flag;
        zzzf = messenger;
        zzzg = i;
        zzzh = j;
        zzzi = f;
        if (list != null && list.size() > 0)
        {
            zzzc = 2;
            zzmZ = list;
        } else
        {
            zzzc = 0;
            zzmZ = null;
        }
        zzzd = bundle2;
        zzzj = s3;
        zzzk = flag1;
        zzzl = k;
        zzzn = l;
        zzzo = s4;
        zzzp = list1;
    }
}
