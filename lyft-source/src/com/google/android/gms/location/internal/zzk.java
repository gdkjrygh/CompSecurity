// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternal, ClientIdentity

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void a(LocationRequestInternal locationrequestinternal, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, locationrequestinternal.b, i, false);
        zzb.a(parcel, 1000, locationrequestinternal.a());
        zzb.a(parcel, 2, locationrequestinternal.c);
        zzb.a(parcel, 3, locationrequestinternal.d);
        zzb.a(parcel, 4, locationrequestinternal.e);
        zzb.c(parcel, 5, locationrequestinternal.f, false);
        zzb.a(parcel, 6, locationrequestinternal.g, false);
        zzb.a(parcel, j);
    }

    public LocationRequestInternal a(Parcel parcel)
    {
        String s = null;
        boolean flag = true;
        boolean flag2 = false;
        int j = zza.b(parcel);
        Object obj = LocationRequestInternal.a;
        boolean flag1 = true;
        LocationRequest locationrequest = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    locationrequest = (LocationRequest)zza.a(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = zza.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag = zza.c(parcel, k);
                    break;

                case 5: // '\005'
                    obj = zza.c(parcel, k, ClientIdentity.CREATOR);
                    break;

                case 6: // '\006'
                    s = zza.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LocationRequestInternal(i, locationrequest, flag2, flag1, flag, ((java.util.List) (obj)), s);
            }
        } while (true);
    }

    public LocationRequestInternal[] a(int i)
    {
        return new LocationRequestInternal[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
