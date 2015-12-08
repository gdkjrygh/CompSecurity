// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Optional, Preconditions

final class Absent extends Optional
{

    static final Absent INSTANCE = new Absent();

    private Absent()
    {
    }

    static Optional withType()
    {
        return INSTANCE;
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

    public final Object or(Object obj)
    {
        return Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public final Object orNull()
    {
        return null;
    }

    public final String toString()
    {
        return "Optional.absent()";
    }

}
