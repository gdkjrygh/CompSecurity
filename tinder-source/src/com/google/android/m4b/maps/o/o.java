// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.o:
//            m

public final class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    public static m a(Parcel parcel)
    {
        int i = 1;
        int i1 = com.google.android.m4b.maps.k.a.a(parcel);
        int l = 0;
        int k = 1000;
        long l1 = 0L;
        int j = 1;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    j = com.google.android.m4b.maps.k.a.e(parcel, j1);
                    break;

                case 2: // '\002'
                    i = com.google.android.m4b.maps.k.a.e(parcel, j1);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.m4b.maps.k.a.f(parcel, j1);
                    break;

                case 4: // '\004'
                    k = com.google.android.m4b.maps.k.a.e(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.m4b.maps.k.a.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new m(l, k, j, i, l1);
            }
        } while (true);
    }

    static void a(m m1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, m1.b);
        b.b(parcel, 2, m1.c);
        b.a(parcel, 3, m1.d);
        b.b(parcel, 4, m1.e);
        b.b(parcel, 1000, m1.a);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new m[i];
    }
}
