// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.a;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            j

public final class LoyaltyWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    String aTM;
    String aTN;
    String aTO;
    String aTP;
    String aTQ;
    String aTR;
    String aTS;
    ArrayList aTT;
    TimeInterval aTU;
    ArrayList aTV;
    String aTW;
    String aTX;
    ArrayList aTY;
    boolean aTZ;
    ArrayList aUa;
    ArrayList aUb;
    ArrayList aUc;
    LoyaltyPoints aUd;
    String accountId;
    String accountName;
    String fl;
    private final int mVersionCode;
    int state;

    LoyaltyWalletObject()
    {
        mVersionCode = 4;
        aTT = a.ji();
        aTV = a.ji();
        aTY = a.ji();
        aUa = a.ji();
        aUb = a.ji();
        aUc = a.ji();
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, int k, ArrayList arraylist, TimeInterval timeinterval, 
            ArrayList arraylist1, String s10, String s11, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, 
            ArrayList arraylist5, LoyaltyPoints loyaltypoints)
    {
        mVersionCode = i;
        fl = s;
        accountId = s1;
        aTM = s2;
        aTN = s3;
        accountName = s4;
        aTO = s5;
        aTP = s6;
        aTQ = s7;
        aTR = s8;
        aTS = s9;
        state = k;
        aTT = arraylist;
        aTU = timeinterval;
        aTV = arraylist1;
        aTW = s10;
        aTX = s11;
        aTY = arraylist2;
        aTZ = flag;
        aUa = arraylist3;
        aUb = arraylist4;
        aUc = arraylist5;
        aUd = loyaltypoints;
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
        com.google.android.gms.wallet.j.a(this, parcel, i);
    }

}
