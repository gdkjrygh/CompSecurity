// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.SortedSet;
import java.util.TreeSet;

class t
{
    public static final class a extends Enum
    {

        public static final a Aa;
        public static final a Ab;
        public static final a Ac;
        public static final a Ad;
        public static final a Ae;
        public static final a Af;
        public static final a Ag;
        public static final a Ah;
        public static final a Ai;
        public static final a Aj;
        public static final a Ak;
        public static final a Al;
        public static final a Am;
        public static final a An;
        public static final a Ao;
        public static final a Ap;
        private static final a Aq[];
        public static final a zA;
        public static final a zB;
        public static final a zC;
        public static final a zD;
        public static final a zE;
        public static final a zF;
        public static final a zG;
        public static final a zH;
        public static final a zI;
        public static final a zJ;
        public static final a zK;
        public static final a zL;
        public static final a zM;
        public static final a zN;
        public static final a zO;
        public static final a zP;
        public static final a zQ;
        public static final a zR;
        public static final a zS;
        public static final a zT;
        public static final a zU;
        public static final a zV;
        public static final a zW;
        public static final a zX;
        public static final a zY;
        public static final a zZ;
        public static final a zf;
        public static final a zg;
        public static final a zh;
        public static final a zi;
        public static final a zj;
        public static final a zk;
        public static final a zl;
        public static final a zm;
        public static final a zn;
        public static final a zo;
        public static final a zp;
        public static final a zq;
        public static final a zr;
        public static final a zs;
        public static final a zt;
        public static final a zu;
        public static final a zv;
        public static final a zw;
        public static final a zx;
        public static final a zy;
        public static final a zz;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/t$a, s);
        }

        public static a[] values()
        {
            return (a[])Aq.clone();
        }

        static 
        {
            zf = new a("MAP_BUILDER_SET", 0);
            zg = new a("MAP_BUILDER_SET_ALL", 1);
            zh = new a("MAP_BUILDER_GET", 2);
            zi = new a("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
            zj = new a("BLANK_04", 4);
            zk = new a("BLANK_05", 5);
            zl = new a("BLANK_06", 6);
            zm = new a("BLANK_07", 7);
            zn = new a("BLANK_08", 8);
            zo = new a("GET", 9);
            zp = new a("SET", 10);
            zq = new a("SEND", 11);
            zr = new a("BLANK_12", 12);
            zs = new a("BLANK_13", 13);
            zt = new a("BLANK_14", 14);
            zu = new a("BLANK_15", 15);
            zv = new a("BLANK_16", 16);
            zw = new a("BLANK_17", 17);
            zx = new a("BLANK_18", 18);
            zy = new a("BLANK_19", 19);
            zz = new a("BLANK_20", 20);
            zA = new a("BLANK_21", 21);
            zB = new a("BLANK_22", 22);
            zC = new a("BLANK_23", 23);
            zD = new a("BLANK_24", 24);
            zE = new a("BLANK_25", 25);
            zF = new a("BLANK_26", 26);
            zG = new a("BLANK_27", 27);
            zH = new a("BLANK_28", 28);
            zI = new a("BLANK_29", 29);
            zJ = new a("SET_EXCEPTION_PARSER", 30);
            zK = new a("GET_EXCEPTION_PARSER", 31);
            zL = new a("CONSTRUCT_TRANSACTION", 32);
            zM = new a("CONSTRUCT_EXCEPTION", 33);
            zN = new a("CONSTRUCT_RAW_EXCEPTION", 34);
            zO = new a("CONSTRUCT_TIMING", 35);
            zP = new a("CONSTRUCT_SOCIAL", 36);
            zQ = new a("BLANK_37", 37);
            zR = new a("BLANK_38", 38);
            zS = new a("GET_TRACKER", 39);
            zT = new a("GET_DEFAULT_TRACKER", 40);
            zU = new a("SET_DEFAULT_TRACKER", 41);
            zV = new a("SET_APP_OPT_OUT", 42);
            zW = new a("GET_APP_OPT_OUT", 43);
            zX = new a("DISPATCH", 44);
            zY = new a("SET_DISPATCH_PERIOD", 45);
            zZ = new a("BLANK_46", 46);
            Aa = new a("REPORT_UNCAUGHT_EXCEPTIONS", 47);
            Ab = new a("SET_AUTO_ACTIVITY_TRACKING", 48);
            Ac = new a("SET_SESSION_TIMEOUT", 49);
            Ad = new a("CONSTRUCT_EVENT", 50);
            Ae = new a("CONSTRUCT_ITEM", 51);
            Af = new a("BLANK_52", 52);
            Ag = new a("BLANK_53", 53);
            Ah = new a("SET_DRY_RUN", 54);
            Ai = new a("GET_DRY_RUN", 55);
            Aj = new a("SET_LOGGER", 56);
            Ak = new a("SET_FORCE_LOCAL_DISPATCH", 57);
            Al = new a("GET_TRACKER_NAME", 58);
            Am = new a("CLOSE_TRACKER", 59);
            An = new a("EASY_TRACKER_ACTIVITY_START", 60);
            Ao = new a("EASY_TRACKER_ACTIVITY_STOP", 61);
            Ap = new a("CONSTRUCT_APP_VIEW", 62);
            Aq = (new a[] {
                zf, zg, zh, zi, zj, zk, zl, zm, zn, zo, 
                zp, zq, zr, zs, zt, zu, zv, zw, zx, zy, 
                zz, zA, zB, zC, zD, zE, zF, zG, zH, zI, 
                zJ, zK, zL, zM, zN, zO, zP, zQ, zR, zS, 
                zT, zU, zV, zW, zX, zY, zZ, Aa, Ab, Ac, 
                Ad, Ae, Af, Ag, Ah, Ai, Aj, Ak, Al, Am, 
                An, Ao, Ap
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final t ze = new t();
    private SortedSet zb;
    private StringBuilder zc;
    private boolean zd;

    private t()
    {
        zb = new TreeSet();
        zc = new StringBuilder();
        zd = false;
    }

    public static t ep()
    {
        return ze;
    }

    public void B(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zd = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!zd)
        {
            zb.add(a1);
            zc.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(a1.ordinal()));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public String eq()
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
        if (zb.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (a)zb.first();
        zb.remove(a1);
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
        zb.clear();
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public String er()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (zc.length() > 0)
        {
            zc.insert(0, ".");
        }
        s = zc.toString();
        zc = new StringBuilder();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

}
