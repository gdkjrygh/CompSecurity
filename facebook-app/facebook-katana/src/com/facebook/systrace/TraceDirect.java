// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;

import com.facebook.soloader.SoLoader;

class TraceDirect
{

    private static final String a;
    private static final boolean b;

    TraceDirect()
    {
    }

    public static void a()
    {
        if (b)
        {
            return;
        } else
        {
            nativeEndSection();
            return;
        }
    }

    public static void a(long l)
    {
        if (b)
        {
            return;
        } else
        {
            nativeSetEnabledTags(l);
            return;
        }
    }

    public static void a(String s)
    {
        if (b)
        {
            return;
        } else
        {
            nativeBeginSection(s);
            return;
        }
    }

    public static void a(String s, int i)
    {
        if (b)
        {
            return;
        } else
        {
            nativeTraceCounter(s, i);
            return;
        }
    }

    public static void a(String s, int i, long l)
    {
        if (b)
        {
            return;
        } else
        {
            nativeAsyncTraceBegin(s, i, l);
            return;
        }
    }

    public static void a(String s, int i, String s1)
    {
        if (b)
        {
            return;
        } else
        {
            nativeAsyncTraceStageBegin(s, i, s1);
            return;
        }
    }

    public static void a(String s, String s1, char c)
    {
        if (b)
        {
            return;
        } else
        {
            nativeTraceInstant(s, s1, c);
            return;
        }
    }

    public static void a(String s, String s1, int i)
    {
        if (b)
        {
            return;
        } else
        {
            nativeAsyncTraceRename(s, s1, i);
            return;
        }
    }

    static void a(StringBuilder stringbuilder)
    {
        if (b)
        {
            return;
        } else
        {
            nativeBeginSectionWithArgs(stringbuilder);
            return;
        }
    }

    public static String b()
    {
        if (b)
        {
            return "";
        } else
        {
            return nativeGetMyCommandLine();
        }
    }

    public static void b(String s, int i)
    {
        if (b)
        {
            return;
        } else
        {
            nativeAsyncTraceCancel(s, i);
            return;
        }
    }

    public static void b(String s, int i, long l)
    {
        if (b)
        {
            return;
        } else
        {
            nativeAsyncTraceEnd(s, i, l);
            return;
        }
    }

    public static void b(String s, String s1, int i)
    {
        if (b)
        {
            return;
        } else
        {
            nativeTraceMetadata(s, s1, i);
            return;
        }
    }

    static void b(StringBuilder stringbuilder)
    {
        if (b)
        {
            return;
        } else
        {
            nativeEndSectionWithArgs(stringbuilder);
            return;
        }
    }

    private static native void nativeAsyncTraceBegin(String s, int i, long l);

    private static native void nativeAsyncTraceCancel(String s, int i);

    private static native void nativeAsyncTraceEnd(String s, int i, long l);

    private static native void nativeAsyncTraceRename(String s, String s1, int i);

    private static native void nativeAsyncTraceStageBegin(String s, int i, String s1);

    private static native void nativeBeginSection(String s);

    private static native void nativeBeginSectionWithArgs(StringBuilder stringbuilder);

    private static native void nativeEndSection();

    private static native void nativeEndSectionWithArgs(StringBuilder stringbuilder);

    private static native String nativeGetMyCommandLine();

    private static native void nativeSetEnabledTags(long l);

    private static native void nativeTraceCounter(String s, int i);

    private static native void nativeTraceInstant(String s, String s1, char c);

    private static native void nativeTraceMetadata(String s, String s1, int i);

    static 
    {
        boolean flag1;
        flag1 = true;
        a = com/facebook/systrace/TraceDirect.getSimpleName();
        SoLoader.a("fbsystrace");
        boolean flag = true;
_L1:
        UnsatisfiedLinkError unsatisfiedlinkerror;
        if (flag)
        {
            flag1 = false;
        }
        b = flag1;
        return;
        unsatisfiedlinkerror;
        flag = false;
          goto _L1
    }
}
