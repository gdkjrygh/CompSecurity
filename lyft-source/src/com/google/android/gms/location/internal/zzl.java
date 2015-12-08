// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestUpdateData, LocationRequestInternal

public class zzl
    implements android.os.Parcelable.Creator
{

    public zzl()
    {
    }

    static void a(LocationRequestUpdateData locationrequestupdatedata, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, locationrequestupdatedata.a);
        zzb.a(parcel, 1000, locationrequestupdatedata.a());
        zzb.a(parcel, 2, locationrequestupdatedata.b, i, false);
        zzb.a(parcel, 3, locationrequestupdatedata.b(), false);
        zzb.a(parcel, 4, locationrequestupdatedata.d, i, false);
        zzb.a(parcel, 5, locationrequestupdatedata.c(), false);
        zzb.a(parcel, j);
    }

    public LocationRequestUpdateData a(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int k = zza.b(parcel);
        int j = 0;
        int i = 1;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder1 = null;
        LocationRequestInternal locationrequestinternal = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, l);
                    break;

                case 1000: 
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    locationrequestinternal = (LocationRequestInternal)zza.a(parcel, l, LocationRequestInternal.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder1 = zza.n(parcel, l);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)zza.a(parcel, l, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    ibinder = zza.n(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new LocationRequestUpdateData(j, i, locationrequestinternal, ibinder1, pendingintent, ibinder);
            }
        } while (true);
    }

    public LocationRequestUpdateData[] a(int i)
    {
        return new LocationRequestUpdateData[i];
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
