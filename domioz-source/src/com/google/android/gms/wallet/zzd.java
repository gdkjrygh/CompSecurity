// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            o, LoyaltyWalletObject, OfferWalletObject, GiftCardWalletObject

public final class zzd
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    LoyaltyWalletObject a;
    OfferWalletObject b;
    GiftCardWalletObject c;
    private final int d;

    zzd()
    {
        d = 3;
    }

    zzd(int i, LoyaltyWalletObject loyaltywalletobject, OfferWalletObject offerwalletobject, GiftCardWalletObject giftcardwalletobject)
    {
        d = i;
        a = loyaltywalletobject;
        b = offerwalletobject;
        c = giftcardwalletobject;
    }

    public final int a()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
