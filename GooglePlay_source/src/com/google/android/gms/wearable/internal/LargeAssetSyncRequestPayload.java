// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetSyncRequestPayloadCreator

public class LargeAssetSyncRequestPayload
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LargeAssetSyncRequestPayloadCreator();
    public final long offset;
    public final String path;
    final int versionCode;

    public LargeAssetSyncRequestPayload(int i, String s, long l)
    {
        versionCode = i;
        path = (String)Preconditions.checkNotNull(s, "path");
        offset = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder("LargeAssetSyncRequestPayload{path='")).append(path).append("', offset=").append(offset).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LargeAssetSyncRequestPayloadCreator.writeToParcel$2799b5f3(this, parcel);
    }

}
