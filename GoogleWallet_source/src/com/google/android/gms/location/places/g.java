// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceRequest, PlaceFilter

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(PlaceRequest placerequest, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1000, placerequest.mVersionCode);
        b.a(parcel, 2, placerequest.getFilter(), i, false);
        b.a(parcel, 3, placerequest.getInterval());
        b.c(parcel, 4, placerequest.getPriority());
        b.J(parcel, j);
    }

    public static PlaceRequest fQ(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int j = 0;
        PlaceFilter placefilter = null;
        long l1 = PlaceRequest.DEFAULT_INTERVAL;
        int i = 102;
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

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    placefilter = (PlaceFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PlaceFilter.CREATOR);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PlaceRequest(j, placefilter, l1, i);
            }
        } while (true);
    }

    private static PlaceRequest[] il(int i)
    {
        return new PlaceRequest[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fQ(parcel);
    }

    public final Object[] newArray(int i)
    {
        return il(i);
    }
}
