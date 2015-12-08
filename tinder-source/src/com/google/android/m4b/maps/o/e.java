// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.o:
//            c

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(c c1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, c1.b);
        b.b(parcel, 2, c1.c);
        b.b(parcel, 1000, c1.a);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.m4b.maps.k.a.a(parcel);
        int j = 0;
        int i = 0;
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
                    k = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new c(i, j, k);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new c[i];
    }
}
