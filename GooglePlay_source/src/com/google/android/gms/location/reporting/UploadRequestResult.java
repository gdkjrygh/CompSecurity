// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.reporting:
//            UploadRequestResultCreator

public final class UploadRequestResult
    implements SafeParcelable
{

    public static final UploadRequestResultCreator CREATOR = new UploadRequestResultCreator();
    final long mRequestId;
    final int mResultCode;
    final int mVersionCode;

    UploadRequestResult(int i, int j, long l)
    {
        mVersionCode = i;
        mResultCode = j;
        mRequestId = l;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof UploadRequestResult)
        {
            if (mRequestId == ((UploadRequestResult) (obj = (UploadRequestResult)obj)).mRequestId && mResultCode == ((UploadRequestResult) (obj)).mResultCode)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mResultCode), Long.valueOf(mRequestId)
        });
    }

    public final String toString()
    {
        return (new StringBuilder("Result{mVersionCode=")).append(mVersionCode).append(", mResultCode=").append(mResultCode).append(", mRequestId=").append(mRequestId).append('}').toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        UploadRequestResultCreator.writeToParcel$40360378(this, parcel);
    }

}
