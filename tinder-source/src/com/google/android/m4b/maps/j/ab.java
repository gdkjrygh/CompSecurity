// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.j:
//            y

public final class ab
    implements android.os.Parcelable.Creator
{

    public ab()
    {
    }

    static void a(y y1, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, y1.a);
        b.a(parcel, 2, y1.b);
        b.a(parcel, 3, y1.c, i);
        b.a(parcel, 4, y1.d);
        b.a(parcel, 5, y1.e);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        com.google.android.m4b.maps.g.a a1 = null;
        boolean flag = false;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        boolean flag1 = false;
        android.os.IBinder ibinder = null;
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
                    i = com.google.android.m4b.maps.k.a.e(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.m4b.maps.k.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    a1 = (com.google.android.m4b.maps.g.a)com.google.android.m4b.maps.k.a.a(parcel, k, com.google.android.m4b.maps.g.a.CREATOR);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new y(i, ibinder, a1, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new y[i];
    }
}
