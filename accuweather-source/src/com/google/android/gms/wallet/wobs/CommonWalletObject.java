// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ih;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            a, l

public class CommonWalletObject
    implements SafeParcelable
{
    public final class a
    {

        final CommonWalletObject akL;

        public a cw(String s)
        {
            akL.eC = s;
            return this;
        }

        public CommonWalletObject ng()
        {
            return akL;
        }

        private a()
        {
            akL = CommonWalletObject.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.wallet.wobs.a();
    String ajg;
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
    String eC;
    String name;
    int state;
    private final int xJ;

    CommonWalletObject()
    {
        xJ = 1;
        ajo = ih.fV();
        ajq = ih.fV();
        ajt = ih.fV();
        ajv = ih.fV();
        ajw = ih.fV();
        ajx = ih.fV();
    }

    CommonWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, int j, ArrayList arraylist, l l, ArrayList arraylist1, String s8, 
            String s9, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, ArrayList arraylist5)
    {
        xJ = i;
        eC = s;
        ajn = s1;
        name = s2;
        ajg = s3;
        ajj = s4;
        ajk = s5;
        ajl = s6;
        ajm = s7;
        state = j;
        ajo = arraylist;
        ajp = l;
        ajq = arraylist1;
        ajr = s8;
        ajs = s9;
        ajt = arraylist2;
        aju = flag;
        ajv = arraylist3;
        ajw = arraylist4;
        ajx = arraylist5;
    }

    public static a nf()
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
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.wobs.a.a(this, parcel, i);
    }

}
