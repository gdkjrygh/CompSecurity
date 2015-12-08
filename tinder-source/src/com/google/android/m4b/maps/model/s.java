// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            Tile

public final class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    public static Tile a(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.m4b.maps.k.a.a(parcel);
        byte abyte0[] = null;
        int j = 0;
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
                    i = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 3: // '\003'
                    k = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 4: // '\004'
                    abyte0 = com.google.android.m4b.maps.k.a.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new Tile(i, j, k, abyte0);
            }
        } while (true);
    }

    static void a(Tile tile, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, tile.a);
        b.b(parcel, 2, tile.b);
        b.b(parcel, 3, tile.c);
        b.a(parcel, 4, tile.d);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Tile[i];
    }
}
