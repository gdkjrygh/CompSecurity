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
    String NB;
    String NC;
    String ND;
    String NI;
    String NK;
    boolean NL;
    String NM;
    String aba;
    String abb;
    String name;
    String qd;
    private final int xH;

    Address()
    {
        xH = 1;
    }

    Address(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, boolean flag, String s9)
    {
        xH = i;
        name = s;
        NB = s1;
        NC = s2;
        ND = s3;
        qd = s4;
        aba = s5;
        abb = s6;
        NI = s7;
        NK = s8;
        NL = flag;
        NM = s9;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress1()
    {
        return NB;
    }

    public String getAddress2()
    {
        return NC;
    }

    public String getAddress3()
    {
        return ND;
    }

    public String getCity()
    {
        return aba;
    }

    public String getCompanyName()
    {
        return NM;
    }

    public String getCountryCode()
    {
        return qd;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return NK;
    }

    public String getPostalCode()
    {
        return NI;
    }

    public String getState()
    {
        return abb;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public boolean isPostBox()
    {
        return NL;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
