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

        final MaskedWalletRequest acg;

        public Builder addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
        {
            if (acg.acf == null)
            {
                acg.acf = new ArrayList();
            }
            acg.acf.add(countryspecification);
            return this;
        }

        public Builder addAllowedCountrySpecificationsForShipping(Collection collection)
        {
            if (collection != null)
            {
                if (acg.acf == null)
                {
                    acg.acf = new ArrayList();
                }
                acg.acf.addAll(collection);
            }
            return this;
        }

        public MaskedWalletRequest build()
        {
            return acg;
        }

        public Builder setAllowDebitCard(boolean flag)
        {
            acg.ace = flag;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean flag)
        {
            acg.acd = flag;
            return this;
        }

        public Builder setCart(Cart cart)
        {
            acg.abr = cart;
            return this;
        }

        public Builder setCurrencyCode(String s)
        {
            acg.abd = s;
            return this;
        }

        public Builder setEstimatedTotalPrice(String s)
        {
            acg.abY = s;
            return this;
        }

        public Builder setIsBillingAgreement(boolean flag)
        {
            acg.acb = flag;
            return this;
        }

        public Builder setMerchantName(String s)
        {
            acg.abZ = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            acg.abi = s;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean flag)
        {
            acg.abV = flag;
            return this;
        }

        public Builder setShippingAddressRequired(boolean flag)
        {
            acg.abW = flag;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean flag)
        {
            acg.aca = flag;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean flag)
        {
            acg.abX = flag;
            return this;
        }

        private Builder()
        {
            acg = MaskedWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new l();
    boolean abV;
    boolean abW;
    boolean abX;
    String abY;
    String abZ;
    String abd;
    String abi;
    Cart abr;
    boolean aca;
    boolean acb;
    com.google.android.gms.wallet.CountrySpecification acc[];
    boolean acd;
    boolean ace;
    ArrayList acf;
    private final int xH;

    MaskedWalletRequest()
    {
        xH = 3;
        acd = true;
        ace = true;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, com.google.android.gms.wallet.CountrySpecification acountryspecification[], boolean flag5, boolean flag6, 
            ArrayList arraylist)
    {
        xH = i;
        abi = s;
        abV = flag;
        abW = flag1;
        abX = flag2;
        abY = s1;
        abd = s2;
        abZ = s3;
        abr = cart;
        aca = flag3;
        acb = flag4;
        acc = acountryspecification;
        acd = flag5;
        ace = flag6;
        acf = arraylist;
    }

    public static Builder newBuilder()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return maskedwalletrequest. new Builder();
    }

    public boolean allowDebitCard()
    {
        return ace;
    }

    public boolean allowPrepaidCard()
    {
        return acd;
    }

    public int describeContents()
    {
        return 0;
    }

    public ArrayList getAllowedCountrySpecificationsForShipping()
    {
        return acf;
    }

    public com.google.android.gms.wallet.CountrySpecification[] getAllowedShippingCountrySpecifications()
    {
        return acc;
    }

    public Cart getCart()
    {
        return abr;
    }

    public String getCurrencyCode()
    {
        return abd;
    }

    public String getEstimatedTotalPrice()
    {
        return abY;
    }

    public String getMerchantName()
    {
        return abZ;
    }

    public String getMerchantTransactionId()
    {
        return abi;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public boolean isBillingAgreement()
    {
        return acb;
    }

    public boolean isPhoneNumberRequired()
    {
        return abV;
    }

    public boolean isShippingAddressRequired()
    {
        return abW;
    }

    public boolean shouldRetrieveWalletObjects()
    {
        return aca;
    }

    public boolean useMinimalBillingAddress()
    {
        return abX;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
