// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetCloudSyncOptInStatusCreator

public class GetCloudSyncOptInStatusResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetCloudSyncOptInStatusCreator();
    public final boolean isOptInOrOutDone;
    public final boolean isOptedIn;
    public final int statusCode;
    public final int versionCode;

    GetCloudSyncOptInStatusResponse(int i, int j, boolean flag, boolean flag1)
    {
        versionCode = i;
        statusCode = j;
        isOptInOrOutDone = flag;
        isOptedIn = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetCloudSyncOptInStatusCreator.writeToParcel$252681cf(this, parcel);
    }

}
