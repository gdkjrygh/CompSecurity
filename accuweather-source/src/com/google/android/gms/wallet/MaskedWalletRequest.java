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

        final MaskedWalletRequest ajN;

        public Builder addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
        {
            if (ajN.ajM == null)
            {
                ajN.ajM = new ArrayList();
            }
            ajN.ajM.add(countryspecification);
            return this;
        }

        public Builder addAllowedCountrySpecificationsForShipping(Collection collection)
        {
            if (collection != null)
            {
                if (ajN.ajM == null)
                {
                    ajN.ajM = new ArrayList();
                }
                ajN.ajM.addAll(collection);
            }
            return this;
        }

        public MaskedWalletRequest build()
        {
            return ajN;
        }

        public Builder setAllowDebitCard(boolean flag)
        {
            ajN.ajL = flag;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean flag)
        {
            ajN.ajK = flag;
            return this;
        }

        public Builder setCart(Cart cart)
        {
            ajN.aiX = cart;
            return this;
        }

        public Builder setCurrencyCode(String s)
        {
            ajN.aiI = s;
            return this;
        }

        public Builder setEstimatedTotalPrice(String s)
        {
            ajN.ajF = s;
            return this;
        }

        public Builder setIsBillingAgreement(boolean flag)
        {
            ajN.ajI = flag;
            return this;
        }

        public Builder setMerchantName(String s)
        {
            ajN.ajG = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            ajN.aiO = s;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean flag)
        {
            ajN.ajC = flag;
            return this;
        }

        public Builder setShippingAddressRequired(boolean flag)
        {
            ajN.ajD = flag;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean flag)
        {
            ajN.ajH = flag;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean flag)
        {
            ajN.ajE = flag;
            return this;
        }

        private Builder()
        {
            ajN = MaskedWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new l();
    String aiI;
    String aiO;
    Cart aiX;
    boolean ajC;
    boolean ajD;
    boolean ajE;
    String ajF;
    String ajG;
    boolean ajH;
    boolean ajI;
    com.google.android.gms.wallet.CountrySpecification ajJ[];
    boolean ajK;
    boolean ajL;
    ArrayList ajM;
    private final int xJ;

    MaskedWalletRequest()
    {
        xJ = 3;
        ajK = true;
        ajL = true;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, com.google.android.gms.wallet.CountrySpecification acountryspecification[], boolean flag5, boolean flag6, 
            ArrayList arraylist)
    {
        xJ = i;
        aiO = s;
        ajC = flag;
        ajD = flag1;
        ajE = flag2;
        ajF = s1;
        aiI = s2;
        ajG = s3;
        aiX = cart;
        ajH = flag3;
        ajI = flag4;
        ajJ = acountryspecification;
        ajK = flag5;
        ajL = flag6;
        ajM = arraylist;
    }

    public static Builder newBuilder()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return maskedwalletrequest. new Builder();
    }

    public boolean allowDebitCard()
    {
        return ajL;
    }

    public boolean allowPrepaidCard()
    {
        return ajK;
    }

    public int describeContents()
    {
        return 0;
    }

    public ArrayList getAllowedCountrySpecificationsForShipping()
    {
        return ajM;
    }

    public com.google.android.gms.wallet.CountrySpecification[] getAllowedShippingCountrySpecifications()
    {
        return ajJ;
    }

    public Cart getCart()
    {
        return aiX;
    }

    public String getCurrencyCode()
    {
        return aiI;
    }

    public String getEstimatedTotalPrice()
    {
        return ajF;
    }

    public String getMerchantName()
    {
        return ajG;
    }

    public String getMerchantTransactionId()
    {
        return aiO;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public boolean isBillingAgreement()
    {
        return ajI;
    }

    public boolean isPhoneNumberRequired()
    {
        return ajC;
    }

    public boolean isShippingAddressRequired()
    {
        return ajD;
    }

    public boolean shouldRetrieveWalletObjects()
    {
        return ajH;
    }

    public boolean useMinimalBillingAddress()
    {
        return ajE;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
