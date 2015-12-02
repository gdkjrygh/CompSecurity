// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.sharedata;


public class UTShareData
{

    private static String sAppKey = null;
    private static String sAppName = null;
    private static String sAppVersion = null;
    private static String sChannel = null;
    private static String sCurPageName = null;
    private static String sLongUsernick = null;
    private static String sUsernick = null;
    private static String sUtdid = null;
    private static UTShareData s_instance = null;

    private UTShareData()
    {
    }

    public static UTShareData getInstance()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static String getUsernick()
    {
        com/ut/sharedata/UTShareData;
        JVM INSTR monitorenter ;
        String s = sUsernick;
        com/ut/sharedata/UTShareData;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getAppKey()
    {
        this;
        JVM INSTR monitorenter ;
        String s = sAppKey;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getAppName()
    {
        this;
        JVM INSTR monitorenter ;
        String s = sAppName;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getAppVersion()
    {
        this;
        JVM INSTR monitorenter ;
        String s = sAppVersion;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getChannel()
    {
        this;
        JVM INSTR monitorenter ;
        String s = sChannel;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getCurPageName()
    {
        this;
        JVM INSTR monitorenter ;
        String s = sCurPageName;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getLongUsernick()
    {
        this;
        JVM INSTR monitorenter ;
        String s = sLongUsernick;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getUtdid()
    {
        this;
        JVM INSTR monitorenter ;
        String s = sUtdid;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void setAppKey(String s)
    {
        this;
        JVM INSTR monitorenter ;
        sAppKey = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setAppName(String s)
    {
        this;
        JVM INSTR monitorenter ;
        sAppName = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setAppVersion(String s)
    {
        this;
        JVM INSTR monitorenter ;
        sAppVersion = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setChannel(String s)
    {
        this;
        JVM INSTR monitorenter ;
        sChannel = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setCurPageName(String s)
    {
        this;
        JVM INSTR monitorenter ;
        sCurPageName = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setLongUsernick(String s)
    {
        this;
        JVM INSTR monitorenter ;
        sLongUsernick = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setUsernick(String s)
    {
        this;
        JVM INSTR monitorenter ;
        sUsernick = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setUtdid(String s)
    {
        this;
        JVM INSTR monitorenter ;
        sUtdid = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

}
