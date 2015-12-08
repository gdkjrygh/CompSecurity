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
    String UE;
    String UF;
    String UG;
    String UL;
    String UN;
    boolean UO;
    String UP;
    String aiF;
    String aiG;
    String name;
    String rc;
    private final int xJ;

    Address()
    {
        xJ = 1;
    }

    Address(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, boolean flag, String s9)
    {
        xJ = i;
        name = s;
        UE = s1;
        UF = s2;
        UG = s3;
        rc = s4;
        aiF = s5;
        aiG = s6;
        UL = s7;
        UN = s8;
        UO = flag;
        UP = s9;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress1()
    {
        return UE;
    }

    public String getAddress2()
    {
        return UF;
    }

    public String getAddress3()
    {
        return UG;
    }

    public String getCity()
    {
        return aiF;
    }

    public String getCompanyName()
    {
        return UP;
    }

    public String getCountryCode()
    {
        return rc;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return UN;
    }

    public String getPostalCode()
    {
        return UL;
    }

    public String getState()
    {
        return aiG;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public boolean isPostBox()
    {
        return UO;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
