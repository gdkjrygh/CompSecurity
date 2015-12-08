// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            zzj

public final class LoyaltyWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    int k;
    ArrayList l;
    TimeInterval m;
    ArrayList n;
    String o;
    String p;
    ArrayList q;
    boolean r;
    ArrayList s;
    ArrayList t;
    ArrayList u;
    LoyaltyPoints v;
    private final int w;

    LoyaltyWalletObject()
    {
        w = 4;
        l = zzkx.a();
        n = zzkx.a();
        q = zzkx.a();
        s = zzkx.a();
        t = zzkx.a();
        u = zzkx.a();
    }

    LoyaltyWalletObject(int i1, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, int j1, ArrayList arraylist, TimeInterval timeinterval, 
            ArrayList arraylist1, String s11, String s12, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, 
            ArrayList arraylist5, LoyaltyPoints loyaltypoints)
    {
        w = i1;
        a = s1;
        b = s2;
        c = s3;
        d = s4;
        e = s5;
        f = s6;
        g = s7;
        h = s8;
        i = s9;
        j = s10;
        k = j1;
        l = arraylist;
        m = timeinterval;
        n = arraylist1;
        o = s11;
        p = s12;
        q = arraylist2;
        r = flag;
        s = arraylist3;
        t = arraylist4;
        u = arraylist5;
        v = loyaltypoints;
    }

    public int a()
    {
        return w;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        zzj.a(this, parcel, i1);
    }

}
