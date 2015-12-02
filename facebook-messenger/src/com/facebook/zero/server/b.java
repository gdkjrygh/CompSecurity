// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.zero.server:
//            FetchZeroTokenResult

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public FetchZeroTokenResult a(Parcel parcel)
    {
        return new FetchZeroTokenResult(parcel);
    }

    public FetchZeroTokenResult[] a(int i)
    {
        return new FetchZeroTokenResult[0];
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
