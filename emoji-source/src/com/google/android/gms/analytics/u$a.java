// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            u

public static final class  extends Enum
{

    public static final wg uW;
    public static final wg uX;
    public static final wg uY;
    public static final wg uZ;
    public static final wg vA;
    public static final wg vB;
    public static final wg vC;
    public static final wg vD;
    public static final wg vE;
    public static final wg vF;
    public static final wg vG;
    public static final wg vH;
    public static final wg vI;
    public static final wg vJ;
    public static final wg vK;
    public static final wg vL;
    public static final wg vM;
    public static final wg vN;
    public static final wg vO;
    public static final wg vP;
    public static final wg vQ;
    public static final wg vR;
    public static final wg vS;
    public static final wg vT;
    public static final wg vU;
    public static final wg vV;
    public static final wg vW;
    public static final wg vX;
    public static final wg vY;
    public static final wg vZ;
    public static final wg va;
    public static final wg vb;
    public static final wg vc;
    public static final wg vd;
    public static final wg ve;
    public static final wg vf;
    public static final wg vg;
    public static final wg vh;
    public static final wg vi;
    public static final wg vj;
    public static final wg vk;
    public static final wg vl;
    public static final wg vm;
    public static final wg vn;
    public static final wg vo;
    public static final wg vp;
    public static final wg vq;
    public static final wg vr;
    public static final wg vs;
    public static final wg vt;
    public static final wg vu;
    public static final wg vv;
    public static final wg vw;
    public static final wg vx;
    public static final wg vy;
    public static final wg vz;
    public static final wg wa;
    public static final wg wb;
    public static final wg wc;
    public static final wg wd;
    public static final wg we;
    public static final wg wf;
    public static final wg wg;
    private static final wg wh[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/u$a, s);
    }

    public static [] values()
    {
        return ([])wh.clone();
    }

    static 
    {
        uW = new <init>("MAP_BUILDER_SET", 0);
        uX = new <init>("MAP_BUILDER_SET_ALL", 1);
        uY = new <init>("MAP_BUILDER_GET", 2);
        uZ = new <init>("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
        va = new <init>("BLANK_04", 4);
        vb = new <init>("BLANK_05", 5);
        vc = new <init>("BLANK_06", 6);
        vd = new <init>("BLANK_07", 7);
        ve = new <init>("BLANK_08", 8);
        vf = new <init>("GET", 9);
        vg = new <init>("SET", 10);
        vh = new <init>("SEND", 11);
        vi = new <init>("BLANK_12", 12);
        vj = new <init>("BLANK_13", 13);
        vk = new <init>("BLANK_14", 14);
        vl = new <init>("BLANK_15", 15);
        vm = new <init>("BLANK_16", 16);
        vn = new <init>("BLANK_17", 17);
        vo = new <init>("BLANK_18", 18);
        vp = new <init>("BLANK_19", 19);
        vq = new <init>("BLANK_20", 20);
        vr = new <init>("BLANK_21", 21);
        vs = new <init>("BLANK_22", 22);
        vt = new <init>("BLANK_23", 23);
        vu = new <init>("BLANK_24", 24);
        vv = new <init>("BLANK_25", 25);
        vw = new <init>("BLANK_26", 26);
        vx = new <init>("BLANK_27", 27);
        vy = new <init>("BLANK_28", 28);
        vz = new <init>("BLANK_29", 29);
        vA = new <init>("SET_EXCEPTION_PARSER", 30);
        vB = new <init>("GET_EXCEPTION_PARSER", 31);
        vC = new <init>("CONSTRUCT_TRANSACTION", 32);
        vD = new <init>("CONSTRUCT_EXCEPTION", 33);
        vE = new <init>("CONSTRUCT_RAW_EXCEPTION", 34);
        vF = new <init>("CONSTRUCT_TIMING", 35);
        vG = new <init>("CONSTRUCT_SOCIAL", 36);
        vH = new <init>("BLANK_37", 37);
        vI = new <init>("BLANK_38", 38);
        vJ = new <init>("GET_TRACKER", 39);
        vK = new <init>("GET_DEFAULT_TRACKER", 40);
        vL = new <init>("SET_DEFAULT_TRACKER", 41);
        vM = new <init>("SET_APP_OPT_OUT", 42);
        vN = new <init>("GET_APP_OPT_OUT", 43);
        vO = new <init>("DISPATCH", 44);
        vP = new <init>("SET_DISPATCH_PERIOD", 45);
        vQ = new <init>("BLANK_46", 46);
        vR = new <init>("REPORT_UNCAUGHT_EXCEPTIONS", 47);
        vS = new <init>("SET_AUTO_ACTIVITY_TRACKING", 48);
        vT = new <init>("SET_SESSION_TIMEOUT", 49);
        vU = new <init>("CONSTRUCT_EVENT", 50);
        vV = new <init>("CONSTRUCT_ITEM", 51);
        vW = new <init>("BLANK_52", 52);
        vX = new <init>("BLANK_53", 53);
        vY = new <init>("SET_DRY_RUN", 54);
        vZ = new <init>("GET_DRY_RUN", 55);
        wa = new <init>("SET_LOGGER", 56);
        wb = new <init>("SET_FORCE_LOCAL_DISPATCH", 57);
        wc = new <init>("GET_TRACKER_NAME", 58);
        wd = new <init>("CLOSE_TRACKER", 59);
        we = new <init>("EASY_TRACKER_ACTIVITY_START", 60);
        wf = new <init>("EASY_TRACKER_ACTIVITY_STOP", 61);
        wg = new <init>("CONSTRUCT_APP_VIEW", 62);
        wh = (new wh[] {
            uW, uX, uY, uZ, va, vb, vc, vd, ve, vf, 
            vg, vh, vi, vj, vk, vl, vm, vn, vo, vp, 
            vq, vr, vs, vt, vu, vv, vw, vx, vy, vz, 
            vA, vB, vC, vD, vE, vF, vG, vH, vI, vJ, 
            vK, vL, vM, vN, vO, vP, vQ, vR, vS, vT, 
            vU, vV, vW, vX, vY, vZ, wa, wb, wc, wd, 
            we, wf, wg
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
