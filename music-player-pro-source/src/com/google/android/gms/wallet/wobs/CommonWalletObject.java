// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.la;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            a, l

public class CommonWalletObject
    implements SafeParcelable
{
    public final class a
    {

        final CommonWalletObject awI;

        public a dh(String s)
        {
            awI.fl = s;
            return this;
        }

        public CommonWalletObject ri()
        {
            return awI;
        }

        private a()
        {
            awI = CommonWalletObject.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.wallet.wobs.a();
    private final int CK;
    String ave;
    String avg;
    String avh;
    String avi;
    String avj;
    String avk;
    ArrayList avl;
    l avm;
    ArrayList avn;
    String avo;
    String avp;
    ArrayList avq;
    boolean avr;
    ArrayList avs;
    ArrayList avt;
    ArrayList avu;
    String fl;
    String name;
    int state;

    CommonWalletObject()
    {
        CK = 1;
        avl = la.ie();
        avn = la.ie();
        avq = la.ie();
        avs = la.ie();
        avt = la.ie();
        avu = la.ie();
    }

    CommonWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, int j, ArrayList arraylist, l l, ArrayList arraylist1, String s8, 
            String s9, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, ArrayList arraylist5)
    {
        CK = i;
        fl = s;
        avk = s1;
        name = s2;
        ave = s3;
        avg = s4;
        avh = s5;
        avi = s6;
        avj = s7;
        state = j;
        avl = arraylist;
        avm = l;
        avn = arraylist1;
        avo = s8;
        avp = s9;
        avq = arraylist2;
        avr = flag;
        avs = arraylist3;
        avt = arraylist4;
        avu = arraylist5;
    }

    public static a rh()
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
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.wobs.a.a(this, parcel, i);
    }

}
