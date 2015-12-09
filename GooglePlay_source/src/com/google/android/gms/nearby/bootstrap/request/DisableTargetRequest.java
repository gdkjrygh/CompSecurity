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
//            DisableTargetRequestCreator

public class DisableTargetRequest
    implements SafeParcelable
{

    public static final DisableTargetRequestCreator CREATOR = new DisableTargetRequestCreator();
    final INearbyBootstrapCallback callback;
    final int versionCode;

    DisableTargetRequest(int i, IBinder ibinder)
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
        DisableTargetRequestCreator.writeToParcel$14af0843(this, parcel);
    }

}
