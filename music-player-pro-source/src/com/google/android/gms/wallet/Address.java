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
    private final int CK;
    String afK;
    String afL;
    String afM;
    String afR;
    String afT;
    boolean afU;
    String afV;
    String auD;
    String auE;
    String name;
    String vk;

    Address()
    {
        CK = 1;
    }

    Address(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, boolean flag, String s9)
    {
        CK = i;
        name = s;
        afK = s1;
        afL = s2;
        afM = s3;
        vk = s4;
        auD = s5;
        auE = s6;
        afR = s7;
        afT = s8;
        afU = flag;
        afV = s9;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress1()
    {
        return afK;
    }

    public String getAddress2()
    {
        return afL;
    }

    public String getAddress3()
    {
        return afM;
    }

    public String getCity()
    {
        return auD;
    }

    public String getCompanyName()
    {
        return afV;
    }

    public String getCountryCode()
    {
        return vk;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return afT;
    }

    public String getPostalCode()
    {
        return afR;
    }

    public String getState()
    {
        return auE;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public boolean isPostBox()
    {
        return afU;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
