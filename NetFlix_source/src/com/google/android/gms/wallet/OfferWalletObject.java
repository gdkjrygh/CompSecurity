// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            n

public final class OfferWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    String acj;
    String eC;
    private final int xH;

    OfferWalletObject()
    {
        xH = 2;
    }

    OfferWalletObject(int i, String s, String s1)
    {
        xH = i;
        eC = s;
        acj = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return eC;
    }

    public String getRedemptionCode()
    {
        return acj;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
