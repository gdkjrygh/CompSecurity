// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.server:
//            FetchContactParams

final class k
    implements android.os.Parcelable.Creator
{

    k()
    {
    }

    public FetchContactParams a(Parcel parcel)
    {
        return new FetchContactParams(parcel, null);
    }

    public FetchContactParams[] a(int i)
    {
        return new FetchContactParams[i];
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
