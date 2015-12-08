// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;

public final class am
{

    private final List a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private final List h;

    public final List a()
    {
        return a;
    }

    public final List b()
    {
        return b;
    }

    public final List c()
    {
        return c;
    }

    public final List d()
    {
        return d;
    }

    public final List e()
    {
        return g;
    }

    public final List f()
    {
        return h;
    }

    public final String toString()
    {
        return (new StringBuilder("Positive predicates: ")).append(a).append("  Negative predicates: ").append(b).append("  Add tags: ").append(c).append("  Remove tags: ").append(d).append("  Add macros: ").append(e).append("  Remove macros: ").append(f).toString();
    }
}
