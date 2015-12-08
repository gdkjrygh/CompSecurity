// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzf, CapabilityParcel

public final class AdRequestInfoParcel
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    public final ApplicationInfo applicationInfo;
    public final int versionCode;
    public final String zzEA;
    public final long zzEB;
    public final String zzEC;
    public final List zzED;
    public final List zzEE;
    public final long zzEF;
    public final CapabilityParcel zzEG;
    public final String zzEH;
    public final Bundle zzEm;
    public final AdRequestParcel zzEn;
    public final PackageInfo zzEo;
    public final String zzEp;
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

    AdRequestInfoParcel(int i, Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, VersionInfoParcel versioninfoparcel, Bundle bundle1, int j, List list, 
            Bundle bundle2, boolean flag, Messenger messenger, int k, int l, float f, String s4, 
            long l1, String s5, List list1, String s6, NativeAdOptionsParcel nativeadoptionsparcel, List list2, 
            long l2, CapabilityParcel capabilityparcel, String s7)
    {
        versionCode = i;
        zzEm = bundle;
        zzEn = adrequestparcel;
        zzqn = adsizeparcel;
        zzqh = s;
        applicationInfo = applicationinfo;
        zzEo = packageinfo;
        zzEp = s1;
        zzEq = s2;
        zzEr = s3;
        zzqj = versioninfoparcel;
        zzEs = bundle1;
        zzEt = j;
        zzqD = list;
        if (list2 == null)
        {
            bundle = Collections.emptyList();
        } else
        {
            bundle = Collections.unmodifiableList(list2);
        }
        zzEE = bundle;
        zzEu = bundle2;
        zzEv = flag;
        zzEw = messenger;
        zzEx = k;
        zzEy = l;
        zzEz = f;
        zzEA = s4;
        zzEB = l1;
        zzEC = s5;
        if (list1 == null)
        {
            bundle = Collections.emptyList();
        } else
        {
            bundle = Collections.unmodifiableList(list1);
        }
        zzED = bundle;
        zzqg = s6;
        zzqB = nativeadoptionsparcel;
        zzEF = l2;
        zzEG = capabilityparcel;
        zzEH = s7;
    }

    public AdRequestInfoParcel(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, VersionInfoParcel versioninfoparcel, Bundle bundle1, int i, List list, List list1, 
            Bundle bundle2, boolean flag, Messenger messenger, int j, int k, float f, String s4, 
            long l, String s5, List list2, String s6, NativeAdOptionsParcel nativeadoptionsparcel, long l1, CapabilityParcel capabilityparcel, String s7)
    {
        this(12, bundle, adrequestparcel, adsizeparcel, s, applicationinfo, packageinfo, s1, s2, s3, versioninfoparcel, bundle1, i, list, bundle2, flag, messenger, j, k, f, s4, l, s5, list2, s6, nativeadoptionsparcel, list1, l1, capabilityparcel, s7);
    }

    public AdRequestInfoParcel(zza zza1, String s, long l)
    {
        this(zza1.zzEm, zza1.zzEn, zza1.zzqn, zza1.zzqh, zza1.applicationInfo, zza1.zzEo, s, zza1.zzEq, zza1.zzEr, zza1.zzqj, zza1.zzEs, zza1.zzEt, zza1.zzqD, zza1.zzEE, zza1.zzEu, zza1.zzEv, zza1.zzEw, zza1.zzEx, zza1.zzEy, zza1.zzEz, zza1.zzEA, zza1.zzEB, zza1.zzEC, zza1.zzED, zza1.zzqg, zza1.zzqB, l, zza1.zzEG, zza1.zzEH);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzf.a(this, parcel, i);
    }


    private class zza
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

        public zza(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
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

}
