// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.ILocationListener;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestUpdateDataCreator, IFusedLocationProviderCallback, LocationRequestInternal

public class LocationRequestUpdateData
    implements SafeParcelable
{

    public static final LocationRequestUpdateDataCreator CREATOR = new LocationRequestUpdateDataCreator();
    IFusedLocationProviderCallback mFusedLocationProviderCallback;
    ILocationCallback mLocationCallback;
    ILocationListener mLocationListener;
    int mOperation;
    PendingIntent mPendingIntent;
    LocationRequestInternal mRequest;
    final int mVersionCode;

    LocationRequestUpdateData(int i, int j, LocationRequestInternal locationrequestinternal, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1, IBinder ibinder2)
    {
        Object obj = null;
        super();
        mVersionCode = i;
        mOperation = j;
        mRequest = locationrequestinternal;
        if (ibinder == null)
        {
            locationrequestinternal = null;
        } else
        {
            locationrequestinternal = com.google.android.gms.location.ILocationListener.Stub.asInterface(ibinder);
        }
        mLocationListener = locationrequestinternal;
        mPendingIntent = pendingintent;
        if (ibinder1 == null)
        {
            locationrequestinternal = null;
        } else
        {
            locationrequestinternal = com.google.android.gms.location.ILocationCallback.Stub.asInterface(ibinder1);
        }
        mLocationCallback = locationrequestinternal;
        if (ibinder2 == null)
        {
            locationrequestinternal = obj;
        } else
        {
            locationrequestinternal = IFusedLocationProviderCallback.Stub.asInterface(ibinder2);
        }
        mFusedLocationProviderCallback = locationrequestinternal;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationRequestUpdateDataCreator.writeToParcel(this, parcel, i);
    }

}
