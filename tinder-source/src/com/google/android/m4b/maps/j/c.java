// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.Parcel;
import com.google.android.m4b.maps.h.o;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.j:
//            aa

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(aa aa1, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, aa1.a);
        b.b(parcel, 2, aa1.b);
        b.a(parcel, 3, aa1.c);
        b.a(parcel, 4, aa1.d, i);
        b.a(parcel, 5, aa1.e);
        b.a(parcel, 6, aa1.f);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.m4b.maps.k.a.a(parcel);
        android.os.Bundle bundle = null;
        o ao[] = null;
        android.os.IBinder ibinder = null;
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
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 3: // '\003'
                    ibinder = com.google.android.m4b.maps.k.a.j(parcel, l);
                    break;

                case 4: // '\004'
                    ao = (o[])com.google.android.m4b.maps.k.a.b(parcel, l, o.CREATOR);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.m4b.maps.k.a.k(parcel, l);
                    break;

                case 6: // '\006'
                    s = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new aa(j, i, ibinder, ao, bundle, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new aa[i];
    }
}
