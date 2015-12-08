// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetQueryCreator

public final class LargeAssetQuery
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LargeAssetQueryCreator();
    public final Uri destinationUri;
    final int mVersionCode;
    public final int stateFlags;

    LargeAssetQuery(int i, int j, Uri uri)
    {
        mVersionCode = i;
        stateFlags = j;
        destinationUri = uri;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder("LargeAssetQuery{stateFlags=")).append(stateFlags).append(", destinationUri=").append(destinationUri).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LargeAssetQueryCreator.writeToParcel(this, parcel, i);
    }

}
