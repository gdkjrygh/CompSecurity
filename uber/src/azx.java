// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

public final class azx
    implements android.os.Parcelable.Creator
{

    public azx()
    {
    }

    public static VisibleRegion a(Parcel parcel)
    {
        LatLngBounds latlngbounds = null;
        int j = up.b(parcel);
        int i = 0;
        LatLng latlng = null;
        LatLng latlng1 = null;
        LatLng latlng2 = null;
        LatLng latlng3 = null;
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
                    latlng3 = (LatLng)up.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    latlng2 = (LatLng)up.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    latlng1 = (LatLng)up.a(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    latlng = (LatLng)up.a(parcel, k, LatLng.CREATOR);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)up.a(parcel, k, LatLngBounds.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new VisibleRegion(i, latlng3, latlng2, latlng1, latlng, latlngbounds);
            }
        } while (true);
    }

    public static void a(VisibleRegion visibleregion, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, visibleregion.a());
        ur.a(parcel, 2, visibleregion.a, i, false);
        ur.a(parcel, 3, visibleregion.b, i, false);
        ur.a(parcel, 4, visibleregion.c, i, false);
        ur.a(parcel, 5, visibleregion.d, i, false);
        ur.a(parcel, 6, visibleregion.e, i, false);
        ur.a(parcel, j);
    }

    private static VisibleRegion[] a(int i)
    {
        return new VisibleRegion[i];
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
