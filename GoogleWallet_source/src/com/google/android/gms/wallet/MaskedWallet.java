// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            k, Address, InstrumentInfo, LoyaltyWalletObject, 
//            OfferWalletObject

public final class MaskedWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    String aTl;
    String aTm;
    String aTo;
    Address aTp;
    Address aTq;
    String aTr[];
    UserAddress aTs;
    UserAddress aTt;
    InstrumentInfo aTu[];
    LoyaltyWalletObject aUf[];
    OfferWalletObject aUg[];
    private final int mVersionCode;

    private MaskedWallet()
    {
        mVersionCode = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        mVersionCode = i;
        aTl = s;
        aTm = s1;
        aTr = as;
        aTo = s2;
        aTp = address;
        aTq = address1;
        aUf = aloyaltywalletobject;
        aUg = aofferwalletobject;
        aTs = useraddress;
        aTt = useraddress1;
        aTu = ainstrumentinfo;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
