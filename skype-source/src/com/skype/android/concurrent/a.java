// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;


// Referenced classes of package com.skype.android.concurrent:
//            AsyncResult

final class a
    implements AsyncResult
{

    private Object a;
    private Object b;
    private Throwable c;
    private boolean d;

    a()
    {
    }

    public final Object a()
    {
        return b;
    }

    public final void a(Object obj)
    {
        a = obj;
    }

    public final void a(Throwable throwable)
    {
        b = null;
        c = throwable;
    }

    public final Object b()
    {
        return a;
    }

    public final void b(Object obj)
    {
        b = obj;
        c = null;
    }

    public final Throwable c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }

    public final boolean e()
    {
        return !d && c == null;
    }

    public final void f()
    {
        d = true;
        b = null;
        c = null;
    }
}
