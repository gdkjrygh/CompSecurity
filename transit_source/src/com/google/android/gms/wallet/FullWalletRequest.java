// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            d, Cart

public class FullWalletRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final FullWalletRequest tP;

        public FullWalletRequest build()
        {
            return tP;
        }

        public Builder setCart(Cart cart)
        {
            tP.tO = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            tP.tH = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            tP.tI = s;
            return this;
        }

        private Builder()
        {
            tP = FullWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final int iM;
    String tH;
    String tI;
    Cart tO;

    public FullWalletRequest()
    {
        iM = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        iM = i;
        tH = s;
        tI = s1;
        tO = cart;
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
        return tO;
    }

    public String getGoogleTransactionId()
    {
        return tH;
    }

    public String getMerchantTransactionId()
    {
        return tI;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
