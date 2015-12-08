// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            bv, x, co, v

public final class bu
    implements SafeParcelable
{
    public static final class a
    {

        public final String adUnitId;
        public final ApplicationInfo applicationInfo;
        public final x ed;
        public final co eg;
        public final Bundle gA;
        public final v gB;
        public final PackageInfo gC;
        public final String gE;
        public final String gF;

        public a(Bundle bundle, v v, x x, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
                String s2, co co)
        {
            gA = bundle;
            gB = v;
            ed = x;
            adUnitId = s;
            applicationInfo = applicationinfo;
            gC = packageinfo;
            gE = s1;
            gF = s2;
            eg = co;
        }
    }


    public static final bv CREATOR = new bv();
    public final String adUnitId;
    public final ApplicationInfo applicationInfo;
    public final x ed;
    public final co eg;
    public final Bundle gA;
    public final v gB;
    public final PackageInfo gC;
    public final String gD;
    public final String gE;
    public final String gF;
    public final int versionCode;

    bu(int i, Bundle bundle, v v, x x, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, co co)
    {
        versionCode = i;
        gA = bundle;
        gB = v;
        ed = x;
        adUnitId = s;
        applicationInfo = applicationinfo;
        gC = packageinfo;
        gD = s1;
        gE = s2;
        gF = s3;
        eg = co;
    }

    public bu(Bundle bundle, v v, x x, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, co co)
    {
        this(1, bundle, v, x, s, applicationinfo, packageinfo, s1, s2, s3, co);
    }

    public bu(a a1, String s)
    {
        this(a1.gA, a1.gB, a1.ed, a1.adUnitId, a1.applicationInfo, a1.gC, s, a1.gE, a1.gF, a1.eg);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bv.a(this, parcel, i);
    }

}
