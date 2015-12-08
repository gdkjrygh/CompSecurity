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
//            ContinueConnectRequestCreator

public class ContinueConnectRequest
    implements SafeParcelable
{

    public static final ContinueConnectRequestCreator CREATOR = new ContinueConnectRequestCreator();
    final INearbyBootstrapCallback callback;
    final String token;
    final int versionCode;

    ContinueConnectRequest(int i, String s, IBinder ibinder)
    {
        versionCode = i;
        token = (String)Preconditions.checkNotNull(s);
        callback = com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback.Stub.asInterface(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ContinueConnectRequestCreator.writeToParcel$3b1ed0a7(this, parcel);
    }

}
