// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.nn;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GeofencingRequest geofencingrequest, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, geofencingrequest.ng(), false);
        b.c(parcel, 1000, geofencingrequest.getVersionCode());
        b.c(parcel, 2, geofencingrequest.getInitialTrigger());
        b.H(parcel, i);
    }

    public GeofencingRequest cI(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, nn.CREATOR);
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
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GeofencingRequest(i, arraylist, j);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cI(parcel);
    }

    public GeofencingRequest[] ex(int i)
    {
        return new GeofencingRequest[i];
    }

    public Object[] newArray(int i)
    {
        return ex(i);
    }
}
