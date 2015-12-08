// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            dm, dj, gt, x

public class dl
    implements android.os.Parcelable.Creator
{

    public dl()
    {
    }

    static void a(dm dm1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.c(parcel, 1, dm1.versionCode);
        b.a(parcel, 2, dm1.rK, i, false);
        b.a(parcel, 3, dm1.cb(), false);
        b.a(parcel, 4, dm1.cc(), false);
        b.a(parcel, 5, dm1.cd(), false);
        b.a(parcel, 6, dm1.ce(), false);
        b.a(parcel, 7, dm1.rP, false);
        b.a(parcel, 8, dm1.rQ);
        b.a(parcel, 9, dm1.rR, false);
        b.a(parcel, 10, dm1.cg(), false);
        b.c(parcel, 11, dm1.orientation);
        b.c(parcel, 12, dm1.rT);
        b.a(parcel, 13, dm1.rq, false);
        b.a(parcel, 14, dm1.lD, i, false);
        b.a(parcel, 15, dm1.cf(), false);
        b.a(parcel, 17, dm1.rW, i, false);
        b.a(parcel, 16, dm1.rV, false);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return f(parcel);
    }

    public dm f(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int k = 0;
        dj dj1 = null;
        android.os.IBinder ibinder5 = null;
        android.os.IBinder ibinder4 = null;
        android.os.IBinder ibinder3 = null;
        android.os.IBinder ibinder2 = null;
        String s3 = null;
        boolean flag = false;
        String s2 = null;
        android.os.IBinder ibinder1 = null;
        int j = 0;
        int i = 0;
        String s1 = null;
        gt gt1 = null;
        android.os.IBinder ibinder = null;
        String s = null;
        x x1 = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    dj1 = (dj)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, dj.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder5 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 4: // '\004'
                    ibinder4 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 6: // '\006'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 7: // '\007'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 10: // '\n'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 11: // '\013'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 13: // '\r'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 14: // '\016'
                    gt1 = (gt)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, gt.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 17: // '\021'
                    x1 = (x)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, x.CREATOR);
                    break;

                case 16: // '\020'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new dm(k, dj1, ibinder5, ibinder4, ibinder3, ibinder2, s3, flag, s2, ibinder1, j, i, s1, gt1, ibinder, s, x1);
            }
        } while (true);
    }

    public dm[] m(int i)
    {
        return new dm[i];
    }

    public Object[] newArray(int i)
    {
        return m(i);
    }
}
