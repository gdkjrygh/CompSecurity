// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.core;


public class Loader
{

    private static boolean compatible = true;
    private static boolean done = false;

    public Loader()
    {
    }

    private static native int getCpuArch();

    public static boolean isCompatible()
    {
        return compatible;
    }

    public static void load()
    {
        com/moodstocks/android/core/Loader;
        JVM INSTR monitorenter ;
        boolean flag = done;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/moodstocks/android/core/Loader;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        System.loadLibrary("jmoodstocks-sdk");
        getCpuArch();
        JVM INSTR tableswitch 0 3: default 116
    //                   0 77
    //                   1 85
    //                   2 93
    //                   3 101;
           goto _L3 _L4 _L5 _L6 _L7
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        compatible = false;
_L9:
        done = true;
        if (true) goto _L1; else goto _L8
        Exception exception;
        exception;
        throw exception;
_L8:
        System.loadLibrary("jmoodstocks-sdk-core-armv6");
          goto _L9
_L5:
        System.loadLibrary("jmoodstocks-sdk-core-armv7");
          goto _L9
_L6:
        System.loadLibrary("jmoodstocks-sdk-core-armv7-neon");
          goto _L9
_L7:
        System.loadLibrary("jmoodstocks-sdk-core-x86");
          goto _L9
        compatible = false;
          goto _L9
    }

}
