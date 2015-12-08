// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            StopScanRequestCreator

public class StopScanRequest
    implements SafeParcelable
{

    public static final StopScanRequestCreator CREATOR = new StopScanRequestCreator();
    final INearbyBootstrapCallback callback;
    final int versionCode;

    StopScanRequest(int i, IBinder ibinder)
    {
        versionCode = i;
        Preconditions.checkNotNull(ibinder);
        callback = com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback.Stub.asInterface(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StopScanRequestCreator.writeToParcel$1d1c3a47(this, parcel);
    }

}
