// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lho;
import lij;
import lik;
import lim;
import lin;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternal

public class LocationRequestUpdateData
    implements SafeParcelable
{

    public static final lho CREATOR = new lho();
    public final int a;
    public int b;
    public LocationRequestInternal c;
    public lim d;
    public PendingIntent e;
    public lij f;

    public LocationRequestUpdateData(int i, int j, LocationRequestInternal locationrequestinternal, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1)
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
            locationrequestinternal = lin.a(ibinder);
        }
        d = locationrequestinternal;
        e = pendingintent;
        if (ibinder1 == null)
        {
            locationrequestinternal = obj;
        } else
        {
            locationrequestinternal = lik.a(ibinder1);
        }
        f = locationrequestinternal;
    }

    public static LocationRequestUpdateData a(lij lij1)
    {
        return new LocationRequestUpdateData(1, 2, null, null, null, lij1.asBinder());
    }

    public static LocationRequestUpdateData a(lim lim1)
    {
        return new LocationRequestUpdateData(1, 2, null, lim1.asBinder(), null, null);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lho.a(this, parcel, i);
    }

}
