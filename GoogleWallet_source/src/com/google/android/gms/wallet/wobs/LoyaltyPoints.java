// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            e, TimeInterval, LoyaltyPointsBalance

public final class LoyaltyPoints
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    TimeInterval aTU;
    LoyaltyPointsBalance aVP;
    String label;
    private final int mVersionCode;
    String type;

    LoyaltyPoints()
    {
        mVersionCode = 1;
    }

    LoyaltyPoints(int i, String s, LoyaltyPointsBalance loyaltypointsbalance, String s1, TimeInterval timeinterval)
    {
        mVersionCode = i;
        label = s;
        aVP = loyaltypointsbalance;
        type = s1;
        aTU = timeinterval;
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
