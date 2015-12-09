// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback;
import com.google.android.gms.nearby.bootstrap.internal.IScanListener;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            StartScanRequestCreator

public class StartScanRequest
    implements SafeParcelable
{

    public static final StartScanRequestCreator CREATOR = new StartScanRequestCreator();
    final INearbyBootstrapCallback callback;
    final IScanListener scanListener;
    final int versionCode;

    StartScanRequest(int i, IBinder ibinder, IBinder ibinder1)
    {
        versionCode = i;
        Preconditions.checkNotNull(ibinder);
        scanListener = com.google.android.gms.nearby.bootstrap.internal.IScanListener.Stub.asInterface(ibinder);
        Preconditions.checkNotNull(ibinder1);
        callback = com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback.Stub.asInterface(ibinder1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StartScanRequestCreator.writeToParcel$dea6f23(this, parcel);
    }

}
