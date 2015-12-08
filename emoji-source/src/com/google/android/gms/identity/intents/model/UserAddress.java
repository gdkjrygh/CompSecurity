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
    String UH;
    String UI;
    String UJ;
    String UK;
    String UL;
    String UM;
    String UN;
    String UO;
    String UP;
    String UQ;
    boolean UR;
    String US;
    String UT;
    String name;
    String rf;
    private final int xM;

    UserAddress()
    {
        xM = 1;
    }

    UserAddress(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, String s11, boolean flag, 
            String s12, String s13)
    {
        xM = i;
        name = s;
        UH = s1;
        UI = s2;
        UJ = s3;
        UK = s4;
        UL = s5;
        UM = s6;
        UN = s7;
        rf = s8;
        UO = s9;
        UP = s10;
        UQ = s11;
        UR = flag;
        US = s12;
        UT = s13;
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
        return UH;
    }

    public String getAddress2()
    {
        return UI;
    }

    public String getAddress3()
    {
        return UJ;
    }

    public String getAddress4()
    {
        return UK;
    }

    public String getAddress5()
    {
        return UL;
    }

    public String getAdministrativeArea()
    {
        return UM;
    }

    public String getCompanyName()
    {
        return US;
    }

    public String getCountryCode()
    {
        return rf;
    }

    public String getEmailAddress()
    {
        return UT;
    }

    public String getLocality()
    {
        return UN;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return UQ;
    }

    public String getPostalCode()
    {
        return UO;
    }

    public String getSortingCode()
    {
        return UP;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public boolean isPostBox()
    {
        return UR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
