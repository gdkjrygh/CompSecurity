// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzc;
import com.google.android.gms.location.zzd;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzl, LocationRequestInternal

public class LocationRequestUpdateData
    implements SafeParcelable
{

    public static final zzl CREATOR = new zzl();
    int a;
    LocationRequestInternal b;
    zzd c;
    PendingIntent d;
    zzc e;
    private final int f;

    LocationRequestUpdateData(int i, int j, LocationRequestInternal locationrequestinternal, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1)
    {
        Object obj = null;
        super();
        f = i;
        a = j;
        b = locationrequestinternal;
        if (ibinder == null)
        {
            locationrequestinternal = null;
        } else
        {
            locationrequestinternal = com.google.android.gms.location.zzd.zza.a(ibinder);
        }
        c = locationrequestinternal;
        d = pendingintent;
        if (ibinder1 == null)
        {
            locationrequestinternal = obj;
        } else
        {
            locationrequestinternal = com.google.android.gms.location.zzc.zza.a(ibinder1);
        }
        e = locationrequestinternal;
    }

    public static LocationRequestUpdateData a(LocationRequestInternal locationrequestinternal, zzd zzd1)
    {
        return new LocationRequestUpdateData(1, 1, locationrequestinternal, zzd1.asBinder(), null, null);
    }

    public static LocationRequestUpdateData a(zzc zzc1)
    {
        return new LocationRequestUpdateData(1, 2, null, null, null, zzc1.asBinder());
    }

    public static LocationRequestUpdateData a(zzd zzd1)
    {
        return new LocationRequestUpdateData(1, 2, null, zzd1.asBinder(), null, null);
    }

    int a()
    {
        return f;
    }

    IBinder b()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return c.asBinder();
        }
    }

    IBinder c()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.asBinder();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.a(this, parcel, i);
    }

}
