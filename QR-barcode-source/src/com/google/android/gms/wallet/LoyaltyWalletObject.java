// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jr;
import com.google.android.gms.wallet.wobs.f;
import com.google.android.gms.wallet.wobs.l;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            j

public final class LoyaltyWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final int BR;
    String Dv;
    String asT;
    String asU;
    String asV;
    String asW;
    String asX;
    String asY;
    String asZ;
    String ata;
    ArrayList atb;
    l atc;
    ArrayList atd;
    String ate;
    String atf;
    ArrayList atg;
    boolean ath;
    ArrayList ati;
    ArrayList atj;
    ArrayList atk;
    f atl;
    String fl;
    int state;

    LoyaltyWalletObject()
    {
        BR = 4;
        atb = jr.hz();
        atd = jr.hz();
        atg = jr.hz();
        ati = jr.hz();
        atj = jr.hz();
        atk = jr.hz();
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, int k, ArrayList arraylist, l l, 
            ArrayList arraylist1, String s10, String s11, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, 
            ArrayList arraylist5, f f)
    {
        BR = i;
        fl = s;
        asT = s1;
        asU = s2;
        asV = s3;
        Dv = s4;
        asW = s5;
        asX = s6;
        asY = s7;
        asZ = s8;
        ata = s9;
        state = k;
        atb = arraylist;
        atc = l;
        atd = arraylist1;
        ate = s10;
        atf = s11;
        atg = arraylist2;
        ath = flag;
        ati = arraylist3;
        atj = arraylist4;
        atk = arraylist5;
        atl = f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountId()
    {
        return asT;
    }

    public String getAccountName()
    {
        return Dv;
    }

    public String getBarcodeAlternateText()
    {
        return asW;
    }

    public String getBarcodeType()
    {
        return asX;
    }

    public String getBarcodeValue()
    {
        return asY;
    }

    public String getId()
    {
        return fl;
    }

    public String getIssuerName()
    {
        return asU;
    }

    public String getProgramName()
    {
        return asV;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
