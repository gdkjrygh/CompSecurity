// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            k, LoyaltyWalletObject, OfferWalletObject, Address, 
//            InstrumentInfo

public final class MaskedWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    LoyaltyWalletObject abT[];
    OfferWalletObject abU[];
    String abh;
    String abi;
    String abk;
    Address abl;
    Address abm;
    String abn[];
    UserAddress abo;
    UserAddress abp;
    InstrumentInfo abq[];
    private final int xH;

    private MaskedWallet()
    {
        xH = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        xH = i;
        abh = s;
        abi = s1;
        abn = as;
        abk = s2;
        abl = address;
        abm = address1;
        abT = aloyaltywalletobject;
        abU = aofferwalletobject;
        abo = useraddress;
        abp = useraddress1;
        abq = ainstrumentinfo;
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return abl;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return abo;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return abp;
    }

    public String getEmail()
    {
        return abk;
    }

    public String getGoogleTransactionId()
    {
        return abh;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return abq;
    }

    public LoyaltyWalletObject[] getLoyaltyWalletObjects()
    {
        return abT;
    }

    public String getMerchantTransactionId()
    {
        return abi;
    }

    public OfferWalletObject[] getOfferWalletObjects()
    {
        return abU;
    }

    public String[] getPaymentDescriptions()
    {
        return abn;
    }

    public Address getShippingAddress()
    {
        return abm;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
