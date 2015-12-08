// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;
import java.util.Collections;

// Referenced classes of package com.google.android.m4b.maps.o:
//            u, p

public final class x
    implements android.os.Parcelable.Creator
{

    public x()
    {
    }

    static void a(u u1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.a(parcel, 1, Collections.unmodifiableList(u1.b));
        b.a(parcel, 2, u1.c);
        b.a(parcel, 3, u1.d);
        b.a(parcel, 4, u1.e);
        b.b(parcel, 1000, u1.a);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        boolean flag2 = false;
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
                    arraylist = com.google.android.m4b.maps.k.a.c(parcel, k, p.CREATOR);
                    break;

                case 2: // '\002'
                    flag2 = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.m4b.maps.k.a.e(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new u(i, arraylist, flag2, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new u[i];
    }
}
