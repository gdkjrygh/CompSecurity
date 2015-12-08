// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            k, Address, InstrumentInfo, LoyaltyWalletObject, 
//            OfferWalletObject

public final class MaskedWallet
    implements SafeParcelable
{
    public final class Builder
    {

        final MaskedWallet ato;

        public MaskedWallet build()
        {
            return ato;
        }

        public Builder setBillingAddress(Address address)
        {
            ato.asF = address;
            return this;
        }

        public Builder setBuyerBillingAddress(UserAddress useraddress)
        {
            ato.asI = useraddress;
            return this;
        }

        public Builder setBuyerShippingAddress(UserAddress useraddress)
        {
            ato.asJ = useraddress;
            return this;
        }

        public Builder setEmail(String s)
        {
            ato.asE = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            ato.asB = s;
            return this;
        }

        public Builder setInstrumentInfos(InstrumentInfo ainstrumentinfo[])
        {
            ato.asK = ainstrumentinfo;
            return this;
        }

        public Builder setLoyaltyWalletObjects(LoyaltyWalletObject aloyaltywalletobject[])
        {
            ato.atm = aloyaltywalletobject;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            ato.asC = s;
            return this;
        }

        public Builder setOfferWalletObjects(OfferWalletObject aofferwalletobject[])
        {
            ato.atn = aofferwalletobject;
            return this;
        }

        public Builder setPaymentDescriptions(String as[])
        {
            ato.asH = as;
            return this;
        }

        public Builder setShippingAddress(Address address)
        {
            ato.asG = address;
            return this;
        }

        private Builder()
        {
            ato = MaskedWallet.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new k();
    private final int BR;
    String asB;
    String asC;
    String asE;
    Address asF;
    Address asG;
    String asH[];
    UserAddress asI;
    UserAddress asJ;
    InstrumentInfo asK[];
    LoyaltyWalletObject atm[];
    OfferWalletObject atn[];

    private MaskedWallet()
    {
        BR = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        BR = i;
        asB = s;
        asC = s1;
        asH = as;
        asE = s2;
        asF = address;
        asG = address1;
        atm = aloyaltywalletobject;
        atn = aofferwalletobject;
        asI = useraddress;
        asJ = useraddress1;
        asK = ainstrumentinfo;
    }

    public static Builder newBuilderFrom(MaskedWallet maskedwallet)
    {
        o.i(maskedwallet);
        return pM().setGoogleTransactionId(maskedwallet.getGoogleTransactionId()).setMerchantTransactionId(maskedwallet.getMerchantTransactionId()).setPaymentDescriptions(maskedwallet.getPaymentDescriptions()).setInstrumentInfos(maskedwallet.getInstrumentInfos()).setEmail(maskedwallet.getEmail()).setLoyaltyWalletObjects(maskedwallet.getLoyaltyWalletObjects()).setOfferWalletObjects(maskedwallet.getOfferWalletObjects()).setBuyerBillingAddress(maskedwallet.getBuyerBillingAddress()).setBuyerShippingAddress(maskedwallet.getBuyerShippingAddress());
    }

    public static Builder pM()
    {
        MaskedWallet maskedwallet = new MaskedWallet();
        maskedwallet.getClass();
        return maskedwallet. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return asF;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return asI;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return asJ;
    }

    public String getEmail()
    {
        return asE;
    }

    public String getGoogleTransactionId()
    {
        return asB;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return asK;
    }

    public LoyaltyWalletObject[] getLoyaltyWalletObjects()
    {
        return atm;
    }

    public String getMerchantTransactionId()
    {
        return asC;
    }

    public OfferWalletObject[] getOfferWalletObjects()
    {
        return atn;
    }

    public String[] getPaymentDescriptions()
    {
        return asH;
    }

    public Address getShippingAddress()
    {
        return asG;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
