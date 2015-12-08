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
    private final int BR;
    String adN;
    String adO;
    String adP;
    String adQ;
    String adR;
    String adS;
    String adT;
    String adU;
    String adV;
    String adW;
    boolean adX;
    String adY;
    String adZ;
    String name;
    String uW;

    UserAddress()
    {
        BR = 1;
    }

    UserAddress(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, String s11, boolean flag, 
            String s12, String s13)
    {
        BR = i;
        name = s;
        adN = s1;
        adO = s2;
        adP = s3;
        adQ = s4;
        adR = s5;
        adS = s6;
        adT = s7;
        uW = s8;
        adU = s9;
        adV = s10;
        adW = s11;
        adX = flag;
        adY = s12;
        adZ = s13;
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

    public String getAddress4()
    {
        return adQ;
    }

    public String getAddress5()
    {
        return adR;
    }

    public String getAdministrativeArea()
    {
        return adS;
    }

    public String getCompanyName()
    {
        return adY;
    }

    public String getCountryCode()
    {
        return uW;
    }

    public String getEmailAddress()
    {
        return adZ;
    }

    public String getLocality()
    {
        return adT;
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

    public String getSortingCode()
    {
        return adV;
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
        b.a(this, parcel, i);
    }

}
