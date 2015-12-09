// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.SortedSet;
import java.util.TreeSet;

class y
{
    public static final class a extends Enum
    {

        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        public static final a W;
        public static final a X;
        public static final a Y;
        public static final a Z;
        public static final a a;
        public static final a aa;
        public static final a ab;
        public static final a ac;
        public static final a ad;
        public static final a ae;
        public static final a af;
        public static final a ag;
        public static final a ah;
        public static final a ai;
        public static final a aj;
        public static final a ak;
        private static final a al[];
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/y$a, s1);
        }

        public static a[] values()
        {
            return (a[])al.clone();
        }

        static 
        {
            a = new a("MAP_BUILDER_SET", 0);
            b = new a("MAP_BUILDER_SET_ALL", 1);
            c = new a("MAP_BUILDER_GET", 2);
            d = new a("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
            e = new a("BLANK_04", 4);
            f = new a("BLANK_05", 5);
            g = new a("BLANK_06", 6);
            h = new a("BLANK_07", 7);
            i = new a("BLANK_08", 8);
            j = new a("GET", 9);
            k = new a("SET", 10);
            l = new a("SEND", 11);
            m = new a("BLANK_12", 12);
            n = new a("BLANK_13", 13);
            o = new a("BLANK_14", 14);
            p = new a("BLANK_15", 15);
            q = new a("BLANK_16", 16);
            r = new a("BLANK_17", 17);
            s = new a("BLANK_18", 18);
            t = new a("BLANK_19", 19);
            u = new a("BLANK_20", 20);
            v = new a("BLANK_21", 21);
            w = new a("BLANK_22", 22);
            x = new a("BLANK_23", 23);
            y = new a("BLANK_24", 24);
            z = new a("BLANK_25", 25);
            A = new a("BLANK_26", 26);
            B = new a("BLANK_27", 27);
            C = new a("BLANK_28", 28);
            D = new a("BLANK_29", 29);
            E = new a("SET_EXCEPTION_PARSER", 30);
            F = new a("GET_EXCEPTION_PARSER", 31);
            G = new a("CONSTRUCT_TRANSACTION", 32);
            H = new a("CONSTRUCT_EXCEPTION", 33);
            I = new a("CONSTRUCT_RAW_EXCEPTION", 34);
            J = new a("CONSTRUCT_TIMING", 35);
            K = new a("CONSTRUCT_SOCIAL", 36);
            L = new a("BLANK_37", 37);
            M = new a("BLANK_38", 38);
            N = new a("GET_TRACKER", 39);
            O = new a("GET_DEFAULT_TRACKER", 40);
            P = new a("SET_DEFAULT_TRACKER", 41);
            Q = new a("SET_APP_OPT_OUT", 42);
            R = new a("GET_APP_OPT_OUT", 43);
            S = new a("DISPATCH", 44);
            T = new a("SET_DISPATCH_PERIOD", 45);
            U = new a("BLANK_46", 46);
            V = new a("REPORT_UNCAUGHT_EXCEPTIONS", 47);
            W = new a("SET_AUTO_ACTIVITY_TRACKING", 48);
            X = new a("SET_SESSION_TIMEOUT", 49);
            Y = new a("CONSTRUCT_EVENT", 50);
            Z = new a("CONSTRUCT_ITEM", 51);
            aa = new a("BLANK_52", 52);
            ab = new a("BLANK_53", 53);
            ac = new a("SET_DRY_RUN", 54);
            ad = new a("GET_DRY_RUN", 55);
            ae = new a("SET_LOGGER", 56);
            af = new a("SET_FORCE_LOCAL_DISPATCH", 57);
            ag = new a("GET_TRACKER_NAME", 58);
            ah = new a("CLOSE_TRACKER", 59);
            ai = new a("EASY_TRACKER_ACTIVITY_START", 60);
            aj = new a("EASY_TRACKER_ACTIVITY_STOP", 61);
            ak = new a("CONSTRUCT_APP_VIEW", 62);
            al = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A, B, C, D, 
                E, F, G, H, I, J, K, L, M, N, 
                O, P, Q, R, S, T, U, V, W, X, 
                Y, Z, aa, ab, ac, ad, ae, af, ag, ah, 
                ai, aj, ak
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static final y d = new y();
    private SortedSet a;
    private StringBuilder b;
    private boolean c;

    private y()
    {
        a = new TreeSet();
        b = new StringBuilder();
        c = false;
    }

    public static y a()
    {
        return d;
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            a.add(a1);
            b.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(a1.ordinal()));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        c = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = new StringBuilder();
        int i;
        int j;
        j = 6;
        i = 0;
_L4:
        a a1;
        int k;
        if (a.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (a)a.first();
        a.remove(a1);
        k = a1.ordinal();
_L2:
        if (k < j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i));
        j += 6;
        i = 0;
        if (true) goto _L2; else goto _L1
_L1:
        i += 1 << a1.ordinal() % 6;
        if (true) goto _L4; else goto _L3
_L3:
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (((StringBuilder) (obj)).length() != 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        ((StringBuilder) (obj)).append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i));
        a.clear();
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public String c()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (b.length() > 0)
        {
            b.insert(0, ".");
        }
        s = b.toString();
        b = new StringBuilder();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

}
