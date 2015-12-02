// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.base;


public final class UTLogFieldsScheme extends Enum
{

    private static final UTLogFieldsScheme $VALUES[];
    public static final UTLogFieldsScheme ACCESS;
    public static final UTLogFieldsScheme ACCESS_SUBTYPE;
    public static final UTLogFieldsScheme APPKEY;
    public static final UTLogFieldsScheme APPVERSION;
    public static final UTLogFieldsScheme ARG1;
    public static final UTLogFieldsScheme ARG2;
    public static final UTLogFieldsScheme ARG3;
    public static final UTLogFieldsScheme ARGS;
    public static final UTLogFieldsScheme BRAND;
    public static final UTLogFieldsScheme CARRIER;
    public static final UTLogFieldsScheme CHANNEL;
    public static final UTLogFieldsScheme DEVICE_MODEL;
    public static final UTLogFieldsScheme EVENTID;
    public static final UTLogFieldsScheme IMEI;
    public static final UTLogFieldsScheme IMSI;
    public static final UTLogFieldsScheme LANGUAGE;
    public static final UTLogFieldsScheme LL_USERID;
    public static final UTLogFieldsScheme LL_USERNICK;
    public static final UTLogFieldsScheme OS;
    public static final UTLogFieldsScheme OSVERSION;
    public static final UTLogFieldsScheme PAGE;
    public static final UTLogFieldsScheme RECORD_TIMESTAMP;
    public static final UTLogFieldsScheme RESERVE2;
    public static final UTLogFieldsScheme RESERVE3;
    public static final UTLogFieldsScheme RESERVE4;
    public static final UTLogFieldsScheme RESERVE5;
    public static final UTLogFieldsScheme RESERVES;
    public static final UTLogFieldsScheme RESOLUTION;
    public static final UTLogFieldsScheme SDKTYPE;
    public static final UTLogFieldsScheme SDKVERSION;
    public static final UTLogFieldsScheme START_SESSION_TIMESTAMP;
    public static final UTLogFieldsScheme USERID;
    public static final UTLogFieldsScheme USERNICK;
    public static final UTLogFieldsScheme UTDID;

    private UTLogFieldsScheme(String s, int i)
    {
        super(s, i);
    }

    public static UTLogFieldsScheme valueOf(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static UTLogFieldsScheme[] values()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static 
    {
        IMEI = new UTLogFieldsScheme("IMEI", 0);
        IMSI = new UTLogFieldsScheme("IMSI", 1);
        BRAND = new UTLogFieldsScheme("BRAND", 2);
        DEVICE_MODEL = new UTLogFieldsScheme("DEVICE_MODEL", 3);
        RESOLUTION = new UTLogFieldsScheme("RESOLUTION", 4);
        CARRIER = new UTLogFieldsScheme("CARRIER", 5);
        ACCESS = new UTLogFieldsScheme("ACCESS", 6);
        ACCESS_SUBTYPE = new UTLogFieldsScheme("ACCESS_SUBTYPE", 7);
        CHANNEL = new UTLogFieldsScheme("CHANNEL", 8);
        APPKEY = new UTLogFieldsScheme("APPKEY", 9);
        APPVERSION = new UTLogFieldsScheme("APPVERSION", 10);
        LL_USERNICK = new UTLogFieldsScheme("LL_USERNICK", 11);
        USERNICK = new UTLogFieldsScheme("USERNICK", 12);
        LL_USERID = new UTLogFieldsScheme("LL_USERID", 13);
        USERID = new UTLogFieldsScheme("USERID", 14);
        LANGUAGE = new UTLogFieldsScheme("LANGUAGE", 15);
        OS = new UTLogFieldsScheme("OS", 16);
        OSVERSION = new UTLogFieldsScheme("OSVERSION", 17);
        SDKVERSION = new UTLogFieldsScheme("SDKVERSION", 18);
        START_SESSION_TIMESTAMP = new UTLogFieldsScheme("START_SESSION_TIMESTAMP", 19);
        UTDID = new UTLogFieldsScheme("UTDID", 20);
        SDKTYPE = new UTLogFieldsScheme("SDKTYPE", 21);
        RESERVE2 = new UTLogFieldsScheme("RESERVE2", 22);
        RESERVE3 = new UTLogFieldsScheme("RESERVE3", 23);
        RESERVE4 = new UTLogFieldsScheme("RESERVE4", 24);
        RESERVE5 = new UTLogFieldsScheme("RESERVE5", 25);
        RESERVES = new UTLogFieldsScheme("RESERVES", 26);
        RECORD_TIMESTAMP = new UTLogFieldsScheme("RECORD_TIMESTAMP", 27);
        PAGE = new UTLogFieldsScheme("PAGE", 28);
        EVENTID = new UTLogFieldsScheme("EVENTID", 29);
        ARG1 = new UTLogFieldsScheme("ARG1", 30);
        ARG2 = new UTLogFieldsScheme("ARG2", 31);
        ARG3 = new UTLogFieldsScheme("ARG3", 32);
        ARGS = new UTLogFieldsScheme("ARGS", 33);
        $VALUES = (new UTLogFieldsScheme[] {
            IMEI, IMSI, BRAND, DEVICE_MODEL, RESOLUTION, CARRIER, ACCESS, ACCESS_SUBTYPE, CHANNEL, APPKEY, 
            APPVERSION, LL_USERNICK, USERNICK, LL_USERID, USERID, LANGUAGE, OS, OSVERSION, SDKVERSION, START_SESSION_TIMESTAMP, 
            UTDID, SDKTYPE, RESERVE2, RESERVE3, RESERVE4, RESERVE5, RESERVES, RECORD_TIMESTAMP, PAGE, EVENTID, 
            ARG1, ARG2, ARG3, ARGS
        });
    }
}
