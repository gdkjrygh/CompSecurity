// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.wallet:
//            k, Address, InstrumentInfo, LoyaltyWalletObject, 
//            OfferWalletObject

public final class MaskedWallet
    implements SafeParcelable
{
    public final class Builder
    {

        final MaskedWallet avy;

        public MaskedWallet build()
        {
            return avy;
        }

        public Builder setBillingAddress(Address address)
        {
            avy.auP = address;
            return this;
        }

        public Builder setBuyerBillingAddress(UserAddress useraddress)
        {
            avy.auS = useraddress;
            return this;
        }

        public Builder setBuyerShippingAddress(UserAddress useraddress)
        {
            avy.auT = useraddress;
            return this;
        }

        public Builder setEmail(String s)
        {
            avy.auO = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            avy.auL = s;
            return this;
        }

        public Builder setInstrumentInfos(InstrumentInfo ainstrumentinfo[])
        {
            avy.auU = ainstrumentinfo;
            return this;
        }

        public Builder setLoyaltyWalletObjects(LoyaltyWalletObject aloyaltywalletobject[])
        {
            avy.avw = aloyaltywalletobject;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            avy.auM = s;
            return this;
        }

        public Builder setOfferWalletObjects(OfferWalletObject aofferwalletobject[])
        {
            avy.avx = aofferwalletobject;
            return this;
        }

        public Builder setPaymentDescriptions(String as[])
        {
            avy.auR = as;
            return this;
        }

        public Builder setShippingAddress(Address address)
        {
            avy.auQ = address;
            return this;
        }

        private Builder()
        {
            avy = MaskedWallet.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new k();
    private final int CK;
    String auL;
    String auM;
    String auO;
    Address auP;
    Address auQ;
    String auR[];
    UserAddress auS;
    UserAddress auT;
    InstrumentInfo auU[];
    LoyaltyWalletObject avw[];
    OfferWalletObject avx[];

    private MaskedWallet()
    {
        CK = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        CK = i;
        auL = s;
        auM = s1;
        auR = as;
        auO = s2;
        auP = address;
        auQ = address1;
        avw = aloyaltywalletobject;
        avx = aofferwalletobject;
        auS = useraddress;
        auT = useraddress1;
        auU = ainstrumentinfo;
    }

    public static Builder newBuilderFrom(MaskedWallet maskedwallet)
    {
        jx.i(maskedwallet);
        return rd().setGoogleTransactionId(maskedwallet.getGoogleTransactionId()).setMerchantTransactionId(maskedwallet.getMerchantTransactionId()).setPaymentDescriptions(maskedwallet.getPaymentDescriptions()).setInstrumentInfos(maskedwallet.getInstrumentInfos()).setEmail(maskedwallet.getEmail()).setLoyaltyWalletObjects(maskedwallet.getLoyaltyWalletObjects()).setOfferWalletObjects(maskedwallet.getOfferWalletObjects()).setBuyerBillingAddress(maskedwallet.getBuyerBillingAddress()).setBuyerShippingAddress(maskedwallet.getBuyerShippingAddress());
    }

    public static Builder rd()
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
        return auP;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return auS;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return auT;
    }

    public String getEmail()
    {
        return auO;
    }

    public String getGoogleTransactionId()
    {
        return auL;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return auU;
    }

    public LoyaltyWalletObject[] getLoyaltyWalletObjects()
    {
        return avw;
    }

    public String getMerchantTransactionId()
    {
        return auM;
    }

    public OfferWalletObject[] getOfferWalletObjects()
    {
        return avx;
    }

    public String[] getPaymentDescriptions()
    {
        return auR;
    }

    public Address getShippingAddress()
    {
        return auQ;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
