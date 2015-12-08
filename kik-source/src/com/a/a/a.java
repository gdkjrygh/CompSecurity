// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import b.a.a.a.d;
import b.a.a.a.l;
import b.a.a.a.m;
import com.a.a.c.g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class a extends l
    implements m
{

    public final com.a.a.a.a a;
    public final com.a.a.b.a b;
    public final g c;
    public final Collection d;

    public a()
    {
        this(new com.a.a.a.a(), new com.a.a.b.a(), new g());
    }

    private a(com.a.a.a.a a1, com.a.a.b.a a2, g g1)
    {
        a = a1;
        b = a2;
        c = g1;
        d = Collections.unmodifiableCollection(Arrays.asList(new l[] {
            a1, a2, g1
        }));
    }

    public static void a(String s)
    {
        f();
        d().c.a(s);
    }

    public static void a(String s, String s1)
    {
        f();
        d().c.a(s, s1);
    }

    public static void a(Throwable throwable)
    {
        f();
        d().c.a(throwable);
    }

    public static a d()
    {
        return (a)b.a.a.a.d.a(com/a/a/a);
    }

    private static void f()
    {
        if (d() == null)
        {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        } else
        {
            return;
        }
    }

    public final String a()
    {
        return "2.3.2.56";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public final Collection c()
    {
        return d;
    }

    protected final volatile Object e()
    {
        return null;
    }
}
