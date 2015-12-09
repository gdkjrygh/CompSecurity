// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.ag;
import com.google.a.t;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.google.a.b.a:
//            aa, al, aw, ba, 
//            bb, bc, bd, be, 
//            bf, ab, ac, ad, 
//            ae, af, ag, ah, 
//            ai, aj, ak, am, 
//            an, ao, aq, ar, 
//            as, at, au, av, 
//            ay, ax

public final class z
{

    public static final af A;
    public static final ag B;
    public static final af C;
    public static final ag D;
    public static final af E;
    public static final ag F;
    public static final af G;
    public static final ag H;
    public static final af I;
    public static final ag J;
    public static final ag K = new ao();
    public static final af L;
    public static final ag M;
    public static final af N;
    public static final ag O;
    public static final af P;
    public static final ag Q;
    public static final ag R = new at();
    public static final af a;
    public static final ag b;
    public static final af c;
    public static final ag d;
    public static final af e;
    public static final af f = new ba();
    public static final ag g;
    public static final af h;
    public static final ag i;
    public static final af j;
    public static final ag k;
    public static final af l;
    public static final ag m;
    public static final af n = new be();
    public static final af o = new bf();
    public static final af p = new ab();
    public static final af q;
    public static final ag r;
    public static final af s;
    public static final ag t;
    public static final af u;
    public static final af v = new com.google.a.b.a.af();
    public static final af w = new com.google.a.b.a.ag();
    public static final ag x;
    public static final af y;
    public static final ag z;

    public static ag a(Class class1, af af1)
    {
        return new au(class1, af1);
    }

    public static ag a(Class class1, Class class2, af af1)
    {
        return new av(class1, class2, af1);
    }

    public static ag b(Class class1, af af1)
    {
        return new ay(class1, af1);
    }

    public static ag b(Class class1, Class class2, af af1)
    {
        return new ax(class1, class2, af1);
    }

    static 
    {
        a = new aa();
        b = a(java/lang/Class, a);
        c = new al();
        d = a(java/util/BitSet, c);
        e = new aw();
        g = a(Boolean.TYPE, java/lang/Boolean, e);
        h = new bb();
        i = a(Byte.TYPE, java/lang/Byte, h);
        j = new bc();
        k = a(Short.TYPE, java/lang/Short, j);
        l = new bd();
        m = a(Integer.TYPE, java/lang/Integer, l);
        q = new ac();
        r = a(java/lang/Number, q);
        s = new ad();
        t = a(Character.TYPE, java/lang/Character, s);
        u = new ae();
        x = a(java/lang/String, u);
        y = new ah();
        z = a(java/lang/StringBuilder, y);
        A = new ai();
        B = a(java/lang/StringBuffer, A);
        C = new aj();
        D = a(java/net/URL, C);
        E = new ak();
        F = a(java/net/URI, E);
        G = new am();
        H = b(java/net/InetAddress, G);
        I = new an();
        J = a(java/util/UUID, I);
        L = new aq();
        M = b(java/util/Calendar, java/util/GregorianCalendar, L);
        N = new ar();
        O = a(java/util/Locale, N);
        P = new as();
        Q = b(com/google/a/t, P);
    }
}
