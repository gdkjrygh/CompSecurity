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
//            dt, aj, am, ew

public class du
    implements android.os.Parcelable.Creator
{

    public du()
    {
    }

    static void a(dt dt1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, dt1.versionCode);
        b.a(parcel, 2, dt1.pU, false);
        b.a(parcel, 3, dt1.pV, i, false);
        b.a(parcel, 4, dt1.kR, i, false);
        b.a(parcel, 5, dt1.kL, false);
        b.a(parcel, 6, dt1.applicationInfo, i, false);
        b.a(parcel, 7, dt1.pW, i, false);
        b.a(parcel, 8, dt1.pX, false);
        b.a(parcel, 9, dt1.pY, false);
        b.a(parcel, 10, dt1.pZ, false);
        b.a(parcel, 11, dt1.kO, i, false);
        b.a(parcel, 12, dt1.qa, false);
        b.G(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return h(parcel);
    }

    public dt h(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        android.os.Bundle bundle1 = null;
        aj aj1 = null;
        am am1 = null;
        String s3 = null;
        ApplicationInfo applicationinfo = null;
        PackageInfo packageinfo = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        ew ew1 = null;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;

                case 3: // '\003'
                    aj1 = (aj)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, aj.CREATOR);
                    break;

                case 4: // '\004'
                    am1 = (am)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, am.CREATOR);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 11: // '\013'
                    ew1 = (ew)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ew.CREATOR);
                    break;

                case 12: // '\f'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new dt(i, bundle1, aj1, am1, s3, applicationinfo, packageinfo, s2, s1, s, ew1, bundle);
            }
        } while (true);
    }

    public dt[] m(int i)
    {
        return new dt[i];
    }

    public Object[] newArray(int i)
    {
        return m(i);
    }
}
