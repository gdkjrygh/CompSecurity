// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.o:
//            c, a

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    public static com.google.android.m4b.maps.o.a a(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int k = com.google.android.m4b.maps.k.a.a(parcel);
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.m4b.maps.k.a.c(parcel, l, c.CREATOR);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.m4b.maps.k.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.m4b.maps.k.a.f(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new com.google.android.m4b.maps.o.a(j, arraylist, l2, l1, i);
            }
        } while (true);
    }

    static void a(com.google.android.m4b.maps.o.a a1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.a(parcel, 1, a1.b);
        b.a(parcel, 2, a1.c);
        b.a(parcel, 3, a1.d);
        b.b(parcel, 4, a1.e);
        b.b(parcel, 1000, a1.a);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new com.google.android.m4b.maps.o.a[i];
    }
}
