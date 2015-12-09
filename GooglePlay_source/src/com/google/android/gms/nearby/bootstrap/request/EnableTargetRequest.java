// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.bootstrap.internal.IConnectionListener;
import com.google.android.gms.nearby.bootstrap.internal.IDataListener;
import com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            EnableTargetRequestCreator

public class EnableTargetRequest
    implements SafeParcelable
{

    public static final EnableTargetRequestCreator CREATOR = new EnableTargetRequestCreator();
    final INearbyBootstrapCallback callback;
    final IConnectionListener connectionListener;
    final IDataListener dataListener;
    final String description;
    final byte deviceType;
    final String name;
    final int versionCode;

    EnableTargetRequest(int i, String s, String s1, byte byte0, IBinder ibinder, IBinder ibinder1, IBinder ibinder2)
    {
        versionCode = i;
        name = Preconditions.checkNotEmpty(s);
        description = (String)Preconditions.checkNotNull(s1);
        deviceType = byte0;
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
        EnableTargetRequestCreator.writeToParcel$4d0f6732(this, parcel);
    }

}
