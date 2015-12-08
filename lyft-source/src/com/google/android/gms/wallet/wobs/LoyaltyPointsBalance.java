// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzd

public final class LoyaltyPointsBalance
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    int a;
    String b;
    double c;
    String d;
    long e;
    int f;
    private final int g;

    LoyaltyPointsBalance()
    {
        g = 1;
        f = -1;
        a = -1;
        c = -1D;
    }

    LoyaltyPointsBalance(int i, int j, String s, double d1, String s1, long l, int k)
    {
        g = i;
        a = j;
        b = s;
        c = d1;
        d = s1;
        e = l;
        f = k;
    }

    public int a()
    {
        return g;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.a(this, parcel, i);
    }

}
