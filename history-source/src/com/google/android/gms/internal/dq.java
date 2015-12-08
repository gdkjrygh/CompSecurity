// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            dr, do, gs, y

public class dq
    implements android.os.Parcelable.Creator
{

    public dq()
    {
    }

    static void a(dr dr1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, dr1.versionCode);
        b.a(parcel, 2, dr1.sb, i, false);
        b.a(parcel, 3, dr1.ck(), false);
        b.a(parcel, 4, dr1.cl(), false);
        b.a(parcel, 5, dr1.cm(), false);
        b.a(parcel, 6, dr1.cn(), false);
        b.a(parcel, 7, dr1.sg, false);
        b.a(parcel, 8, dr1.sh);
        b.a(parcel, 9, dr1.si, false);
        b.a(parcel, 10, dr1.cp(), false);
        b.c(parcel, 11, dr1.orientation);
        b.c(parcel, 12, dr1.sk);
        b.a(parcel, 13, dr1.rH, false);
        b.a(parcel, 14, dr1.lO, i, false);
        b.a(parcel, 15, dr1.co(), false);
        b.a(parcel, 17, dr1.sn, i, false);
        b.a(parcel, 16, dr1.sm, false);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return f(parcel);
    }

    public dr f(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int k = 0;
        do do1 = null;
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
        gs gs1 = null;
        android.os.IBinder ibinder = null;
        String s = null;
        y y1 = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    do1 = (do)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, do.CREATOR);
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
                    gs1 = (gs)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, gs.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 17: // '\021'
                    y1 = (y)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, y.CREATOR);
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
                return new dr(k, do1, ibinder5, ibinder4, ibinder3, ibinder2, s3, flag, s2, ibinder1, j, i, s1, gs1, ibinder, s, y1);
            }
        } while (true);
    }

    public dr[] n(int i)
    {
        return new dr[i];
    }

    public Object[] newArray(int i)
    {
        return n(i);
    }
}
