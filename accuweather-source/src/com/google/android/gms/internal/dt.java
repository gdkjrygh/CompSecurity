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
//            du, ew, am, aj

public final class dt
    implements SafeParcelable
{
    public static final class a
    {

        public final ApplicationInfo applicationInfo;
        public final String kL;
        public final ew kO;
        public final am kR;
        public final Bundle pU;
        public final aj pV;
        public final PackageInfo pW;
        public final String pY;
        public final String pZ;
        public final Bundle qa;

        public a(Bundle bundle, aj aj, am am, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
                String s2, ew ew, Bundle bundle1)
        {
            pU = bundle;
            pV = aj;
            kR = am;
            kL = s;
            applicationInfo = applicationinfo;
            pW = packageinfo;
            pY = s1;
            pZ = s2;
            kO = ew;
            qa = bundle1;
        }
    }


    public static final du CREATOR = new du();
    public final ApplicationInfo applicationInfo;
    public final String kL;
    public final ew kO;
    public final am kR;
    public final Bundle pU;
    public final aj pV;
    public final PackageInfo pW;
    public final String pX;
    public final String pY;
    public final String pZ;
    public final Bundle qa;
    public final int versionCode;

    dt(int i, Bundle bundle, aj aj, am am, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, ew ew, Bundle bundle1)
    {
        versionCode = i;
        pU = bundle;
        pV = aj;
        kR = am;
        kL = s;
        applicationInfo = applicationinfo;
        pW = packageinfo;
        pX = s1;
        pY = s2;
        pZ = s3;
        kO = ew;
        qa = bundle1;
    }

    public dt(Bundle bundle, aj aj, am am, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, ew ew, Bundle bundle1)
    {
        this(2, bundle, aj, am, s, applicationinfo, packageinfo, s1, s2, s3, ew, bundle1);
    }

    public dt(a a1, String s)
    {
        this(a1.pU, a1.pV, a1.kR, a1.kL, a1.applicationInfo, a1.pW, s, a1.pY, a1.pZ, a1.kO, a1.qa);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        du.a(this, parcel, i);
    }

}
