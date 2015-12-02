// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

public final class azt
    implements android.os.Parcelable.Creator
{

    public azt()
    {
    }

    public static StreetViewPanoramaLocation a(Parcel parcel)
    {
        int j = up.b(parcel);
        LatLng latlng = null;
        StreetViewPanoramaLink astreetviewpanoramalink[] = null;
        int i = 0;
        String s = null;
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
                    astreetviewpanoramalink = (StreetViewPanoramaLink[])up.b(parcel, k, StreetViewPanoramaLink.CREATOR);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)up.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    s = up.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaLocation(i, astreetviewpanoramalink, latlng, s);
            }
        } while (true);
    }

    public static void a(StreetViewPanoramaLocation streetviewpanoramalocation, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, streetviewpanoramalocation.a());
        ur.a(parcel, 2, streetviewpanoramalocation.a, i);
        ur.a(parcel, 3, streetviewpanoramalocation.b, i, false);
        ur.a(parcel, 4, streetviewpanoramalocation.c, false);
        ur.a(parcel, j);
    }

    private static StreetViewPanoramaLocation[] a(int i)
    {
        return new StreetViewPanoramaLocation[i];
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
