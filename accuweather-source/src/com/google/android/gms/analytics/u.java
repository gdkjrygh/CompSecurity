// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.SortedSet;
import java.util.TreeSet;

class u
{
    public static final class a extends Enum
    {

        public static final a uT;
        public static final a uU;
        public static final a uV;
        public static final a uW;
        public static final a uX;
        public static final a uY;
        public static final a uZ;
        public static final a vA;
        public static final a vB;
        public static final a vC;
        public static final a vD;
        public static final a vE;
        public static final a vF;
        public static final a vG;
        public static final a vH;
        public static final a vI;
        public static final a vJ;
        public static final a vK;
        public static final a vL;
        public static final a vM;
        public static final a vN;
        public static final a vO;
        public static final a vP;
        public static final a vQ;
        public static final a vR;
        public static final a vS;
        public static final a vT;
        public static final a vU;
        public static final a vV;
        public static final a vW;
        public static final a vX;
        public static final a vY;
        public static final a vZ;
        public static final a va;
        public static final a vb;
        public static final a vc;
        public static final a vd;
        public static final a ve;
        public static final a vf;
        public static final a vg;
        public static final a vh;
        public static final a vi;
        public static final a vj;
        public static final a vk;
        public static final a vl;
        public static final a vm;
        public static final a vn;
        public static final a vo;
        public static final a vp;
        public static final a vq;
        public static final a vr;
        public static final a vs;
        public static final a vt;
        public static final a vu;
        public static final a vv;
        public static final a vw;
        public static final a vx;
        public static final a vy;
        public static final a vz;
        public static final a wa;
        public static final a wb;
        public static final a wc;
        public static final a wd;
        private static final a we[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/u$a, s);
        }

        public static a[] values()
        {
            return (a[])we.clone();
        }

        static 
        {
            uT = new a("MAP_BUILDER_SET", 0);
            uU = new a("MAP_BUILDER_SET_ALL", 1);
            uV = new a("MAP_BUILDER_GET", 2);
            uW = new a("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
            uX = new a("BLANK_04", 4);
            uY = new a("BLANK_05", 5);
            uZ = new a("BLANK_06", 6);
            va = new a("BLANK_07", 7);
            vb = new a("BLANK_08", 8);
            vc = new a("GET", 9);
            vd = new a("SET", 10);
            ve = new a("SEND", 11);
            vf = new a("BLANK_12", 12);
            vg = new a("BLANK_13", 13);
            vh = new a("BLANK_14", 14);
            vi = new a("BLANK_15", 15);
            vj = new a("BLANK_16", 16);
            vk = new a("BLANK_17", 17);
            vl = new a("BLANK_18", 18);
            vm = new a("BLANK_19", 19);
            vn = new a("BLANK_20", 20);
            vo = new a("BLANK_21", 21);
            vp = new a("BLANK_22", 22);
            vq = new a("BLANK_23", 23);
            vr = new a("BLANK_24", 24);
            vs = new a("BLANK_25", 25);
            vt = new a("BLANK_26", 26);
            vu = new a("BLANK_27", 27);
            vv = new a("BLANK_28", 28);
            vw = new a("BLANK_29", 29);
            vx = new a("SET_EXCEPTION_PARSER", 30);
            vy = new a("GET_EXCEPTION_PARSER", 31);
            vz = new a("CONSTRUCT_TRANSACTION", 32);
            vA = new a("CONSTRUCT_EXCEPTION", 33);
            vB = new a("CONSTRUCT_RAW_EXCEPTION", 34);
            vC = new a("CONSTRUCT_TIMING", 35);
            vD = new a("CONSTRUCT_SOCIAL", 36);
            vE = new a("BLANK_37", 37);
            vF = new a("BLANK_38", 38);
            vG = new a("GET_TRACKER", 39);
            vH = new a("GET_DEFAULT_TRACKER", 40);
            vI = new a("SET_DEFAULT_TRACKER", 41);
            vJ = new a("SET_APP_OPT_OUT", 42);
            vK = new a("GET_APP_OPT_OUT", 43);
            vL = new a("DISPATCH", 44);
            vM = new a("SET_DISPATCH_PERIOD", 45);
            vN = new a("BLANK_46", 46);
            vO = new a("REPORT_UNCAUGHT_EXCEPTIONS", 47);
            vP = new a("SET_AUTO_ACTIVITY_TRACKING", 48);
            vQ = new a("SET_SESSION_TIMEOUT", 49);
            vR = new a("CONSTRUCT_EVENT", 50);
            vS = new a("CONSTRUCT_ITEM", 51);
            vT = new a("BLANK_52", 52);
            vU = new a("BLANK_53", 53);
            vV = new a("SET_DRY_RUN", 54);
            vW = new a("GET_DRY_RUN", 55);
            vX = new a("SET_LOGGER", 56);
            vY = new a("SET_FORCE_LOCAL_DISPATCH", 57);
            vZ = new a("GET_TRACKER_NAME", 58);
            wa = new a("CLOSE_TRACKER", 59);
            wb = new a("EASY_TRACKER_ACTIVITY_START", 60);
            wc = new a("EASY_TRACKER_ACTIVITY_STOP", 61);
            wd = new a("CONSTRUCT_APP_VIEW", 62);
            we = (new a[] {
                uT, uU, uV, uW, uX, uY, uZ, va, vb, vc, 
                vd, ve, vf, vg, vh, vi, vj, vk, vl, vm, 
                vn, vo, vp, vq, vr, vs, vt, vu, vv, vw, 
                vx, vy, vz, vA, vB, vC, vD, vE, vF, vG, 
                vH, vI, vJ, vK, vL, vM, vN, vO, vP, vQ, 
                vR, vS, vT, vU, vV, vW, vX, vY, vZ, wa, 
                wb, wc, wd
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final u uS = new u();
    private SortedSet uP;
    private StringBuilder uQ;
    private boolean uR;

    private u()
    {
        uP = new TreeSet();
        uQ = new StringBuilder();
        uR = false;
    }

    public static u cP()
    {
        return uS;
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!uR)
        {
            uP.add(a1);
            uQ.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(a1.ordinal()));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public String cQ()
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
        if (uP.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (a)uP.first();
        uP.remove(a1);
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
        uP.clear();
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public String cR()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (uQ.length() > 0)
        {
            uQ.insert(0, ".");
        }
        s = uQ.toString();
        uQ = new StringBuilder();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void u(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        uR = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
