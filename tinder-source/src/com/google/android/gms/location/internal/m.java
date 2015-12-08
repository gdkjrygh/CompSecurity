// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.n;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternal, LocationRequestUpdateData, f

public final class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    public static LocationRequestUpdateData a(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int k = zza.a(parcel);
        int j = 0;
        int i = 1;
        android.os.IBinder ibinder1 = null;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder2 = null;
        LocationRequestInternal locationrequestinternal = null;
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

                case 1: // '\001'
                    i = zza.e(parcel, l);
                    break;

                case 1000: 
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    locationrequestinternal = (LocationRequestInternal)zza.a(parcel, l, LocationRequestInternal.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder2 = zza.m(parcel, l);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)zza.a(parcel, l, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    ibinder1 = zza.m(parcel, l);
                    break;

                case 6: // '\006'
                    ibinder = zza.m(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new LocationRequestUpdateData(j, i, locationrequestinternal, ibinder2, pendingintent, ibinder1, ibinder);
            }
        } while (true);
    }

    static void a(LocationRequestUpdateData locationrequestupdatedata, Parcel parcel, int i)
    {
        Object obj = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, locationrequestupdatedata.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, locationrequestupdatedata.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, locationrequestupdatedata.c, i);
        android.os.IBinder ibinder;
        if (locationrequestupdatedata.d == null)
        {
            ibinder = null;
        } else
        {
            ibinder = locationrequestupdatedata.d.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, ibinder);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, locationrequestupdatedata.e, i);
        if (locationrequestupdatedata.f == null)
        {
            ibinder = null;
        } else
        {
            ibinder = locationrequestupdatedata.f.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, ibinder);
        if (locationrequestupdatedata.g == null)
        {
            locationrequestupdatedata = obj;
        } else
        {
            locationrequestupdatedata = locationrequestupdatedata.g.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, locationrequestupdatedata);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new LocationRequestUpdateData[i];
    }
}
