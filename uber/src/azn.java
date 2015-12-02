// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public final class azn
    implements android.os.Parcelable.Creator
{

    public azn()
    {
    }

    public static LatLng a(Parcel parcel)
    {
        double d = 0.0D;
        int j = up.b(parcel);
        int i = 0;
        double d1 = 0.0D;
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
                    d1 = up.j(parcel, k);
                    break;

                case 3: // '\003'
                    d = up.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LatLng(i, d1, d);
            }
        } while (true);
    }

    public static void a(LatLng latlng, Parcel parcel)
    {
        int i = ur.a(parcel);
        ur.a(parcel, 1, latlng.a());
        ur.a(parcel, 2, latlng.a);
        ur.a(parcel, 3, latlng.b);
        ur.a(parcel, i);
    }

    private static LatLng[] a(int i)
    {
        return new LatLng[i];
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
