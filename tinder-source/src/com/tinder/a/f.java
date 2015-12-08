// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.volley.Request;
import com.android.volley.h;
import com.tinder.enums.Environment;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.utils.v;
import com.tinder.utils.y;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;

public final class f
{

    public static final String a;
    public static String aa = "http://www.gotinder.com/jobs";
    public static String ab;
    public static String ac;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    public String Y;
    public String Z;
    private h ad;
    private final CookieManager ae;
    private final y af;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public f(Context context, h h1, Environment environment)
    {
        ad = h1;
        af = new y(context);
        ae = new CookieManager(af, CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(ae);
        h1 = context.getPackageManager();
        if (h1 != null)
        {
            try
            {
                ac = String.valueOf(h1.getPackageInfo(context.getPackageName(), 0).versionCode);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.tinder.utils.v.a("Failed to get package info from package manager", context);
            }
        }
        ab = String.valueOf(android.os.Build.VERSION.SDK_INT);
        (new StringBuilder("APP VERSION IS: ")).append(ac).append(" OS VERSION IS: ").append(ab);
        a(environment);
    }

    public final void a(Request request)
    {
        ad.a(request);
    }

    public final void a(Environment environment)
    {
        if ("DEFAULT".equals("DEFAULT")) goto _L2; else goto _L1
_L1:
        b = (new StringBuilder("https://")).append("DEFAULT").toString();
_L8:
        if ("DEFAULT".equals("DEFAULT")) goto _L4; else goto _L3
_L3:
        c = (new StringBuilder("https://")).append("DEFAULT").toString();
_L6:
        d = "/media";
        e = (new StringBuilder()).append(c).append(d).toString();
        f = (new StringBuilder()).append(b).append("/user/").toString();
        g = (new StringBuilder()).append(b).append("/auth").toString();
        h = (new StringBuilder()).append(f).append("matches/").toString();
        i = (new StringBuilder()).append(f).append("ping").toString();
        j = (new StringBuilder()).append(b).append("/profile").toString();
        k = (new StringBuilder()).append(f).append("recs?locale=%s").toString();
        l = (new StringBuilder()).append(b).append("/updates").toString();
        m = (new StringBuilder()).append(b).append("/device/android").toString();
        n = (new StringBuilder()).append(b).append("/like/%s").toString();
        C = (new StringBuilder()).append(n).append('?').append("user_traveling=true").toString();
        D = (new StringBuilder()).append(n).append('?').append("rec_traveling=true").toString();
        E = (new StringBuilder()).append(n).append('?').append("user_traveling=true&rec_traveling=true").toString();
        o = (new StringBuilder()).append(b).append("/pass/%s").toString();
        O = (new StringBuilder()).append(n).append("/super/").toString();
        Q = (new StringBuilder()).append(n).append('?').append("super=1").toString();
        R = (new StringBuilder()).append(o).append('?').append("super=1").toString();
        p = (new StringBuilder()).append(b).append("/report/").toString();
        q = (new StringBuilder()).append(p).append("user/").toString();
        r = (new StringBuilder()).append(b).append("/list").toString();
        s = (new StringBuilder()).append(b).append("/sendtoken").toString();
        t = (new StringBuilder()).append(b).append("/validate").toString();
        u = (new StringBuilder()).append(b).append("/location/search?locale=%s&s=%s").toString();
        v = (new StringBuilder()).append(b).append("/location/search?locale=%s&lat=%f&lon=%f").toString();
        w = (new StringBuilder()).append(b).append("/passport/user/travel").toString();
        x = (new StringBuilder()).append(b).append("/passport/user/reset").toString();
        B = (new StringBuilder()).append(b).append("/location/popular?locale=%s").toString();
        y = (new StringBuilder()).append(b).append("/purchase").toString();
        A = "/android";
        z = (new StringBuilder()).append(y).append(A).toString();
        F = (new StringBuilder()).append(b).append("/meta").toString();
        P = (new StringBuilder()).append(b).append("/meta/user/tutorials").toString();
        G = (new StringBuilder()).append(b).append("/report/ack").toString();
        H = (new StringBuilder()).append(b).append("/instagram/authorize").toString();
        I = "http://gotinder.com/instagram/authenticate";
        J = (new StringBuilder()).append(b).append("/instagram/authenticate").toString();
        K = (new StringBuilder()).append(b).append("/instagram/deauthorize").toString();
        L = (new StringBuilder()).append(b).append("/instagram/refresh").toString();
        M = (new StringBuilder()).append(f).append("%s/common_connections").toString();
        N = (new StringBuilder()).append(b).append("/feedback").toString();
        O = (new StringBuilder()).append(b).append("/like/%s/super").toString();
        S = f;
        T = (new StringBuilder()).append(j).append("/username").toString();
        U = (new StringBuilder()).append(j).append("/username").toString();
        V = (new StringBuilder()).append(j).append("/username").toString();
        W = (new StringBuilder()).append(j).append("/job").toString();
        X = (new StringBuilder()).append(j).append("/job").toString();
        Y = (new StringBuilder()).append(j).append("/school").toString();
        Z = (new StringBuilder()).append(j).append("/school").toString();
        return;
_L2:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Environment.values().length];
                try
                {
                    a[Environment.PROD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Environment.PRODTEST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Environment.DEV.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Environment.SANDBOX.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[environment.ordinal()])
        {
        case 1: // '\001'
            b = "https://api.gotinder.com";
            break;

        case 2: // '\002'
            b = "https://prodtest2.gotinder.com";
            break;

        case 3: // '\003'
            b = "https://dev-stable.gotinder.com";
            break;

        case 4: // '\004'
            ManagerApp.h().j();
            b = "https://*.tindersandbox.com".replace("*", ae.a.getString("KEY_SANDBOX", ""));
            (new StringBuilder("Switching to ")).append(b);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        switch (_cls1.a[environment.ordinal()])
        {
        case 1: // '\001'
        case 4: // '\004'
            c = "https://content.gotinder.com";
            break;

        case 2: // '\002'
            c = "https://prodtest2.gotinder.com";
            break;

        case 3: // '\003'
            c = "https://content-dev.gotinder.com";
            break;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(Object obj)
    {
        ad.a(obj);
    }

    public final transient void a(Object aobj[])
    {
        for (int i1 = 0; i1 < 2; i1++)
        {
            Object obj = aobj[i1];
            ad.a(obj);
        }

    }

    static 
    {
        a = (new StringBuilder("Tinder Android Version ")).append(ManagerApp.d).toString();
    }
}
