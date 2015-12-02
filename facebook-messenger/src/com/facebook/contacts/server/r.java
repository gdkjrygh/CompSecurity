// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.server:
//            FetchLastActiveResult

final class r
    implements android.os.Parcelable.Creator
{

    r()
    {
    }

    public FetchLastActiveResult a(Parcel parcel)
    {
        return new FetchLastActiveResult(parcel, null);
    }

    public FetchLastActiveResult[] a(int i)
    {
        return new FetchLastActiveResult[i];
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
