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
//            cy, dx, ak, ah

public final class cx
    implements SafeParcelable
{
    public static final class a
    {

        public final ApplicationInfo applicationInfo;
        public final String kH;
        public final dx kK;
        public final ak kN;
        public final Bundle pf;
        public final ah pg;
        public final PackageInfo ph;
        public final String pj;
        public final String pk;
        public final Bundle pl;

        public a(Bundle bundle, ah ah, ak ak, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
                String s2, dx dx, Bundle bundle1)
        {
            pf = bundle;
            pg = ah;
            kN = ak;
            kH = s;
            applicationInfo = applicationinfo;
            ph = packageinfo;
            pj = s1;
            pk = s2;
            kK = dx;
            pl = bundle1;
        }
    }


    public static final cy CREATOR = new cy();
    public final ApplicationInfo applicationInfo;
    public final String kH;
    public final dx kK;
    public final ak kN;
    public final Bundle pf;
    public final ah pg;
    public final PackageInfo ph;
    public final String pi;
    public final String pj;
    public final String pk;
    public final Bundle pl;
    public final int versionCode;

    cx(int i, Bundle bundle, ah ah, ak ak, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, dx dx, Bundle bundle1)
    {
        versionCode = i;
        pf = bundle;
        pg = ah;
        kN = ak;
        kH = s;
        applicationInfo = applicationinfo;
        ph = packageinfo;
        pi = s1;
        pj = s2;
        pk = s3;
        kK = dx;
        pl = bundle1;
    }

    public cx(Bundle bundle, ah ah, ak ak, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, dx dx, Bundle bundle1)
    {
        this(2, bundle, ah, ak, s, applicationinfo, packageinfo, s1, s2, s3, dx, bundle1);
    }

    public cx(a a1, String s)
    {
        this(a1.pf, a1.pg, a1.kN, a1.kH, a1.applicationInfo, a1.ph, s, a1.pj, a1.pk, a1.kK, a1.pl);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        cy.a(this, parcel, i);
    }

}
