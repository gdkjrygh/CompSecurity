// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.logging;

import ght;
import ghu;
import ghz;
import gia;
import gmu;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.util.logging:
//            LogLevel

public final class Logger
{

    private static final ThreadLocal a = new ThreadLocal() {

        protected final Object initialValue()
        {
            return new Exception();
        }

    };
    private static List b;
    private static ghz c;

    private Logger()
    {
    }

    private static String a()
    {
        StackTraceElement astacktraceelement[] = ((Exception)a.get()).fillInStackTrace().getStackTrace();
        String s = astacktraceelement[3].getClassName();
        int i;
        if (s.startsWith("com.spotify.music."))
        {
            i = 18;
        } else
        if (s.startsWith("com.spotify.mobile.android."))
        {
            i = 27;
        } else
        {
            i = s.lastIndexOf('.') + 1;
        }
        s = s.substring(i);
        i = astacktraceelement[3].getLineNumber();
        return (new StringBuilder()).append(Thread.currentThread().getName()).append('@').append(s).append(':').append(i).toString();
    }

    public static transient void a(ghz ghz1, ght aght[])
    {
        b = Collections.unmodifiableList(Arrays.asList(aght));
        c = ghz1;
    }

    private static transient void a(gia gia1, String s, Object aobj[])
    {
        gia1.a(a(), d(s, aobj));
    }

    private static transient void a(gia gia1, Throwable throwable, String s, Object aobj[])
    {
        gia1.a(a(), d(s, aobj), throwable);
    }

    public static transient void a(String s, Object aobj[])
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a(((ght)iterator.next()).b(), s, aobj)) { }
    }

    public static transient void a(Throwable throwable, String s, Object aobj[])
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a(((ght)iterator.next()).a(), throwable, s, aobj)) { }
    }

    public static transient void b(String s, Object aobj[])
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a(((ght)iterator.next()).c(), s, aobj)) { }
    }

    public static transient void b(Throwable throwable, String s, Object aobj[])
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a(((ght)iterator.next()).d(), throwable, s, aobj)) { }
    }

    public static transient void c(String s, Object aobj[])
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a(((ght)iterator.next()).d(), s, aobj)) { }
    }

    public static void core(String s)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ght)iterator.next()).b().a("core", d(s, new Object[0]))) { }
    }

    private static transient String d(String s, Object aobj[])
    {
        if (aobj == null || aobj.length == 0)
        {
            return s;
        } else
        {
            return c.a(s, aobj);
        }
    }

    static 
    {
        List list;
        if (gmu.a)
        {
            list = Collections.singletonList(new ghu(EnumSet.noneOf(com/spotify/mobile/android/util/logging/LogLevel)));
        } else
        {
            list = Collections.singletonList(new ghu(EnumSet.allOf(com/spotify/mobile/android/util/logging/LogLevel)));
        }
        b = list;
        c = ghz.a;
    }
}
