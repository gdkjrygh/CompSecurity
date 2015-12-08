// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.optional;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Function;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.soundcloud.java.optional:
//            Optional

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
        return (Optional)Preconditions.checkNotNull(optional);
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

    public final Optional transform(Function function)
    {
        Preconditions.checkNotNull(function);
        return absent();
    }

}
