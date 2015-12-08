// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CloseContentsRequestCreator

public class CloseContentsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CloseContentsRequestCreator();
    final Contents mContentsReference;
    final int mContentsRequestId;
    final Boolean mSaveResults;
    final int mVersionCode;

    public CloseContentsRequest(int i)
    {
        this(1, null, Boolean.valueOf(false), i);
    }

    CloseContentsRequest(int i, Contents contents, Boolean boolean1, int j)
    {
        mVersionCode = i;
        mContentsReference = contents;
        mSaveResults = boolean1;
        mContentsRequestId = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CloseContentsRequestCreator.writeToParcel(this, parcel, i);
    }

}
