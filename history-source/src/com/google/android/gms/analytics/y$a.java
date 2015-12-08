// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            y

public static final class  extends Enum
{

    public static final Bg AA;
    public static final Bg AB;
    public static final Bg AC;
    public static final Bg AD;
    public static final Bg AE;
    public static final Bg AF;
    public static final Bg AG;
    public static final Bg AH;
    public static final Bg AI;
    public static final Bg AJ;
    public static final Bg AK;
    public static final Bg AL;
    public static final Bg AM;
    public static final Bg AN;
    public static final Bg AO;
    public static final Bg AP;
    public static final Bg AQ;
    public static final Bg AR;
    public static final Bg AS;
    public static final Bg AT;
    public static final Bg AU;
    public static final Bg AV;
    public static final Bg AW;
    public static final Bg AX;
    public static final Bg AY;
    public static final Bg AZ;
    public static final Bg Aa;
    public static final Bg Ab;
    public static final Bg Ac;
    public static final Bg Ad;
    public static final Bg Ae;
    public static final Bg Af;
    public static final Bg Ag;
    public static final Bg Ah;
    public static final Bg Ai;
    public static final Bg Aj;
    public static final Bg Ak;
    public static final Bg Al;
    public static final Bg Am;
    public static final Bg An;
    public static final Bg Ao;
    public static final Bg Ap;
    public static final Bg Aq;
    public static final Bg Ar;
    public static final Bg As;
    public static final Bg At;
    public static final Bg Au;
    public static final Bg Av;
    public static final Bg Aw;
    public static final Bg Ax;
    public static final Bg Ay;
    public static final Bg Az;
    public static final Bg Ba;
    public static final Bg Bb;
    public static final Bg Bc;
    public static final Bg Bd;
    public static final Bg Be;
    public static final Bg Bf;
    public static final Bg Bg;
    private static final Bg Bh[];
    public static final Bg zW;
    public static final Bg zX;
    public static final Bg zY;
    public static final Bg zZ;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/y$a, s);
    }

    public static [] values()
    {
        return ([])Bh.clone();
    }

    static 
    {
        zW = new <init>("MAP_BUILDER_SET", 0);
        zX = new <init>("MAP_BUILDER_SET_ALL", 1);
        zY = new <init>("MAP_BUILDER_GET", 2);
        zZ = new <init>("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
        Aa = new <init>("BLANK_04", 4);
        Ab = new <init>("BLANK_05", 5);
        Ac = new <init>("BLANK_06", 6);
        Ad = new <init>("BLANK_07", 7);
        Ae = new <init>("BLANK_08", 8);
        Af = new <init>("GET", 9);
        Ag = new <init>("SET", 10);
        Ah = new <init>("SEND", 11);
        Ai = new <init>("BLANK_12", 12);
        Aj = new <init>("BLANK_13", 13);
        Ak = new <init>("BLANK_14", 14);
        Al = new <init>("BLANK_15", 15);
        Am = new <init>("BLANK_16", 16);
        An = new <init>("BLANK_17", 17);
        Ao = new <init>("BLANK_18", 18);
        Ap = new <init>("BLANK_19", 19);
        Aq = new <init>("BLANK_20", 20);
        Ar = new <init>("BLANK_21", 21);
        As = new <init>("BLANK_22", 22);
        At = new <init>("BLANK_23", 23);
        Au = new <init>("BLANK_24", 24);
        Av = new <init>("BLANK_25", 25);
        Aw = new <init>("BLANK_26", 26);
        Ax = new <init>("BLANK_27", 27);
        Ay = new <init>("BLANK_28", 28);
        Az = new <init>("BLANK_29", 29);
        AA = new <init>("SET_EXCEPTION_PARSER", 30);
        AB = new <init>("GET_EXCEPTION_PARSER", 31);
        AC = new <init>("CONSTRUCT_TRANSACTION", 32);
        AD = new <init>("CONSTRUCT_EXCEPTION", 33);
        AE = new <init>("CONSTRUCT_RAW_EXCEPTION", 34);
        AF = new <init>("CONSTRUCT_TIMING", 35);
        AG = new <init>("CONSTRUCT_SOCIAL", 36);
        AH = new <init>("BLANK_37", 37);
        AI = new <init>("BLANK_38", 38);
        AJ = new <init>("GET_TRACKER", 39);
        AK = new <init>("GET_DEFAULT_TRACKER", 40);
        AL = new <init>("SET_DEFAULT_TRACKER", 41);
        AM = new <init>("SET_APP_OPT_OUT", 42);
        AN = new <init>("GET_APP_OPT_OUT", 43);
        AO = new <init>("DISPATCH", 44);
        AP = new <init>("SET_DISPATCH_PERIOD", 45);
        AQ = new <init>("BLANK_46", 46);
        AR = new <init>("REPORT_UNCAUGHT_EXCEPTIONS", 47);
        AS = new <init>("SET_AUTO_ACTIVITY_TRACKING", 48);
        AT = new <init>("SET_SESSION_TIMEOUT", 49);
        AU = new <init>("CONSTRUCT_EVENT", 50);
        AV = new <init>("CONSTRUCT_ITEM", 51);
        AW = new <init>("BLANK_52", 52);
        AX = new <init>("BLANK_53", 53);
        AY = new <init>("SET_DRY_RUN", 54);
        AZ = new <init>("GET_DRY_RUN", 55);
        Ba = new <init>("SET_LOGGER", 56);
        Bb = new <init>("SET_FORCE_LOCAL_DISPATCH", 57);
        Bc = new <init>("GET_TRACKER_NAME", 58);
        Bd = new <init>("CLOSE_TRACKER", 59);
        Be = new <init>("EASY_TRACKER_ACTIVITY_START", 60);
        Bf = new <init>("EASY_TRACKER_ACTIVITY_STOP", 61);
        Bg = new <init>("CONSTRUCT_APP_VIEW", 62);
        Bh = (new Bh[] {
            zW, zX, zY, zZ, Aa, Ab, Ac, Ad, Ae, Af, 
            Ag, Ah, Ai, Aj, Ak, Al, Am, An, Ao, Ap, 
            Aq, Ar, As, At, Au, Av, Aw, Ax, Ay, Az, 
            AA, AB, AC, AD, AE, AF, AG, AH, AI, AJ, 
            AK, AL, AM, AN, AO, AP, AQ, AR, AS, AT, 
            AU, AV, AW, AX, AY, AZ, Ba, Bb, Bc, Bd, 
            Be, Bf, Bg
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
