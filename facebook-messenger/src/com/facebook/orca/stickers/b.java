// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.stickers:
//            Sticker

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public Sticker a(Parcel parcel)
    {
        return new Sticker(parcel, null);
    }

    public Sticker[] a(int i)
    {
        return new Sticker[i];
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
