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
//            CapabilityParcel

public final class zzEH
{

    public final ApplicationInfo applicationInfo;
    public final String zzEA;
    public final long zzEB;
    public final String zzEC;
    public final List zzED;
    public final List zzEE;
    public final CapabilityParcel zzEG;
    public final String zzEH;
    public final Bundle zzEm;
    public final AdRequestParcel zzEn;
    public final PackageInfo zzEo;
    public final String zzEq;
    public final String zzEr;
    public final Bundle zzEs;
    public final int zzEt;
    public final Bundle zzEu;
    public final boolean zzEv;
    public final Messenger zzEw;
    public final int zzEx;
    public final int zzEy;
    public final float zzEz;
    public final NativeAdOptionsParcel zzqB;
    public final List zzqD;
    public final String zzqg;
    public final String zzqh;
    public final VersionInfoParcel zzqj;
    public final AdSizeParcel zzqn;

    public I(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, VersionInfoParcel versioninfoparcel, Bundle bundle1, List list, List list1, Bundle bundle2, boolean flag, 
            Messenger messenger, int i, int j, float f, String s3, long l, 
            String s4, List list2, String s5, NativeAdOptionsParcel nativeadoptionsparcel, CapabilityParcel capabilityparcel, String s6)
    {
        zzEm = bundle;
        zzEn = adrequestparcel;
        zzqn = adsizeparcel;
        zzqh = s;
        applicationInfo = applicationinfo;
        zzEo = packageinfo;
        zzEq = s1;
        zzEr = s2;
        zzqj = versioninfoparcel;
        zzEs = bundle1;
        zzEv = flag;
        zzEw = messenger;
        zzEx = i;
        zzEy = j;
        zzEz = f;
        if (list != null && list.size() > 0)
        {
            zzEt = 3;
            zzqD = list;
            zzEE = list1;
        } else
        {
            zzEt = 0;
            zzqD = null;
            zzEE = null;
        }
        zzEu = bundle2;
        zzEA = s3;
        zzEB = l;
        zzEC = s4;
        zzED = list2;
        zzqg = s5;
        zzqB = nativeadoptionsparcel;
        zzEG = capabilityparcel;
        zzEH = s6;
    }
}
