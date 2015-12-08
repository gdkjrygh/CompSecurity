// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.v;

import android.os.Parcel;
import com.google.android.m4b.maps.h.o;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.v:
//            d

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(d d1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, d1.a);
        b.a(parcel, 2, d1.b);
        b.a(parcel, 3, d1.c);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
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
                    flag = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.m4b.maps.k.a.c(parcel, k, o.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new d(i, flag, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new d[i];
    }
}
