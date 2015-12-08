// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jr;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            a, l

public class CommonWalletObject
    implements SafeParcelable
{
    public final class a
    {

        final CommonWalletObject auy;

        public a df(String s)
        {
            auy.fl = s;
            return this;
        }

        public CommonWalletObject pR()
        {
            return auy;
        }

        private a()
        {
            auy = CommonWalletObject.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.wallet.wobs.a();
    private final int BR;
    String asU;
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
    String fl;
    String name;
    int state;

    CommonWalletObject()
    {
        BR = 1;
        atb = jr.hz();
        atd = jr.hz();
        atg = jr.hz();
        ati = jr.hz();
        atj = jr.hz();
        atk = jr.hz();
    }

    CommonWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, int j, ArrayList arraylist, l l, ArrayList arraylist1, String s8, 
            String s9, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, ArrayList arraylist5)
    {
        BR = i;
        fl = s;
        ata = s1;
        name = s2;
        asU = s3;
        asW = s4;
        asX = s5;
        asY = s6;
        asZ = s7;
        state = j;
        atb = arraylist;
        atc = l;
        atd = arraylist1;
        ate = s8;
        atf = s9;
        atg = arraylist2;
        ath = flag;
        ati = arraylist3;
        atj = arraylist4;
        atk = arraylist5;
    }

    public static a pQ()
    {
        CommonWalletObject commonwalletobject = new CommonWalletObject();
        commonwalletobject.getClass();
        return commonwalletobject. new a();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return fl;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.wobs.a.a(this, parcel, i);
    }

}
