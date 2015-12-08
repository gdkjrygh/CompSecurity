// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.identity.intents.model:
//            b

public final class UserAddress
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    String asT;
    String asU;
    String asV;
    String asW;
    String asX;
    String asY;
    String asZ;
    String ata;
    String atb;
    boolean atc;
    String atd;
    String ate;
    private final int mVersionCode;
    String name;
    String phoneNumber;
    String vk;

    UserAddress()
    {
        mVersionCode = 1;
    }

    UserAddress(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, String s11, boolean flag, 
            String s12, String s13)
    {
        mVersionCode = i;
        name = s;
        asT = s1;
        asU = s2;
        asV = s3;
        asW = s4;
        asX = s5;
        asY = s6;
        asZ = s7;
        vk = s8;
        ata = s9;
        atb = s10;
        phoneNumber = s11;
        atc = flag;
        atd = s12;
        ate = s13;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
