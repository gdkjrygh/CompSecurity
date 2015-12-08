// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Set;

// Referenced classes of package com.google.common.base:
//            Absent, Present, p, n, 
//            s, d

public abstract class Optional
    implements Serializable
{

    private static final long serialVersionUID = 0L;

    Optional()
    {
    }

    public static Optional absent()
    {
        return Absent.withType();
    }

    public static Optional fromNullable(Object obj)
    {
        if (obj == null)
        {
            return absent();
        } else
        {
            return new Present(obj);
        }
    }

    public static Optional of(Object obj)
    {
        return new Present(p.a(obj));
    }

    public static Iterable presentInstances(Iterable iterable)
    {
        p.a(iterable);
        return new n(iterable);
    }

    public abstract Set asSet();

    public abstract boolean equals(Object obj);

    public abstract Object get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional or(Optional optional);

    public abstract Object or(s s);

    public abstract Object or(Object obj);

    public abstract Object orNull();

    public abstract String toString();

    public abstract Optional transform(d d);
}
