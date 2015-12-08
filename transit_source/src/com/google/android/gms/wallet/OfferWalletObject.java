// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            j

public class OfferWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final int iM;
    String tU;
    String ul;

    public OfferWalletObject()
    {
        iM = 2;
    }

    OfferWalletObject(int i, String s, String s1)
    {
        iM = i;
        tU = s;
        ul = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return tU;
    }

    public String getRedemptionCode()
    {
        return ul;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
