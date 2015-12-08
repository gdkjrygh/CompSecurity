// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;

import java.util.HashMap;
import java.util.Map;

class TelemetryStandaloneUtils
{

    private static TelemetryStandaloneUtils e = null;
    private int a;
    private int b;
    private Map c;
    private Map d;
    private long f;

    private TelemetryStandaloneUtils()
    {
        a = 0;
        b = 0;
        c = new HashMap();
        d = new HashMap();
        f = 0L;
    }

    public static TelemetryStandaloneUtils a()
    {
        com/skype/data/clienttelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new TelemetryStandaloneUtils();
        }
        com/skype/data/clienttelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return e;
        Exception exception;
        exception;
        com/skype/data/clienttelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private native long createHttpStackNative();

    public final long b()
    {
        com/skype/data/clienttelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorenter ;
        int i;
        String s = Thread.currentThread().getStackTrace()[4].getMethodName();
        String s1 = Thread.currentThread().getStackTrace()[3].getClassName();
        String s2 = Thread.currentThread().getStackTrace()[3].getFileName();
        i = Thread.currentThread().getStackTrace()[4].getLineNumber();
        HashMap hashmap = new HashMap();
        hashmap.put((new StringBuilder()).append("httpstack").append("-lineNum").toString(), Integer.toString(i));
        hashmap.put((new StringBuilder()).append("httpstack").append("-methodName").toString(), s);
        hashmap.put((new StringBuilder()).append("httpstack").append("-fileName").toString(), s2);
        hashmap.put((new StringBuilder()).append("httpstack").append("-className").toString(), s1);
        c.put((new StringBuilder()).append(s1).append("-httpstack").toString(), hashmap);
        i = a + 1;
        a = i;
        if (i <= 1)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        long l = f;
        com/skype/data/clienttelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return l;
        f = createHttpStackNative();
        com/skype/data/clienttelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return f;
        Exception exception;
        exception;
        com/skype/data/clienttelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
