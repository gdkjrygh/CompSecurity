// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.SortedSet;
import java.util.TreeSet;

final class w
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
        private static final a Bf[];
        public static final a zU;
        public static final a zV;
        public static final a zW;
        public static final a zX;
        public static final a zY;
        public static final a zZ;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/analytics/w$a, s);
        }

        public static a[] values()
        {
            return (a[])Bf.clone();
        }

        static 
        {
            zU = new a("MAP_BUILDER_SET", 0);
            zV = new a("MAP_BUILDER_SET_ALL", 1);
            zW = new a("MAP_BUILDER_GET", 2);
            zX = new a("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
            zY = new a("BLANK_04", 4);
            zZ = new a("BLANK_05", 5);
            Aa = new a("BLANK_06", 6);
            Ab = new a("BLANK_07", 7);
            Ac = new a("BLANK_08", 8);
            Ad = new a("GET", 9);
            Ae = new a("SET", 10);
            Af = new a("SEND", 11);
            Ag = new a("BLANK_12", 12);
            Ah = new a("BLANK_13", 13);
            Ai = new a("BLANK_14", 14);
            Aj = new a("BLANK_15", 15);
            Ak = new a("BLANK_16", 16);
            Al = new a("BLANK_17", 17);
            Am = new a("BLANK_18", 18);
            An = new a("BLANK_19", 19);
            Ao = new a("BLANK_20", 20);
            Ap = new a("BLANK_21", 21);
            Aq = new a("BLANK_22", 22);
            Ar = new a("BLANK_23", 23);
            As = new a("BLANK_24", 24);
            At = new a("BLANK_25", 25);
            Au = new a("BLANK_26", 26);
            Av = new a("BLANK_27", 27);
            Aw = new a("BLANK_28", 28);
            Ax = new a("BLANK_29", 29);
            Ay = new a("SET_EXCEPTION_PARSER", 30);
            Az = new a("GET_EXCEPTION_PARSER", 31);
            AA = new a("CONSTRUCT_TRANSACTION", 32);
            AB = new a("CONSTRUCT_EXCEPTION", 33);
            AC = new a("CONSTRUCT_RAW_EXCEPTION", 34);
            AD = new a("CONSTRUCT_TIMING", 35);
            AE = new a("CONSTRUCT_SOCIAL", 36);
            AF = new a("BLANK_37", 37);
            AG = new a("BLANK_38", 38);
            AH = new a("GET_TRACKER", 39);
            AI = new a("GET_DEFAULT_TRACKER", 40);
            AJ = new a("SET_DEFAULT_TRACKER", 41);
            AK = new a("SET_APP_OPT_OUT", 42);
            AL = new a("GET_APP_OPT_OUT", 43);
            AM = new a("DISPATCH", 44);
            AN = new a("SET_DISPATCH_PERIOD", 45);
            AO = new a("BLANK_46", 46);
            AP = new a("REPORT_UNCAUGHT_EXCEPTIONS", 47);
            AQ = new a("SET_AUTO_ACTIVITY_TRACKING", 48);
            AR = new a("SET_SESSION_TIMEOUT", 49);
            AS = new a("CONSTRUCT_EVENT", 50);
            AT = new a("CONSTRUCT_ITEM", 51);
            AU = new a("BLANK_52", 52);
            AV = new a("BLANK_53", 53);
            AW = new a("SET_DRY_RUN", 54);
            AX = new a("GET_DRY_RUN", 55);
            AY = new a("SET_LOGGER", 56);
            AZ = new a("SET_FORCE_LOCAL_DISPATCH", 57);
            Ba = new a("GET_TRACKER_NAME", 58);
            Bb = new a("CLOSE_TRACKER", 59);
            Bc = new a("EASY_TRACKER_ACTIVITY_START", 60);
            Bd = new a("EASY_TRACKER_ACTIVITY_STOP", 61);
            Be = new a("CONSTRUCT_APP_VIEW", 62);
            Bf = (new a[] {
                zU, zV, zW, zX, zY, zZ, Aa, Ab, Ac, Ad, 
                Ae, Af, Ag, Ah, Ai, Aj, Ak, Al, Am, An, 
                Ao, Ap, Aq, Ar, As, At, Au, Av, Aw, Ax, 
                Ay, Az, AA, AB, AC, AD, AE, AF, AG, AH, 
                AI, AJ, AK, AL, AM, AN, AO, AP, AQ, AR, 
                AS, AT, AU, AV, AW, AX, AY, AZ, Ba, Bb, 
                Bc, Bd, Be
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final w zT = new w();
    private SortedSet zQ;
    private StringBuilder zR;
    private boolean zS;

    private w()
    {
        zQ = new TreeSet();
        zR = new StringBuilder();
        zS = false;
    }

    public static w eF()
    {
        return zT;
    }

    public final void D(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zS = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!zS)
        {
            zQ.add(a1);
            zR.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(a1.ordinal()));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public final String eG()
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
        if (zQ.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (a)zQ.first();
        zQ.remove(a1);
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
        zQ.clear();
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public final String eH()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (zR.length() > 0)
        {
            zR.insert(0, ".");
        }
        s = zR.toString();
        zR = new StringBuilder();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

}
