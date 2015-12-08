// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.t;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;

// Referenced classes of package com.google.android.m4b.maps.t:
//            a

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(com.google.android.m4b.maps.t.a a1, Parcel parcel)
    {
        int i = com.google.android.m4b.maps.k.b.a(parcel, 20293);
        com.google.android.m4b.maps.k.b.b(parcel, 1, a1.a);
        com.google.android.m4b.maps.k.b.a(parcel, 2, a1.b);
        com.google.android.m4b.maps.k.b.b(parcel, 3, a1.c);
        com.google.android.m4b.maps.k.b.b(parcel, 4, a1.d);
        com.google.android.m4b.maps.k.b.a(parcel, 5, a1.e);
        com.google.android.m4b.maps.k.b.a(parcel, 6, a1.f);
        com.google.android.m4b.maps.k.b.a(parcel, 7, a1.g);
        com.google.android.m4b.maps.k.b.a(parcel, 8, a1.h);
        com.google.android.m4b.maps.k.b.a(parcel, 9, a1.i);
        com.google.android.m4b.maps.k.b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = com.google.android.m4b.maps.k.a.a(parcel);
        boolean flag1 = true;
        String s1 = null;
        String s2 = null;
        int i = 0;
        int j = 0;
        String s3 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.m4b.maps.k.a.i(parcel, i1);
                    break;

                case 3: // '\003'
                    j = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.m4b.maps.k.a.i(parcel, i1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.m4b.maps.k.a.i(parcel, i1);
                    break;

                case 7: // '\007'
                    flag1 = com.google.android.m4b.maps.k.a.c(parcel, i1);
                    break;

                case 8: // '\b'
                    s = com.google.android.m4b.maps.k.a.i(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = com.google.android.m4b.maps.k.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new com.google.android.m4b.maps.t.a(k, s3, j, i, s2, s1, flag1, s, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new com.google.android.m4b.maps.t.a[i];
    }
}
