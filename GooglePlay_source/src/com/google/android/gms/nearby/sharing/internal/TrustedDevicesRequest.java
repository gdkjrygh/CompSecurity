// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            TrustedDevicesRequestCreator, INearbySharingCallback

public final class TrustedDevicesRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new TrustedDevicesRequestCreator();
    public INearbySharingCallback callback;
    public String deviceIdentifier;
    public byte message[];
    final int versionCode;

    TrustedDevicesRequest(int i, String s, byte abyte0[], IBinder ibinder)
    {
        versionCode = i;
        deviceIdentifier = (String)Preconditions.checkNotNull(s);
        message = (byte[])Preconditions.checkNotNull(abyte0);
        callback = INearbySharingCallback.Stub.asInterface(ibinder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        TrustedDevicesRequestCreator.writeToParcel$73b9be4a(this, parcel);
    }

}
