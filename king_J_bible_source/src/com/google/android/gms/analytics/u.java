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

        public static final a tI;
        public static final a tJ;
        public static final a tK;
        public static final a tL;
        public static final a tM;
        public static final a tN;
        public static final a tO;
        public static final a tP;
        public static final a tQ;
        public static final a tR;
        public static final a tS;
        public static final a tT;
        public static final a tU;
        public static final a tV;
        public static final a tW;
        public static final a tX;
        public static final a tY;
        public static final a tZ;
        public static final a uA;
        public static final a uB;
        public static final a uC;
        public static final a uD;
        public static final a uE;
        public static final a uF;
        public static final a uG;
        public static final a uH;
        public static final a uI;
        public static final a uJ;
        public static final a uK;
        public static final a uL;
        public static final a uM;
        public static final a uN;
        public static final a uO;
        public static final a uP;
        public static final a uQ;
        public static final a uR;
        public static final a uS;
        private static final a uT[];
        public static final a ua;
        public static final a ub;
        public static final a uc;
        public static final a ud;
        public static final a ue;
        public static final a uf;
        public static final a ug;
        public static final a uh;
        public static final a ui;
        public static final a uj;
        public static final a uk;
        public static final a ul;
        public static final a um;
        public static final a un;
        public static final a uo;
        public static final a up;
        public static final a uq;
        public static final a ur;
        public static final a us;
        public static final a ut;
        public static final a uu;
        public static final a uv;
        public static final a uw;
        public static final a ux;
        public static final a uy;
        public static final a uz;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/u$a, s);
        }

        public static a[] values()
        {
            return (a[])uT.clone();
        }

        static 
        {
            tI = new a("MAP_BUILDER_SET", 0);
            tJ = new a("MAP_BUILDER_SET_ALL", 1);
            tK = new a("MAP_BUILDER_GET", 2);
            tL = new a("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
            tM = new a("BLANK_04", 4);
            tN = new a("BLANK_05", 5);
            tO = new a("BLANK_06", 6);
            tP = new a("BLANK_07", 7);
            tQ = new a("BLANK_08", 8);
            tR = new a("GET", 9);
            tS = new a("SET", 10);
            tT = new a("SEND", 11);
            tU = new a("BLANK_12", 12);
            tV = new a("BLANK_13", 13);
            tW = new a("BLANK_14", 14);
            tX = new a("BLANK_15", 15);
            tY = new a("BLANK_16", 16);
            tZ = new a("BLANK_17", 17);
            ua = new a("BLANK_18", 18);
            ub = new a("BLANK_19", 19);
            uc = new a("BLANK_20", 20);
            ud = new a("BLANK_21", 21);
            ue = new a("BLANK_22", 22);
            uf = new a("BLANK_23", 23);
            ug = new a("BLANK_24", 24);
            uh = new a("BLANK_25", 25);
            ui = new a("BLANK_26", 26);
            uj = new a("BLANK_27", 27);
            uk = new a("BLANK_28", 28);
            ul = new a("BLANK_29", 29);
            um = new a("SET_EXCEPTION_PARSER", 30);
            un = new a("GET_EXCEPTION_PARSER", 31);
            uo = new a("CONSTRUCT_TRANSACTION", 32);
            up = new a("CONSTRUCT_EXCEPTION", 33);
            uq = new a("CONSTRUCT_RAW_EXCEPTION", 34);
            ur = new a("CONSTRUCT_TIMING", 35);
            us = new a("CONSTRUCT_SOCIAL", 36);
            ut = new a("BLANK_37", 37);
            uu = new a("BLANK_38", 38);
            uv = new a("GET_TRACKER", 39);
            uw = new a("GET_DEFAULT_TRACKER", 40);
            ux = new a("SET_DEFAULT_TRACKER", 41);
            uy = new a("SET_APP_OPT_OUT", 42);
            uz = new a("GET_APP_OPT_OUT", 43);
            uA = new a("DISPATCH", 44);
            uB = new a("SET_DISPATCH_PERIOD", 45);
            uC = new a("BLANK_46", 46);
            uD = new a("REPORT_UNCAUGHT_EXCEPTIONS", 47);
            uE = new a("SET_AUTO_ACTIVITY_TRACKING", 48);
            uF = new a("SET_SESSION_TIMEOUT", 49);
            uG = new a("CONSTRUCT_EVENT", 50);
            uH = new a("CONSTRUCT_ITEM", 51);
            uI = new a("BLANK_52", 52);
            uJ = new a("BLANK_53", 53);
            uK = new a("SET_DRY_RUN", 54);
            uL = new a("GET_DRY_RUN", 55);
            uM = new a("SET_LOGGER", 56);
            uN = new a("SET_FORCE_LOCAL_DISPATCH", 57);
            uO = new a("GET_TRACKER_NAME", 58);
            uP = new a("CLOSE_TRACKER", 59);
            uQ = new a("EASY_TRACKER_ACTIVITY_START", 60);
            uR = new a("EASY_TRACKER_ACTIVITY_STOP", 61);
            uS = new a("CONSTRUCT_APP_VIEW", 62);
            uT = (new a[] {
                tI, tJ, tK, tL, tM, tN, tO, tP, tQ, tR, 
                tS, tT, tU, tV, tW, tX, tY, tZ, ua, ub, 
                uc, ud, ue, uf, ug, uh, ui, uj, uk, ul, 
                um, un, uo, up, uq, ur, us, ut, uu, uv, 
                uw, ux, uy, uz, uA, uB, uC, uD, uE, uF, 
                uG, uH, uI, uJ, uK, uL, uM, uN, uO, uP, 
                uQ, uR, uS
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final u tH = new u();
    private SortedSet tE;
    private StringBuilder tF;
    private boolean tG;

    private u()
    {
        tE = new TreeSet();
        tF = new StringBuilder();
        tG = false;
    }

    public static u cy()
    {
        return tH;
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!tG)
        {
            tE.add(a1);
            tF.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(a1.ordinal()));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public String cA()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (tF.length() > 0)
        {
            tF.insert(0, ".");
        }
        s = tF.toString();
        tF = new StringBuilder();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String cz()
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
        if (tE.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (a)tE.first();
        tE.remove(a1);
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
        tE.clear();
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public void t(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        tG = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
