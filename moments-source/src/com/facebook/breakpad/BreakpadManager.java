// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.breakpad;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import java.io.File;

public class BreakpadManager
{

    private static String a;
    private static File b;

    public BreakpadManager()
    {
    }

    public static void a(Context context, boolean flag)
    {
        b(context, flag);
    }

    private static void b(Context context, boolean flag)
    {
        com/facebook/breakpad/BreakpadManager;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            SoLoader.a("breakpad");
            a = "breakpad";
        }
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        context = context.getDir("minidumps", 0);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        throw new RuntimeException("Breakpad init failed to create crash directory: minidumps");
        context;
        com/facebook/breakpad/BreakpadManager;
        JVM INSTR monitorexit ;
        throw context;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        install(context.getAbsolutePath());
        b = context;
        com/facebook/breakpad/BreakpadManager;
        JVM INSTR monitorexit ;
    }

    public static native void crashThisProcess();

    public static native long getMinidumpFlags();

    private static native void install(String s);

    public static native void setMinidumpFlags(long l);

    public static native void uninstall();
}
