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
    String hl;
    private final int iM;
    String name;
    String tA;
    boolean tB;
    String tC;
    String tu;
    String tv;
    String tw;
    String tx;
    String ty;
    String tz;

    public Address()
    {
        iM = 1;
    }

    Address(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, boolean flag, String s9)
    {
        iM = i;
        name = s;
        tu = s1;
        tv = s2;
        tw = s3;
        hl = s4;
        tx = s5;
        ty = s6;
        tz = s7;
        tA = s8;
        tB = flag;
        tC = s9;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress1()
    {
        return tu;
    }

    public String getAddress2()
    {
        return tv;
    }

    public String getAddress3()
    {
        return tw;
    }

    public String getCity()
    {
        return tx;
    }

    public String getCompanyName()
    {
        return tC;
    }

    public String getCountryCode()
    {
        return hl;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return tA;
    }

    public String getPostalCode()
    {
        return tz;
    }

    public String getState()
    {
        return ty;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public boolean isPostBox()
    {
        return tB;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
