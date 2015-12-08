// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;
import com.google.android.m4b.maps.q.n;

// Referenced classes of package com.google.android.m4b.maps.o:
//            g

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(g g1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.a(parcel, 1, g1.b);
        b.b(parcel, 2, g1.c);
        b.b(parcel, 1000, g1.a);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.m4b.maps.k.a.a(parcel);
        java.util.ArrayList arraylist = null;
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
                    arraylist = com.google.android.m4b.maps.k.a.c(parcel, i1, n.CREATOR);
                    break;

                case 2: // '\002'
                    k = com.google.android.m4b.maps.k.a.e(parcel, i1);
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
                return new g(i, arraylist, k);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new g[i];
    }
}
