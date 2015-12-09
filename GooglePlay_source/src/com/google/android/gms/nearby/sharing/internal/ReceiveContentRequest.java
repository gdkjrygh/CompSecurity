// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            ReceiveContentRequestCreator, INearbySharingCallback, IAppContentReceiver

public final class ReceiveContentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ReceiveContentRequestCreator();
    public INearbySharingCallback callback;
    public IBinder clientBinder;
    public IAppContentReceiver contentReceiver;
    public String packageName;
    final int versionCode;

    ReceiveContentRequest()
    {
        versionCode = 1;
    }

    ReceiveContentRequest(int i, IBinder ibinder, IBinder ibinder1, String s, IBinder ibinder2)
    {
        versionCode = i;
        clientBinder = ibinder;
        contentReceiver = IAppContentReceiver.Stub.asInterface(ibinder1);
        packageName = s;
        callback = INearbySharingCallback.Stub.asInterface(ibinder2);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ReceiveContentRequestCreator.writeToParcel$3585cd86(this, parcel);
    }

}
