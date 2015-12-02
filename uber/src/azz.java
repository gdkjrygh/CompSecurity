// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class azz
    implements android.os.Parcelable.Creator
{

    public azz()
    {
    }

    public static StreetViewPanoramaOptions a(Parcel parcel)
    {
        Integer integer = null;
        byte byte0 = 0;
        int j = up.b(parcel);
        byte byte1 = 0;
        byte byte2 = 0;
        byte byte3 = 0;
        byte byte4 = 0;
        LatLng latlng = null;
        String s = null;
        StreetViewPanoramaCamera streetviewpanoramacamera = null;
        int i = 0;
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
                    streetviewpanoramacamera = (StreetViewPanoramaCamera)up.a(parcel, k, StreetViewPanoramaCamera.CREATOR);
                    break;

                case 3: // '\003'
                    s = up.l(parcel, k);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)up.a(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    integer = up.f(parcel, k);
                    break;

                case 6: // '\006'
                    byte4 = up.c(parcel, k);
                    break;

                case 7: // '\007'
                    byte3 = up.c(parcel, k);
                    break;

                case 8: // '\b'
                    byte2 = up.c(parcel, k);
                    break;

                case 9: // '\t'
                    byte1 = up.c(parcel, k);
                    break;

                case 10: // '\n'
                    byte0 = up.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOptions(i, streetviewpanoramacamera, s, latlng, integer, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public static void a(StreetViewPanoramaOptions streetviewpanoramaoptions, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, streetviewpanoramaoptions.a());
        ur.a(parcel, 2, streetviewpanoramaoptions.g(), i, false);
        ur.a(parcel, 3, streetviewpanoramaoptions.j(), false);
        ur.a(parcel, 4, streetviewpanoramaoptions.h(), i, false);
        ur.a(parcel, streetviewpanoramaoptions.i());
        ur.a(parcel, 6, streetviewpanoramaoptions.b());
        ur.a(parcel, 7, streetviewpanoramaoptions.c());
        ur.a(parcel, 8, streetviewpanoramaoptions.d());
        ur.a(parcel, 9, streetviewpanoramaoptions.e());
        ur.a(parcel, 10, streetviewpanoramaoptions.f());
        ur.a(parcel, j);
    }

    private static StreetViewPanoramaOptions[] a(int i)
    {
        return new StreetViewPanoramaOptions[i];
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
