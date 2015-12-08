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
    String abh;
    String abi;
    ProxyCard abj;
    String abk;
    Address abl;
    Address abm;
    String abn[];
    UserAddress abo;
    UserAddress abp;
    InstrumentInfo abq[];
    private final int xH;

    private FullWallet()
    {
        xH = 1;
    }

    FullWallet(int i, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        xH = i;
        abh = s;
        abi = s1;
        abj = proxycard;
        abk = s2;
        abl = address;
        abm = address1;
        abn = as;
        abo = useraddress;
        abp = useraddress1;
        abq = ainstrumentinfo;
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return abl;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return abo;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return abp;
    }

    public String getEmail()
    {
        return abk;
    }

    public String getGoogleTransactionId()
    {
        return abh;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return abq;
    }

    public String getMerchantTransactionId()
    {
        return abi;
    }

    public String[] getPaymentDescriptions()
    {
        return abn;
    }

    public ProxyCard getProxyCard()
    {
        return abj;
    }

    public Address getShippingAddress()
    {
        return abm;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
