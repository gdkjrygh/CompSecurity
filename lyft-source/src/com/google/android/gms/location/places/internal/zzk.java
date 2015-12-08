// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceImpl, PlaceLocalization

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void a(PlaceImpl placeimpl, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, placeimpl.b(), false);
        zzb.a(parcel, 2, placeimpl.u(), false);
        zzb.a(parcel, 3, placeimpl.w(), i, false);
        zzb.a(parcel, 4, placeimpl.f(), i, false);
        zzb.a(parcel, 5, placeimpl.k());
        zzb.a(parcel, 6, placeimpl.l(), i, false);
        zzb.a(parcel, 7, placeimpl.v(), false);
        zzb.a(parcel, 8, placeimpl.m(), i, false);
        zzb.a(parcel, 9, placeimpl.q());
        zzb.a(parcel, 10, placeimpl.r());
        zzb.a(parcel, 11, placeimpl.s());
        zzb.a(parcel, 12, placeimpl.t());
        zzb.a(parcel, 13, placeimpl.h(), false);
        zzb.a(parcel, 14, placeimpl.j(), false);
        zzb.a(parcel, 15, placeimpl.n(), false);
        zzb.b(parcel, 17, placeimpl.p(), false);
        zzb.a(parcel, 16, placeimpl.o(), false);
        zzb.a(parcel, 1000, placeimpl.a);
        zzb.a(parcel, 19, placeimpl.i(), false);
        zzb.a(parcel, 18, placeimpl.b);
        zzb.a(parcel, 20, placeimpl.c(), false);
        zzb.a(parcel, j);
    }

    public PlaceImpl a(Parcel parcel)
    {
        int k = zza.b(parcel);
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
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    s5 = zza.m(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = zza.o(parcel, l);
                    break;

                case 3: // '\003'
                    placelocalization = (PlaceLocalization)zza.a(parcel, l, PlaceLocalization.CREATOR);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)zza.a(parcel, l, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    f1 = zza.j(parcel, l);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)zza.a(parcel, l, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    s = zza.m(parcel, l);
                    break;

                case 8: // '\b'
                    uri = (Uri)zza.a(parcel, l, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    flag1 = zza.c(parcel, l);
                    break;

                case 10: // '\n'
                    f = zza.j(parcel, l);
                    break;

                case 11: // '\013'
                    i = zza.f(parcel, l);
                    break;

                case 12: // '\f'
                    l1 = zza.h(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist1 = zza.z(parcel, l);
                    break;

                case 14: // '\016'
                    s3 = zza.m(parcel, l);
                    break;

                case 15: // '\017'
                    s2 = zza.m(parcel, l);
                    break;

                case 17: // '\021'
                    arraylist = zza.A(parcel, l);
                    break;

                case 16: // '\020'
                    s1 = zza.m(parcel, l);
                    break;

                case 1000: 
                    j = zza.f(parcel, l);
                    break;

                case 19: // '\023'
                    s4 = zza.m(parcel, l);
                    break;

                case 18: // '\022'
                    flag = zza.c(parcel, l);
                    break;

                case 20: // '\024'
                    arraylist2 = zza.z(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PlaceImpl(j, s5, arraylist2, arraylist1, bundle, s4, s3, s2, s1, arraylist, latlng, f1, latlngbounds, s, uri, flag1, f, i, l1, flag, placelocalization);
            }
        } while (true);
    }

    public PlaceImpl[] a(int i)
    {
        return new PlaceImpl[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
