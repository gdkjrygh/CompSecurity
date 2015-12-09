// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetFdForAssetResponseCreator

public class GetFdForAssetResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetFdForAssetResponseCreator();
    public final ParcelFileDescriptor pfd;
    public final int statusCode;
    public final int versionCode;

    GetFdForAssetResponse(int i, int j, ParcelFileDescriptor parcelfiledescriptor)
    {
        versionCode = i;
        statusCode = j;
        pfd = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetFdForAssetResponseCreator.writeToParcel(this, parcel, i | 1);
    }

}
