// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import ctz;

// Referenced classes of package com.google.common.base:
//            Optional

final class Absent extends Optional
{

    private static Absent a = new Absent();
    private static final long serialVersionUID = 0L;

    private Absent()
    {
    }

    static Optional a()
    {
        return a;
    }

    private Object readResolve()
    {
        return a;
    }

    public final Object a(Object obj)
    {
        return ctz.a(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public final boolean b()
    {
        return false;
    }

    public final Object c()
    {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final Object d()
    {
        return null;
    }

    public final boolean equals(Object obj)
    {
        return obj == this;
    }

    public final int hashCode()
    {
        return 0x598df91c;
    }

    public final String toString()
    {
        return "Optional.absent()";
    }

}
