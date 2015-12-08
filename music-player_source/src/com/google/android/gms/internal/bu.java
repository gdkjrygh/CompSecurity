// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            bq, bn, db

public final class bu
    implements android.os.Parcelable.Creator
{

    public bu()
    {
    }

    static void a(bq bq1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, bq1.b);
        c.a(parcel, 2, bq1.c, i, false);
        c.a(parcel, 3, bq1.a());
        c.a(parcel, 4, bq1.b());
        c.a(parcel, 5, bq1.c());
        c.a(parcel, 6, bq1.d());
        c.a(parcel, 7, bq1.h, false);
        c.a(parcel, 8, bq1.i);
        c.a(parcel, 9, bq1.j, false);
        c.a(parcel, 10, bq1.e());
        c.a(parcel, 11, bq1.l);
        c.a(parcel, 12, bq1.m);
        c.a(parcel, 13, bq1.n, false);
        c.a(parcel, 14, bq1.o, i, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k = 0;
        bn bn1 = null;
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
        db db1 = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    bn1 = (bn)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, com.google.android.gms.internal.bn.a);
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
                    db1 = (db)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, com.google.android.gms.internal.db.a);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new bq(k, bn1, ibinder4, ibinder3, ibinder2, ibinder1, s2, flag, s1, ibinder, j, i, s, db1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new bq[i];
    }
}
