// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            DisconnectRequestCreator

public class DisconnectRequest
    implements SafeParcelable
{

    public static final DisconnectRequestCreator CREATOR = new DisconnectRequestCreator();
    final INearbyBootstrapCallback callback;
    final Device device;
    final int versionCode;

    DisconnectRequest(int i, Device device1, IBinder ibinder)
    {
        versionCode = i;
        device = (Device)Preconditions.checkNotNull(device1);
        Preconditions.checkNotNull(ibinder);
        callback = com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback.Stub.asInterface(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DisconnectRequestCreator.writeToParcel(this, parcel, i);
    }

}
