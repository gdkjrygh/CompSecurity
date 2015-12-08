// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            bh, be, co

public class bg
    implements android.os.Parcelable.Creator
{

    public bg()
    {
    }

    static void a(bh bh1, Parcel parcel, int i)
    {
        int j = b.k(parcel);
        b.c(parcel, 1, bh1.versionCode);
        b.a(parcel, 2, bh1.fR, i, false);
        b.a(parcel, 3, bh1.U(), false);
        b.a(parcel, 4, bh1.V(), false);
        b.a(parcel, 5, bh1.W(), false);
        b.a(parcel, 6, bh1.X(), false);
        b.a(parcel, 7, bh1.fW, false);
        b.a(parcel, 8, bh1.fX);
        b.a(parcel, 9, bh1.fY, false);
        b.a(parcel, 10, bh1.Y(), false);
        b.c(parcel, 11, bh1.orientation);
        b.c(parcel, 12, bh1.ga);
        b.a(parcel, 13, bh1.fz, false);
        b.a(parcel, 14, bh1.eg, i, false);
        b.C(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return d(parcel);
    }

    public bh d(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int k = 0;
        be be1 = null;
        android.os.IBinder ibinder4 = null;
        android.os.IBinder ibinder3 = null;
        android.os.IBinder ibinder2 = null;
        android.os.IBinder ibinder1 = null;
        String s2 = null;
        boolean flag = false;
        String s1 = null;
        android.os.IBinder ibinder = null;
        int j = 0;
        int i = 0;
        String s = null;
        co co1 = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    be1 = (be)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, be.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 4: // '\004'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 6: // '\006'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 7: // '\007'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 10: // '\n'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 11: // '\013'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 13: // '\r'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 14: // '\016'
                    co1 = (co)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, co.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new bh(k, be1, ibinder4, ibinder3, ibinder2, ibinder1, s2, flag, s1, ibinder, j, i, s, co1);
            }
        } while (true);
    }

    public bh[] h(int i)
    {
        return new bh[i];
    }

    public Object[] newArray(int i)
    {
        return h(i);
    }
}
