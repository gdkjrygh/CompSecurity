// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.os.Parcel;

public final class axv
    implements android.os.Parcelable.Creator
{

    public axv()
    {
    }

    public static com.google.android.gms.maps.internal.Point a(Parcel parcel)
    {
        int j = up.b(parcel);
        int i = 0;
        Point point = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = up.a(parcel);
                switch (up.a(k))
                {
                default:
                    up.a(parcel, k);
                    break;

                case 1: // '\001'
                    i = up.e(parcel, k);
                    break;

                case 2: // '\002'
                    point = (Point)up.a(parcel, k, Point.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new com.google.android.gms.maps.internal.Point(i, point);
            }
        } while (true);
    }

    public static void a(com.google.android.gms.maps.internal.Point point, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, point.a());
        ur.a(parcel, 2, point.b(), i, false);
        ur.a(parcel, j);
    }

    private static com.google.android.gms.maps.internal.Point[] a(int i)
    {
        return new com.google.android.gms.maps.internal.Point[i];
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
