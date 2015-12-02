// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.server:
//            FetchStickerPacksResult

final class w
    implements android.os.Parcelable.Creator
{

    w()
    {
    }

    public FetchStickerPacksResult a(Parcel parcel)
    {
        return new FetchStickerPacksResult(parcel, null);
    }

    public FetchStickerPacksResult[] a(int i)
    {
        return new FetchStickerPacksResult[i];
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
