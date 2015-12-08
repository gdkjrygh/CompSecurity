// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.internal.ParcelableGeofence;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(GeofencingRequest geofencingrequest, Parcel parcel)
    {
        int i = b.a(parcel);
        b.c(parcel, 1, geofencingrequest.b());
        b.a(parcel, 1000, geofencingrequest.a());
        b.a(parcel, 2, geofencingrequest.c());
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, ParcelableGeofence.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GeofencingRequest(i, arraylist, k);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GeofencingRequest[i];
    }
}
