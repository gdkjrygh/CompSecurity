// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kow;

// Referenced classes of package com.google.android.gms.feedback:
//            FileTeleporter, ThemeSettings, LogOptions

public class ErrorReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kow();
    public int A;
    public String B;
    public String C;
    public String D;
    public Bundle E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public String J;
    public String K;
    public int L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public BitmapTeleporter T;
    public String U;
    public FileTeleporter V[];
    public String W[];
    public boolean X;
    public String Y;
    public ThemeSettings Z;
    public final int a;
    public LogOptions aa;
    public String ab;
    public boolean ac;
    public Bundle ad;
    public ApplicationErrorReport b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r[];
    public String s[];
    public String t[];
    public String u;
    public String v;
    public byte w[];
    public int x;
    public int y;
    public int z;

    public ErrorReport()
    {
        b = new ApplicationErrorReport();
        a = 8;
    }

    public ErrorReport(int i1, ApplicationErrorReport applicationerrorreport, String s1, int j1, String s2, String s3, String s4, 
            String s5, String s6, String s7, String s8, int k1, String s9, String s10, 
            String s11, String s12, String s13, String as[], String as1[], String as2[], String s14, 
            String s15, byte abyte0[], int l1, int i2, int j2, int k2, String s16, 
            String s17, String s18, Bundle bundle, boolean flag, int l2, int i3, boolean flag1, 
            String s19, String s20, int j3, String s21, String s22, String s23, String s24, 
            String s25, String s26, String s27, BitmapTeleporter bitmapteleporter, String s28, FileTeleporter afileteleporter[], String as3[], 
            boolean flag2, String s29, ThemeSettings themesettings, LogOptions logoptions, String s30, boolean flag3, Bundle bundle1)
    {
        b = new ApplicationErrorReport();
        a = i1;
        b = applicationerrorreport;
        c = s1;
        d = j1;
        e = s2;
        f = s3;
        g = s4;
        h = s5;
        i = s6;
        j = s7;
        k = s8;
        l = k1;
        m = s9;
        n = s10;
        o = s11;
        p = s12;
        q = s13;
        r = as;
        s = as1;
        t = as2;
        u = s14;
        v = s15;
        w = abyte0;
        x = l1;
        y = i2;
        z = j2;
        A = k2;
        B = s16;
        C = s17;
        D = s18;
        E = bundle;
        F = flag;
        G = l2;
        H = i3;
        I = flag1;
        J = s19;
        K = s20;
        L = j3;
        M = s21;
        N = s22;
        O = s23;
        P = s24;
        Q = s25;
        R = s26;
        S = s27;
        T = bitmapteleporter;
        U = s28;
        V = afileteleporter;
        W = as3;
        X = flag2;
        Y = s29;
        Z = themesettings;
        aa = logoptions;
        ab = s30;
        ac = flag3;
        ad = bundle1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        kow.a(this, parcel, i1);
    }

}
