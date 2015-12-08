// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.internal.IConnectionListener;
import com.google.android.gms.nearby.bootstrap.internal.IDataListener;
import com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            ConnectRequestCreator

public class ConnectRequest
    implements SafeParcelable
{

    public static final ConnectRequestCreator CREATOR = new ConnectRequestCreator();
    final INearbyBootstrapCallback callback;
    final byte connectType;
    final IConnectionListener connectionListener;
    final IDataListener dataListener;
    final String description;
    final Device device;
    final byte deviceType;
    final String name;
    final long timeoutMillis;
    final String token;
    final int versionCode;

    ConnectRequest(int i, Device device1, String s, String s1, byte byte0, long l, 
            String s2, byte byte1, IBinder ibinder, IBinder ibinder1, IBinder ibinder2)
    {
        versionCode = i;
        device = (Device)Preconditions.checkNotNull(device1);
        name = Preconditions.checkNotEmpty(s);
        description = (String)Preconditions.checkNotNull(s1);
        deviceType = byte0;
        timeoutMillis = l;
        connectType = byte1;
        token = s2;
        Preconditions.checkNotNull(ibinder);
        connectionListener = com.google.android.gms.nearby.bootstrap.internal.IConnectionListener.Stub.asInterface(ibinder);
        Preconditions.checkNotNull(ibinder1);
        dataListener = com.google.android.gms.nearby.bootstrap.internal.IDataListener.Stub.asInterface(ibinder1);
        Preconditions.checkNotNull(ibinder2);
        callback = com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback.Stub.asInterface(ibinder2);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ConnectRequestCreator.writeToParcel(this, parcel, i);
    }

}
