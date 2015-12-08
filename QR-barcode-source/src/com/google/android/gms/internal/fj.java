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
//            fi, av, ay, gt

public class fj
    implements android.os.Parcelable.Creator
{

    public fj()
    {
    }

    static void a(fi fi1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.c(parcel, 1, fi1.versionCode);
        b.a(parcel, 2, fi1.tw, false);
        b.a(parcel, 3, fi1.tx, i, false);
        b.a(parcel, 4, fi1.lH, i, false);
        b.a(parcel, 5, fi1.lA, false);
        b.a(parcel, 6, fi1.applicationInfo, i, false);
        b.a(parcel, 7, fi1.ty, i, false);
        b.a(parcel, 8, fi1.tz, false);
        b.a(parcel, 9, fi1.tA, false);
        b.a(parcel, 10, fi1.tB, false);
        b.a(parcel, 11, fi1.lD, i, false);
        b.a(parcel, 12, fi1.tC, false);
        b.c(parcel, 13, fi1.tD);
        b.b(parcel, 14, fi1.lS, false);
        b.a(parcel, 15, fi1.tE, false);
        b.a(parcel, 16, fi1.tF);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return h(parcel);
    }

    public fi h(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int j = 0;
        android.os.Bundle bundle2 = null;
        av av1 = null;
        ay ay1 = null;
        String s3 = null;
        ApplicationInfo applicationinfo = null;
        PackageInfo packageinfo = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        gt gt1 = null;
        android.os.Bundle bundle1 = null;
        int i = 0;
        java.util.ArrayList arraylist = null;
        android.os.Bundle bundle = null;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    bundle2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l);
                    break;

                case 3: // '\003'
                    av1 = (av)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, av.CREATOR);
                    break;

                case 4: // '\004'
                    ay1 = (ay)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ay.CREATOR);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 11: // '\013'
                    gt1 = (gt)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, gt.CREATOR);
                    break;

                case 12: // '\f'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l);
                    break;

                case 13: // '\r'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 14: // '\016'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, l);
                    break;

                case 15: // '\017'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l);
                    break;

                case 16: // '\020'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new fi(j, bundle2, av1, ay1, s3, applicationinfo, packageinfo, s2, s1, s, gt1, bundle1, i, arraylist, bundle, flag);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return p(i);
    }

    public fi[] p(int i)
    {
        return new fi[i];
    }
}
