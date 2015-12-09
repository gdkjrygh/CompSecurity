// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.identity.intents.model:
//            b

public final class UserAddress
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    String NB;
    String NC;
    String ND;
    String NE;
    String NF;
    String NG;
    String NH;
    String NI;
    String NJ;
    String NK;
    boolean NL;
    String NM;
    String NN;
    String name;
    String qd;
    private final int xH;

    UserAddress()
    {
        xH = 1;
    }

    UserAddress(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, String s11, boolean flag, 
            String s12, String s13)
    {
        xH = i;
        name = s;
        NB = s1;
        NC = s2;
        ND = s3;
        NE = s4;
        NF = s5;
        NG = s6;
        NH = s7;
        qd = s8;
        NI = s9;
        NJ = s10;
        NK = s11;
        NL = flag;
        NM = s12;
        NN = s13;
    }

    public static UserAddress fromIntent(Intent intent)
    {
        if (intent == null || !intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS"))
        {
            return null;
        } else
        {
            return (UserAddress)intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
        }
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

    public String getAddress4()
    {
        return NE;
    }

    public String getAddress5()
    {
        return NF;
    }

    public String getAdministrativeArea()
    {
        return NG;
    }

    public String getCompanyName()
    {
        return NM;
    }

    public String getCountryCode()
    {
        return qd;
    }

    public String getEmailAddress()
    {
        return NN;
    }

    public String getLocality()
    {
        return NH;
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

    public String getSortingCode()
    {
        return NJ;
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
        b.a(this, parcel, i);
    }

}
