// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;
import com.google.android.m4b.maps.o.p;

// Referenced classes of package com.google.android.m4b.maps.q:
//            j, b

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    public static j a(Parcel parcel)
    {
        String s = null;
        boolean flag = true;
        boolean flag2 = false;
        int l = com.google.android.m4b.maps.k.a.a(parcel);
        Object obj = com.google.android.m4b.maps.q.j.a;
        boolean flag1 = true;
        p p1 = null;
        int i = 0;
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
                    p1 = (p)com.google.android.m4b.maps.k.a.a(parcel, i1, p.CREATOR);
                    break;

                case 2: // '\002'
                    flag2 = com.google.android.m4b.maps.k.a.c(parcel, i1);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.m4b.maps.k.a.c(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.m4b.maps.k.a.c(parcel, i1);
                    break;

                case 5: // '\005'
                    obj = com.google.android.m4b.maps.k.a.c(parcel, i1, b.CREATOR);
                    break;

                case 6: // '\006'
                    s = com.google.android.m4b.maps.k.a.i(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new j(i, p1, flag2, flag1, flag, ((java.util.List) (obj)), s);
            }
        } while (true);
    }

    static void a(j j1, Parcel parcel, int i)
    {
        int l = b.a(parcel, 20293);
        b.a(parcel, 1, j1.c, i);
        b.a(parcel, 2, j1.d);
        b.a(parcel, 3, j1.e);
        b.a(parcel, 4, j1.f);
        b.a(parcel, 5, j1.g);
        b.a(parcel, 6, j1.h);
        b.b(parcel, 1000, j1.b);
        b.b(parcel, l);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new j[i];
    }
}
