// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ig;
import com.google.android.gms.wallet.wobs.f;
import com.google.android.gms.wallet.wobs.l;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            j

public final class LoyaltyWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    ArrayList ajA;
    f ajB;
    String aji;
    String ajj;
    String ajk;
    String ajl;
    String ajm;
    String ajn;
    String ajo;
    String ajp;
    String ajq;
    ArrayList ajr;
    l ajs;
    ArrayList ajt;
    String aju;
    String ajv;
    ArrayList ajw;
    boolean ajx;
    ArrayList ajy;
    ArrayList ajz;
    String eC;
    int state;
    private final int xM;

    LoyaltyWalletObject()
    {
        xM = 4;
        ajr = ig.ga();
        ajt = ig.ga();
        ajw = ig.ga();
        ajy = ig.ga();
        ajz = ig.ga();
        ajA = ig.ga();
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, int k, ArrayList arraylist, l l, 
            ArrayList arraylist1, String s10, String s11, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, 
            ArrayList arraylist5, f f)
    {
        xM = i;
        eC = s;
        aji = s1;
        ajj = s2;
        ajk = s3;
        ajl = s4;
        ajm = s5;
        ajn = s6;
        ajo = s7;
        ajp = s8;
        ajq = s9;
        state = k;
        ajr = arraylist;
        ajs = l;
        ajt = arraylist1;
        aju = s10;
        ajv = s11;
        ajw = arraylist2;
        ajx = flag;
        ajy = arraylist3;
        ajz = arraylist4;
        ajA = arraylist5;
        ajB = f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountId()
    {
        return aji;
    }

    public String getAccountName()
    {
        return ajl;
    }

    public String getBarcodeAlternateText()
    {
        return ajm;
    }

    public String getBarcodeType()
    {
        return ajn;
    }

    public String getBarcodeValue()
    {
        return ajo;
    }

    public String getId()
    {
        return eC;
    }

    public String getIssuerName()
    {
        return ajj;
    }

    public String getProgramName()
    {
        return ajk;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
