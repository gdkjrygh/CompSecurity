// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnDownloadProgressResponseCreator

public class OnDownloadProgressResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OnDownloadProgressResponseCreator();
    private static final List NO_RANGES = Collections.emptyList();
    final long mBytesExpected;
    final long mBytesLoaded;
    final List mRangesAvailable;
    final int mStatus;
    final int mVersionCode;

    OnDownloadProgressResponse(int i, long l, long l1, int j, List list)
    {
        mVersionCode = i;
        mBytesLoaded = l;
        mBytesExpected = l1;
        mStatus = j;
        mRangesAvailable = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OnDownloadProgressResponseCreator.writeToParcel$6043b49e(this, parcel);
    }

}
