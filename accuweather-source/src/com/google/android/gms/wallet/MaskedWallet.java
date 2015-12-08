// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.wallet:
//            k, Address, InstrumentInfo, OfferWalletObject, 
//            LoyaltyWalletObject

public final class MaskedWallet
    implements SafeParcelable
{
    public final class Builder
    {

        final MaskedWallet ajB;

        public MaskedWallet build()
        {
            return ajB;
        }

        public Builder setBillingAddress(Address address)
        {
            ajB.aiR = address;
            return this;
        }

        public Builder setBuyerBillingAddress(UserAddress useraddress)
        {
            ajB.aiU = useraddress;
            return this;
        }

        public Builder setBuyerShippingAddress(UserAddress useraddress)
        {
            ajB.aiV = useraddress;
            return this;
        }

        public Builder setEmail(String s)
        {
            ajB.aiQ = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            ajB.aiN = s;
            return this;
        }

        public Builder setInstrumentInfos(InstrumentInfo ainstrumentinfo[])
        {
            ajB.aiW = ainstrumentinfo;
            return this;
        }

        public Builder setLoyaltyWalletObjects(LoyaltyWalletObject aloyaltywalletobject[])
        {
            ajB.ajz = aloyaltywalletobject;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            ajB.aiO = s;
            return this;
        }

        public Builder setOfferWalletObjects(OfferWalletObject aofferwalletobject[])
        {
            ajB.ajA = aofferwalletobject;
            return this;
        }

        public Builder setPaymentDescriptions(String as[])
        {
            ajB.aiT = as;
            return this;
        }

        public Builder setShippingAddress(Address address)
        {
            ajB.aiS = address;
            return this;
        }

        private Builder()
        {
            ajB = MaskedWallet.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new k();
    String aiN;
    String aiO;
    String aiQ;
    Address aiR;
    Address aiS;
    String aiT[];
    UserAddress aiU;
    UserAddress aiV;
    InstrumentInfo aiW[];
    OfferWalletObject ajA[];
    LoyaltyWalletObject ajz[];
    private final int xJ;

    private MaskedWallet()
    {
        xJ = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        xJ = i;
        aiN = s;
        aiO = s1;
        aiT = as;
        aiQ = s2;
        aiR = address;
        aiS = address1;
        ajz = aloyaltywalletobject;
        ajA = aofferwalletobject;
        aiU = useraddress;
        aiV = useraddress1;
        aiW = ainstrumentinfo;
    }

    public static Builder nb()
    {
        MaskedWallet maskedwallet = new MaskedWallet();
        maskedwallet.getClass();
        return maskedwallet. new Builder();
    }

    public static Builder newBuilderFrom(MaskedWallet maskedwallet)
    {
        hn.f(maskedwallet);
        return nb().setGoogleTransactionId(maskedwallet.getGoogleTransactionId()).setMerchantTransactionId(maskedwallet.getMerchantTransactionId()).setPaymentDescriptions(maskedwallet.getPaymentDescriptions()).setInstrumentInfos(maskedwallet.getInstrumentInfos()).setEmail(maskedwallet.getEmail()).setLoyaltyWalletObjects(maskedwallet.getLoyaltyWalletObjects()).setOfferWalletObjects(maskedwallet.getOfferWalletObjects()).setBuyerBillingAddress(maskedwallet.getBuyerBillingAddress()).setBuyerShippingAddress(maskedwallet.getBuyerShippingAddress());
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return aiR;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return aiU;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return aiV;
    }

    public String getEmail()
    {
        return aiQ;
    }

    public String getGoogleTransactionId()
    {
        return aiN;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return aiW;
    }

    public LoyaltyWalletObject[] getLoyaltyWalletObjects()
    {
        return ajz;
    }

    public String getMerchantTransactionId()
    {
        return aiO;
    }

    public OfferWalletObject[] getOfferWalletObjects()
    {
        return ajA;
    }

    public String[] getPaymentDescriptions()
    {
        return aiT;
    }

    public Address getShippingAddress()
    {
        return aiS;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
