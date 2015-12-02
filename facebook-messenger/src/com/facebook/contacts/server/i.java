// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.server:
//            FetchChatContextParams

final class i
    implements android.os.Parcelable.Creator
{

    i()
    {
    }

    public FetchChatContextParams a(Parcel parcel)
    {
        return new FetchChatContextParams(parcel, null);
    }

    public FetchChatContextParams[] a(int j)
    {
        return new FetchChatContextParams[j];
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
