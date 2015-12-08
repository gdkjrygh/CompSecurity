// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DView

public final class Log
{
    public static final class DebugLevel extends Enum
    {

        private static final DebugLevel $VALUES[];
        public static final DebugLevel DEBUG;
        public static final DebugLevel NODEBUG;

        public static DebugLevel valueOf(String s)
        {
            return (DebugLevel)Enum.valueOf(com/amobee/pulse3d/Log$DebugLevel, s);
        }

        public static DebugLevel[] values()
        {
            return (DebugLevel[])$VALUES.clone();
        }

        static 
        {
            DEBUG = new DebugLevel("DEBUG", 0);
            NODEBUG = new DebugLevel("NODEBUG", 1);
            $VALUES = (new DebugLevel[] {
                DEBUG, NODEBUG
            });
        }

        private DebugLevel(String s, int j)
        {
            super(s, j);
        }
    }


    static int all = 0;
    static int d = 3;
    static int e = 2;
    static int i = 1;
    static int v = 4;
    static int w = 5;

    public Log()
    {
    }

    static void LogHandler(int j, String s, String s1)
    {
        if (Pulse3DView.debugLevel != DebugLevel.NODEBUG)
        {
            android.util.Log.d(s, s1);
        }
    }

    public static void d(String s, String s1)
    {
        LogHandler(d, s, s1);
    }

    public static void e(String s, String s1)
    {
        LogHandler(e, s, s1);
    }

    public static void i(String s, String s1)
    {
        LogHandler(i, s, s1);
    }

    public static void v(String s, String s1)
    {
        LogHandler(v, s, s1);
    }

    public static void w(String s, String s1)
    {
        LogHandler(w, s, s1);
    }

}
