// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import android.os.Parcel;

// Referenced classes of package com.facebook.http.protocol:
//            ApiErrorResult

final class c
    implements android.os.Parcelable.Creator
{

    c()
    {
    }

    public ApiErrorResult a(Parcel parcel)
    {
        return new ApiErrorResult(parcel, null);
    }

    public ApiErrorResult[] a(int i)
    {
        return new ApiErrorResult[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
