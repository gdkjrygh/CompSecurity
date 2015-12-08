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
        public static final a we;
        public static final a wf;
        public static final a wg;
        private static final a wh[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/u$a, s);
        }

        public static a[] values()
        {
            return (a[])wh.clone();
        }

        static 
        {
            uW = new a("MAP_BUILDER_SET", 0);
            uX = new a("MAP_BUILDER_SET_ALL", 1);
            uY = new a("MAP_BUILDER_GET", 2);
            uZ = new a("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
            va = new a("BLANK_04", 4);
            vb = new a("BLANK_05", 5);
            vc = new a("BLANK_06", 6);
            vd = new a("BLANK_07", 7);
            ve = new a("BLANK_08", 8);
            vf = new a("GET", 9);
            vg = new a("SET", 10);
            vh = new a("SEND", 11);
            vi = new a("BLANK_12", 12);
            vj = new a("BLANK_13", 13);
            vk = new a("BLANK_14", 14);
            vl = new a("BLANK_15", 15);
            vm = new a("BLANK_16", 16);
            vn = new a("BLANK_17", 17);
            vo = new a("BLANK_18", 18);
            vp = new a("BLANK_19", 19);
            vq = new a("BLANK_20", 20);
            vr = new a("BLANK_21", 21);
            vs = new a("BLANK_22", 22);
            vt = new a("BLANK_23", 23);
            vu = new a("BLANK_24", 24);
            vv = new a("BLANK_25", 25);
            vw = new a("BLANK_26", 26);
            vx = new a("BLANK_27", 27);
            vy = new a("BLANK_28", 28);
            vz = new a("BLANK_29", 29);
            vA = new a("SET_EXCEPTION_PARSER", 30);
            vB = new a("GET_EXCEPTION_PARSER", 31);
            vC = new a("CONSTRUCT_TRANSACTION", 32);
            vD = new a("CONSTRUCT_EXCEPTION", 33);
            vE = new a("CONSTRUCT_RAW_EXCEPTION", 34);
            vF = new a("CONSTRUCT_TIMING", 35);
            vG = new a("CONSTRUCT_SOCIAL", 36);
            vH = new a("BLANK_37", 37);
            vI = new a("BLANK_38", 38);
            vJ = new a("GET_TRACKER", 39);
            vK = new a("GET_DEFAULT_TRACKER", 40);
            vL = new a("SET_DEFAULT_TRACKER", 41);
            vM = new a("SET_APP_OPT_OUT", 42);
            vN = new a("GET_APP_OPT_OUT", 43);
            vO = new a("DISPATCH", 44);
            vP = new a("SET_DISPATCH_PERIOD", 45);
            vQ = new a("BLANK_46", 46);
            vR = new a("REPORT_UNCAUGHT_EXCEPTIONS", 47);
            vS = new a("SET_AUTO_ACTIVITY_TRACKING", 48);
            vT = new a("SET_SESSION_TIMEOUT", 49);
            vU = new a("CONSTRUCT_EVENT", 50);
            vV = new a("CONSTRUCT_ITEM", 51);
            vW = new a("BLANK_52", 52);
            vX = new a("BLANK_53", 53);
            vY = new a("SET_DRY_RUN", 54);
            vZ = new a("GET_DRY_RUN", 55);
            wa = new a("SET_LOGGER", 56);
            wb = new a("SET_FORCE_LOCAL_DISPATCH", 57);
            wc = new a("GET_TRACKER_NAME", 58);
            wd = new a("CLOSE_TRACKER", 59);
            we = new a("EASY_TRACKER_ACTIVITY_START", 60);
            wf = new a("EASY_TRACKER_ACTIVITY_STOP", 61);
            wg = new a("CONSTRUCT_APP_VIEW", 62);
            wh = (new a[] {
                uW, uX, uY, uZ, va, vb, vc, vd, ve, vf, 
                vg, vh, vi, vj, vk, vl, vm, vn, vo, vp, 
                vq, vr, vs, vt, vu, vv, vw, vx, vy, vz, 
                vA, vB, vC, vD, vE, vF, vG, vH, vI, vJ, 
                vK, vL, vM, vN, vO, vP, vQ, vR, vS, vT, 
                vU, vV, vW, vX, vY, vZ, wa, wb, wc, wd, 
                we, wf, wg
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final u uV = new u();
    private SortedSet uS;
    private StringBuilder uT;
    private boolean uU;

    private u()
    {
        uS = new TreeSet();
        uT = new StringBuilder();
        uU = false;
    }

    public static u cU()
    {
        return uV;
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!uU)
        {
            uS.add(a1);
            uT.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(a1.ordinal()));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public String cV()
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
        if (uS.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (a)uS.first();
        uS.remove(a1);
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
        uS.clear();
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public String cW()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (uT.length() > 0)
        {
            uT.insert(0, ".");
        }
        s = uT.toString();
        uT = new StringBuilder();
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
        uU = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
