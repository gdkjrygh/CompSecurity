// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class azm
    implements android.os.Parcelable.Creator
{

    public azm()
    {
    }

    public static LatLngBounds a(Parcel parcel)
    {
        int j = up.b(parcel);
        LatLng latlng = null;
        int i = 0;
        LatLng latlng1 = null;
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
                    latlng = (LatLng)up.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    latlng1 = (LatLng)up.a(parcel, k, LatLng.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LatLngBounds(i, latlng, latlng1);
            }
        } while (true);
    }

    public static void a(LatLngBounds latlngbounds, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, latlngbounds.a());
        ur.a(parcel, 2, latlngbounds.a, i, false);
        ur.a(parcel, 3, latlngbounds.b, i, false);
        ur.a(parcel, j);
    }

    private static LatLngBounds[] a(int i)
    {
        return new LatLngBounds[i];
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
