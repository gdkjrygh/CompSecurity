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
//            fh, av, ay, gs

public class fi
    implements android.os.Parcelable.Creator
{

    public fi()
    {
    }

    static void a(fh fh1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, fh1.versionCode);
        b.a(parcel, 2, fh1.tK, false);
        b.a(parcel, 3, fh1.tL, i, false);
        b.a(parcel, 4, fh1.lS, i, false);
        b.a(parcel, 5, fh1.lL, false);
        b.a(parcel, 6, fh1.applicationInfo, i, false);
        b.a(parcel, 7, fh1.tM, i, false);
        b.a(parcel, 8, fh1.tN, false);
        b.a(parcel, 9, fh1.tO, false);
        b.a(parcel, 10, fh1.tP, false);
        b.a(parcel, 11, fh1.lO, i, false);
        b.a(parcel, 12, fh1.tQ, false);
        b.c(parcel, 13, fh1.tR);
        b.b(parcel, 14, fh1.mc, false);
        b.a(parcel, 15, fh1.tS, false);
        b.a(parcel, 16, fh1.tT);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return h(parcel);
    }

    public fh h(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
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
        gs gs1 = null;
        android.os.Bundle bundle1 = null;
        int i = 0;
        java.util.ArrayList arraylist = null;
        android.os.Bundle bundle = null;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
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
                    gs1 = (gs)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, gs.CREATOR);
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
                return new fh(j, bundle2, av1, ay1, s3, applicationinfo, packageinfo, s2, s1, s, gs1, bundle1, i, arraylist, bundle, flag);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return q(i);
    }

    public fh[] q(int i)
    {
        return new fh[i];
    }
}
