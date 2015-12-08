// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ig;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            a, l

public class CommonWalletObject
    implements SafeParcelable
{
    public final class a
    {

        final CommonWalletObject akO;

        public a cw(String s)
        {
            akO.eC = s;
            return this;
        }

        public CommonWalletObject nl()
        {
            return akO;
        }

        private a()
        {
            akO = CommonWalletObject.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.wallet.wobs.a();
    ArrayList ajA;
    String ajj;
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
    String name;
    int state;
    private final int xM;

    CommonWalletObject()
    {
        xM = 1;
        ajr = ig.ga();
        ajt = ig.ga();
        ajw = ig.ga();
        ajy = ig.ga();
        ajz = ig.ga();
        ajA = ig.ga();
    }

    CommonWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, int j, ArrayList arraylist, l l, ArrayList arraylist1, String s8, 
            String s9, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, ArrayList arraylist5)
    {
        xM = i;
        eC = s;
        ajq = s1;
        name = s2;
        ajj = s3;
        ajm = s4;
        ajn = s5;
        ajo = s6;
        ajp = s7;
        state = j;
        ajr = arraylist;
        ajs = l;
        ajt = arraylist1;
        aju = s8;
        ajv = s9;
        ajw = arraylist2;
        ajx = flag;
        ajy = arraylist3;
        ajz = arraylist4;
        ajA = arraylist5;
    }

    public static a nk()
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
        return eC;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.wobs.a.a(this, parcel, i);
    }

}
