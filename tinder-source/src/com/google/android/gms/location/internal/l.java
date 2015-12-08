// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternal, ClientIdentity

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    public static LocationRequestInternal a(Parcel parcel)
    {
        String s = null;
        boolean flag1 = true;
        boolean flag = false;
        int j = zza.a(parcel);
        Object obj = com.google.android.gms.location.internal.LocationRequestInternal.a;
        boolean flag2 = true;
        boolean flag3 = false;
        LocationRequest locationrequest = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    locationrequest = (LocationRequest)zza.a(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag3 = zza.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag2 = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = zza.c(parcel, k);
                    break;

                case 5: // '\005'
                    obj = zza.c(parcel, k, ClientIdentity.CREATOR);
                    break;

                case 6: // '\006'
                    s = zza.l(parcel, k);
                    break;

                case 7: // '\007'
                    flag = zza.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationRequestInternal(i, locationrequest, flag3, flag2, flag1, ((java.util.List) (obj)), s, flag);
            }
        } while (true);
    }

    static void a(LocationRequestInternal locationrequestinternal, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, locationrequestinternal.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, locationrequestinternal.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, locationrequestinternal.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, locationrequestinternal.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, locationrequestinternal.f);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 5, locationrequestinternal.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, locationrequestinternal.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, locationrequestinternal.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new LocationRequestInternal[i];
    }
}
