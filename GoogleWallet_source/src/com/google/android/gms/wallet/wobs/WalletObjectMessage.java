// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            i, TimeInterval, UriData

public final class WalletObjectMessage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    String aVY;
    TimeInterval aWb;
    UriData aWc;
    UriData aWd;
    private final int mVersionCode;
    String tU;

    WalletObjectMessage()
    {
        mVersionCode = 1;
    }

    WalletObjectMessage(int j, String s, String s1, TimeInterval timeinterval, UriData uridata, UriData uridata1)
    {
        mVersionCode = j;
        aVY = s;
        tU = s1;
        aWb = timeinterval;
        aWc = uridata;
        aWd = uridata1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
