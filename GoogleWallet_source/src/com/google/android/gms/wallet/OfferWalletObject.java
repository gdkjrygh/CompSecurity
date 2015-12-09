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
    String aUr;
    CommonWalletObject aUs;
    String fl;
    private final int mVersionCode;

    OfferWalletObject()
    {
        mVersionCode = 3;
    }

    OfferWalletObject(int i, String s, String s1, CommonWalletObject commonwalletobject)
    {
        mVersionCode = i;
        aUr = s1;
        if (i < 3)
        {
            aUs = CommonWalletObject.vb().el(s).vc();
            return;
        } else
        {
            aUs = commonwalletobject;
            return;
        }
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
        n.a(this, parcel, i);
    }

}
