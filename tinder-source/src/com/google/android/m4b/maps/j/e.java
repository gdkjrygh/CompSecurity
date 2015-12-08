// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.Parcel;
import com.google.android.m4b.maps.h.o;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.j:
//            b

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(com.google.android.m4b.maps.j.b b1, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, b1.a);
        b.a(parcel, 2, b1.b);
        b.a(parcel, 3, b1.c, i);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        o ao[] = null;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
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
                    i = com.google.android.m4b.maps.k.a.e(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.m4b.maps.k.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    ao = (o[])com.google.android.m4b.maps.k.a.b(parcel, k, o.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new com.google.android.m4b.maps.j.b(i, ibinder, ao);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new com.google.android.m4b.maps.j.b[i];
    }
}
