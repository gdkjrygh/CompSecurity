// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.commons.core.utilities;

import android.util.Log;

public final class Logger
{
    public static final class InternalLogLevel extends Enum
    {

        private static final InternalLogLevel $VALUES[];
        public static final InternalLogLevel DEBUG;
        public static final InternalLogLevel ERROR;
        public static final InternalLogLevel INTERNAL;
        public static final InternalLogLevel NONE;

        public static InternalLogLevel valueOf(String s)
        {
            return (InternalLogLevel)Enum.valueOf(com/inmobi/commons/core/utilities/Logger$InternalLogLevel, s);
        }

        public static InternalLogLevel[] values()
        {
            return (InternalLogLevel[])$VALUES.clone();
        }

        static 
        {
            NONE = new InternalLogLevel("NONE", 0);
            ERROR = new InternalLogLevel("ERROR", 1);
            DEBUG = new InternalLogLevel("DEBUG", 2);
            INTERNAL = new InternalLogLevel("INTERNAL", 3);
            $VALUES = (new InternalLogLevel[] {
                NONE, ERROR, DEBUG, INTERNAL
            });
        }

        private InternalLogLevel(String s, int i)
        {
            super(s, i);
        }
    }


    private static InternalLogLevel a;

    public static void a(InternalLogLevel internalloglevel)
    {
        a = internalloglevel;
    }

    public static void a(InternalLogLevel internalloglevel, String s, String s1)
    {
        if (internalloglevel.ordinal() > a.ordinal()) goto _L2; else goto _L1
_L1:
    /* anonymous class not found */
    class _anm1 {}

        _cls1.a[internalloglevel.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 49
    //                   2 57
    //                   3 65;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        Log.e("[InMobi]", s1);
        return;
_L4:
        Log.d("[InMobi]", s1);
        return;
_L5:
        Log.d(s, s1);
        return;
    }

    public static void a(InternalLogLevel internalloglevel, String s, String s1, Throwable throwable)
    {
        if (internalloglevel.ordinal() > a.ordinal()) goto _L2; else goto _L1
_L1:
        _cls1.a[internalloglevel.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 49
    //                   2 58
    //                   3 67;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        Log.e("[InMobi]", s1, throwable);
        return;
_L4:
        Log.d("[InMobi]", s1, throwable);
        return;
_L5:
        Log.d(s, s1, throwable);
        return;
    }

    static 
    {
        InternalLogLevel internalloglevel;
        if ("production".equalsIgnoreCase("staging"))
        {
            internalloglevel = InternalLogLevel.INTERNAL;
        } else
        {
            internalloglevel = InternalLogLevel.NONE;
        }
        a = internalloglevel;
    }
}
