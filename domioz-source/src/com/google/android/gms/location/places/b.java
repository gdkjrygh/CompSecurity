// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.location.places:
//            AddPlaceRequest

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(AddPlaceRequest addplacerequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, addplacerequest.a());
        c.a(parcel, 1000, addplacerequest.a);
        c.a(parcel, 2, addplacerequest.b(), i);
        c.a(parcel, 3, addplacerequest.c());
        c.a(parcel, 4, addplacerequest.d());
        c.a(parcel, 5, addplacerequest.e());
        c.a(parcel, 6, addplacerequest.f(), i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.s(parcel, k);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
