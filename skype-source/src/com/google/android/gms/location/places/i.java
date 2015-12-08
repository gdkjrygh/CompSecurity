// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertFilter, UserDataType

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(NearbyAlertFilter nearbyalertfilter, Parcel parcel)
    {
        int j = b.a(parcel);
        b.b(parcel, 1, nearbyalertfilter.b);
        b.a(parcel, 1000, nearbyalertfilter.a);
        b.a(parcel, 2, nearbyalertfilter.c);
        b.c(parcel, 3, nearbyalertfilter.d);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist2 = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        java.util.ArrayList arraylist = null;
        int j = 0;
        java.util.ArrayList arraylist1 = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.t(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, l);
                    break;

                case 3: // '\003'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, UserDataType.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NearbyAlertFilter(j, arraylist, arraylist1, arraylist2);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new NearbyAlertFilter[j];
    }
}
