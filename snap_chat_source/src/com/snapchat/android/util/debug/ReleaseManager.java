// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;


public final class ReleaseManager
{
    public static final class ReleaseMode extends Enum
    {

        private static final ReleaseMode $VALUES[];
        public static final ReleaseMode ALPHA;
        public static final ReleaseMode BETA;
        public static final ReleaseMode DEBUG;
        public static final ReleaseMode PERF;
        public static final ReleaseMode PRODUCTION;
        public static final ReleaseMode UNINITIALIZED;

        public static ReleaseMode valueOf(String s)
        {
            return (ReleaseMode)Enum.valueOf(com/snapchat/android/util/debug/ReleaseManager$ReleaseMode, s);
        }

        public static ReleaseMode[] values()
        {
            return (ReleaseMode[])$VALUES.clone();
        }

        static 
        {
            UNINITIALIZED = new ReleaseMode("UNINITIALIZED", 0);
            DEBUG = new ReleaseMode("DEBUG", 1);
            PERF = new ReleaseMode("PERF", 2);
            ALPHA = new ReleaseMode("ALPHA", 3);
            BETA = new ReleaseMode("BETA", 4);
            PRODUCTION = new ReleaseMode("PRODUCTION", 5);
            $VALUES = (new ReleaseMode[] {
                UNINITIALIZED, DEBUG, PERF, ALPHA, BETA, PRODUCTION
            });
        }

        private ReleaseMode(String s, int j)
        {
            super(s, j);
        }
    }


    private static final ReleaseManager INSTANCE = new ReleaseManager();
    public ReleaseMode mReleaseMode;

    private ReleaseManager()
    {
        mReleaseMode = ReleaseMode.UNINITIALIZED;
    }

    public static ReleaseManager a()
    {
        return INSTANCE;
    }

    public static boolean e()
    {
        return INSTANCE.b();
    }

    public static boolean f()
    {
        return INSTANCE.c();
    }

    public static boolean g()
    {
        return INSTANCE.d();
    }

    public static boolean h()
    {
        return "com.snapchat.android".contains("flavortest");
    }

    public static boolean i()
    {
        return INSTANCE.c() && !INSTANCE.b();
    }

    public final boolean b()
    {
        if (mReleaseMode == ReleaseMode.UNINITIALIZED)
        {
            throw new IllegalStateException();
        }
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode[];

            static 
            {
                $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode = new int[ReleaseMode.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode[ReleaseMode.DEBUG.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode[ReleaseMode.PERF.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode[ReleaseMode.ALPHA.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode[ReleaseMode.BETA.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.snapchat.android.util.debug.ReleaseManager.ReleaseMode[mReleaseMode.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    public final boolean c()
    {
        if (mReleaseMode == ReleaseMode.UNINITIALIZED)
        {
            throw new IllegalStateException();
        }
        switch (_cls1..SwitchMap.com.snapchat.android.util.debug.ReleaseManager.ReleaseMode[mReleaseMode.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return true;
        }
    }

    public final boolean d()
    {
        if (mReleaseMode == ReleaseMode.UNINITIALIZED)
        {
            throw new IllegalStateException();
        }
        switch (_cls1..SwitchMap.com.snapchat.android.util.debug.ReleaseManager.ReleaseMode[mReleaseMode.ordinal()])
        {
        case 2: // '\002'
        default:
            return false;

        case 1: // '\001'
        case 3: // '\003'
        case 4: // '\004'
            return true;
        }
    }

}
