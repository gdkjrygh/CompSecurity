// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            d

public final class LoyaltyPointsBalance
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    int aVR;
    String aVS;
    double aVT;
    String aVU;
    long aVV;
    int aVW;
    private final int mVersionCode;

    LoyaltyPointsBalance()
    {
        mVersionCode = 1;
        aVW = -1;
        aVR = -1;
        aVT = -1D;
    }

    LoyaltyPointsBalance(int i, int j, String s, double d1, String s1, long l, int k)
    {
        mVersionCode = i;
        aVR = j;
        aVS = s;
        aVT = d1;
        aVU = s1;
        aVV = l;
        aVW = k;
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
        d.a(this, parcel, i);
    }

}
