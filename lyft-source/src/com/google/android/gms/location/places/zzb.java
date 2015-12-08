// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.location.places:
//            AddPlaceRequest

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(AddPlaceRequest addplacerequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, addplacerequest.a(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1000, addplacerequest.a);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, addplacerequest.b(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, addplacerequest.c(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 4, addplacerequest.d(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 5, addplacerequest.e(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 6, addplacerequest.f(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, j);
    }

    public AddPlaceRequest a(Parcel parcel)
    {
        Uri uri = null;
        int j = zza.b(parcel);
        int i = 0;
        String s = null;
        java.util.ArrayList arraylist = null;
        String s1 = null;
        LatLng latlng = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    s2 = zza.m(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = zza.z(parcel, k);
                    break;

                case 5: // '\005'
                    s = zza.m(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)zza.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AddPlaceRequest(i, s2, latlng, s1, arraylist, s, uri);
            }
        } while (true);
    }

    public AddPlaceRequest[] a(int i)
    {
        return new AddPlaceRequest[i];
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
