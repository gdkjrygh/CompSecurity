// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.h:
//            o

public final class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(o o1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, o1.a);
        b.a(parcel, 2, o1.b);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.m4b.maps.k.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new o(i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new o[i];
    }
}
