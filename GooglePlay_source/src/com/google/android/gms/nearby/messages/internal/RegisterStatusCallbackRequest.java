// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            RegisterStatusCallbackRequestCreator, INearbyMessagesCallback, IStatusCallback

public final class RegisterStatusCallbackRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new RegisterStatusCallbackRequestCreator();
    public final INearbyMessagesCallback callback;
    public boolean isRegister;
    public final IStatusCallback statusCallback;
    final int versionCode;
    public String zeroPartyPackageName;

    RegisterStatusCallbackRequest(int i, IBinder ibinder, IBinder ibinder1, boolean flag, String s)
    {
        versionCode = i;
        callback = INearbyMessagesCallback.Stub.asInterface(ibinder);
        statusCallback = IStatusCallback.Stub.asInterface(ibinder1);
        isRegister = flag;
        zeroPartyPackageName = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        RegisterStatusCallbackRequestCreator.writeToParcel$55f0b97e(this, parcel);
    }

}
