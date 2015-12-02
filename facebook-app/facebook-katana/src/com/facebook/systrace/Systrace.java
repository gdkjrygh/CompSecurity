// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;


// Referenced classes of package com.facebook.systrace:
//            TraceConfig, SystraceMetadata, TraceDirect, FbSystrace, 
//            TraceListener

public class Systrace
{

    public Systrace()
    {
    }

    public static void a()
    {
        SystraceMetadata.a();
    }

    public static void a(long l)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.a();
            return;
        }
    }

    public static void a(long l, String s)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.a(s);
            return;
        }
    }

    public static void a(long l, String s, int i)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.a(s, i);
            return;
        }
    }

    public static void a(long l, String s, int i, long l1)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.a(s, i, FbSystrace.a(l1));
            return;
        }
    }

    public static void a(long l, String s, int i, String s1)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.a(s, i, s1);
            return;
        }
    }

    public static void a(long l, String s, EventScope eventscope)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.a("", s, eventscope.getCode());
            return;
        }
    }

    public static void a(long l, String s, String s1, int i)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.b(s, s1, i);
            return;
        }
    }

    public static void a(TraceListener tracelistener)
    {
        TraceConfig.a(tracelistener);
    }

    public static void b(long l, String s, int i)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.a(s, i, 0L);
            return;
        }
    }

    public static void b(long l, String s, int i, long l1)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.b(s, i, FbSystrace.a(l1));
            return;
        }
    }

    public static void b(long l, String s, String s1, int i)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.a(s, s1, i);
            return;
        }
    }

    public static void b(TraceListener tracelistener)
    {
        TraceConfig.b(tracelistener);
    }

    public static boolean b(long l)
    {
        return TraceConfig.a(l);
    }

    public static void c(long l, String s, int i)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.b(s, i, 0L);
            return;
        }
    }

    public static void d(long l, String s, int i)
    {
        if (!b(l))
        {
            return;
        } else
        {
            TraceDirect.b(s, i);
            return;
        }
    }

    static 
    {
        TraceConfig.a(true);
        SystraceMetadata.b();
    }

    private class EventScope extends Enum
    {

        private static final EventScope $VALUES[];
        public static final EventScope GLOBAL;
        public static final EventScope PROCESS;
        public static final EventScope THREAD;
        private final char mCode;

        public static EventScope valueOf(String s)
        {
            return (EventScope)Enum.valueOf(com/facebook/systrace/Systrace$EventScope, s);
        }

        public static EventScope[] values()
        {
            return (EventScope[])$VALUES.clone();
        }

        public final char getCode()
        {
            return mCode;
        }

        static 
        {
            THREAD = new EventScope("THREAD", 0, 't');
            PROCESS = new EventScope("PROCESS", 1, 'p');
            GLOBAL = new EventScope("GLOBAL", 2, 'g');
            $VALUES = (new EventScope[] {
                THREAD, PROCESS, GLOBAL
            });
        }

        private EventScope(String s, int i, char c1)
        {
            super(s, i);
            mCode = c1;
        }
    }

}
