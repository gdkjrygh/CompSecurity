// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.a;

import android.content.Context;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.e.c;
import com.microsoft.onlineid.internal.o;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class f
{

    private static volatile c a;
    private static volatile ConcurrentMap b = new ConcurrentHashMap();
    private static volatile boolean c = false;

    public static String a(String s)
    {
        String s1;
        e.a(c);
        s1 = null;
        String s2 = a.a(s, (String)b.get(s));
        s1 = s2;
_L2:
        String s3 = s1;
        if (s1 == null)
        {
            s3 = (String)b.get(s);
        }
        return s3;
        ClassCastException classcastexception;
        classcastexception;
        e.a(false);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(Context context)
    {
        com/microsoft/onlineid/internal/a/f;
        JVM INSTR monitorenter ;
        if (!c)
        {
            a = new c(context, "settings");
            b.put("areTestHooksEnabled", "false");
            b.put("isDebugBuild", "false");
            b.put("isPseudoLocBuild", "false");
            b.put("isLoggingEnabled", "true");
            b.put("isRedactionEnabled", "true");
            b.put("hasUnlockProcedureCheckRun", "false");
            b.put("isCertificateTelemetryNeeded", "true");
            c = true;
        }
        com/microsoft/onlineid/internal/a/f;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void a(String s, String s1)
    {
        a.a().a(s, s1).a();
    }

    public static boolean a()
    {
        return false;
    }

    public static boolean b(String s)
    {
        return o.b(a(s), "true");
    }

}
