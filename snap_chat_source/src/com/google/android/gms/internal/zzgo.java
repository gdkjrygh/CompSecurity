// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzgp, zzhy, zzba, zzax

public final class zzgo
    implements SafeParcelable
{
    public static final class zza
    {

        public final ApplicationInfo applicationInfo;
        public final String zzlM;
        public final zzhy zzlP;
        public final zzba zzlV;
        public final List zzmf;
        public final String zzwA;
        public final boolean zzwB;
        public final int zzwC;
        public final long zzwE;
        public final String zzwF;
        public final Bundle zzwm;
        public final zzax zzwn;
        public final PackageInfo zzwo;
        public final String zzwq;
        public final String zzwr;
        public final Bundle zzws;
        public final int zzwt;
        public final Bundle zzwu;
        public final boolean zzwv;
        public final Messenger zzww;
        public final int zzwx;
        public final int zzwy;
        public final float zzwz;

        public zza(Bundle bundle, zzax zzax, zzba zzba, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
                String s2, zzhy zzhy, Bundle bundle1, List list, Bundle bundle2, boolean flag, Messenger messenger, 
                int i, int j, float f, String s3, boolean flag1, int k, long l, String s4)
        {
            zzwm = bundle;
            zzwn = zzax;
            zzlV = zzba;
            zzlM = s;
            applicationInfo = applicationinfo;
            zzwo = packageinfo;
            zzwq = s1;
            zzwr = s2;
            zzlP = zzhy;
            zzws = bundle1;
            zzwv = flag;
            zzww = messenger;
            zzwx = i;
            zzwy = j;
            zzwz = f;
            if (list != null && list.size() > 0)
            {
                zzwt = 2;
                zzmf = list;
            } else
            {
                zzwt = 0;
                zzmf = null;
            }
            zzwu = bundle2;
            zzwA = s3;
            zzwB = flag1;
            zzwC = k;
            zzwE = l;
            zzwF = s4;
        }
    }


    public static final zzgp CREATOR = new zzgp();
    public final ApplicationInfo applicationInfo;
    public final int versionCode;
    public final String zzlM;
    public final zzhy zzlP;
    public final zzba zzlV;
    public final List zzmf;
    public final String zzwA;
    public final boolean zzwB;
    public final int zzwC;
    public final String zzwD;
    public final long zzwE;
    public final String zzwF;
    public final Bundle zzwm;
    public final zzax zzwn;
    public final PackageInfo zzwo;
    public final String zzwp;
    public final String zzwq;
    public final String zzwr;
    public final Bundle zzws;
    public final int zzwt;
    public final Bundle zzwu;
    public final boolean zzwv;
    public final Messenger zzww;
    public final int zzwx;
    public final int zzwy;
    public final float zzwz;

    zzgo(int i, Bundle bundle, zzax zzax, zzba zzba, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, zzhy zzhy, Bundle bundle1, int j, List list, 
            Bundle bundle2, boolean flag, Messenger messenger, int k, int l, float f, String s4, 
            boolean flag1, int i1, String s5, long l1, String s6)
    {
        versionCode = i;
        zzwm = bundle;
        zzwn = zzax;
        zzlV = zzba;
        zzlM = s;
        applicationInfo = applicationinfo;
        zzwo = packageinfo;
        zzwp = s1;
        zzwq = s2;
        zzwr = s3;
        zzlP = zzhy;
        zzws = bundle1;
        zzwt = j;
        zzmf = list;
        zzwu = bundle2;
        zzwv = flag;
        zzww = messenger;
        zzwx = k;
        zzwy = l;
        zzwz = f;
        zzwA = s4;
        zzwB = flag1;
        zzwC = i1;
        zzwD = s5;
        zzwE = l1;
        zzwF = s6;
    }

    public zzgo(Bundle bundle, zzax zzax, zzba zzba, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, zzhy zzhy, Bundle bundle1, int i, List list, Bundle bundle2, 
            boolean flag, Messenger messenger, int j, int k, float f, String s4, boolean flag1, 
            int l, String s5, long l1, String s6)
    {
        this(7, bundle, zzax, zzba, s, applicationinfo, packageinfo, s1, s2, s3, zzhy, bundle1, i, list, bundle2, flag, messenger, j, k, f, s4, flag1, l, s5, l1, s6);
    }

    public zzgo(zza zza1, String s, String s1)
    {
        this(zza1.zzwm, zza1.zzwn, zza1.zzlV, zza1.zzlM, zza1.applicationInfo, zza1.zzwo, s, zza1.zzwq, zza1.zzwr, zza1.zzlP, zza1.zzws, zza1.zzwt, zza1.zzmf, zza1.zzwu, zza1.zzwv, zza1.zzww, zza1.zzwx, zza1.zzwy, zza1.zzwz, zza1.zzwA, zza1.zzwB, zza1.zzwC, s1, zza1.zzwE, zza1.zzwF);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzgp.zza(this, parcel, i);
    }

}
