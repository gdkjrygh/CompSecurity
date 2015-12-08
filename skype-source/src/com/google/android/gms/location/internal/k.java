// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.l;
import com.google.android.gms.location.m;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternal, LocationRequestUpdateData

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    public static LocationRequestUpdateData a(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        int i = 1;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder1 = null;
        LocationRequestInternal locationrequestinternal = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    locationrequestinternal = (LocationRequestInternal)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LocationRequestInternal.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new LocationRequestUpdateData(j, i, locationrequestinternal, ibinder1, pendingintent, ibinder);
            }
        } while (true);
    }

    static void a(LocationRequestUpdateData locationrequestupdatedata, Parcel parcel, int i)
    {
        Object obj = null;
        int j = b.a(parcel);
        b.a(parcel, 1, locationrequestupdatedata.a);
        b.a(parcel, 1000, locationrequestupdatedata.a());
        b.a(parcel, 2, locationrequestupdatedata.b, i);
        android.os.IBinder ibinder;
        if (locationrequestupdatedata.c == null)
        {
            ibinder = null;
        } else
        {
            ibinder = locationrequestupdatedata.c.asBinder();
        }
        b.a(parcel, 3, ibinder);
        b.a(parcel, 4, locationrequestupdatedata.d, i);
        if (locationrequestupdatedata.e == null)
        {
            locationrequestupdatedata = obj;
        } else
        {
            locationrequestupdatedata = locationrequestupdatedata.e.asBinder();
        }
        b.a(parcel, 5, locationrequestupdatedata);
        b.a(parcel, j);
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
