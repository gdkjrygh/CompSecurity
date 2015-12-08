// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalOAuthScopes

final class ap
    implements android.os.Parcelable.Creator
{

    ap()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new PayPalOAuthScopes(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PayPalOAuthScopes[i];
    }
}
