// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.l;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;

// Referenced classes of package com.google.android.m4b.maps.l:
//            a

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(com.google.android.m4b.maps.l.a a1, Parcel parcel)
    {
        int i = com.google.android.m4b.maps.k.b.a(parcel, 20293);
        com.google.android.m4b.maps.k.b.b(parcel, 1, a1.a);
        com.google.android.m4b.maps.k.b.a(parcel, 2, a1.b);
        com.google.android.m4b.maps.k.b.a(parcel, 4, a1.d);
        com.google.android.m4b.maps.k.b.a(parcel, 5, a1.e);
        com.google.android.m4b.maps.k.b.a(parcel, 6, a1.f);
        com.google.android.m4b.maps.k.b.a(parcel, 7, a1.g);
        com.google.android.m4b.maps.k.b.a(parcel, 8, a1.h);
        com.google.android.m4b.maps.k.b.a(parcel, 10, a1.j);
        com.google.android.m4b.maps.k.b.a(parcel, 11, a1.k);
        com.google.android.m4b.maps.k.b.b(parcel, 12, a1.c);
        com.google.android.m4b.maps.k.b.a(parcel, 13, a1.i);
        com.google.android.m4b.maps.k.b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.m4b.maps.k.a.a(parcel);
        int j = 0;
        long l3 = 0L;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        long l2 = 0L;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 3: // '\003'
                case 9: // '\t'
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.m4b.maps.k.a.f(parcel, l);
                    break;

                case 4: // '\004'
                    s5 = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;

                case 5: // '\005'
                    s4 = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;

                case 6: // '\006'
                    s3 = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;

                case 7: // '\007'
                    s2 = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;

                case 8: // '\b'
                    s1 = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;

                case 10: // '\n'
                    l2 = com.google.android.m4b.maps.k.a.f(parcel, l);
                    break;

                case 11: // '\013'
                    l1 = com.google.android.m4b.maps.k.a.f(parcel, l);
                    break;

                case 12: // '\f'
                    i = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 13: // '\r'
                    s = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new com.google.android.m4b.maps.l.a(j, l3, i, s5, s4, s3, s2, s1, s, l2, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new com.google.android.m4b.maps.l.a[i];
    }
}
