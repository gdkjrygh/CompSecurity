// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            f, ProxyCard, Address, InstrumentInfo

public final class FullWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final int BR;
    String asB;
    String asC;
    ProxyCard asD;
    String asE;
    Address asF;
    Address asG;
    String asH[];
    UserAddress asI;
    UserAddress asJ;
    InstrumentInfo asK[];

    private FullWallet()
    {
        BR = 1;
    }

    FullWallet(int i, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        BR = i;
        asB = s;
        asC = s1;
        asD = proxycard;
        asE = s2;
        asF = address;
        asG = address1;
        asH = as;
        asI = useraddress;
        asJ = useraddress1;
        asK = ainstrumentinfo;
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return asF;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return asI;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return asJ;
    }

    public String getEmail()
    {
        return asE;
    }

    public String getGoogleTransactionId()
    {
        return asB;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return asK;
    }

    public String getMerchantTransactionId()
    {
        return asC;
    }

    public String[] getPaymentDescriptions()
    {
        return asH;
    }

    public ProxyCard getProxyCard()
    {
        return asD;
    }

    public Address getShippingAddress()
    {
        return asG;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
