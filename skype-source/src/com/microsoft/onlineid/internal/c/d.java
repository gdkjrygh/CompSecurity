// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.c;

import android.content.Context;
import com.microsoft.onlineid.internal.a.f;

// Referenced classes of package com.microsoft.onlineid.internal.c:
//            c, b

public final class d
{

    private static c a = new c();

    public static String a()
    {
        return "MSA";
    }

    public static void a(Context context)
    {
        com/microsoft/onlineid/internal/c/d;
        JVM INSTR monitorenter ;
        f.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        a = new c(Boolean.parseBoolean(f.a("isRedactionEnabled")), Boolean.parseBoolean(f.a("isLoggingEnabled")));
_L4:
        com/microsoft/onlineid/internal/c/d;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.b(Boolean.parseBoolean(f.a("isLoggingEnabled")));
        a.a(Boolean.parseBoolean(f.a("isRedactionEnabled")));
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void a(b b1)
    {
        a.a(b1);
    }

    public static void a(String s)
    {
        a.a(s, 4, null);
    }

    public static void a(String s, Throwable throwable)
    {
        a.a(s, 4, throwable);
    }

    public static void b(String s)
    {
        a.a(s, 5, null);
    }

    public static void b(String s, Throwable throwable)
    {
        a.a(s, 5, throwable);
    }

    public static void c(String s)
    {
        a.a(s, 6, null);
    }

    public static void c(String s, Throwable throwable)
    {
        a.a(s, 6, throwable);
    }

}
