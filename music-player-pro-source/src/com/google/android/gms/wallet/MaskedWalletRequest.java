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

        final MaskedWalletRequest avK;

        public Builder addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
        {
            if (avK.avJ == null)
            {
                avK.avJ = new ArrayList();
            }
            avK.avJ.add(countryspecification);
            return this;
        }

        public Builder addAllowedCountrySpecificationsForShipping(Collection collection)
        {
            if (collection != null)
            {
                if (avK.avJ == null)
                {
                    avK.avJ = new ArrayList();
                }
                avK.avJ.addAll(collection);
            }
            return this;
        }

        public MaskedWalletRequest build()
        {
            return avK;
        }

        public Builder setAllowDebitCard(boolean flag)
        {
            avK.avI = flag;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean flag)
        {
            avK.avH = flag;
            return this;
        }

        public Builder setCart(Cart cart)
        {
            avK.auV = cart;
            return this;
        }

        public Builder setCurrencyCode(String s)
        {
            avK.auG = s;
            return this;
        }

        public Builder setEstimatedTotalPrice(String s)
        {
            avK.avC = s;
            return this;
        }

        public Builder setIsBillingAgreement(boolean flag)
        {
            avK.avF = flag;
            return this;
        }

        public Builder setMerchantName(String s)
        {
            avK.avD = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            avK.auM = s;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean flag)
        {
            avK.avz = flag;
            return this;
        }

        public Builder setShippingAddressRequired(boolean flag)
        {
            avK.avA = flag;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean flag)
        {
            avK.avE = flag;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean flag)
        {
            avK.avB = flag;
            return this;
        }

        private Builder()
        {
            avK = MaskedWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new l();
    private final int CK;
    String auG;
    String auM;
    Cart auV;
    boolean avA;
    boolean avB;
    String avC;
    String avD;
    boolean avE;
    boolean avF;
    com.google.android.gms.wallet.CountrySpecification avG[];
    boolean avH;
    boolean avI;
    ArrayList avJ;
    boolean avz;

    MaskedWalletRequest()
    {
        CK = 3;
        avH = true;
        avI = true;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, com.google.android.gms.wallet.CountrySpecification acountryspecification[], boolean flag5, boolean flag6, 
            ArrayList arraylist)
    {
        CK = i;
        auM = s;
        avz = flag;
        avA = flag1;
        avB = flag2;
        avC = s1;
        auG = s2;
        avD = s3;
        auV = cart;
        avE = flag3;
        avF = flag4;
        avG = acountryspecification;
        avH = flag5;
        avI = flag6;
        avJ = arraylist;
    }

    public static Builder newBuilder()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return maskedwalletrequest. new Builder();
    }

    public boolean allowDebitCard()
    {
        return avI;
    }

    public boolean allowPrepaidCard()
    {
        return avH;
    }

    public int describeContents()
    {
        return 0;
    }

    public ArrayList getAllowedCountrySpecificationsForShipping()
    {
        return avJ;
    }

    public com.google.android.gms.wallet.CountrySpecification[] getAllowedShippingCountrySpecifications()
    {
        return avG;
    }

    public Cart getCart()
    {
        return auV;
    }

    public String getCurrencyCode()
    {
        return auG;
    }

    public String getEstimatedTotalPrice()
    {
        return avC;
    }

    public String getMerchantName()
    {
        return avD;
    }

    public String getMerchantTransactionId()
    {
        return auM;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public boolean isBillingAgreement()
    {
        return avF;
    }

    public boolean isPhoneNumberRequired()
    {
        return avz;
    }

    public boolean isShippingAddressRequired()
    {
        return avA;
    }

    public boolean shouldRetrieveWalletObjects()
    {
        return avE;
    }

    public boolean useMinimalBillingAddress()
    {
        return avB;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
