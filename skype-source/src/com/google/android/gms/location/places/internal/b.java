// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
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
        int j = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, placeimpl.b());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, placeimpl.r());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, placeimpl.t(), i);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, placeimpl.g(), i);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, placeimpl.h());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, placeimpl.i(), i);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, placeimpl.s());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, placeimpl.j(), i);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, placeimpl.n());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, placeimpl.o());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, placeimpl.p());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, placeimpl.q());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 13, placeimpl.d());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 14, placeimpl.f());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 15, placeimpl.k());
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, 17, placeimpl.m());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 16, placeimpl.l());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, placeimpl.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 19, placeimpl.e());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 18, placeimpl.b);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 20, placeimpl.c());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 3: // '\003'
                    placelocalization = (PlaceLocalization)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PlaceLocalization.CREATOR);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 8: // '\b'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 10: // '\n'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 11: // '\013'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 12: // '\f'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, l);
                    break;

                case 14: // '\016'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 15: // '\017'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 17: // '\021'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.t(parcel, l);
                    break;

                case 16: // '\020'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 19: // '\023'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 18: // '\022'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 20: // '\024'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
