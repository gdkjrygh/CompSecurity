// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            fj, gt, ay, av

public final class fi
    implements SafeParcelable
{
    public static final class a
    {

        public final ApplicationInfo applicationInfo;
        public final String lA;
        public final gt lD;
        public final ay lH;
        public final List lS;
        public final String tA;
        public final String tB;
        public final Bundle tC;
        public final int tD;
        public final Bundle tE;
        public final boolean tF;
        public final Bundle tw;
        public final av tx;
        public final PackageInfo ty;

        public a(Bundle bundle, av av, ay ay, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
                String s2, gt gt, Bundle bundle1, List list, Bundle bundle2, boolean flag)
        {
            tw = bundle;
            tx = av;
            lH = ay;
            lA = s;
            applicationInfo = applicationinfo;
            ty = packageinfo;
            tA = s1;
            tB = s2;
            lD = gt;
            tC = bundle1;
            tF = flag;
            if (list != null && list.size() > 0)
            {
                tD = 2;
                lS = list;
            } else
            {
                tD = 0;
                lS = null;
            }
            tE = bundle2;
        }
    }


    public static final fj CREATOR = new fj();
    public final ApplicationInfo applicationInfo;
    public final String lA;
    public final gt lD;
    public final ay lH;
    public final List lS;
    public final String tA;
    public final String tB;
    public final Bundle tC;
    public final int tD;
    public final Bundle tE;
    public final boolean tF;
    public final Bundle tw;
    public final av tx;
    public final PackageInfo ty;
    public final String tz;
    public final int versionCode;

    fi(int i, Bundle bundle, av av, ay ay, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, gt gt, Bundle bundle1, int j, List list, 
            Bundle bundle2, boolean flag)
    {
        versionCode = i;
        tw = bundle;
        tx = av;
        lH = ay;
        lA = s;
        applicationInfo = applicationinfo;
        ty = packageinfo;
        tz = s1;
        tA = s2;
        tB = s3;
        lD = gt;
        tC = bundle1;
        tD = j;
        lS = list;
        tE = bundle2;
        tF = flag;
    }

    public fi(Bundle bundle, av av, ay ay, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, gt gt, Bundle bundle1, int i, List list, Bundle bundle2, 
            boolean flag)
    {
        this(4, bundle, av, ay, s, applicationinfo, packageinfo, s1, s2, s3, gt, bundle1, i, list, bundle2, flag);
    }

    public fi(a a1, String s)
    {
        this(a1.tw, a1.tx, a1.lH, a1.lA, a1.applicationInfo, a1.ty, s, a1.tA, a1.tB, a1.lD, a1.tC, a1.tD, a1.lS, a1.tE, a1.tF);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fj.a(this, parcel, i);
    }

}
