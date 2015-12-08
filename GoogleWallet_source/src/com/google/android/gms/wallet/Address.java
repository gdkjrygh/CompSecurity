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
    String aTd;
    String aTe;
    String asT;
    String asU;
    String asV;
    String ata;
    boolean atc;
    String atd;
    private final int mVersionCode;
    String name;
    String phoneNumber;
    String vk;

    Address()
    {
        mVersionCode = 1;
    }

    Address(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, boolean flag, String s9)
    {
        mVersionCode = i;
        name = s;
        asT = s1;
        asU = s2;
        asV = s3;
        vk = s4;
        aTd = s5;
        aTe = s6;
        ata = s7;
        phoneNumber = s8;
        atc = flag;
        atd = s9;
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
        a.a(this, parcel, i);
    }

}
