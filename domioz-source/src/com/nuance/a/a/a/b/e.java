// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b;

import android.util.Log;

public final class e extends com.nuance.a.a.a.a.d.a.e
{

    private String a;

    public e(Class class1)
    {
        a = class1.getSimpleName();
    }

    public final void a(Object obj)
    {
        Log.w("NMSP", (new StringBuilder("[")).append(a).append("] ").append(obj.toString()).toString());
    }

    public final void a(Object obj, Throwable throwable)
    {
        throwable.printStackTrace();
        Log.w("NMSP", (new StringBuilder("[")).append(a).append("] ").append(obj.toString()).toString(), throwable);
    }

    public final boolean a()
    {
        return Log.isLoggable("NMSP_", 2);
    }

    public final void b(Object obj)
    {
        Log.e("NMSP", (new StringBuilder("[")).append(a).append("] ").append(obj.toString()).toString());
    }

    public final boolean b()
    {
        return Log.isLoggable("NMSP_", 3);
    }

    public final boolean c()
    {
        return Log.isLoggable("NMSP", 4);
    }

    public final boolean d()
    {
        return Log.isLoggable("NMSP", 5);
    }

    public final boolean e()
    {
        return Log.isLoggable("NMSP", 6);
    }

    public final void f()
    {
    }

    public final void g()
    {
    }
}
