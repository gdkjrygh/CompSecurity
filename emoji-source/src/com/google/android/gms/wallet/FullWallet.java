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
    String aiQ;
    String aiR;
    ProxyCard aiS;
    String aiT;
    Address aiU;
    Address aiV;
    String aiW[];
    UserAddress aiX;
    UserAddress aiY;
    InstrumentInfo aiZ[];
    private final int xM;

    private FullWallet()
    {
        xM = 1;
    }

    FullWallet(int i, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        xM = i;
        aiQ = s;
        aiR = s1;
        aiS = proxycard;
        aiT = s2;
        aiU = address;
        aiV = address1;
        aiW = as;
        aiX = useraddress;
        aiY = useraddress1;
        aiZ = ainstrumentinfo;
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return aiU;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return aiX;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return aiY;
    }

    public String getEmail()
    {
        return aiT;
    }

    public String getGoogleTransactionId()
    {
        return aiQ;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return aiZ;
    }

    public String getMerchantTransactionId()
    {
        return aiR;
    }

    public String[] getPaymentDescriptions()
    {
        return aiW;
    }

    public ProxyCard getProxyCard()
    {
        return aiS;
    }

    public Address getShippingAddress()
    {
        return aiV;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
