// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            g, Cart

public final class FullWalletRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final FullWalletRequest auW;

        public FullWalletRequest build()
        {
            return auW;
        }

        public Builder setCart(Cart cart)
        {
            auW.auV = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            auW.auL = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            auW.auM = s;
            return this;
        }

        private Builder()
        {
            auW = FullWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final int CK;
    String auL;
    String auM;
    Cart auV;

    FullWalletRequest()
    {
        CK = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        CK = i;
        auL = s;
        auM = s1;
        auV = cart;
    }

    public static Builder newBuilder()
    {
        FullWalletRequest fullwalletrequest = new FullWalletRequest();
        fullwalletrequest.getClass();
        return fullwalletrequest. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public Cart getCart()
    {
        return auV;
    }

    public String getGoogleTransactionId()
    {
        return auL;
    }

    public String getMerchantTransactionId()
    {
        return auM;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
