// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.internal.ParcelableGeofence;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(GeofencingRequest geofencingrequest, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 1, geofencingrequest.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, geofencingrequest.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, geofencingrequest.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int l = zza.a(parcel);
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
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    arraylist = zza.c(parcel, i1, ParcelableGeofence.CREATOR);
                    break;

                case 1000: 
                    i = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = zza.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GeofencingRequest(i, arraylist, j);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GeofencingRequest[i];
    }
}
