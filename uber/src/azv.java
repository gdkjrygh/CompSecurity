// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

public final class azv
    implements android.os.Parcelable.Creator
{

    public azv()
    {
    }

    public static Tile a(Parcel parcel)
    {
        int k = 0;
        int l = up.b(parcel);
        byte abyte0[] = null;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = up.a(parcel);
                switch (up.a(i1))
                {
                default:
                    up.a(parcel, i1);
                    break;

                case 1: // '\001'
                    i = up.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = up.e(parcel, i1);
                    break;

                case 3: // '\003'
                    k = up.e(parcel, i1);
                    break;

                case 4: // '\004'
                    abyte0 = up.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new Tile(i, j, k, abyte0);
            }
        } while (true);
    }

    public static void a(Tile tile, Parcel parcel)
    {
        int i = ur.a(parcel);
        ur.a(parcel, 1, tile.a());
        ur.a(parcel, 2, tile.a);
        ur.a(parcel, 3, tile.b);
        ur.a(parcel, 4, tile.c);
        ur.a(parcel, i);
    }

    private static Tile[] a(int i)
    {
        return new Tile[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }
}
