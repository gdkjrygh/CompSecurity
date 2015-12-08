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
    String ajT;
    CommonWalletObject ajU;
    String eC;
    private final int xM;

    OfferWalletObject()
    {
        xM = 3;
    }

    OfferWalletObject(int i, String s, String s1, CommonWalletObject commonwalletobject)
    {
        xM = i;
        ajT = s1;
        if (i < 3)
        {
            ajU = CommonWalletObject.nk().cw(s).nl();
            return;
        } else
        {
            ajU = commonwalletobject;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return ajU.getId();
    }

    public String getRedemptionCode()
    {
        return ajT;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
