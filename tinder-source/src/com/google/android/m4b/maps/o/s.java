// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.o:
//            p

public final class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    public static p a(Parcel parcel)
    {
        int l = com.google.android.m4b.maps.k.a.a(parcel);
        int k = 0;
        int j = 102;
        long l4 = 0x36ee80L;
        long l3 = 0x927c0L;
        boolean flag = false;
        long l2 = 0x7fffffffffffffffL;
        int i = 0x7fffffff;
        float f = 0.0F;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 2: // '\002'
                    l4 = com.google.android.m4b.maps.k.a.f(parcel, i1);
                    break;

                case 3: // '\003'
                    l3 = com.google.android.m4b.maps.k.a.f(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.m4b.maps.k.a.c(parcel, i1);
                    break;

                case 5: // '\005'
                    l2 = com.google.android.m4b.maps.k.a.f(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 7: // '\007'
                    f = com.google.android.m4b.maps.k.a.g(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = com.google.android.m4b.maps.k.a.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new p(k, j, l4, l3, flag, l2, i, f, l1);
            }
        } while (true);
    }

    static void a(p p1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, p1.b);
        b.a(parcel, 2, p1.c);
        b.a(parcel, 3, p1.d);
        b.a(parcel, 4, p1.e);
        b.a(parcel, 5, p1.f);
        b.b(parcel, 6, p1.g);
        b.a(parcel, 7, p1.h);
        b.b(parcel, 1000, p1.a);
        b.a(parcel, 8, p1.i);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new p[i];
    }
}
