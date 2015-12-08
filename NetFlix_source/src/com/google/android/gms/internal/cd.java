// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ce, cb, dx

public class cd
    implements android.os.Parcelable.Creator
{

    public cd()
    {
    }

    static void a(ce ce1, Parcel parcel, int j)
    {
        int k = b.p(parcel);
        b.c(parcel, 1, ce1.versionCode);
        b.a(parcel, 2, ce1.og, j, false);
        b.a(parcel, 3, ce1.aO(), false);
        b.a(parcel, 4, ce1.aP(), false);
        b.a(parcel, 5, ce1.aQ(), false);
        b.a(parcel, 6, ce1.aR(), false);
        b.a(parcel, 7, ce1.ol, false);
        b.a(parcel, 8, ce1.om);
        b.a(parcel, 9, ce1.on, false);
        b.a(parcel, 10, ce1.aT(), false);
        b.c(parcel, 11, ce1.orientation);
        b.c(parcel, 12, ce1.op);
        b.a(parcel, 13, ce1.nO, false);
        b.a(parcel, 14, ce1.kK, j, false);
        b.a(parcel, 15, ce1.aS(), false);
        b.a(parcel, 16, ce1.or, false);
        b.F(parcel, k);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return e(parcel);
    }

    public ce e(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int l = 0;
        cb cb1 = null;
        android.os.IBinder ibinder5 = null;
        android.os.IBinder ibinder4 = null;
        android.os.IBinder ibinder3 = null;
        android.os.IBinder ibinder2 = null;
        String s3 = null;
        boolean flag = false;
        String s2 = null;
        android.os.IBinder ibinder1 = null;
        int k = 0;
        int j = 0;
        String s1 = null;
        dx dx1 = null;
        android.os.IBinder ibinder = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    cb1 = (cb)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, cb.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 4: // '\004'
                    ibinder4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 5: // '\005'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 6: // '\006'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 7: // '\007'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, j1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, j1);
                    break;

                case 10: // '\n'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 12: // '\f'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 13: // '\r'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, j1);
                    break;

                case 14: // '\016'
                    dx1 = (dx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, dx.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 16: // '\020'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new ce(l, cb1, ibinder5, ibinder4, ibinder3, ibinder2, s3, flag, s2, ibinder1, k, j, s1, dx1, ibinder, s);
            }
        } while (true);
    }

    public ce[] i(int j)
    {
        return new ce[j];
    }

    public Object[] newArray(int j)
    {
        return i(j);
    }
}
