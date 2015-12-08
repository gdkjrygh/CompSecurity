// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ih;
import com.google.android.gms.wallet.wobs.f;
import com.google.android.gms.wallet.wobs.l;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            j

public final class LoyaltyWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    String ajf;
    String ajg;
    String ajh;
    String aji;
    String ajj;
    String ajk;
    String ajl;
    String ajm;
    String ajn;
    ArrayList ajo;
    l ajp;
    ArrayList ajq;
    String ajr;
    String ajs;
    ArrayList ajt;
    boolean aju;
    ArrayList ajv;
    ArrayList ajw;
    ArrayList ajx;
    f ajy;
    String eC;
    int state;
    private final int xJ;

    LoyaltyWalletObject()
    {
        xJ = 4;
        ajo = ih.fV();
        ajq = ih.fV();
        ajt = ih.fV();
        ajv = ih.fV();
        ajw = ih.fV();
        ajx = ih.fV();
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, int k, ArrayList arraylist, l l, 
            ArrayList arraylist1, String s10, String s11, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, 
            ArrayList arraylist5, f f)
    {
        xJ = i;
        eC = s;
        ajf = s1;
        ajg = s2;
        ajh = s3;
        aji = s4;
        ajj = s5;
        ajk = s6;
        ajl = s7;
        ajm = s8;
        ajn = s9;
        state = k;
        ajo = arraylist;
        ajp = l;
        ajq = arraylist1;
        ajr = s10;
        ajs = s11;
        ajt = arraylist2;
        aju = flag;
        ajv = arraylist3;
        ajw = arraylist4;
        ajx = arraylist5;
        ajy = f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountId()
    {
        return ajf;
    }

    public String getAccountName()
    {
        return aji;
    }

    public String getBarcodeAlternateText()
    {
        return ajj;
    }

    public String getBarcodeType()
    {
        return ajk;
    }

    public String getBarcodeValue()
    {
        return ajl;
    }

    public String getId()
    {
        return eC;
    }

    public String getIssuerName()
    {
        return ajg;
    }

    public String getProgramName()
    {
        return ajh;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
