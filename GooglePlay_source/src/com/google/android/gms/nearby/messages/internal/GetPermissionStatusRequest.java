// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            GetPermissionStatusRequestCreator, INearbyMessagesCallback

public class GetPermissionStatusRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetPermissionStatusRequestCreator();
    public final INearbyMessagesCallback callback;
    final int mVersionCode;
    public final String zeroPartyPackageName;

    GetPermissionStatusRequest(int i, IBinder ibinder, String s)
    {
        mVersionCode = i;
        callback = INearbyMessagesCallback.Stub.asInterface(ibinder);
        zeroPartyPackageName = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetPermissionStatusRequestCreator.writeToParcel$37f406ad(this, parcel);
    }

}
