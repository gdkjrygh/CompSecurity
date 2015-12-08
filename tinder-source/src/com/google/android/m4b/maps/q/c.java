// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.q:
//            b

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(com.google.android.m4b.maps.q.b b1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, b1.b);
        b.a(parcel, 2, b1.c);
        b.b(parcel, 1000, b1.a);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.m4b.maps.k.a.a(parcel);
        String s = null;
        int i = 0;
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
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new com.google.android.m4b.maps.q.b(i, j, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new com.google.android.m4b.maps.q.b[i];
    }
}
