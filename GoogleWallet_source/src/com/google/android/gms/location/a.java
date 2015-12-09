// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.ph;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GeofencingRequest geofencingrequest, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.d(parcel, 1, geofencingrequest.oZ(), false);
        b.c(parcel, 1000, geofencingrequest.getVersionCode());
        b.c(parcel, 2, geofencingrequest.getInitialTrigger());
        b.J(parcel, i);
    }

    private static GeofencingRequest fi(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, ph.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GeofencingRequest(i, arraylist, j);
            }
        } while (true);
    }

    private static GeofencingRequest[] hs(int i)
    {
        return new GeofencingRequest[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fi(parcel);
    }

    public final Object[] newArray(int i)
    {
        return hs(i);
    }
}
