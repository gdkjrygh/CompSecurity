// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.l;
import com.google.android.gms.location.m;

// Referenced classes of package com.google.android.gms.location.internal:
//            k, LocationRequestInternal

public class LocationRequestUpdateData
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    int a;
    LocationRequestInternal b;
    m c;
    PendingIntent d;
    l e;
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
            locationrequestinternal = com.google.android.gms.location.m.a.a(ibinder);
        }
        c = locationrequestinternal;
        d = pendingintent;
        if (ibinder1 == null)
        {
            locationrequestinternal = obj;
        } else
        {
            locationrequestinternal = com.google.android.gms.location.l.a.a(ibinder1);
        }
        e = locationrequestinternal;
    }

    public static LocationRequestUpdateData a(LocationRequestInternal locationrequestinternal, m m1)
    {
        return new LocationRequestUpdateData(1, 1, locationrequestinternal, m1.asBinder(), null, null);
    }

    public static LocationRequestUpdateData a(l l1)
    {
        return new LocationRequestUpdateData(1, 2, null, null, null, l1.asBinder());
    }

    public static LocationRequestUpdateData a(m m1)
    {
        return new LocationRequestUpdateData(1, 2, null, m1.asBinder(), null, null);
    }

    final int a()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
