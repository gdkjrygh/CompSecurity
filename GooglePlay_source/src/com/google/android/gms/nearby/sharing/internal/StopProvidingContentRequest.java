// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            StopProvidingContentRequestCreator, INearbySharingCallback

public final class StopProvidingContentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new StopProvidingContentRequestCreator();
    public long activityId;
    public INearbySharingCallback callback;
    final int versionCode;

    StopProvidingContentRequest()
    {
        versionCode = 1;
    }

    StopProvidingContentRequest(int i, long l, IBinder ibinder)
    {
        versionCode = i;
        activityId = l;
        callback = INearbySharingCallback.Stub.asInterface(ibinder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        StopProvidingContentRequestCreator.writeToParcel$5cfa03ff(this, parcel);
    }

}
