// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.location.places.internal.PlaceImpl;
import com.google.android.gms.location.places.internal.PlaceLocalization;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class lhs
    implements android.os.Parcelable.Creator
{

    public lhs()
    {
    }

    public static void a(PlaceImpl placeimpl, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, placeimpl.a(), false);
        b.a(parcel, 2, placeimpl.b, false);
        placeimpl.a("getLocalization");
        b.a(parcel, 3, placeimpl.c, i, false);
        b.a(parcel, 4, placeimpl.d(), i, false);
        placeimpl.a("getLevelNumber");
        b.a(parcel, 5, placeimpl.d);
        placeimpl.a("getViewport");
        b.a(parcel, 6, placeimpl.e, i, false);
        b.a(parcel, 7, placeimpl.f, false);
        placeimpl.a("getWebsiteUri");
        b.a(parcel, 8, placeimpl.g, i, false);
        placeimpl.a("isPermanentlyClosed");
        b.a(parcel, 9, placeimpl.h);
        placeimpl.a("getRating");
        b.a(parcel, 10, placeimpl.i);
        placeimpl.a("getPriceLevel");
        b.c(parcel, 11, placeimpl.j);
        b.a(parcel, 12, placeimpl.k);
        placeimpl.a("getTypesDeprecated");
        b.a(parcel, 13, placeimpl.l, false);
        b.a(parcel, 14, placeimpl.f(), false);
        placeimpl.a("getPhoneNumber");
        b.a(parcel, 15, placeimpl.n, false);
        placeimpl.a("getAttributions");
        b.b(parcel, 17, placeimpl.p, false);
        placeimpl.a("getRegularOpenHours");
        b.a(parcel, 16, placeimpl.o, false);
        b.c(parcel, 1000, placeimpl.a);
        b.a(parcel, 19, placeimpl.e(), false);
        b.a(parcel, 18, placeimpl.q);
        placeimpl.a("getPlaceTypes");
        b.a(parcel, 20, placeimpl.m, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = b.b(parcel);
        int j = 0;
        String s5 = null;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        android.os.Bundle bundle = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        LatLng latlng = null;
        float f1 = 0.0F;
        LatLngBounds latlngbounds = null;
        String s = null;
        Uri uri = null;
        boolean flag1 = false;
        float f = 0.0F;
        int i = 0;
        long l1 = 0L;
        boolean flag = false;
        PlaceLocalization placelocalization = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    b.b(parcel, l);
                    break;

                case 1: // '\001'
                    s5 = b.i(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = b.k(parcel, l);
                    break;

                case 3: // '\003'
                    placelocalization = (PlaceLocalization)b.a(parcel, l, PlaceLocalization.CREATOR);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)b.a(parcel, l, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    f1 = b.g(parcel, l);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)b.a(parcel, l, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    s = b.i(parcel, l);
                    break;

                case 8: // '\b'
                    uri = (Uri)b.a(parcel, l, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    flag1 = b.c(parcel, l);
                    break;

                case 10: // '\n'
                    f = b.g(parcel, l);
                    break;

                case 11: // '\013'
                    i = b.e(parcel, l);
                    break;

                case 12: // '\f'
                    l1 = b.f(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist1 = b.o(parcel, l);
                    break;

                case 14: // '\016'
                    s3 = b.i(parcel, l);
                    break;

                case 15: // '\017'
                    s2 = b.i(parcel, l);
                    break;

                case 17: // '\021'
                    arraylist = b.p(parcel, l);
                    break;

                case 16: // '\020'
                    s1 = b.i(parcel, l);
                    break;

                case 1000: 
                    j = b.e(parcel, l);
                    break;

                case 19: // '\023'
                    s4 = b.i(parcel, l);
                    break;

                case 18: // '\022'
                    flag = b.c(parcel, l);
                    break;

                case 20: // '\024'
                    arraylist2 = b.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PlaceImpl(j, s5, arraylist2, arraylist1, bundle, s4, s3, s2, s1, arraylist, latlng, f1, latlngbounds, s, uri, flag1, f, i, l1, flag, placelocalization);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlaceImpl[i];
    }
}
