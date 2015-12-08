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
    String a;
    String b;
    ProxyCard c;
    String d;
    Address e;
    Address f;
    String g[];
    UserAddress h;
    UserAddress i;
    InstrumentInfo j[];
    private final int k;

    private FullWallet()
    {
        k = 1;
    }

    FullWallet(int l, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        k = l;
        a = s;
        b = s1;
        c = proxycard;
        d = s2;
        e = address;
        f = address1;
        g = as;
        h = useraddress;
        i = useraddress1;
        j = ainstrumentinfo;
    }

    public final int a()
    {
        return k;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.wallet.f.a(this, parcel, l);
    }

}
