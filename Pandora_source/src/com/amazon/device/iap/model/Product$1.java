// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;

import android.os.Parcel;

// Referenced classes of package com.amazon.device.iap.model:
//            Product

static final class 
    implements android.os..Creator
{

    public Product createFromParcel(Parcel parcel)
    {
        return new Product(parcel, null);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public Product[] newArray(int i)
    {
        return new Product[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
