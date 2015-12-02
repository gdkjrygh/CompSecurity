// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import android.os.Parcel;

// Referenced classes of package com.facebook.nux.status:
//            FetchNuxStatusesResult

final class c
    implements android.os.Parcelable.Creator
{

    c()
    {
    }

    public FetchNuxStatusesResult a(Parcel parcel)
    {
        return new FetchNuxStatusesResult(parcel, null);
    }

    public FetchNuxStatusesResult[] a(int i)
    {
        return new FetchNuxStatusesResult[i];
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
