// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

// Referenced classes of package com.google.android.gms.wallet:
//            n

public final class OfferWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    String ajQ;
    CommonWalletObject ajR;
    String eC;
    private final int xJ;

    OfferWalletObject()
    {
        xJ = 3;
    }

    OfferWalletObject(int i, String s, String s1, CommonWalletObject commonwalletobject)
    {
        xJ = i;
        ajQ = s1;
        if (i < 3)
        {
            ajR = CommonWalletObject.nf().cw(s).ng();
            return;
        } else
        {
            ajR = commonwalletobject;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return ajR.getId();
    }

    public String getRedemptionCode()
    {
        return ajQ;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
