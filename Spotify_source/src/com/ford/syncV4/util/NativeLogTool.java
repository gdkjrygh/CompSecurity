// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.util;

import android.util.Log;

public final class NativeLogTool
{

    private static boolean a = true;

    private static void a(LogTarget logtarget, String s, String s1)
    {
        int j = 0;
        if (s1 != null && s1.length() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
_L9:
        String s2;
        int k;
        if (j >= s1.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        k = Math.min(4000, s1.length() - j);
        s2 = s1.substring(j, j + k);
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[LogTarget.values().length];
                try
                {
                    a[LogTarget.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[LogTarget.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[LogTarget.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[logtarget.ordinal()];
        JVM INSTR tableswitch 1 3: default 204
    //                   1 135
    //                   2 145
    //                   3 155;
           goto _L3 _L4 _L5 _L6
_L3:
        if (i < s2.length())
        {
            Log.e("SyncProxy", (new StringBuilder("Calling Log.e: msg length=")).append(s2.length()).append(", bytesWritten=").append(i).toString());
        }
        break MISSING_BLOCK_LABEL_207;
_L4:
        try
        {
            i = Log.i(s, s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("SyncProxy", (new StringBuilder("Failure writing ")).append(logtarget.name()).append(" fragments to android log:").append(s.toString()).toString());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i = Log.w(s, s2);
        continue; /* Loop/switch isn't completed */
_L6:
        i = Log.e(s, s2);
        if (true) goto _L3; else goto _L7
_L7:
        j += k;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L1; else goto _L10
_L10:
    }

    public static void a(String s, String s1)
    {
        if (a)
        {
            a(LogTarget.a, s, s1);
        }
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        if (a)
        {
            Log.e(s, s1, throwable);
        }
    }

    public static void b(String s, String s1)
    {
        if (a)
        {
            a(LogTarget.b, s, s1);
        }
    }

    public static void c(String s, String s1)
    {
        if (a)
        {
            a(LogTarget.c, s, s1);
        }
    }


    private class LogTarget extends Enum
    {

        public static final LogTarget a;
        public static final LogTarget b;
        public static final LogTarget c;
        private static final LogTarget d[];

        public static LogTarget valueOf(String s)
        {
            return (LogTarget)Enum.valueOf(com/ford/syncV4/util/NativeLogTool$LogTarget, s);
        }

        public static LogTarget[] values()
        {
            return (LogTarget[])d.clone();
        }

        static 
        {
            a = new LogTarget("Info", 0);
            b = new LogTarget("Warning", 1);
            c = new LogTarget("Error", 2);
            d = (new LogTarget[] {
                a, b, c
            });
        }

        private LogTarget(String s, int i)
        {
            super(s, i);
        }
    }

}
