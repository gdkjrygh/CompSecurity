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

        final FullWalletRequest ajb;

        public FullWalletRequest build()
        {
            return ajb;
        }

        public Builder setCart(Cart cart)
        {
            ajb.aja = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            ajb.aiQ = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            ajb.aiR = s;
            return this;
        }

        private Builder()
        {
            ajb = FullWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new g();
    String aiQ;
    String aiR;
    Cart aja;
    private final int xM;

    FullWalletRequest()
    {
        xM = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        xM = i;
        aiQ = s;
        aiR = s1;
        aja = cart;
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
        return aja;
    }

    public String getGoogleTransactionId()
    {
        return aiQ;
    }

    public String getMerchantTransactionId()
    {
        return aiR;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
