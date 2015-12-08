// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.jo;
import com.google.android.gms.internal.ju;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            j

public final class LoyaltyWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    String abA;
    String abB;
    String abC;
    String abD;
    String abE;
    String abF;
    String abG;
    String abH;
    ArrayList abI;
    ju abJ;
    ArrayList abK;
    String abL;
    String abM;
    ArrayList abN;
    boolean abO;
    ArrayList abP;
    ArrayList abQ;
    ArrayList abR;
    jo abS;
    String abz;
    String eC;
    int state;
    private final int xH;

    LoyaltyWalletObject()
    {
        xH = 4;
        abI = gi.fs();
        abK = gi.fs();
        abN = gi.fs();
        abP = gi.fs();
        abQ = gi.fs();
        abR = gi.fs();
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, int k, ArrayList arraylist, ju ju, 
            ArrayList arraylist1, String s10, String s11, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, 
            ArrayList arraylist5, jo jo)
    {
        xH = i;
        eC = s;
        abz = s1;
        abA = s2;
        abB = s3;
        abC = s4;
        abD = s5;
        abE = s6;
        abF = s7;
        abG = s8;
        abH = s9;
        state = k;
        abI = arraylist;
        abJ = ju;
        abK = arraylist1;
        abL = s10;
        abM = s11;
        abN = arraylist2;
        abO = flag;
        abP = arraylist3;
        abQ = arraylist4;
        abR = arraylist5;
        abS = jo;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountId()
    {
        return abz;
    }

    public String getAccountName()
    {
        return abC;
    }

    public String getBarcodeAlternateText()
    {
        return abD;
    }

    public String getBarcodeType()
    {
        return abE;
    }

    public String getBarcodeValue()
    {
        return abF;
    }

    public String getId()
    {
        return eC;
    }

    public String getIssuerName()
    {
        return abA;
    }

    public String getProgramName()
    {
        return abB;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
