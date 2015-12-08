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
//            bu, v, x, co

public class bv
    implements android.os.Parcelable.Creator
{

    public bv()
    {
    }

    static void a(bu bu1, Parcel parcel, int j)
    {
        int k = b.k(parcel);
        b.c(parcel, 1, bu1.versionCode);
        b.a(parcel, 2, bu1.gA, false);
        b.a(parcel, 3, bu1.gB, j, false);
        b.a(parcel, 4, bu1.ed, j, false);
        b.a(parcel, 5, bu1.adUnitId, false);
        b.a(parcel, 6, bu1.applicationInfo, j, false);
        b.a(parcel, 7, bu1.gC, j, false);
        b.a(parcel, 8, bu1.gD, false);
        b.a(parcel, 9, bu1.gE, false);
        b.a(parcel, 10, bu1.gF, false);
        b.a(parcel, 11, bu1.eg, j, false);
        b.C(parcel, k);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return e(parcel);
    }

    public bu e(Parcel parcel)
    {
        co co1 = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int j = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        PackageInfo packageinfo = null;
        ApplicationInfo applicationinfo = null;
        String s3 = null;
        x x1 = null;
        v v1 = null;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 3: // '\003'
                    v1 = (v)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, v.CREATOR);
                    break;

                case 4: // '\004'
                    x1 = (x)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, x.CREATOR);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 11: // '\013'
                    co1 = (co)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, co.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new bu(j, bundle, v1, x1, s3, applicationinfo, packageinfo, s2, s1, s, co1);
            }
        } while (true);
    }

    public bu[] i(int j)
    {
        return new bu[j];
    }

    public Object[] newArray(int j)
    {
        return i(j);
    }
}
