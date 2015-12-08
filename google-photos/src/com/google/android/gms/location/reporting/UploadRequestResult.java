// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import lig;

public final class UploadRequestResult
    implements SafeParcelable
{

    public static final lig CREATOR = new lig();
    public final int a;
    public final int b;
    public final long c;

    public UploadRequestResult(int i, int j, long l)
    {
        a = i;
        b = j;
        c = l;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof UploadRequestResult)
        {
            if (c == ((UploadRequestResult) (obj = (UploadRequestResult)obj)).c && b == ((UploadRequestResult) (obj)).b)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Long.valueOf(c)
        });
    }

    public final String toString()
    {
        return (new StringBuilder("Result{mVersionCode=")).append(a).append(", mResultCode=").append(b).append(", mRequestId=").append(c).append('}').toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lig.a(this, parcel);
    }

}
