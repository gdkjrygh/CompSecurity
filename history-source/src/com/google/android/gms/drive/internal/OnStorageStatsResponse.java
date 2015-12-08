// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.StorageStats;

// Referenced classes of package com.google.android.gms.drive.internal:
//            aw

public class OnStorageStatsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aw();
    final int CK;
    StorageStats QS;

    OnStorageStatsResponse(int i, StorageStats storagestats)
    {
        CK = i;
        QS = storagestats;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aw.a(this, parcel, i);
    }

}
