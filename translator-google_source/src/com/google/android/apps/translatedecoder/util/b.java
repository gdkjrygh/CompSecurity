// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Logger;

public final class b
{

    private static final Logger R = Logger.getLogger("translate");
    public int A;
    public int B;
    public int C;
    public int D;
    public double E;
    public String F;
    public String G;
    private String H;
    private String I;
    private boolean J;
    private String K;
    private boolean L;
    private double M;
    private String N;
    private String O;
    private String P;
    private String Q;
    public boolean a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public String g;
    public boolean h;
    public String i;
    public int j;
    public String k;
    public double l;
    public int m;
    public String n;
    public int o;
    public boolean p;
    public double q;
    public double r;
    public String s;
    public double t;
    public int u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public b()
    {
        a = true;
        c = "ENGLISH";
        d = "FRENCH";
        J = false;
        e = true;
        f = false;
        h = false;
        j = 0;
        l = 1.0D;
        m = 0;
        L = false;
        o = 10000;
        p = false;
        q = 0.0D;
        r = 0.0D;
        s = null;
        t = -10D;
        u = 3;
        M = 0.050000000000000003D;
        v = null;
        w = "1";
        G = "2";
    }

    public b(String s1)
    {
        a = true;
        c = "ENGLISH";
        d = "FRENCH";
        J = false;
        e = true;
        f = false;
        h = false;
        j = 0;
        l = 1.0D;
        m = 0;
        L = false;
        o = 10000;
        p = false;
        q = 0.0D;
        r = 0.0D;
        s = null;
        t = -10D;
        u = 3;
        M = 0.050000000000000003D;
        v = null;
        w = "1";
        G = "2";
        Properties properties = new Properties();
        try
        {
            properties.load(new FileInputStream(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        for (s1 = properties.propertyNames(); s1.hasMoreElements();)
        {
            String s2 = (String)s1.nextElement();
            String s3 = properties.getProperty(s2);
            if (s2.equals("1"))
            {
                H = s3;
            } else
            if (s2.equals("2"))
            {
                a = (new Boolean(s3)).booleanValue();
            } else
            if (s2.equals("3"))
            {
                e = (new Boolean(s3)).booleanValue();
            } else
            if (s2.equals("4"))
            {
                I = s3;
            } else
            if (s2.equals("5"))
            {
                b = s3;
            } else
            if (s2.equals("6"))
            {
                c = s3;
            } else
            if (s2.equals("7"))
            {
                d = s3;
            } else
            if (s2.equals("8"))
            {
                J = (new Boolean(s3)).booleanValue();
            } else
            if (s2.equals("9"))
            {
                f = (new Boolean(s3)).booleanValue();
            } else
            if (s2.equals("10"))
            {
                g = s3;
            } else
            if (s2.equals("11"))
            {
                K = s3;
            } else
            if (s2.equals("12"))
            {
                h = (new Boolean(s3)).booleanValue();
            } else
            if (s2.equals("13"))
            {
                i = s3;
            } else
            if (s2.equals("14"))
            {
                j = Integer.valueOf(s3).intValue();
            } else
            if (s2.equals("15"))
            {
                k = s3;
            } else
            if (s2.equals("16"))
            {
                l = (new Double(s3)).doubleValue();
            } else
            if (s2.equals("17"))
            {
                m = Integer.valueOf(s3).intValue();
            } else
            if (s2.equals("18"))
            {
                n = s3;
            } else
            if (s2.equals("19"))
            {
                L = (new Boolean(s3)).booleanValue();
            } else
            if (s2.equals("20"))
            {
                o = Integer.valueOf(s3).intValue();
            } else
            if (s2.equals("21"))
            {
                p = (new Boolean(s3)).booleanValue();
            } else
            if (s2.equals("22"))
            {
                q = (new Double(s3)).doubleValue();
            } else
            if (s2.equals("23"))
            {
                r = (new Double(s3)).doubleValue();
            } else
            if (s2.equals("24"))
            {
                s = s3.trim();
            } else
            if (s2.equals("25"))
            {
                v = s3.trim();
            } else
            if (s2.equals("26"))
            {
                t = (new Double(s3)).doubleValue();
            } else
            if (s2.equals("27"))
            {
                u = (new Integer(s3)).intValue();
            } else
            if (s2.equals("28"))
            {
                M = (new Double(s3)).doubleValue();
            } else
            if (s2.equals("29"))
            {
                N = s3.trim();
            } else
            if (s2.equals("30"))
            {
                O = s3.trim();
            } else
            if (s2.equals("31"))
            {
                P = s3.trim();
            } else
            if (s2.equals("32"))
            {
                Q = s3.trim();
            } else
            if (s2.equals("33"))
            {
                w = s3.trim();
            } else
            if (s2.equals("34"))
            {
                x = s3.trim();
            } else
            if (s2.equals("35"))
            {
                y = s3.trim();
            } else
            if (s2.equals("36"))
            {
                z = s3.trim();
            } else
            if (s2.equals("39"))
            {
                A = (new Integer(s3)).intValue();
            } else
            if (s2.equals("40"))
            {
                B = (new Integer(s3)).intValue();
            } else
            if (s2.equals("41"))
            {
                C = (new Integer(s3)).intValue();
            } else
            if (s2.equals("43"))
            {
                D = (new Integer(s3)).intValue();
            } else
            if (s2.equals("42"))
            {
                E = (new Double(s3)).doubleValue();
            } else
            if (s2.equals("44"))
            {
                F = s3.trim();
            } else
            if (s2.equals("45"))
            {
                G = s3.trim();
            } else
            {
                throw new IOException("invalid line in config file");
            }
        }

    }

}
