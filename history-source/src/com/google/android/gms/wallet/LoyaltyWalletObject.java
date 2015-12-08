// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.la;
import com.google.android.gms.wallet.wobs.f;
import com.google.android.gms.wallet.wobs.l;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            j

public final class LoyaltyWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final int CK;
    String aki;
    String avd;
    String ave;
    String avf;
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
    f avv;
    String fl;
    int state;

    LoyaltyWalletObject()
    {
        CK = 4;
        avl = la.ie();
        avn = la.ie();
        avq = la.ie();
        avs = la.ie();
        avt = la.ie();
        avu = la.ie();
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, int k, ArrayList arraylist, l l, 
            ArrayList arraylist1, String s10, String s11, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, 
            ArrayList arraylist5, f f)
    {
        CK = i;
        fl = s;
        avd = s1;
        ave = s2;
        avf = s3;
        aki = s4;
        avg = s5;
        avh = s6;
        avi = s7;
        avj = s8;
        avk = s9;
        state = k;
        avl = arraylist;
        avm = l;
        avn = arraylist1;
        avo = s10;
        avp = s11;
        avq = arraylist2;
        avr = flag;
        avs = arraylist3;
        avt = arraylist4;
        avu = arraylist5;
        avv = f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountId()
    {
        return avd;
    }

    public String getAccountName()
    {
        return aki;
    }

    public String getBarcodeAlternateText()
    {
        return avg;
    }

    public String getBarcodeType()
    {
        return avh;
    }

    public String getBarcodeValue()
    {
        return avi;
    }

    public String getId()
    {
        return fl;
    }

    public String getIssuerName()
    {
        return ave;
    }

    public String getProgramName()
    {
        return avf;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
