// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            Tile

public class w
    implements android.os.Parcelable.Creator
{

    public w()
    {
    }

    static void a(Tile tile, Parcel parcel, int i)
    {
        i = c.a(parcel);
        c.a(parcel, 1, tile.a());
        c.a(parcel, 2, tile.a);
        c.a(parcel, 3, tile.b);
        c.a(parcel, 4, tile.c, false);
        c.a(parcel, i);
    }

    public Tile a(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        byte abyte0[] = null;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.e(parcel, i1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.e(parcel, i1);
                    break;

                case 4: // '\004'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new Tile(i, j, k, abyte0);
            }
        } while (true);
    }

    public Tile[] a(int i)
    {
        return new Tile[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
