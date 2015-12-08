// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.j;
import com.google.android.gms.b.m;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzeo, zzek, zzhy, zzx

public final class cu
    implements android.os.Parcelable.Creator
{

    public cu()
    {
    }

    static void a(zzeo zzeo1, Parcel parcel, int i)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, zzeo1.a);
        c.a(parcel, 2, zzeo1.b, i);
        c.a(parcel, 3, m.a(zzeo1.c).asBinder());
        c.a(parcel, 4, m.a(zzeo1.d).asBinder());
        c.a(parcel, 5, m.a(zzeo1.e).asBinder());
        c.a(parcel, 6, m.a(zzeo1.f).asBinder());
        c.a(parcel, 7, zzeo1.g);
        c.a(parcel, 8, zzeo1.h);
        c.a(parcel, 9, zzeo1.i);
        c.a(parcel, 10, m.a(zzeo1.j).asBinder());
        c.a(parcel, 11, zzeo1.k);
        c.a(parcel, 12, zzeo1.l);
        c.a(parcel, 13, zzeo1.m);
        c.a(parcel, 14, zzeo1.n, i);
        c.a(parcel, 15, m.a(zzeo1.o).asBinder());
        c.a(parcel, 17, zzeo1.q, i);
        c.a(parcel, 16, zzeo1.p);
        c.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int l = 0;
        zzek zzek1 = null;
        android.os.IBinder ibinder5 = null;
        android.os.IBinder ibinder4 = null;
        android.os.IBinder ibinder3 = null;
        android.os.IBinder ibinder2 = null;
        String s3 = null;
        boolean flag = false;
        String s2 = null;
        android.os.IBinder ibinder1 = null;
        int k = 0;
        int i = 0;
        String s1 = null;
        zzhy zzhy1 = null;
        android.os.IBinder ibinder = null;
        String s = null;
        zzx zzx1 = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    zzek1 = (zzek)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, zzek.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 4: // '\004'
                    ibinder4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 5: // '\005'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 6: // '\006'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 7: // '\007'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 10: // '\n'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 13: // '\r'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 14: // '\016'
                    zzhy1 = (zzhy)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, zzhy.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 17: // '\021'
                    zzx1 = (zzx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, zzx.CREATOR);
                    break;

                case 16: // '\020'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new zzeo(l, zzek1, ibinder5, ibinder4, ibinder3, ibinder2, s3, flag, s2, ibinder1, k, i, s1, zzhy1, ibinder, s, zzx1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzeo[i];
    }
}
