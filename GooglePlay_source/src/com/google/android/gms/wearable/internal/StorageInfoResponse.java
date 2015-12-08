// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            StorageInfoResponseCreator

public class StorageInfoResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new StorageInfoResponseCreator();
    public final List packageStorageInfo;
    public final int statusCode;
    public final long totalSizeBytes;
    public final int versionCode;

    StorageInfoResponse(int i, int j, long l, List list)
    {
        versionCode = i;
        statusCode = j;
        totalSizeBytes = l;
        packageStorageInfo = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StorageInfoResponseCreator.writeToParcel$3afab916(this, parcel);
    }

}
