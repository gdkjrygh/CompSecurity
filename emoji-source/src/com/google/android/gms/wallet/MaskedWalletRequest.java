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
//            l, CountrySpecification, Cart

public final class MaskedWalletRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final MaskedWalletRequest ajQ;

        public Builder addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
        {
            if (ajQ.ajP == null)
            {
                ajQ.ajP = new ArrayList();
            }
            ajQ.ajP.add(countryspecification);
            return this;
        }

        public Builder addAllowedCountrySpecificationsForShipping(Collection collection)
        {
            if (collection != null)
            {
                if (ajQ.ajP == null)
                {
                    ajQ.ajP = new ArrayList();
                }
                ajQ.ajP.addAll(collection);
            }
            return this;
        }

        public MaskedWalletRequest build()
        {
            return ajQ;
        }

        public Builder setAllowDebitCard(boolean flag)
        {
            ajQ.ajO = flag;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean flag)
        {
            ajQ.ajN = flag;
            return this;
        }

        public Builder setCart(Cart cart)
        {
            ajQ.aja = cart;
            return this;
        }

        public Builder setCurrencyCode(String s)
        {
            ajQ.aiL = s;
            return this;
        }

        public Builder setEstimatedTotalPrice(String s)
        {
            ajQ.ajI = s;
            return this;
        }

        public Builder setIsBillingAgreement(boolean flag)
        {
            ajQ.ajL = flag;
            return this;
        }

        public Builder setMerchantName(String s)
        {
            ajQ.ajJ = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            ajQ.aiR = s;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean flag)
        {
            ajQ.ajF = flag;
            return this;
        }

        public Builder setShippingAddressRequired(boolean flag)
        {
            ajQ.ajG = flag;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean flag)
        {
            ajQ.ajK = flag;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean flag)
        {
            ajQ.ajH = flag;
            return this;
        }

        private Builder()
        {
            ajQ = MaskedWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new l();
    String aiL;
    String aiR;
    boolean ajF;
    boolean ajG;
    boolean ajH;
    String ajI;
    String ajJ;
    boolean ajK;
    boolean ajL;
    com.google.android.gms.wallet.CountrySpecification ajM[];
    boolean ajN;
    boolean ajO;
    ArrayList ajP;
    Cart aja;
    private final int xM;

    MaskedWalletRequest()
    {
        xM = 3;
        ajN = true;
        ajO = true;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, com.google.android.gms.wallet.CountrySpecification acountryspecification[], boolean flag5, boolean flag6, 
            ArrayList arraylist)
    {
        xM = i;
        aiR = s;
        ajF = flag;
        ajG = flag1;
        ajH = flag2;
        ajI = s1;
        aiL = s2;
        ajJ = s3;
        aja = cart;
        ajK = flag3;
        ajL = flag4;
        ajM = acountryspecification;
        ajN = flag5;
        ajO = flag6;
        ajP = arraylist;
    }

    public static Builder newBuilder()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return maskedwalletrequest. new Builder();
    }

    public boolean allowDebitCard()
    {
        return ajO;
    }

    public boolean allowPrepaidCard()
    {
        return ajN;
    }

    public int describeContents()
    {
        return 0;
    }

    public ArrayList getAllowedCountrySpecificationsForShipping()
    {
        return ajP;
    }

    public com.google.android.gms.wallet.CountrySpecification[] getAllowedShippingCountrySpecifications()
    {
        return ajM;
    }

    public Cart getCart()
    {
        return aja;
    }

    public String getCurrencyCode()
    {
        return aiL;
    }

    public String getEstimatedTotalPrice()
    {
        return ajI;
    }

    public String getMerchantName()
    {
        return ajJ;
    }

    public String getMerchantTransactionId()
    {
        return aiR;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public boolean isBillingAgreement()
    {
        return ajL;
    }

    public boolean isPhoneNumberRequired()
    {
        return ajF;
    }

    public boolean isShippingAddressRequired()
    {
        return ajG;
    }

    public boolean shouldRetrieveWalletObjects()
    {
        return ajK;
    }

    public boolean useMinimalBillingAddress()
    {
        return ajH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
