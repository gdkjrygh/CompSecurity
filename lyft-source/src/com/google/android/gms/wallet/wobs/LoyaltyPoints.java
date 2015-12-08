// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zze, LoyaltyPointsBalance, TimeInterval

public final class LoyaltyPoints
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    String a;
    LoyaltyPointsBalance b;
    String c;
    TimeInterval d;
    private final int e;

    LoyaltyPoints()
    {
        e = 1;
    }

    LoyaltyPoints(int i, String s, LoyaltyPointsBalance loyaltypointsbalance, String s1, TimeInterval timeinterval)
    {
        e = i;
        a = s;
        b = loyaltypointsbalance;
        c = s1;
        d = timeinterval;
    }

    public int a()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.a(this, parcel, i);
    }

}
