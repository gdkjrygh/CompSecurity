// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            h, Cart

public class MaskedWalletRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final MaskedWalletRequest ui;

        public MaskedWalletRequest build()
        {
            return ui;
        }

        public Builder setCart(Cart cart)
        {
            ui.tO = cart;
            return this;
        }

        public Builder setCurrencyCode(String s)
        {
            ui.tE = s;
            return this;
        }

        public Builder setEstimatedTotalPrice(String s)
        {
            ui.ue = s;
            return this;
        }

        public Builder setIsBillingAgreement(boolean flag)
        {
            ui.uh = flag;
            return this;
        }

        public Builder setMerchantName(String s)
        {
            ui.uf = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            ui.tI = s;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean flag)
        {
            ui.ub = flag;
            return this;
        }

        public Builder setShippingAddressRequired(boolean flag)
        {
            ui.uc = flag;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean flag)
        {
            ui.ug = flag;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean flag)
        {
            ui.ud = flag;
            return this;
        }

        private Builder()
        {
            ui = MaskedWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final int iM;
    String tE;
    String tI;
    Cart tO;
    boolean ub;
    boolean uc;
    boolean ud;
    String ue;
    String uf;
    boolean ug;
    boolean uh;

    public MaskedWalletRequest()
    {
        iM = 2;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4)
    {
        iM = i;
        tI = s;
        ub = flag;
        uc = flag1;
        ud = flag2;
        ue = s1;
        tE = s2;
        uf = s3;
        tO = cart;
        ug = flag3;
        uh = flag4;
    }

    public static Builder newBuilder()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return maskedwalletrequest. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public Cart getCart()
    {
        return tO;
    }

    public String getCurrencyCode()
    {
        return tE;
    }

    public String getEstimatedTotalPrice()
    {
        return ue;
    }

    public String getMerchantName()
    {
        return uf;
    }

    public String getMerchantTransactionId()
    {
        return tI;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public boolean isBillingAgreement()
    {
        return uh;
    }

    public boolean isPhoneNumberRequired()
    {
        return ub;
    }

    public boolean isShippingAddressRequired()
    {
        return uc;
    }

    public boolean shouldRetrieveWalletObjects()
    {
        return ug;
    }

    public boolean useMinimalBillingAddress()
    {
        return ud;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
