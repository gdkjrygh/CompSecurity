// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import b.a.a.a.d;
import b.a.a.a.l;
import b.a.a.a.m;
import b.a.a.a.o;
import com.a.a.b.e;
import com.a.a.c.M;
import com.a.a.c.g;
import com.a.a.c.r;
import com.a.a.c.x;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class a extends l
    implements m
{

    public final com.a.a.a.a a;
    public final e b;
    public final g c;
    public final Collection d;

    public a()
    {
        this(new com.a.a.a.a(), new e(), new g());
    }

    private a(com.a.a.a.a a1, e e1, g g1)
    {
        a = a1;
        b = e1;
        c = g1;
        d = Collections.unmodifiableCollection(Arrays.asList(new l[] {
            a1, e1, g1
        }));
    }

    public static void a(int i, String s, String s1)
    {
        g();
        f().c.a(i, s, s1);
        b.a.a.a.d.a().a(i, s, s1, true);
    }

    public static void a(String s)
    {
        g();
        f().c.a(3, "CrashlyticsCore", s);
    }

    public static void a(String s, long l1)
    {
        g();
        f().c.a(s, Long.toString(l1));
    }

    public static void a(String s, String s1)
    {
        g();
        f().c.a(s, s1);
    }

    public static void a(String s, boolean flag)
    {
        g();
        f().c.a(s, Boolean.toString(flag));
    }

    public static void a(Throwable throwable)
    {
        Object obj;
label0:
        {
            g();
            obj = f().c;
            if (!((g) (obj)).j && com.a.a.c.g.j())
            {
                if (throwable != null)
                {
                    break label0;
                }
                b.a.a.a.d.a().a(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
            }
            return;
        }
        obj = ((g) (obj)).b;
        Thread thread = Thread.currentThread();
        Date date = new Date();
        ((x) (obj)).f.a(new M(((x) (obj)), date, thread, throwable));
    }

    private static a f()
    {
        return (a)b.a.a.a.d.a(com/a/a/a);
    }

    private static void g()
    {
        if (f() == null)
        {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        } else
        {
            return;
        }
    }

    public final String a()
    {
        return "2.5.2.79";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public final Collection c()
    {
        return d;
    }

    protected final volatile Object d()
    {
        return null;
    }
}
