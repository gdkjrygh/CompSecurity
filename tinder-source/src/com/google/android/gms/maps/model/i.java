// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            PointOfInterest, LatLng

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(PointOfInterest pointofinterest, Parcel parcel, int j)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, pointofinterest.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, pointofinterest.b, j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, pointofinterest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, pointofinterest.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = zza.a(parcel);
        String s = null;
        LatLng latlng = null;
        int j = 0;
        String s1 = null;
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
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)zza.a(parcel, l, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s = zza.l(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = zza.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PointOfInterest(j, latlng, s, s1);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new PointOfInterest[j];
    }
}
