// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.commerce;

import android.os.Parcel;

// Referenced classes of package com.pinterest.model.commerce:
//            ShippingRate

final class 
    implements android.os.tor
{

    public final ShippingRate createFromParcel(Parcel parcel)
    {
        return new ShippingRate(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final ShippingRate[] newArray(int i)
    {
        return new ShippingRate[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
