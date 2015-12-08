// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.e;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.e:
//            c

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    public static c a(Parcel parcel)
    {
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        com.google.android.m4b.maps.t.a a1 = null;
        int i = 0;
        byte abyte0[] = null;
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
                    a1 = (com.google.android.m4b.maps.t.a)com.google.android.m4b.maps.k.a.a(parcel, k, com.google.android.m4b.maps.t.a.CREATOR);
                    break;

                case 3: // '\003'
                    abyte0 = com.google.android.m4b.maps.k.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new c(i, a1, abyte0);
            }
        } while (true);
    }

    static void a(c c1, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, c1.a);
        b.a(parcel, 2, c1.b, i);
        b.a(parcel, 3, c1.c);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new c[i];
    }
}
