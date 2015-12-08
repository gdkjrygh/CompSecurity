// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.q:
//            n

public final class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(n n1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.a(parcel, 1, n1.b);
        b.a(parcel, 2, n1.c);
        short word0 = n1.d;
        b.a(parcel, 3, 4);
        parcel.writeInt(word0);
        b.a(parcel, 4, n1.e);
        b.a(parcel, 5, n1.f);
        b.a(parcel, 6, n1.g);
        b.b(parcel, 7, n1.h);
        b.b(parcel, 1000, n1.a);
        b.b(parcel, 8, n1.i);
        b.b(parcel, 9, n1.j);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i1 = com.google.android.m4b.maps.k.a.a(parcel);
        int l = 0;
        String s = null;
        int k = 0;
        short word0 = 0;
        double d1 = 0.0D;
        double d = 0.0D;
        float f = 0.0F;
        long l1 = 0L;
        int j = 0;
        int i = -1;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s = com.google.android.m4b.maps.k.a.i(parcel, j1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.m4b.maps.k.a.f(parcel, j1);
                    break;

                case 3: // '\003'
                    com.google.android.m4b.maps.k.a.a(parcel, j1, 4);
                    word0 = (short)parcel.readInt();
                    break;

                case 4: // '\004'
                    d1 = com.google.android.m4b.maps.k.a.h(parcel, j1);
                    break;

                case 5: // '\005'
                    d = com.google.android.m4b.maps.k.a.h(parcel, j1);
                    break;

                case 6: // '\006'
                    f = com.google.android.m4b.maps.k.a.g(parcel, j1);
                    break;

                case 7: // '\007'
                    k = com.google.android.m4b.maps.k.a.e(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.m4b.maps.k.a.e(parcel, j1);
                    break;

                case 8: // '\b'
                    j = com.google.android.m4b.maps.k.a.e(parcel, j1);
                    break;

                case 9: // '\t'
                    i = com.google.android.m4b.maps.k.a.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new n(l, s, k, word0, d1, d, f, l1, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new n[i];
    }
}
