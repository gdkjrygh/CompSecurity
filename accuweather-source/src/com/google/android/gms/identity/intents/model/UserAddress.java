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
    String UE;
    String UF;
    String UG;
    String UH;
    String UI;
    String UJ;
    String UK;
    String UL;
    String UM;
    String UN;
    boolean UO;
    String UP;
    String UQ;
    String name;
    String rc;
    private final int xJ;

    UserAddress()
    {
        xJ = 1;
    }

    UserAddress(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, String s11, boolean flag, 
            String s12, String s13)
    {
        xJ = i;
        name = s;
        UE = s1;
        UF = s2;
        UG = s3;
        UH = s4;
        UI = s5;
        UJ = s6;
        UK = s7;
        rc = s8;
        UL = s9;
        UM = s10;
        UN = s11;
        UO = flag;
        UP = s12;
        UQ = s13;
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

    public String getAddress4()
    {
        return UH;
    }

    public String getAddress5()
    {
        return UI;
    }

    public String getAdministrativeArea()
    {
        return UJ;
    }

    public String getCompanyName()
    {
        return UP;
    }

    public String getCountryCode()
    {
        return rc;
    }

    public String getEmailAddress()
    {
        return UQ;
    }

    public String getLocality()
    {
        return UK;
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

    public String getSortingCode()
    {
        return UM;
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
        b.a(this, parcel, i);
    }

}
