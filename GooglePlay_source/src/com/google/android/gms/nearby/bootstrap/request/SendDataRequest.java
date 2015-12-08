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
//            SendDataRequestCreator

public class SendDataRequest
    implements SafeParcelable
{

    public static final SendDataRequestCreator CREATOR = new SendDataRequestCreator();
    final INearbyBootstrapCallback callback;
    final byte data[];
    final Device device;
    final int versionCode;

    SendDataRequest(int i, Device device1, byte abyte0[], IBinder ibinder)
    {
        versionCode = i;
        device = (Device)Preconditions.checkNotNull(device1);
        data = (byte[])Preconditions.checkNotNull(abyte0);
        Preconditions.checkNotNull(ibinder);
        callback = com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback.Stub.asInterface(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SendDataRequestCreator.writeToParcel(this, parcel, i);
    }

}
