// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.breakpad;

import android.content.Context;
import android.util.Log;
import com.facebook.soloader.SoLoader;
import java.io.File;

public class BreakpadManager
{

    private static String a;
    private static File b;

    public BreakpadManager()
    {
    }

    public static String a()
    {
        if (a == null)
        {
            throw new RuntimeException("Breakpad not installed");
        } else
        {
            return a;
        }
    }

    public static void a(Context context)
    {
        if (!b())
        {
            a(context, false, 1);
            if (!b())
            {
                Log.e("BreakpadManager", "BreakpadManager.ensureInstall() failed");
                return;
            }
        }
    }

    public static void a(Context context, boolean flag, int i)
    {
        com/facebook/breakpad/BreakpadManager;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        String s;
        if ((i & 2) != 0)
        {
            s = "breakpad_static";
        } else
        {
            s = "breakpad";
        }
        SoLoader.a(s);
        a = s;
        if (b != null) goto _L2; else goto _L1
_L1:
        context = context.getDir("minidumps", 0);
        if (context != null) goto _L4; else goto _L3
_L3:
        throw new RuntimeException("Breakpad init failed to create crash directory: minidumps");
        context;
        com/facebook/breakpad/BreakpadManager;
        JVM INSTR monitorexit ;
        throw context;
_L5:
        install(context.getAbsolutePath());
        b = context;
_L2:
        com/facebook/breakpad/BreakpadManager;
        JVM INSTR monitorexit ;
        return;
_L4:
        if ((i & 1) == 0 && flag) goto _L2; else goto _L5
    }

    public static boolean b()
    {
        return b != null;
    }

    public static native void crashThisProcess();

    public static native long getMinidumpFlags();

    private static native void install(String s);

    public static native void setMinidumpFlags(long l);

    public static native void uninstall();
}
