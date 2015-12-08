// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            cx, ah, ak, dx

public class cy
    implements android.os.Parcelable.Creator
{

    public cy()
    {
    }

    static void a(cx cx1, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, cx1.versionCode);
        b.a(parcel, 2, cx1.pf, false);
        b.a(parcel, 3, cx1.pg, i, false);
        b.a(parcel, 4, cx1.kN, i, false);
        b.a(parcel, 5, cx1.kH, false);
        b.a(parcel, 6, cx1.applicationInfo, i, false);
        b.a(parcel, 7, cx1.ph, i, false);
        b.a(parcel, 8, cx1.pi, false);
        b.a(parcel, 9, cx1.pj, false);
        b.a(parcel, 10, cx1.pk, false);
        b.a(parcel, 11, cx1.kK, i, false);
        b.a(parcel, 12, cx1.pl, false);
        b.F(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return f(parcel);
    }

    public cx f(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        android.os.Bundle bundle1 = null;
        ah ah1 = null;
        ak ak1 = null;
        String s3 = null;
        ApplicationInfo applicationinfo = null;
        PackageInfo packageinfo = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        dx dx1 = null;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 3: // '\003'
                    ah1 = (ah)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ah.CREATOR);
                    break;

                case 4: // '\004'
                    ak1 = (ak)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ak.CREATOR);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 11: // '\013'
                    dx1 = (dx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, dx.CREATOR);
                    break;

                case 12: // '\f'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new cx(i, bundle1, ah1, ak1, s3, applicationinfo, packageinfo, s2, s1, s, dx1, bundle);
            }
        } while (true);
    }

    public cx[] k(int i)
    {
        return new cx[i];
    }

    public Object[] newArray(int i)
    {
        return k(i);
    }
}
