// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;

// Referenced classes of package com.amazon.device.associates:
//            Product

final class bw
    implements android.os.Parcelable.Creator
{

    bw()
    {
    }

    public Product a(Parcel parcel)
    {
        return new Product(parcel, null);
    }

    public Product[] a(int i)
    {
        return new Product[i];
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
