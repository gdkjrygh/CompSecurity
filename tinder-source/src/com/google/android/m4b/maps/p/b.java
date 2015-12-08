// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.p;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;

// Referenced classes of package com.google.android.m4b.maps.p:
//            a

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(com.google.android.m4b.maps.p.a a1, Parcel parcel)
    {
        int i = com.google.android.m4b.maps.k.b.a(parcel, 20293);
        com.google.android.m4b.maps.k.b.b(parcel, 1, a1.b);
        com.google.android.m4b.maps.k.b.a(parcel, 2, a1.c);
        com.google.android.m4b.maps.k.b.a(parcel, 3, a1.d);
        com.google.android.m4b.maps.k.b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        String s = null;
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
                    s = com.google.android.m4b.maps.k.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new com.google.android.m4b.maps.p.a(i, flag, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new com.google.android.m4b.maps.p.a[i];
    }
}
