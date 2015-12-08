// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            g, Address, LoyaltyWalletObject, OfferWalletObject

public final class MaskedWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final int iM;
    String tH;
    String tI;
    String tK;
    Address tL;
    Address tM;
    String tN[];
    LoyaltyWalletObject tZ[];
    OfferWalletObject ua[];

    public MaskedWallet()
    {
        iM = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[])
    {
        iM = i;
        tH = s;
        tI = s1;
        tN = as;
        tK = s2;
        tL = address;
        tM = address1;
        tZ = aloyaltywalletobject;
        ua = aofferwalletobject;
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return tL;
    }

    public String getEmail()
    {
        return tK;
    }

    public String getGoogleTransactionId()
    {
        return tH;
    }

    public LoyaltyWalletObject[] getLoyaltyWalletObjects()
    {
        return tZ;
    }

    public String getMerchantTransactionId()
    {
        return tI;
    }

    public OfferWalletObject[] getOfferWalletObjects()
    {
        return ua;
    }

    public String[] getPaymentDescriptions()
    {
        return tN;
    }

    public Address getShippingAddress()
    {
        return tM;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
