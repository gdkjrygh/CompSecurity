// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.protocol;

import android.os.Parcel;

// Referenced classes of package com.facebook.auth.protocol:
//            GetLoggedInUserResult

final class i
    implements android.os.Parcelable.Creator
{

    i()
    {
    }

    public GetLoggedInUserResult a(Parcel parcel)
    {
        return new GetLoggedInUserResult(parcel, null);
    }

    public GetLoggedInUserResult[] a(int j)
    {
        return new GetLoggedInUserResult[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
