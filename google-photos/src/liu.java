// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class liu
    implements android.os.Parcelable.Creator
{

    public liu()
    {
    }

    public static void a(LatLngBounds latlngbounds, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, latlngbounds.a);
        b.a(parcel, 2, latlngbounds.b, i, false);
        b.a(parcel, 3, latlngbounds.c, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
        LatLng latlng = null;
        int i = 0;
        LatLng latlng1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)b.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    latlng1 = (LatLng)b.a(parcel, k, LatLng.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LatLngBounds(i, latlng, latlng1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LatLngBounds[i];
    }
}
