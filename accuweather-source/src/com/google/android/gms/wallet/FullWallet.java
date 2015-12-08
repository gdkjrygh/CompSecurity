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
    String aiN;
    String aiO;
    ProxyCard aiP;
    String aiQ;
    Address aiR;
    Address aiS;
    String aiT[];
    UserAddress aiU;
    UserAddress aiV;
    InstrumentInfo aiW[];
    private final int xJ;

    private FullWallet()
    {
        xJ = 1;
    }

    FullWallet(int i, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        xJ = i;
        aiN = s;
        aiO = s1;
        aiP = proxycard;
        aiQ = s2;
        aiR = address;
        aiS = address1;
        aiT = as;
        aiU = useraddress;
        aiV = useraddress1;
        aiW = ainstrumentinfo;
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return aiR;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return aiU;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return aiV;
    }

    public String getEmail()
    {
        return aiQ;
    }

    public String getGoogleTransactionId()
    {
        return aiN;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return aiW;
    }

    public String getMerchantTransactionId()
    {
        return aiO;
    }

    public String[] getPaymentDescriptions()
    {
        return aiT;
    }

    public ProxyCard getProxyCard()
    {
        return aiP;
    }

    public Address getShippingAddress()
    {
        return aiS;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
