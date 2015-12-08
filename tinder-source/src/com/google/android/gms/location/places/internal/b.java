// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceImpl, PlaceLocalization

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(PlaceImpl placeimpl, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        placeimpl.a("getId");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, placeimpl.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, placeimpl.c);
        placeimpl.a("getLocalization");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, placeimpl.d, i);
        placeimpl.a("getLatLng");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, placeimpl.e, i);
        placeimpl.a("getLevelNumber");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, placeimpl.f);
        placeimpl.a("getViewport");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, placeimpl.g, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, placeimpl.h);
        placeimpl.a("getWebsiteUri");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, placeimpl.i, i);
        placeimpl.a("isPermanentlyClosed");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, placeimpl.j);
        placeimpl.a("getRating");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, placeimpl.k);
        placeimpl.a("getPriceLevel");
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 11, placeimpl.l);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, placeimpl.m);
        placeimpl.a("getTypesDeprecated");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, placeimpl.n);
        placeimpl.a("getAddress");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 14, placeimpl.q);
        placeimpl.a("getPhoneNumber");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 15, placeimpl.r);
        placeimpl.a("getAttributions");
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 17, placeimpl.t);
        placeimpl.a("getRegularOpenHours");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 16, placeimpl.s);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, placeimpl.a);
        placeimpl.a("getName");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 19, placeimpl.p);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 18, placeimpl.u);
        placeimpl.a("getPlaceTypes");
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20, placeimpl.o);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = zza.a(parcel);
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
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    s5 = zza.l(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = zza.n(parcel, l);
                    break;

                case 3: // '\003'
                    placelocalization = (PlaceLocalization)zza.a(parcel, l, PlaceLocalization.CREATOR);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)zza.a(parcel, l, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    f1 = zza.i(parcel, l);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)zza.a(parcel, l, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    s = zza.l(parcel, l);
                    break;

                case 8: // '\b'
                    uri = (Uri)zza.a(parcel, l, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    flag1 = zza.c(parcel, l);
                    break;

                case 10: // '\n'
                    f = zza.i(parcel, l);
                    break;

                case 11: // '\013'
                    i = zza.e(parcel, l);
                    break;

                case 12: // '\f'
                    l1 = zza.f(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist1 = zza.s(parcel, l);
                    break;

                case 14: // '\016'
                    s3 = zza.l(parcel, l);
                    break;

                case 15: // '\017'
                    s2 = zza.l(parcel, l);
                    break;

                case 17: // '\021'
                    arraylist = zza.t(parcel, l);
                    break;

                case 16: // '\020'
                    s1 = zza.l(parcel, l);
                    break;

                case 1000: 
                    j = zza.e(parcel, l);
                    break;

                case 19: // '\023'
                    s4 = zza.l(parcel, l);
                    break;

                case 18: // '\022'
                    flag = zza.c(parcel, l);
                    break;

                case 20: // '\024'
                    arraylist2 = zza.s(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
