// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;

import java.util.HashMap;
import java.util.Map;

public class TelemetryStandaloneUtils
{
    final class a
    {

        public int a;
        public long b;
        final TelemetryStandaloneUtils c;

        a()
        {
            c = TelemetryStandaloneUtils.this;
            super();
        }
    }


    private static TelemetryStandaloneUtils d = null;
    private int a;
    private Map b;
    private Map c;
    private long e;

    private TelemetryStandaloneUtils()
    {
        a = 0;
        b = new HashMap();
        c = new HashMap();
        e = 0L;
    }

    public static TelemetryStandaloneUtils a()
    {
        com/microsoft/applications/skypetelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new TelemetryStandaloneUtils();
        }
        com/microsoft/applications/skypetelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return d;
        Exception exception;
        exception;
        com/microsoft/applications/skypetelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private native long setupLogNative(String s);

    private native void shutdownLogNative(long l);

    public final int a(String s)
    {
        com/microsoft/applications/skypetelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorenter ;
        if (s.isEmpty()) goto _L2; else goto _L1
_L1:
        if (!c.containsKey(s)) goto _L4; else goto _L3
_L3:
        a a1;
        a1 = (a)c.get(s);
        a1.a = a1.a + 1;
_L5:
        c.put(s, a1);
_L2:
        com/microsoft/applications/skypetelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return 0;
_L4:
        long l;
        a1 = new a();
        l = setupLogNative(s);
        a1.b = l;
        if (l != 0L)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        com/microsoft/applications/skypetelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return -1;
        s;
        com/microsoft/applications/skypetelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        throw s;
        a1.a = 1;
          goto _L5
    }

    public final void b(String s)
    {
        com/microsoft/applications/skypetelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorenter ;
        a a1;
        if (c.containsKey(s))
        {
            a1 = (a)c.get(s);
            if (a1.a != 1)
            {
                break MISSING_BLOCK_LABEL_61;
            }
            shutdownLogNative(a1.b);
            c.remove(s);
        }
_L2:
        com/microsoft/applications/skypetelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return;
        a1.a = a1.a - 1;
        c.put(s, a1);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        com/microsoft/applications/skypetelemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        throw s;
    }

}
