// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.transport.SiphonServer;
import com.ford.syncV4.util.NativeLogTool;
import java.util.Vector;

public final class axt
{

    private static boolean a = false;
    private static boolean b = false;
    private static boolean c = false;

    public static void a()
    {
        a = true;
        b = true;
        c = true;
    }

    public static void a(String s)
    {
        s = e(s);
        Boolean boolean1 = f(s);
        if (a && !boolean1.booleanValue())
        {
            NativeLogTool.c("SyncProxy", s);
        }
    }

    public static void a(String s, Throwable throwable)
    {
        String s1 = e(s);
        if (throwable != null)
        {
            s = f((new StringBuilder()).append(s1).append(" Exception String: ").append(throwable.toString()).toString());
        } else
        {
            s = f(s1);
        }
        if (a && !s.booleanValue())
        {
            NativeLogTool.a("SyncProxy", s1, throwable);
        }
    }

    public static void b()
    {
        a = true;
        b = false;
        c = false;
    }

    public static void b(String s)
    {
        s = e(s);
        Boolean boolean1 = f(s);
        if (b && !boolean1.booleanValue())
        {
            NativeLogTool.b("SyncProxy", s);
        }
    }

    public static void c(String s)
    {
        s = e(s);
        Boolean boolean1 = f(s);
        if (c && !boolean1.booleanValue())
        {
            NativeLogTool.a("SyncProxy", s);
        }
    }

    public static boolean c()
    {
        return b && c;
    }

    public static void d(String s)
    {
        Boolean boolean1 = f(s);
        if (c && !boolean1.booleanValue())
        {
            NativeLogTool.a("SyncProxy", s);
        }
    }

    private static String e(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = (new StringBuilder("2.3: ")).append(s).toString();
        }
        return s1;
    }

    private static Boolean f(String s)
    {
        SiphonServer.a();
        return SiphonServer.a(s);
    }

    static 
    {
        new Vector();
    }
}
