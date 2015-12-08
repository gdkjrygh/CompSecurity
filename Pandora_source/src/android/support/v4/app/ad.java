// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

public class ad extends af.a
{
    static interface a
    {
    }

    static class b
        implements a
    {

        b()
        {
        }
    }

    static class c
        implements a
    {

        c()
        {
        }
    }

    static class d
        implements a
    {

        d()
        {
        }
    }


    public static final af.a.a a = new af.a.a() {

    };
    private static final a g;
    private final String b;
    private final CharSequence c;
    private final CharSequence d[];
    private final boolean e;
    private final Bundle f;

    public String a()
    {
        return b;
    }

    public CharSequence b()
    {
        return c;
    }

    public CharSequence[] c()
    {
        return d;
    }

    public boolean d()
    {
        return e;
    }

    public Bundle e()
    {
        return f;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            g = new b();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            g = new d();
        } else
        {
            g = new c();
        }
    }
}
