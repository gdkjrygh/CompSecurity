// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            c, ProxyCard, Address

public final class FullWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int iM;
    String tH;
    String tI;
    ProxyCard tJ;
    String tK;
    Address tL;
    Address tM;
    String tN[];

    public FullWallet()
    {
        iM = 1;
    }

    FullWallet(int i, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[])
    {
        iM = i;
        tH = s;
        tI = s1;
        tJ = proxycard;
        tK = s2;
        tL = address;
        tM = address1;
        tN = as;
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

    public String getMerchantTransactionId()
    {
        return tI;
    }

    public String[] getPaymentDescriptions()
    {
        return tN;
    }

    public ProxyCard getProxyCard()
    {
        return tJ;
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
        c.a(this, parcel, i);
    }

}
