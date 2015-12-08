// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            a

public final class Address
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int BR;
    String adN;
    String adO;
    String adP;
    String adU;
    String adW;
    boolean adX;
    String adY;
    String ast;
    String asu;
    String name;
    String uW;

    Address()
    {
        BR = 1;
    }

    Address(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, boolean flag, String s9)
    {
        BR = i;
        name = s;
        adN = s1;
        adO = s2;
        adP = s3;
        uW = s4;
        ast = s5;
        asu = s6;
        adU = s7;
        adW = s8;
        adX = flag;
        adY = s9;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress1()
    {
        return adN;
    }

    public String getAddress2()
    {
        return adO;
    }

    public String getAddress3()
    {
        return adP;
    }

    public String getCity()
    {
        return ast;
    }

    public String getCompanyName()
    {
        return adY;
    }

    public String getCountryCode()
    {
        return uW;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return adW;
    }

    public String getPostalCode()
    {
        return adU;
    }

    public String getState()
    {
        return asu;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public boolean isPostBox()
    {
        return adX;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
