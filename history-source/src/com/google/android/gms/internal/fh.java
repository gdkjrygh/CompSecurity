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
//            fi, gs, ay, av

public final class fh
    implements SafeParcelable
{
    public static final class a
    {

        public final ApplicationInfo applicationInfo;
        public final String lL;
        public final gs lO;
        public final ay lS;
        public final List mc;
        public final Bundle tK;
        public final av tL;
        public final PackageInfo tM;
        public final String tO;
        public final String tP;
        public final Bundle tQ;
        public final int tR;
        public final Bundle tS;
        public final boolean tT;

        public a(Bundle bundle, av av, ay ay, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
                String s2, gs gs, Bundle bundle1, List list, Bundle bundle2, boolean flag)
        {
            tK = bundle;
            tL = av;
            lS = ay;
            lL = s;
            applicationInfo = applicationinfo;
            tM = packageinfo;
            tO = s1;
            tP = s2;
            lO = gs;
            tQ = bundle1;
            tT = flag;
            if (list != null && list.size() > 0)
            {
                tR = 2;
                mc = list;
            } else
            {
                tR = 0;
                mc = null;
            }
            tS = bundle2;
        }
    }


    public static final fi CREATOR = new fi();
    public final ApplicationInfo applicationInfo;
    public final String lL;
    public final gs lO;
    public final ay lS;
    public final List mc;
    public final Bundle tK;
    public final av tL;
    public final PackageInfo tM;
    public final String tN;
    public final String tO;
    public final String tP;
    public final Bundle tQ;
    public final int tR;
    public final Bundle tS;
    public final boolean tT;
    public final int versionCode;

    fh(int i, Bundle bundle, av av, ay ay, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, gs gs, Bundle bundle1, int j, List list, 
            Bundle bundle2, boolean flag)
    {
        versionCode = i;
        tK = bundle;
        tL = av;
        lS = ay;
        lL = s;
        applicationInfo = applicationinfo;
        tM = packageinfo;
        tN = s1;
        tO = s2;
        tP = s3;
        lO = gs;
        tQ = bundle1;
        tR = j;
        mc = list;
        tS = bundle2;
        tT = flag;
    }

    public fh(Bundle bundle, av av, ay ay, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, gs gs, Bundle bundle1, int i, List list, Bundle bundle2, 
            boolean flag)
    {
        this(4, bundle, av, ay, s, applicationinfo, packageinfo, s1, s2, s3, gs, bundle1, i, list, bundle2, flag);
    }

    public fh(a a1, String s)
    {
        this(a1.tK, a1.tL, a1.lS, a1.lL, a1.applicationInfo, a1.tM, s, a1.tO, a1.tP, a1.lO, a1.tQ, a1.tR, a1.mc, a1.tS, a1.tT);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fi.a(this, parcel, i);
    }

}
