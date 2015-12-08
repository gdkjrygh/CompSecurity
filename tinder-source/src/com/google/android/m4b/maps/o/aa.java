// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.o:
//            y

public final class aa
    implements android.os.Parcelable.Creator
{

    public aa()
    {
    }

    static void a(y y1, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.a(parcel, 1, y1.b);
        b.a(parcel, 2, y1.c);
        b.a(parcel, 3, y1.d);
        b.a(parcel, 4, y1.e);
        b.a(parcel, 5, y1.f);
        b.a(parcel, 6, y1.g);
        b.a(parcel, 7, y1.h);
        b.b(parcel, 1000, y1.a);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
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
                    flag6 = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 2: // '\002'
                    flag5 = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag4 = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag3 = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag2 = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 7: // '\007'
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
                return new y(i, flag6, flag5, flag4, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new y[i];
    }
}
