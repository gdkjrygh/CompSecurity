// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            f

public class LoyaltyWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final int iM;
    String tU;
    String tV;
    String tW;
    String tX;
    String tY;

    public LoyaltyWalletObject()
    {
        iM = 2;
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4)
    {
        iM = i;
        tU = s;
        tV = s1;
        tW = s2;
        tX = s3;
        tY = s4;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountId()
    {
        return tV;
    }

    public String getAccountName()
    {
        return tY;
    }

    public String getId()
    {
        return tU;
    }

    public String getIssuerName()
    {
        return tW;
    }

    public String getProgramName()
    {
        return tX;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
