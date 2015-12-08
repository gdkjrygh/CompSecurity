// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzkx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zza, TimeInterval

public class CommonWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.wallet.wobs.zza();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    int i;
    ArrayList j;
    TimeInterval k;
    ArrayList l;
    String m;
    String n;
    ArrayList o;
    boolean p;
    ArrayList q;
    ArrayList r;
    ArrayList s;
    private final int t;

    CommonWalletObject()
    {
        t = 1;
        j = zzkx.a();
        l = zzkx.a();
        o = zzkx.a();
        q = zzkx.a();
        r = zzkx.a();
        s = zzkx.a();
    }

    CommonWalletObject(int i1, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, int j1, ArrayList arraylist, TimeInterval timeinterval, ArrayList arraylist1, String s9, 
            String s10, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, ArrayList arraylist5)
    {
        t = i1;
        a = s1;
        b = s2;
        c = s3;
        d = s4;
        e = s5;
        f = s6;
        g = s7;
        h = s8;
        i = j1;
        j = arraylist;
        k = timeinterval;
        l = arraylist1;
        m = s9;
        n = s10;
        o = arraylist2;
        p = flag;
        q = arraylist3;
        r = arraylist4;
        s = arraylist5;
    }

    public static zza a()
    {
        CommonWalletObject commonwalletobject = new CommonWalletObject();
        commonwalletobject.getClass();
        return commonwalletobject. new zza();
    }

    public int b()
    {
        return t;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.wallet.wobs.zza.a(this, parcel, i1);
    }


    private class zza
    {

        final CommonWalletObject a;

        public zza a(String s1)
        {
            a.a = s1;
            return this;
        }

        public CommonWalletObject a()
        {
            return a;
        }

        private zza()
        {
            a = CommonWalletObject.this;
            super();
        }

    }

}
