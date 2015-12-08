// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.wallet:
//            l, Cart, CountrySpecification

public final class MaskedWalletRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final MaskedWalletRequest atA;

        public Builder addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
        {
            if (atA.atz == null)
            {
                atA.atz = new ArrayList();
            }
            atA.atz.add(countryspecification);
            return this;
        }

        public Builder addAllowedCountrySpecificationsForShipping(Collection collection)
        {
            if (collection != null)
            {
                if (atA.atz == null)
                {
                    atA.atz = new ArrayList();
                }
                atA.atz.addAll(collection);
            }
            return this;
        }

        public MaskedWalletRequest build()
        {
            return atA;
        }

        public Builder setAllowDebitCard(boolean flag)
        {
            atA.aty = flag;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean flag)
        {
            atA.atx = flag;
            return this;
        }

        public Builder setCart(Cart cart)
        {
            atA.asL = cart;
            return this;
        }

        public Builder setCurrencyCode(String s)
        {
            atA.asw = s;
            return this;
        }

        public Builder setEstimatedTotalPrice(String s)
        {
            atA.ats = s;
            return this;
        }

        public Builder setIsBillingAgreement(boolean flag)
        {
            atA.atv = flag;
            return this;
        }

        public Builder setMerchantName(String s)
        {
            atA.att = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            atA.asC = s;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean flag)
        {
            atA.atp = flag;
            return this;
        }

        public Builder setShippingAddressRequired(boolean flag)
        {
            atA.atq = flag;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean flag)
        {
            atA.atu = flag;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean flag)
        {
            atA.atr = flag;
            return this;
        }

        private Builder()
        {
            atA = MaskedWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new l();
    private final int BR;
    String asC;
    Cart asL;
    String asw;
    boolean atp;
    boolean atq;
    boolean atr;
    String ats;
    String att;
    boolean atu;
    boolean atv;
    com.google.android.gms.wallet.CountrySpecification atw[];
    boolean atx;
    boolean aty;
    ArrayList atz;

    MaskedWalletRequest()
    {
        BR = 3;
        atx = true;
        aty = true;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, com.google.android.gms.wallet.CountrySpecification acountryspecification[], boolean flag5, boolean flag6, 
            ArrayList arraylist)
    {
        BR = i;
        asC = s;
        atp = flag;
        atq = flag1;
        atr = flag2;
        ats = s1;
        asw = s2;
        att = s3;
        asL = cart;
        atu = flag3;
        atv = flag4;
        atw = acountryspecification;
        atx = flag5;
        aty = flag6;
        atz = arraylist;
    }

    public static Builder newBuilder()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return maskedwalletrequest. new Builder();
    }

    public boolean allowDebitCard()
    {
        return aty;
    }

    public boolean allowPrepaidCard()
    {
        return atx;
    }

    public int describeContents()
    {
        return 0;
    }

    public ArrayList getAllowedCountrySpecificationsForShipping()
    {
        return atz;
    }

    public com.google.android.gms.wallet.CountrySpecification[] getAllowedShippingCountrySpecifications()
    {
        return atw;
    }

    public Cart getCart()
    {
        return asL;
    }

    public String getCurrencyCode()
    {
        return asw;
    }

    public String getEstimatedTotalPrice()
    {
        return ats;
    }

    public String getMerchantName()
    {
        return att;
    }

    public String getMerchantTransactionId()
    {
        return asC;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public boolean isBillingAgreement()
    {
        return atv;
    }

    public boolean isPhoneNumberRequired()
    {
        return atp;
    }

    public boolean isShippingAddressRequired()
    {
        return atq;
    }

    public boolean shouldRetrieveWalletObjects()
    {
        return atu;
    }

    public boolean useMinimalBillingAddress()
    {
        return atr;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
