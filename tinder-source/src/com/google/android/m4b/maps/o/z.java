// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.h.q;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.o:
//            w, y

public final class z
    implements android.os.Parcelable.Creator
{

    public z()
    {
    }

    static void a(w w1, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.a(parcel, 1, w1.b, i);
        b.a(parcel, 2, w1.c, i);
        b.b(parcel, 1000, w1.a);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        q q1 = null;
        int i = 0;
        y y1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    q1 = (q)com.google.android.m4b.maps.k.a.a(parcel, k, q.CREATOR);
                    break;

                case 2: // '\002'
                    y1 = (y)com.google.android.m4b.maps.k.a.a(parcel, k, y.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.m4b.maps.k.a.e(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new w(i, q1, y1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new w[i];
    }
}
