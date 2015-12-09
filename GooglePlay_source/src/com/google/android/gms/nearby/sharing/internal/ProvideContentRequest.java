// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            ProvideContentRequestCreator, INearbySharingCallback, IContentProvider

public final class ProvideContentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ProvideContentRequestCreator();
    public long activityId;
    public INearbySharingCallback callback;
    public IBinder clientBinder;
    public List content;
    public IContentProvider contentProvider;
    final int versionCode;

    ProvideContentRequest()
    {
        versionCode = 1;
    }

    ProvideContentRequest(int i, IBinder ibinder, IBinder ibinder1, List list, long l, IBinder ibinder2)
    {
        versionCode = i;
        clientBinder = ibinder;
        contentProvider = IContentProvider.Stub.asInterface(ibinder1);
        content = list;
        activityId = l;
        callback = INearbySharingCallback.Stub.asInterface(ibinder2);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ProvideContentRequestCreator.writeToParcel$7643f57c(this, parcel);
    }

}
