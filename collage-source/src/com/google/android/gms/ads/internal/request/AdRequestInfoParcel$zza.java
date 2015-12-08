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
//            AdRequestInfoParcel, CapabilityParcel

public static final class zzDU
{

    public final ApplicationInfo applicationInfo;
    public final String zzDB;
    public final String zzDC;
    public final Bundle zzDD;
    public final int zzDE;
    public final Bundle zzDF;
    public final boolean zzDG;
    public final Messenger zzDH;
    public final int zzDI;
    public final int zzDJ;
    public final float zzDK;
    public final String zzDL;
    public final boolean zzDM;
    public final int zzDN;
    public final long zzDP;
    public final String zzDQ;
    public final List zzDR;
    public final List zzDS;
    public final CapabilityParcel zzDU;
    public final Bundle zzDx;
    public final AdRequestParcel zzDy;
    public final PackageInfo zzDz;
    public final String zzpY;
    public final String zzpZ;
    public final VersionInfoParcel zzqb;
    public final AdSizeParcel zzqf;
    public final NativeAdOptionsParcel zzqt;
    public final List zzqv;

    public I(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, VersionInfoParcel versioninfoparcel, Bundle bundle1, List list, List list1, Bundle bundle2, boolean flag, 
            Messenger messenger, int i, int j, float f, String s3, boolean flag1, int k, 
            long l, String s4, List list2, String s5, NativeAdOptionsParcel nativeadoptionsparcel, CapabilityParcel capabilityparcel)
    {
        zzDx = bundle;
        zzDy = adrequestparcel;
        zzqf = adsizeparcel;
        zzpZ = s;
        applicationInfo = applicationinfo;
        zzDz = packageinfo;
        zzDB = s1;
        zzDC = s2;
        zzqb = versioninfoparcel;
        zzDD = bundle1;
        zzDG = flag;
        zzDH = messenger;
        zzDI = i;
        zzDJ = j;
        zzDK = f;
        if (list != null && list.size() > 0)
        {
            zzDE = 3;
            zzqv = list;
            zzDS = list1;
        } else
        {
            zzDE = 0;
            zzqv = null;
            zzDS = null;
        }
        zzDF = bundle2;
        zzDL = s3;
        zzDM = flag1;
        zzDN = k;
        zzDP = l;
        zzDQ = s4;
        zzDR = list2;
        zzpY = s5;
        zzqt = nativeadoptionsparcel;
        zzDU = capabilityparcel;
    }
}
