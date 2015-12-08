// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            ab

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    public static ab a(Parcel parcel)
    {
        ab aab[] = null;
        int i = 0;
        int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        boolean flag = false;
        int k = 0;
        int l = 0;
        String s = null;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 8: // '\b'
                    aab = (ab[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1, com.google.android.gms.internal.ab.a);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new ab(i1, s, l, k, flag, j, i, aab);
            }
        } while (true);
    }

    static void a(ab ab1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, ab1.b);
        c.a(parcel, 2, ab1.c, false);
        c.a(parcel, 3, ab1.d);
        c.a(parcel, 4, ab1.e);
        c.a(parcel, 5, ab1.f);
        c.a(parcel, 6, ab1.g);
        c.a(parcel, 7, ab1.h);
        c.a(parcel, 8, ab1.i, i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ab[i];
    }
}
