// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.graphics.Point;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.internal:
//            y

public final class z
    implements android.os.Parcelable.Creator
{

    public z()
    {
    }

    static void a(y y1, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, y1.getVersionCode());
        b.a(parcel, 2, y1.qo(), i, false);
        b.J(parcel, j);
    }

    public static y gl(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        Point point = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    point = (Point)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Point.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new y(i, point);
            }
        } while (true);
    }

    private static y[] iK(int i)
    {
        return new y[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gl(parcel);
    }

    public final Object[] newArray(int i)
    {
        return iK(i);
    }
}
