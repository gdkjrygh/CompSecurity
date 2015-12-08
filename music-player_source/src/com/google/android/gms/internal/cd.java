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
//            cz, cy, z, ab, 
//            db

public final class cd
    implements SafeParcelable
{

    public static final cz a = new cz();
    public final int b;
    public final Bundle c;
    public final z d;
    public final ab e;
    public final String f;
    public final ApplicationInfo g;
    public final PackageInfo h;
    public final String i;
    public final String j;
    public final String k;
    public final db l;
    public final Bundle m;

    cd(int i1, Bundle bundle, z z, ab ab, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, db db, Bundle bundle1)
    {
        b = i1;
        c = bundle;
        d = z;
        e = ab;
        f = s;
        g = applicationinfo;
        h = packageinfo;
        i = s1;
        j = s2;
        k = s3;
        l = db;
        m = bundle1;
    }

    private cd(Bundle bundle, z z, ab ab, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, db db, Bundle bundle1)
    {
        this(2, bundle, z, ab, s, applicationinfo, packageinfo, s1, s2, s3, db, bundle1);
    }

    public cd(cy cy1, String s)
    {
        this(cy1.a, cy1.b, cy1.c, cy1.d, cy1.e, cy1.f, s, cy1.g, cy1.h, cy1.j, cy1.i);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        cz.a(this, parcel, i1);
    }

}
