// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            e, ProxyCard, Address, InstrumentInfo

public final class FullWallet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    String aTl;
    String aTm;
    ProxyCard aTn;
    String aTo;
    Address aTp;
    Address aTq;
    String aTr[];
    UserAddress aTs;
    UserAddress aTt;
    InstrumentInfo aTu[];
    private final int mVersionCode;

    private FullWallet()
    {
        mVersionCode = 1;
    }

    FullWallet(int i, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        mVersionCode = i;
        aTl = s;
        aTm = s1;
        aTn = proxycard;
        aTo = s2;
        aTp = address;
        aTq = address1;
        aTr = as;
        aTs = useraddress;
        aTt = useraddress1;
        aTu = ainstrumentinfo;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
