// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            zzy

public static final class  extends Enum
{

    public static final zzEf zzCV;
    public static final zzEf zzCW;
    public static final zzEf zzCX;
    public static final zzEf zzCY;
    public static final zzEf zzCZ;
    public static final zzEf zzDA;
    public static final zzEf zzDB;
    public static final zzEf zzDC;
    public static final zzEf zzDD;
    public static final zzEf zzDE;
    public static final zzEf zzDF;
    public static final zzEf zzDG;
    public static final zzEf zzDH;
    public static final zzEf zzDI;
    public static final zzEf zzDJ;
    public static final zzEf zzDK;
    public static final zzEf zzDL;
    public static final zzEf zzDM;
    public static final zzEf zzDN;
    public static final zzEf zzDO;
    public static final zzEf zzDP;
    public static final zzEf zzDQ;
    public static final zzEf zzDR;
    public static final zzEf zzDS;
    public static final zzEf zzDT;
    public static final zzEf zzDU;
    public static final zzEf zzDV;
    public static final zzEf zzDW;
    public static final zzEf zzDX;
    public static final zzEf zzDY;
    public static final zzEf zzDZ;
    public static final zzEf zzDa;
    public static final zzEf zzDb;
    public static final zzEf zzDc;
    public static final zzEf zzDd;
    public static final zzEf zzDe;
    public static final zzEf zzDf;
    public static final zzEf zzDg;
    public static final zzEf zzDh;
    public static final zzEf zzDi;
    public static final zzEf zzDj;
    public static final zzEf zzDk;
    public static final zzEf zzDl;
    public static final zzEf zzDm;
    public static final zzEf zzDn;
    public static final zzEf zzDo;
    public static final zzEf zzDp;
    public static final zzEf zzDq;
    public static final zzEf zzDr;
    public static final zzEf zzDs;
    public static final zzEf zzDt;
    public static final zzEf zzDu;
    public static final zzEf zzDv;
    public static final zzEf zzDw;
    public static final zzEf zzDx;
    public static final zzEf zzDy;
    public static final zzEf zzDz;
    public static final zzEf zzEa;
    public static final zzEf zzEb;
    public static final zzEf zzEc;
    public static final zzEf zzEd;
    public static final zzEf zzEe;
    public static final zzEf zzEf;
    private static final zzEf zzEg[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/zzy$zza, s);
    }

    public static [] values()
    {
        return ([])zzEg.clone();
    }

    static 
    {
        zzCV = new <init>("MAP_BUILDER_SET", 0);
        zzCW = new <init>("MAP_BUILDER_SET_ALL", 1);
        zzCX = new <init>("MAP_BUILDER_GET", 2);
        zzCY = new <init>("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
        zzCZ = new <init>("BLANK_04", 4);
        zzDa = new <init>("BLANK_05", 5);
        zzDb = new <init>("BLANK_06", 6);
        zzDc = new <init>("BLANK_07", 7);
        zzDd = new <init>("BLANK_08", 8);
        zzDe = new <init>("GET", 9);
        zzDf = new <init>("SET", 10);
        zzDg = new <init>("SEND", 11);
        zzDh = new <init>("BLANK_12", 12);
        zzDi = new <init>("BLANK_13", 13);
        zzDj = new <init>("BLANK_14", 14);
        zzDk = new <init>("BLANK_15", 15);
        zzDl = new <init>("BLANK_16", 16);
        zzDm = new <init>("BLANK_17", 17);
        zzDn = new <init>("BLANK_18", 18);
        zzDo = new <init>("BLANK_19", 19);
        zzDp = new <init>("BLANK_20", 20);
        zzDq = new <init>("BLANK_21", 21);
        zzDr = new <init>("BLANK_22", 22);
        zzDs = new <init>("BLANK_23", 23);
        zzDt = new <init>("BLANK_24", 24);
        zzDu = new <init>("BLANK_25", 25);
        zzDv = new <init>("BLANK_26", 26);
        zzDw = new <init>("BLANK_27", 27);
        zzDx = new <init>("BLANK_28", 28);
        zzDy = new <init>("BLANK_29", 29);
        zzDz = new <init>("SET_EXCEPTION_PARSER", 30);
        zzDA = new <init>("GET_EXCEPTION_PARSER", 31);
        zzDB = new <init>("CONSTRUCT_TRANSACTION", 32);
        zzDC = new <init>("CONSTRUCT_EXCEPTION", 33);
        zzDD = new <init>("CONSTRUCT_RAW_EXCEPTION", 34);
        zzDE = new <init>("CONSTRUCT_TIMING", 35);
        zzDF = new <init>("CONSTRUCT_SOCIAL", 36);
        zzDG = new <init>("BLANK_37", 37);
        zzDH = new <init>("BLANK_38", 38);
        zzDI = new <init>("GET_TRACKER", 39);
        zzDJ = new <init>("GET_DEFAULT_TRACKER", 40);
        zzDK = new <init>("SET_DEFAULT_TRACKER", 41);
        zzDL = new <init>("SET_APP_OPT_OUT", 42);
        zzDM = new <init>("GET_APP_OPT_OUT", 43);
        zzDN = new <init>("DISPATCH", 44);
        zzDO = new <init>("SET_DISPATCH_PERIOD", 45);
        zzDP = new <init>("BLANK_46", 46);
        zzDQ = new <init>("REPORT_UNCAUGHT_EXCEPTIONS", 47);
        zzDR = new <init>("SET_AUTO_ACTIVITY_TRACKING", 48);
        zzDS = new <init>("SET_SESSION_TIMEOUT", 49);
        zzDT = new <init>("CONSTRUCT_EVENT", 50);
        zzDU = new <init>("CONSTRUCT_ITEM", 51);
        zzDV = new <init>("BLANK_52", 52);
        zzDW = new <init>("BLANK_53", 53);
        zzDX = new <init>("SET_DRY_RUN", 54);
        zzDY = new <init>("GET_DRY_RUN", 55);
        zzDZ = new <init>("SET_LOGGER", 56);
        zzEa = new <init>("SET_FORCE_LOCAL_DISPATCH", 57);
        zzEb = new <init>("GET_TRACKER_NAME", 58);
        zzEc = new <init>("CLOSE_TRACKER", 59);
        zzEd = new <init>("EASY_TRACKER_ACTIVITY_START", 60);
        zzEe = new <init>("EASY_TRACKER_ACTIVITY_STOP", 61);
        zzEf = new <init>("CONSTRUCT_APP_VIEW", 62);
        zzEg = (new zzEg[] {
            zzCV, zzCW, zzCX, zzCY, zzCZ, zzDa, zzDb, zzDc, zzDd, zzDe, 
            zzDf, zzDg, zzDh, zzDi, zzDj, zzDk, zzDl, zzDm, zzDn, zzDo, 
            zzDp, zzDq, zzDr, zzDs, zzDt, zzDu, zzDv, zzDw, zzDx, zzDy, 
            zzDz, zzDA, zzDB, zzDC, zzDD, zzDE, zzDF, zzDG, zzDH, zzDI, 
            zzDJ, zzDK, zzDL, zzDM, zzDN, zzDO, zzDP, zzDQ, zzDR, zzDS, 
            zzDT, zzDU, zzDV, zzDW, zzDX, zzDY, zzDZ, zzEa, zzEb, zzEc, 
            zzEd, zzEe, zzEf
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
