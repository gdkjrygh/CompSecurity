// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;

// Referenced classes of package com.amazon.device.associates:
//            Image

final class bv
    implements android.os.Parcelable.Creator
{

    bv()
    {
    }

    public Image a(Parcel parcel)
    {
        return new Image(parcel, null);
    }

    public Image[] a(int i)
    {
        return new Image[i];
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public volatile Object[] newArray(int i)
    {
        return a(i);
    }
}
