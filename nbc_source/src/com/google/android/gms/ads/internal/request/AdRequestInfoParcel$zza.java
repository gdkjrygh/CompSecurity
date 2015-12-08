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
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel

public static final class zzqb
{

    public final ApplicationInfo applicationInfo;
    public final boolean zzCA;
    public final int zzCB;
    public final long zzCD;
    public final String zzCE;
    public final List zzCF;
    public final List zzCG;
    public final Bundle zzCl;
    public final AdRequestParcel zzCm;
    public final PackageInfo zzCn;
    public final String zzCp;
    public final String zzCq;
    public final Bundle zzCr;
    public final int zzCs;
    public final Bundle zzCt;
    public final boolean zzCu;
    public final Messenger zzCv;
    public final int zzCw;
    public final int zzCx;
    public final float zzCy;
    public final String zzCz;
    public final String zzpF;
    public final String zzpG;
    public final VersionInfoParcel zzpJ;
    public final AdSizeParcel zzpN;
    public final NativeAdOptionsParcel zzqb;
    public final List zzqd;

    public I(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, VersionInfoParcel versioninfoparcel, Bundle bundle1, List list, List list1, Bundle bundle2, boolean flag, 
            Messenger messenger, int i, int j, float f, String s3, boolean flag1, int k, 
            long l, String s4, List list2, String s5, NativeAdOptionsParcel nativeadoptionsparcel)
    {
        zzCl = bundle;
        zzCm = adrequestparcel;
        zzpN = adsizeparcel;
        zzpG = s;
        applicationInfo = applicationinfo;
        zzCn = packageinfo;
        zzCp = s1;
        zzCq = s2;
        zzpJ = versioninfoparcel;
        zzCr = bundle1;
        zzCu = flag;
        zzCv = messenger;
        zzCw = i;
        zzCx = j;
        zzCy = f;
        if (list != null && list.size() > 0)
        {
            zzCs = 3;
            zzqd = list;
            zzCG = list1;
        } else
        {
            zzCs = 0;
            zzqd = null;
            zzCG = null;
        }
        zzCt = bundle2;
        zzCz = s3;
        zzCA = flag1;
        zzCB = k;
        zzCD = l;
        zzCE = s4;
        zzCF = list2;
        zzpF = s5;
        zzqb = nativeadoptionsparcel;
    }
}
