// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.a;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            a, TimeInterval

public class CommonWalletObject
    implements SafeParcelable
{
    public final class a
    {

        final CommonWalletObject aVK;

        public final a el(String s)
        {
            aVK.fl = s;
            return this;
        }

        public final CommonWalletObject vc()
        {
            return aVK;
        }

        private a()
        {
            aVK = CommonWalletObject.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.wallet.wobs.a();
    String aTM;
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
    String fl;
    private final int mVersionCode;
    String name;
    int state;

    CommonWalletObject()
    {
        mVersionCode = 1;
        aTT = com.google.android.gms.common.util.a.ji();
        aTV = com.google.android.gms.common.util.a.ji();
        aTY = com.google.android.gms.common.util.a.ji();
        aUa = com.google.android.gms.common.util.a.ji();
        aUb = com.google.android.gms.common.util.a.ji();
        aUc = com.google.android.gms.common.util.a.ji();
    }

    CommonWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, int j, ArrayList arraylist, TimeInterval timeinterval, ArrayList arraylist1, String s8, 
            String s9, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, ArrayList arraylist5)
    {
        mVersionCode = i;
        fl = s;
        aTS = s1;
        name = s2;
        aTM = s3;
        aTO = s4;
        aTP = s5;
        aTQ = s6;
        aTR = s7;
        state = j;
        aTT = arraylist;
        aTU = timeinterval;
        aTV = arraylist1;
        aTW = s8;
        aTX = s9;
        aTY = arraylist2;
        aTZ = flag;
        aUa = arraylist3;
        aUb = arraylist4;
        aUc = arraylist5;
    }

    public static a vb()
    {
        CommonWalletObject commonwalletobject = new CommonWalletObject();
        commonwalletobject.getClass();
        return commonwalletobject. new a();
    }

    public int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.wobs.a.a(this, parcel, i);
    }

}
