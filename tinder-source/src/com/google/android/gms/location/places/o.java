// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceRequest, PlaceFilter

public final class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(PlaceRequest placerequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, placerequest.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, placerequest.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, placerequest.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, placerequest.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, placerequest.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = zza.a(parcel);
        int j = 0;
        PlaceFilter placefilter = null;
        long l2 = com.google.android.gms.location.places.PlaceRequest.a;
        int i = 102;
        long l1 = 0x7fffffffffffffffL;
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

                case 1000: 
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    placefilter = (PlaceFilter)zza.a(parcel, l, PlaceFilter.CREATOR);
                    break;

                case 3: // '\003'
                    l2 = zza.f(parcel, l);
                    break;

                case 4: // '\004'
                    i = zza.e(parcel, l);
                    break;

                case 5: // '\005'
                    l1 = zza.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PlaceRequest(j, placefilter, l2, i, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlaceRequest[i];
    }
}
