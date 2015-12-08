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

        final FullWalletRequest asM;

        public FullWalletRequest build()
        {
            return asM;
        }

        public Builder setCart(Cart cart)
        {
            asM.asL = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            asM.asB = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            asM.asC = s;
            return this;
        }

        private Builder()
        {
            asM = FullWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final int BR;
    String asB;
    String asC;
    Cart asL;

    FullWalletRequest()
    {
        BR = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        BR = i;
        asB = s;
        asC = s1;
        asL = cart;
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
        return asL;
    }

    public String getGoogleTransactionId()
    {
        return asB;
    }

    public String getMerchantTransactionId()
    {
        return asC;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
