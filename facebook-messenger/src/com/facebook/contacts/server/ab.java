// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.server:
//            UpdateFavoriteContactsParams

final class ab
    implements android.os.Parcelable.Creator
{

    ab()
    {
    }

    public UpdateFavoriteContactsParams a(Parcel parcel)
    {
        return new UpdateFavoriteContactsParams(parcel);
    }

    public UpdateFavoriteContactsParams[] a(int i)
    {
        return new UpdateFavoriteContactsParams[i];
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
