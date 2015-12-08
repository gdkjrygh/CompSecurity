// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            PackageStorageInfoCreator

public class PackageStorageInfo
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PackageStorageInfoCreator();
    public final String label;
    public final String packageName;
    public final long totalSizeBytes;
    public final int versionCode;

    PackageStorageInfo(int i, String s, String s1, long l)
    {
        versionCode = i;
        packageName = s;
        label = s1;
        totalSizeBytes = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PackageStorageInfoCreator.writeToParcel$7f7ed7c7(this, parcel);
    }

}
