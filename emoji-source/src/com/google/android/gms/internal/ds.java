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
//            dt, ev, al, ai

public final class ds
    implements SafeParcelable
{
    public static final class a
    {

        public final ApplicationInfo applicationInfo;
        public final String kN;
        public final ev kQ;
        public final al kT;
        public final Bundle pW;
        public final ai pX;
        public final PackageInfo pY;
        public final String qa;
        public final String qb;
        public final Bundle qc;

        public a(Bundle bundle, ai ai, al al, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
                String s2, ev ev, Bundle bundle1)
        {
            pW = bundle;
            pX = ai;
            kT = al;
            kN = s;
            applicationInfo = applicationinfo;
            pY = packageinfo;
            qa = s1;
            qb = s2;
            kQ = ev;
            qc = bundle1;
        }
    }


    public static final dt CREATOR = new dt();
    public final ApplicationInfo applicationInfo;
    public final String kN;
    public final ev kQ;
    public final al kT;
    public final Bundle pW;
    public final ai pX;
    public final PackageInfo pY;
    public final String pZ;
    public final String qa;
    public final String qb;
    public final Bundle qc;
    public final String qd;
    public final int versionCode;

    ds(int i, Bundle bundle, ai ai, al al, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, ev ev, Bundle bundle1, String s4)
    {
        versionCode = i;
        pW = bundle;
        pX = ai;
        kT = al;
        kN = s;
        applicationInfo = applicationinfo;
        pY = packageinfo;
        pZ = s1;
        qa = s2;
        qb = s3;
        kQ = ev;
        qc = bundle1;
        qd = s4;
    }

    public ds(Bundle bundle, ai ai, al al, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, ev ev, Bundle bundle1, String s4)
    {
        this(3, bundle, ai, al, s, applicationinfo, packageinfo, s1, s2, s3, ev, bundle1, s4);
    }

    public ds(a a1, String s, String s1)
    {
        this(a1.pW, a1.pX, a1.kT, a1.kN, a1.applicationInfo, a1.pY, s, a1.qa, a1.qb, a1.kQ, a1.qc, s1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        dt.a(this, parcel, i);
    }

}
