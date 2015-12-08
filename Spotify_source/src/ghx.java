// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.Locale;

public final class ghx
{

    private static final DateFormat a;
    private static final Date b = new Date();
    private static Deque c = new ArrayDeque(500);

    public ghx()
    {
    }

    static Date a()
    {
        return b;
    }

    private static void a(char c1, String s, String s1, Throwable throwable)
    {
        long l = System.currentTimeMillis();
        ghx;
        JVM INSTR monitorenter ;
        ghy ghy1;
        if (c.size() != 500)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        ghy1 = (ghy)c.removeFirst();
_L1:
        ghy1.a = c1;
        ghy1.b = s;
        ghy1.c = s1;
        ghy1.d = throwable;
        ghy1.e = l;
        c.addLast(ghy1);
        ghx;
        JVM INSTR monitorexit ;
        if (gmm.a() && gya.c())
        {
            akk.d().a.a(s1);
        }
        return;
        ghy1 = new ghy((byte)0);
          goto _L1
        s;
        ghx;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void a(String s, String s1)
    {
        a('D', s, s1, null);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        a('D', s, s1, throwable);
    }

    static DateFormat b()
    {
        return a;
    }

    public static void b(String s, String s1)
    {
        a('V', s, s1, null);
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        a('V', s, s1, throwable);
    }

    public static void c(String s, String s1)
    {
        a('I', s, s1, null);
    }

    public static void c(String s, String s1, Throwable throwable)
    {
        a('I', s, s1, throwable);
    }

    public static void d(String s, String s1)
    {
        a('W', s, s1, null);
    }

    public static void d(String s, String s1, Throwable throwable)
    {
        a('W', s, s1, throwable);
    }

    public static void e(String s, String s1)
    {
        a('E', s, s1, null);
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        a('E', s, s1, throwable);
    }

    static 
    {
        a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    }
}
