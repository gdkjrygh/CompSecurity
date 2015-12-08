// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.threading;


// Referenced classes of package com.fitbit.util.threading:
//            FitbitHandlerThread

public static final class threadName extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];
    private final String threadName;

    static String a(threadName threadname)
    {
        return threadname.threadName;
    }

    public static threadName valueOf(String s)
    {
        return (threadName)Enum.valueOf(com/fitbit/util/threading/FitbitHandlerThread$ThreadName, s);
    }

    public static threadName[] values()
    {
        return (threadName[])i.clone();
    }

    static 
    {
        a = new <init>("BLUETOOTH_CONNECTION", 0, "com.fitbit.util.threading.BLUETOOTH_CONNECTION");
        b = new <init>("GALILEO_PROTOCOL", 1, "com.fitbit.util.threading.GALILEO_PROTOCOL");
        c = new <init>("GALILEO_PROTOCOL_REQUEST", 2, "com.fitbit.util.threading.GALILEO_PROTOCOL_REQUEST");
        d = new <init>("GALILEO_TASK_MANAGER", 3, "com.fitbit.util.threading.GALILEO_TASK_MANAGER");
        e = new <init>("NOTIFICATIONS_OBSERVER", 4, "com.fitbit.util.threading.NOTIFICATIONS_OBSERVER");
        f = new <init>("DNCS_CONNECTION_SERVICE", 5, "com.fitbit.util.threading.DNCS_CONNECTION_SERVICE");
        g = new <init>("PEDOMETER", 6, "com.fitbit.util.threading.PEDOMETER");
        h = new <init>("GENERAL", 7, "com.fitbit.util.threading.GENERAL");
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int j, String s1)
    {
        super(s, j);
        threadName = s1;
    }
}
