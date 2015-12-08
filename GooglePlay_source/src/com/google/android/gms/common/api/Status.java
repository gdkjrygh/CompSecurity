// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, StatusCreator, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new StatusCreator();
    public static final Status RESULT_CANCELED = new Status(16);
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);
    public static final Status RESULT_INTERRUPTED = new Status(14);
    public static final Status RESULT_SUCCESS = new Status(0);
    public static final Status RESULT_TIMEOUT = new Status(15);
    final PendingIntent mPendingIntent;
    public final int mStatusCode;
    final String mStatusMessage;
    final int mVersionCode;

    public Status(int i)
    {
        this(i, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        mVersionCode = i;
        mStatusCode = j;
        mStatusMessage = s;
        mPendingIntent = pendingintent;
    }

    public Status(int i, String s)
    {
        this(1, i, s, null);
    }

    public Status(int i, String s, PendingIntent pendingintent)
    {
        this(1, i, s, pendingintent);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (mVersionCode == ((Status) (obj = (Status)obj)).mVersionCode && mStatusCode == ((Status) (obj)).mStatusCode && Objects.equal(mStatusMessage, ((Status) (obj)).mStatusMessage) && Objects.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
            {
                return true;
            }
        }
        return false;
    }

    public final Status getStatus()
    {
        return this;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), Integer.valueOf(mStatusCode), mStatusMessage, mPendingIntent
        });
    }

    public final boolean isSuccess()
    {
        return mStatusCode <= 0;
    }

    public final String toString()
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this);
        String s;
        if (mStatusMessage != null)
        {
            s = mStatusMessage;
        } else
        {
            s = CommonStatusCodes.getStatusCodeString(mStatusCode);
        }
        return tostringhelper.add("statusCode", s).add("resolution", mPendingIntent).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        StatusCreator.writeToParcel(this, parcel, i);
    }

}
