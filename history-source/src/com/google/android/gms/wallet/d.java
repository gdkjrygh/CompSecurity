// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            e, LoyaltyWalletObject, OfferWalletObject

public final class d
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private final int CK;
    LoyaltyWalletObject auJ;
    OfferWalletObject auK;

    d()
    {
        CK = 2;
    }

    d(int i, LoyaltyWalletObject loyaltywalletobject, OfferWalletObject offerwalletobject)
    {
        CK = i;
        auJ = loyaltywalletobject;
        auK = offerwalletobject;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
