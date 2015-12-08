// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.wallet:
//            k, Address, InstrumentInfo, LoyaltyWalletObject, 
//            OfferWalletObject

public final class MaskedWallet
    implements SafeParcelable
{
    public final class Builder
    {

        final MaskedWallet ajE;

        public MaskedWallet build()
        {
            return ajE;
        }

        public Builder setBillingAddress(Address address)
        {
            ajE.aiU = address;
            return this;
        }

        public Builder setBuyerBillingAddress(UserAddress useraddress)
        {
            ajE.aiX = useraddress;
            return this;
        }

        public Builder setBuyerShippingAddress(UserAddress useraddress)
        {
            ajE.aiY = useraddress;
            return this;
        }

        public Builder setEmail(String s)
        {
            ajE.aiT = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            ajE.aiQ = s;
            return this;
        }

        public Builder setInstrumentInfos(InstrumentInfo ainstrumentinfo[])
        {
            ajE.aiZ = ainstrumentinfo;
            return this;
        }

        public Builder setLoyaltyWalletObjects(LoyaltyWalletObject aloyaltywalletobject[])
        {
            ajE.ajC = aloyaltywalletobject;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            ajE.aiR = s;
            return this;
        }

        public Builder setOfferWalletObjects(OfferWalletObject aofferwalletobject[])
        {
            ajE.ajD = aofferwalletobject;
            return this;
        }

        public Builder setPaymentDescriptions(String as[])
        {
            ajE.aiW = as;
            return this;
        }

        public Builder setShippingAddress(Address address)
        {
            ajE.aiV = address;
            return this;
        }

        private Builder()
        {
            ajE = MaskedWallet.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new k();
    String aiQ;
    String aiR;
    String aiT;
    Address aiU;
    Address aiV;
    String aiW[];
    UserAddress aiX;
    UserAddress aiY;
    InstrumentInfo aiZ[];
    LoyaltyWalletObject ajC[];
    OfferWalletObject ajD[];
    private final int xM;

    private MaskedWallet()
    {
        xM = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        xM = i;
        aiQ = s;
        aiR = s1;
        aiW = as;
        aiT = s2;
        aiU = address;
        aiV = address1;
        ajC = aloyaltywalletobject;
        ajD = aofferwalletobject;
        aiX = useraddress;
        aiY = useraddress1;
        aiZ = ainstrumentinfo;
    }

    public static Builder newBuilderFrom(MaskedWallet maskedwallet)
    {
        hm.f(maskedwallet);
        return ng().setGoogleTransactionId(maskedwallet.getGoogleTransactionId()).setMerchantTransactionId(maskedwallet.getMerchantTransactionId()).setPaymentDescriptions(maskedwallet.getPaymentDescriptions()).setInstrumentInfos(maskedwallet.getInstrumentInfos()).setEmail(maskedwallet.getEmail()).setLoyaltyWalletObjects(maskedwallet.getLoyaltyWalletObjects()).setOfferWalletObjects(maskedwallet.getOfferWalletObjects()).setBuyerBillingAddress(maskedwallet.getBuyerBillingAddress()).setBuyerShippingAddress(maskedwallet.getBuyerShippingAddress());
    }

    public static Builder ng()
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
        return aiU;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return aiX;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return aiY;
    }

    public String getEmail()
    {
        return aiT;
    }

    public String getGoogleTransactionId()
    {
        return aiQ;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return aiZ;
    }

    public LoyaltyWalletObject[] getLoyaltyWalletObjects()
    {
        return ajC;
    }

    public String getMerchantTransactionId()
    {
        return aiR;
    }

    public OfferWalletObject[] getOfferWalletObjects()
    {
        return ajD;
    }

    public String[] getPaymentDescriptions()
    {
        return aiW;
    }

    public Address getShippingAddress()
    {
        return aiV;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
