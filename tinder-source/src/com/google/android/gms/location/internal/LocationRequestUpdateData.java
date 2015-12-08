// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.m;
import com.google.android.gms.location.n;

// Referenced classes of package com.google.android.gms.location.internal:
//            m, f, LocationRequestInternal

public class LocationRequestUpdateData
    implements SafeParcelable
{

    public static final com.google.android.gms.location.internal.m CREATOR = new com.google.android.gms.location.internal.m();
    final int a;
    int b;
    LocationRequestInternal c;
    n d;
    PendingIntent e;
    m f;
    f g;

    LocationRequestUpdateData(int i, int j, LocationRequestInternal locationrequestinternal, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1, IBinder ibinder2)
    {
        Object obj = null;
        super();
        a = i;
        b = j;
        c = locationrequestinternal;
        if (ibinder == null)
        {
            locationrequestinternal = null;
        } else
        {
            locationrequestinternal = com.google.android.gms.location.n.a.a(ibinder);
        }
        d = locationrequestinternal;
        e = pendingintent;
        if (ibinder1 == null)
        {
            locationrequestinternal = null;
        } else
        {
            locationrequestinternal = com.google.android.gms.location.m.a.a(ibinder1);
        }
        f = locationrequestinternal;
        if (ibinder2 == null)
        {
            locationrequestinternal = obj;
        } else
        {
            locationrequestinternal = com.google.android.gms.location.internal.f.a.a(ibinder2);
        }
        g = locationrequestinternal;
    }

    public static LocationRequestUpdateData a(LocationRequestInternal locationrequestinternal, n n1, f f1)
    {
        return new LocationRequestUpdateData(1, 1, locationrequestinternal, n1.asBinder(), null, null, f1.asBinder());
    }

    public static LocationRequestUpdateData a(m m1)
    {
        return new LocationRequestUpdateData(1, 2, null, null, null, m1.asBinder(), null);
    }

    public static LocationRequestUpdateData a(n n1, f f1)
    {
        IBinder ibinder = n1.asBinder();
        if (f1 != null)
        {
            n1 = f1.asBinder();
        } else
        {
            n1 = null;
        }
        return new LocationRequestUpdateData(1, 2, null, ibinder, null, null, n1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
