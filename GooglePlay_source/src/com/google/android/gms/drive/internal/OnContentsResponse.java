// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnContentsResponseCreator

public class OnContentsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OnContentsResponseCreator();
    final Contents mContents;
    final boolean mOutOfDate;
    final int mVersionCode;

    OnContentsResponse(int i, Contents contents, boolean flag)
    {
        mVersionCode = i;
        mContents = contents;
        mOutOfDate = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OnContentsResponseCreator.writeToParcel(this, parcel, i);
    }

}
