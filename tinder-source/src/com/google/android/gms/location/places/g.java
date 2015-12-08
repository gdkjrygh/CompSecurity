// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.location.places:
//            AddPlaceRequest

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(AddPlaceRequest addplacerequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, addplacerequest.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, addplacerequest.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, addplacerequest.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, addplacerequest.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, addplacerequest.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, addplacerequest.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, addplacerequest.g, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = zza.a(parcel);
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
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    s2 = zza.l(parcel, k);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = zza.s(parcel, k);
                    break;

                case 5: // '\005'
                    s = zza.l(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)zza.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AddPlaceRequest(i, s2, latlng, s1, arraylist, s, uri);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AddPlaceRequest[i];
    }
}
