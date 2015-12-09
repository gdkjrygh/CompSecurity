// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Parcel;

// Referenced classes of package com.dominos.android.sdk.core.models.loyalty:
//            LoyaltyCoupon

final class A
    implements android.os.or
{

    public final LoyaltyCoupon createFromParcel(Parcel parcel)
    {
        return new LoyaltyCoupon(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final LoyaltyCoupon[] newArray(int i)
    {
        return new LoyaltyCoupon[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    A()
    {
    }
}
