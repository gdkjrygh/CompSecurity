// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.log.impl;

import android.text.TextUtils;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

// Referenced classes of package org.android.agoo.log.impl:
//            AgooLogger

static class <init> extends Formatter
{

    private String errorStr;

    private void setThrow(LogRecord logrecord)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public final String format(LogRecord logrecord)
    {
        this;
        JVM INSTR monitorenter ;
        StringBuffer stringbuffer;
        setThrow(logrecord);
        stringbuffer = new StringBuffer();
        stringbuffer.append(AgooLogger.getDate(logrecord.getMillis()));
        stringbuffer.append(" ");
        if (logrecord.getSourceClassName() == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        stringbuffer.append(logrecord.getSourceClassName());
_L1:
        if (logrecord.getSourceMethodName() != null)
        {
            stringbuffer.append(" ");
            stringbuffer.append(logrecord.getSourceMethodName());
        }
        stringbuffer.append("[");
        stringbuffer.append(logrecord.getLevel().getLocalizedName());
        stringbuffer.append("]-->");
        stringbuffer.append(formatMessage(logrecord));
        stringbuffer.append("\n");
        if (!TextUtils.isEmpty(errorStr))
        {
            stringbuffer.append(errorStr);
        }
        logrecord = stringbuffer.toString();
        this;
        JVM INSTR monitorexit ;
        return logrecord;
        stringbuffer.append(logrecord.getLoggerName());
          goto _L1
        logrecord;
        throw logrecord;
    }

    private ()
    {
        errorStr = null;
    }

    errorStr(errorStr errorstr)
    {
        this();
    }
}
