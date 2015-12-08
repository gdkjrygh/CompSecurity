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
    private final int CK;
    String afK;
    String afL;
    String afM;
    String afN;
    String afO;
    String afP;
    String afQ;
    String afR;
    String afS;
    String afT;
    boolean afU;
    String afV;
    String afW;
    String name;
    String vk;

    UserAddress()
    {
        CK = 1;
    }

    UserAddress(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, String s11, boolean flag, 
            String s12, String s13)
    {
        CK = i;
        name = s;
        afK = s1;
        afL = s2;
        afM = s3;
        afN = s4;
        afO = s5;
        afP = s6;
        afQ = s7;
        vk = s8;
        afR = s9;
        afS = s10;
        afT = s11;
        afU = flag;
        afV = s12;
        afW = s13;
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

    public String getAddress4()
    {
        return afN;
    }

    public String getAddress5()
    {
        return afO;
    }

    public String getAdministrativeArea()
    {
        return afP;
    }

    public String getCompanyName()
    {
        return afV;
    }

    public String getCountryCode()
    {
        return vk;
    }

    public String getEmailAddress()
    {
        return afW;
    }

    public String getLocality()
    {
        return afQ;
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

    public String getSortingCode()
    {
        return afS;
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
        b.a(this, parcel, i);
    }

}
