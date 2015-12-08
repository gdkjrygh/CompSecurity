// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.b;

import android.util.Log;
import org.c.a.b;
import org.c.a.c;

public final class a extends b
{

    a(String s)
    {
        b = s;
    }

    private static String d(String s, Object obj, Object obj1)
    {
        return org.c.a.c.a(s, obj, obj1).a();
    }

    public final void a(String s)
    {
        Log.w(b, s);
    }

    public final void a(String s, Object obj)
    {
        d(s, obj, null);
    }

    public final void a(String s, Object obj, Object obj1)
    {
        d(s, obj, obj1);
    }

    public final void a(String s, Throwable throwable)
    {
        Log.w(b, s, throwable);
    }

    public final boolean a()
    {
        return Log.isLoggable(b, 3);
    }

    public final void b(String s)
    {
        Log.e(b, s);
    }

    public final void b(String s, Object obj)
    {
        Log.w(b, d(s, obj, null));
    }

    public final void b(String s, Object obj, Object obj1)
    {
        Log.w(b, d(s, obj, obj1));
    }

    public final void b(String s, Throwable throwable)
    {
        Log.e(b, s, throwable);
    }

    public final void c(String s, Object obj)
    {
        Log.e(b, d(s, obj, null));
    }

    public final void c(String s, Object obj, Object obj1)
    {
        Log.e(b, d(s, obj, obj1));
    }
}
