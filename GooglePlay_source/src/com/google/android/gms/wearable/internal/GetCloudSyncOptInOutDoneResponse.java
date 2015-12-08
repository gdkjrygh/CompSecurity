// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetCloudSyncOptInOutDoneCreator

public class GetCloudSyncOptInOutDoneResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetCloudSyncOptInOutDoneCreator();
    public final boolean optInOutDone;
    public final int statusCode;
    public final int versionCode;

    GetCloudSyncOptInOutDoneResponse(int i, int j, boolean flag)
    {
        versionCode = i;
        statusCode = j;
        optInOutDone = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetCloudSyncOptInOutDoneCreator.writeToParcel$28711177(this, parcel);
    }

}
