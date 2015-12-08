// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzi, TimeInterval, UriData

public final class WalletObjectMessage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    String a;
    String b;
    TimeInterval c;
    UriData d;
    UriData e;
    private final int f;

    WalletObjectMessage()
    {
        f = 1;
    }

    WalletObjectMessage(int i, String s, String s1, TimeInterval timeinterval, UriData uridata, UriData uridata1)
    {
        f = i;
        a = s;
        b = s1;
        c = timeinterval;
        d = uridata;
        e = uridata1;
    }

    public int a()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.a(this, parcel, i);
    }

}
