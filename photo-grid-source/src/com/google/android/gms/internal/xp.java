// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.List;

public final class xp
{

    private final List a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;

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

    public final String toString()
    {
        return (new StringBuilder("Positive predicates: ")).append(a).append("  Negative predicates: ").append(b).append("  Add tags: ").append(c).append("  Remove tags: ").append(d).append("  Add macros: ").append(e).append("  Remove macros: ").append(f).toString();
    }
}
