// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.SortedSet;
import java.util.TreeSet;

class zzy
{
    public static final class zza extends Enum
    {

        public static final zza zzCV;
        public static final zza zzCW;
        public static final zza zzCX;
        public static final zza zzCY;
        public static final zza zzCZ;
        public static final zza zzDA;
        public static final zza zzDB;
        public static final zza zzDC;
        public static final zza zzDD;
        public static final zza zzDE;
        public static final zza zzDF;
        public static final zza zzDG;
        public static final zza zzDH;
        public static final zza zzDI;
        public static final zza zzDJ;
        public static final zza zzDK;
        public static final zza zzDL;
        public static final zza zzDM;
        public static final zza zzDN;
        public static final zza zzDO;
        public static final zza zzDP;
        public static final zza zzDQ;
        public static final zza zzDR;
        public static final zza zzDS;
        public static final zza zzDT;
        public static final zza zzDU;
        public static final zza zzDV;
        public static final zza zzDW;
        public static final zza zzDX;
        public static final zza zzDY;
        public static final zza zzDZ;
        public static final zza zzDa;
        public static final zza zzDb;
        public static final zza zzDc;
        public static final zza zzDd;
        public static final zza zzDe;
        public static final zza zzDf;
        public static final zza zzDg;
        public static final zza zzDh;
        public static final zza zzDi;
        public static final zza zzDj;
        public static final zza zzDk;
        public static final zza zzDl;
        public static final zza zzDm;
        public static final zza zzDn;
        public static final zza zzDo;
        public static final zza zzDp;
        public static final zza zzDq;
        public static final zza zzDr;
        public static final zza zzDs;
        public static final zza zzDt;
        public static final zza zzDu;
        public static final zza zzDv;
        public static final zza zzDw;
        public static final zza zzDx;
        public static final zza zzDy;
        public static final zza zzDz;
        public static final zza zzEa;
        public static final zza zzEb;
        public static final zza zzEc;
        public static final zza zzEd;
        public static final zza zzEe;
        public static final zza zzEf;
        private static final zza zzEg[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/analytics/zzy$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzEg.clone();
        }

