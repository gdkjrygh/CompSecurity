// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            u

public static final class  extends Enum
{

    public static final uS tI;
    public static final uS tJ;
    public static final uS tK;
    public static final uS tL;
    public static final uS tM;
    public static final uS tN;
    public static final uS tO;
    public static final uS tP;
    public static final uS tQ;
    public static final uS tR;
    public static final uS tS;
    public static final uS tT;
    public static final uS tU;
    public static final uS tV;
    public static final uS tW;
    public static final uS tX;
    public static final uS tY;
    public static final uS tZ;
    public static final uS uA;
    public static final uS uB;
    public static final uS uC;
    public static final uS uD;
    public static final uS uE;
    public static final uS uF;
    public static final uS uG;
    public static final uS uH;
    public static final uS uI;
    public static final uS uJ;
    public static final uS uK;
    public static final uS uL;
    public static final uS uM;
    public static final uS uN;
    public static final uS uO;
    public static final uS uP;
    public static final uS uQ;
    public static final uS uR;
    public static final uS uS;
    private static final uS uT[];
    public static final uS ua;
    public static final uS ub;
    public static final uS uc;
    public static final uS ud;
    public static final uS ue;
    public static final uS uf;
    public static final uS ug;
    public static final uS uh;
    public static final uS ui;
    public static final uS uj;
    public static final uS uk;
    public static final uS ul;
    public static final uS um;
    public static final uS un;
    public static final uS uo;
    public static final uS up;
    public static final uS uq;
    public static final uS ur;
    public static final uS us;
    public static final uS ut;
    public static final uS uu;
    public static final uS uv;
    public static final uS uw;
    public static final uS ux;
    public static final uS uy;
    public static final uS uz;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/u$a, s);
    }

    public static [] values()
    {
        return ([])uT.clone();
    }

    static 
    {
        tI = new <init>("MAP_BUILDER_SET", 0);
        tJ = new <init>("MAP_BUILDER_SET_ALL", 1);
        tK = new <init>("MAP_BUILDER_GET", 2);
        tL = new <init>("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
        tM = new <init>("BLANK_04", 4);
        tN = new <init>("BLANK_05", 5);
        tO = new <init>("BLANK_06", 6);
        tP = new <init>("BLANK_07", 7);
        tQ = new <init>("BLANK_08", 8);
        tR = new <init>("GET", 9);
        tS = new <init>("SET", 10);
        tT = new <init>("SEND", 11);
        tU = new <init>("BLANK_12", 12);
        tV = new <init>("BLANK_13", 13);
        tW = new <init>("BLANK_14", 14);
        tX = new <init>("BLANK_15", 15);
        tY = new <init>("BLANK_16", 16);
        tZ = new <init>("BLANK_17", 17);
        ua = new <init>("BLANK_18", 18);
        ub = new <init>("BLANK_19", 19);
        uc = new <init>("BLANK_20", 20);
        ud = new <init>("BLANK_21", 21);
        ue = new <init>("BLANK_22", 22);
        uf = new <init>("BLANK_23", 23);
        ug = new <init>("BLANK_24", 24);
        uh = new <init>("BLANK_25", 25);
        ui = new <init>("BLANK_26", 26);
        uj = new <init>("BLANK_27", 27);
        uk = new <init>("BLANK_28", 28);
        ul = new <init>("BLANK_29", 29);
        um = new <init>("SET_EXCEPTION_PARSER", 30);
        un = new <init>("GET_EXCEPTION_PARSER", 31);
        uo = new <init>("CONSTRUCT_TRANSACTION", 32);
        up = new <init>("CONSTRUCT_EXCEPTION", 33);
        uq = new <init>("CONSTRUCT_RAW_EXCEPTION", 34);
        ur = new <init>("CONSTRUCT_TIMING", 35);
        us = new <init>("CONSTRUCT_SOCIAL", 36);
        ut = new <init>("BLANK_37", 37);
        uu = new <init>("BLANK_38", 38);
        uv = new <init>("GET_TRACKER", 39);
        uw = new <init>("GET_DEFAULT_TRACKER", 40);
        ux = new <init>("SET_DEFAULT_TRACKER", 41);
        uy = new <init>("SET_APP_OPT_OUT", 42);
        uz = new <init>("GET_APP_OPT_OUT", 43);
        uA = new <init>("DISPATCH", 44);
        uB = new <init>("SET_DISPATCH_PERIOD", 45);
        uC = new <init>("BLANK_46", 46);
        uD = new <init>("REPORT_UNCAUGHT_EXCEPTIONS", 47);
        uE = new <init>("SET_AUTO_ACTIVITY_TRACKING", 48);
        uF = new <init>("SET_SESSION_TIMEOUT", 49);
        uG = new <init>("CONSTRUCT_EVENT", 50);
        uH = new <init>("CONSTRUCT_ITEM", 51);
        uI = new <init>("BLANK_52", 52);
        uJ = new <init>("BLANK_53", 53);
        uK = new <init>("SET_DRY_RUN", 54);
        uL = new <init>("GET_DRY_RUN", 55);
        uM = new <init>("SET_LOGGER", 56);
        uN = new <init>("SET_FORCE_LOCAL_DISPATCH", 57);
        uO = new <init>("GET_TRACKER_NAME", 58);
        uP = new <init>("CLOSE_TRACKER", 59);
        uQ = new <init>("EASY_TRACKER_ACTIVITY_START", 60);
        uR = new <init>("EASY_TRACKER_ACTIVITY_STOP", 61);
        uS = new <init>("CONSTRUCT_APP_VIEW", 62);
        uT = (new uT[] {
            tI, tJ, tK, tL, tM, tN, tO, tP, tQ, tR, 
            tS, tT, tU, tV, tW, tX, tY, tZ, ua, ub, 
            uc, ud, ue, uf, ug, uh, ui, uj, uk, ul, 
            um, un, uo, up, uq, ur, us, ut, uu, uv, 
            uw, ux, uy, uz, uA, uB, uC, uD, uE, uF, 
            uG, uH, uI, uJ, uK, uL, uM, uN, uO, uP, 
            uQ, uR, uS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
