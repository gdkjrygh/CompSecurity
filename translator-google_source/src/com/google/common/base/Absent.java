// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.common.base:
//            Optional, p, s, d

final class Absent extends Optional
{

    static final Absent INSTANCE = new Absent();
    private static final long serialVersionUID = 0L;

    private Absent()
    {
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

    static Optional withType()
    {
        return INSTANCE;
    }

    public final Set asSet()
    {
        return Collections.emptySet();
    }

    public final boolean equals(Object obj)
    {
        return obj == this;
    }

    public final Object get()
    {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final int hashCode()
    {
        return 0x598df91c;
    }

    public final boolean isPresent()
    {
        return false;
    }

    public final Optional or(Optional optional)
    {
        return (Optional)p.a(optional);
    }

    public final Object or(s s1)
    {
        return p.a(s1.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    public final Object or(Object obj)
    {
        return p.a(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public final Object orNull()
    {
        return null;
    }

    public final String toString()
    {
        return "Optional.absent()";
    }

    public final Optional transform(d d)
    {
        p.a(d);
        return Optional.absent();
    }

}
