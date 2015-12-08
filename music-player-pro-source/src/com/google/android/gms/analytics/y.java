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

        public static final a AA;
        public static final a AB;
        public static final a AC;
        public static final a AD;
        public static final a AE;
        public static final a AF;
        public static final a AG;
        public static final a AH;
        public static final a AI;
        public static final a AJ;
        public static final a AK;
        public static final a AL;
        public static final a AM;
        public static final a AN;
        public static final a AO;
        public static final a AP;
        public static final a AQ;
        public static final a AR;
        public static final a AS;
        public static final a AT;
        public static final a AU;
        public static final a AV;
        public static final a AW;
        public static final a AX;
        public static final a AY;
        public static final a AZ;
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
        public static final a Aq;
        public static final a Ar;
        public static final a As;
        public static final a At;
        public static final a Au;
        public static final a Av;
        public static final a Aw;
        public static final a Ax;
        public static final a Ay;
        public static final a Az;
        public static final a Ba;
        public static final a Bb;
        public static final a Bc;
        public static final a Bd;
        public static final a Be;
        public static final a Bf;
        public static final a Bg;
        private static final a Bh[];
        public static final a zW;
        public static final a zX;
        public static final a zY;
        public static final a zZ;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/y$a, s);
        }

        public static a[] values()
        {
            return (a[])Bh.clone();
        }

        static 
        {
            zW = new a("MAP_BUILDER_SET", 0);
            zX = new a("MAP_BUILDER_SET_ALL", 1);
            zY = new a("MAP_BUILDER_GET", 2);
            zZ = new a("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
            Aa = new a("BLANK_04", 4);
            Ab = new a("BLANK_05", 5);
            Ac = new a("BLANK_06", 6);
            Ad = new a("BLANK_07", 7);
            Ae = new a("BLANK_08", 8);
            Af = new a("GET", 9);
            Ag = new a("SET", 10);
            Ah = new a("SEND", 11);
            Ai = new a("BLANK_12", 12);
            Aj = new a("BLANK_13", 13);
            Ak = new a("BLANK_14", 14);
            Al = new a("BLANK_15", 15);
            Am = new a("BLANK_16", 16);
            An = new a("BLANK_17", 17);
            Ao = new a("BLANK_18", 18);
            Ap = new a("BLANK_19", 19);
            Aq = new a("BLANK_20", 20);
            Ar = new a("BLANK_21", 21);
            As = new a("BLANK_22", 22);
            At = new a("BLANK_23", 23);
            Au = new a("BLANK_24", 24);
            Av = new a("BLANK_25", 25);
            Aw = new a("BLANK_26", 26);
            Ax = new a("BLANK_27", 27);
            Ay = new a("BLANK_28", 28);
            Az = new a("BLANK_29", 29);
            AA = new a("SET_EXCEPTION_PARSER", 30);
            AB = new a("GET_EXCEPTION_PARSER", 31);
            AC = new a("CONSTRUCT_TRANSACTION", 32);
            AD = new a("CONSTRUCT_EXCEPTION", 33);
            AE = new a("CONSTRUCT_RAW_EXCEPTION", 34);
            AF = new a("CONSTRUCT_TIMING", 35);
            AG = new a("CONSTRUCT_SOCIAL", 36);
            AH = new a("BLANK_37", 37);
            AI = new a("BLANK_38", 38);
            AJ = new a("GET_TRACKER", 39);
            AK = new a("GET_DEFAULT_TRACKER", 40);
            AL = new a("SET_DEFAULT_TRACKER", 41);
            AM = new a("SET_APP_OPT_OUT", 42);
            AN = new a("GET_APP_OPT_OUT", 43);
            AO = new a("DISPATCH", 44);
            AP = new a("SET_DISPATCH_PERIOD", 45);
            AQ = new a("BLANK_46", 46);
            AR = new a("REPORT_UNCAUGHT_EXCEPTIONS", 47);
            AS = new a("SET_AUTO_ACTIVITY_TRACKING", 48);
            AT = new a("SET_SESSION_TIMEOUT", 49);
            AU = new a("CONSTRUCT_EVENT", 50);
            AV = new a("CONSTRUCT_ITEM", 51);
            AW = new a("BLANK_52", 52);
            AX = new a("BLANK_53", 53);
            AY = new a("SET_DRY_RUN", 54);
            AZ = new a("GET_DRY_RUN", 55);
            Ba = new a("SET_LOGGER", 56);
            Bb = new a("SET_FORCE_LOCAL_DISPATCH", 57);
            Bc = new a("GET_TRACKER_NAME", 58);
            Bd = new a("CLOSE_TRACKER", 59);
            Be = new a("EASY_TRACKER_ACTIVITY_START", 60);
            Bf = new a("EASY_TRACKER_ACTIVITY_STOP", 61);
            Bg = new a("CONSTRUCT_APP_VIEW", 62);
            Bh = (new a[] {
                zW, zX, zY, zZ, Aa, Ab, Ac, Ad, Ae, Af, 
                Ag, Ah, Ai, Aj, Ak, Al, Am, An, Ao, Ap, 
                Aq, Ar, As, At, Au, Av, Aw, Ax, Ay, Az, 
                AA, AB, AC, AD, AE, AF, AG, AH, AI, AJ, 
                AK, AL, AM, AN, AO, AP, AQ, AR, AS, AT, 
                AU, AV, AW, AX, AY, AZ, Ba, Bb, Bc, Bd, 
                Be, Bf, Bg
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final y zV = new y();
    private SortedSet zS;
    private StringBuilder zT;
    private boolean zU;

    private y()
    {
        zS = new TreeSet();
        zT = new StringBuilder();
        zU = false;
    }

    public static y eK()
    {
        return zV;
    }

    public void D(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zU = flag;
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
        if (!zU)
        {
            zS.add(a1);
            zT.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(a1.ordinal()));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public String eL()
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
        if (zS.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (a)zS.first();
        zS.remove(a1);
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
        zS.clear();
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public String eM()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (zT.length() > 0)
        {
            zT.insert(0, ".");
        }
        s = zT.toString();
        zT = new StringBuilder();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

}
