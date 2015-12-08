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

        final FullWalletRequest abs;

        public FullWalletRequest build()
        {
            return abs;
        }

        public Builder setCart(Cart cart)
        {
            abs.abr = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            abs.abh = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            abs.abi = s;
            return this;
        }

        private Builder()
        {
            abs = FullWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new g();
    String abh;
    String abi;
    Cart abr;
    private final int xH;

    FullWalletRequest()
    {
        xH = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        xH = i;
        abh = s;
        abi = s1;
        abr = cart;
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
        return abr;
    }

    public String getGoogleTransactionId()
    {
        return abh;
    }

    public String getMerchantTransactionId()
    {
        return abi;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
