// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;

public final class lih
    implements android.os.Parcelable.Creator
{

    public lih()
    {
    }

    public static void a(GeofencingRequest geofencingrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, geofencingrequest.b, false);
        b.c(parcel, 1000, geofencingrequest.a);
        b.c(parcel, 2, geofencingrequest.c);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = b.b(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
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
                    arraylist = b.c(parcel, l, ParcelableGeofence.CREATOR);
                    break;

                case 1000: 
                    i = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = b.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