        static 
        {
            zzCV = new zza("MAP_BUILDER_SET", 0);
            zzCW = new zza("MAP_BUILDER_SET_ALL", 1);
            zzCX = new zza("MAP_BUILDER_GET", 2);
            zzCY = new zza("MAP_BUILDER_SET_CAMPAIGN_PARAMS", 3);
            zzCZ = new zza("BLANK_04", 4);
            zzDa = new zza("BLANK_05", 5);
            zzDb = new zza("BLANK_06", 6);
            zzDc = new zza("BLANK_07", 7);
            zzDd = new zza("BLANK_08", 8);
            zzDe = new zza("GET", 9);
            zzDf = new zza("SET", 10);
            zzDg = new zza("SEND", 11);
            zzDh = new zza("BLANK_12", 12);
            zzDi = new zza("BLANK_13", 13);
            zzDj = new zza("BLANK_14", 14);
            zzDk = new zza("BLANK_15", 15);
            zzDl = new zza("BLANK_16", 16);
            zzDm = new zza("BLANK_17", 17);
            zzDn = new zza("BLANK_18", 18);
            zzDo = new zza("BLANK_19", 19);
            zzDp = new zza("BLANK_20", 20);
            zzDq = new zza("BLANK_21", 21);
            zzDr = new zza("BLANK_22", 22);
            zzDs = new zza("BLANK_23", 23);
            zzDt = new zza("BLANK_24", 24);
            zzDu = new zza("BLANK_25", 25);
            zzDv = new zza("BLANK_26", 26);
            zzDw = new zza("BLANK_27", 27);
            zzDx = new zza("BLANK_28", 28);
            zzDy = new zza("BLANK_29", 29);
            zzDz = new zza("SET_EXCEPTION_PARSER", 30);
            zzDA = new zza("GET_EXCEPTION_PARSER", 31);
            zzDB = new zza("CONSTRUCT_TRANSACTION", 32);
            zzDC = new zza("CONSTRUCT_EXCEPTION", 33);
            zzDD = new zza("CONSTRUCT_RAW_EXCEPTION", 34);
            zzDE = new zza("CONSTRUCT_TIMING", 35);
            zzDF = new zza("CONSTRUCT_SOCIAL", 36);
            zzDG = new zza("BLANK_37", 37);
            zzDH = new zza("BLANK_38", 38);
            zzDI = new zza("GET_TRACKER", 39);
            zzDJ = new zza("GET_DEFAULT_TRACKER", 40);
            zzDK = new zza("SET_DEFAULT_TRACKER", 41);
            zzDL = new zza("SET_APP_OPT_OUT", 42);
            zzDM = new zza("GET_APP_OPT_OUT", 43);
            zzDN = new zza("DISPATCH", 44);
            zzDO = new zza("SET_DISPATCH_PERIOD", 45);
            zzDP = new zza("BLANK_46", 46);
            zzDQ = new zza("REPORT_UNCAUGHT_EXCEPTIONS", 47);
            zzDR = new zza("SET_AUTO_ACTIVITY_TRACKING", 48);
            zzDS = new zza("SET_SESSION_TIMEOUT", 49);
            zzDT = new zza("CONSTRUCT_EVENT", 50);
            zzDU = new zza("CONSTRUCT_ITEM", 51);
            zzDV = new zza("BLANK_52", 52);
            zzDW = new zza("BLANK_53", 53);
            zzDX = new zza("SET_DRY_RUN", 54);
            zzDY = new zza("GET_DRY_RUN", 55);
            zzDZ = new zza("SET_LOGGER", 56);
            zzEa = new zza("SET_FORCE_LOCAL_DISPATCH", 57);
            zzEb = new zza("GET_TRACKER_NAME", 58);
            zzEc = new zza("CLOSE_TRACKER", 59);
            zzEd = new zza("EASY_TRACKER_ACTIVITY_START", 60);
            zzEe = new zza("EASY_TRACKER_ACTIVITY_STOP", 61);
            zzEf = new zza("CONSTRUCT_APP_VIEW", 62);
            zzEg = (new zza[] {
                zzCV, zzCW, zzCX, zzCY, zzCZ, zzDa, zzDb, zzDc, zzDd, zzDe, 
                zzDf, zzDg, zzDh, zzDi, zzDj, zzDk, zzDl, zzDm, zzDn, zzDo, 
                zzDp, zzDq, zzDr, zzDs, zzDt, zzDu, zzDv, zzDw, zzDx, zzDy, 
                zzDz, zzDA, zzDB, zzDC, zzDD, zzDE, zzDF, zzDG, zzDH, zzDI, 
                zzDJ, zzDK, zzDL, zzDM, zzDN, zzDO, zzDP, zzDQ, zzDR, zzDS, 
                zzDT, zzDU, zzDV, zzDW, zzDX, zzDY, zzDZ, zzEa, zzEb, zzEc, 
                zzEd, zzEe, zzEf
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private static final zzy zzCU = new zzy();
    private SortedSet zzCR;
    private StringBuilder zzCS;
    private boolean zzCT;

    private zzy()
    {
        zzCR = new TreeSet();
        zzCS = new StringBuilder();
        zzCT = false;
    }

    public static zzy zzfV()
    {
        return zzCU;
    }

    public void zzF(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zzCT = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void zza(zza zza1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzCT)
        {
            zzCR.add(zza1);
            zzCS.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(zza1.ordinal()));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        zza1;
        throw zza1;
    }

    public String zzfW()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = new StringBuilder();
        int i;
        int j;
        j = 6;
        i = 0;
_L4:
        zza zza1;
        int k;
        if (zzCR.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        zza1 = (zza)zzCR.first();
        zzCR.remove(zza1);
        k = zza1.ordinal();
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
        i += 1 << zza1.ordinal() % 6;
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
        zzCR.clear();
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public String zzfX()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (zzCS.length() > 0)
        {
            zzCS.insert(0, ".");
        }
        s = zzCS.toString();
        zzCS = new StringBuilder();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

}
