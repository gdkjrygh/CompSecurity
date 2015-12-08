// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            p, Equivalence, c

public final class <init>
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Equivalence equivalence;
    private final Object reference;

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof <init>)
        {
            obj = (<init>)obj;
            if (equivalence.equals(((equivalence) (obj)).equivalence))
            {
                return equivalence.equivalent(reference, ((reference) (obj)).reference);
            }
        }
        return false;
    }

    public final Object get()
    {
        return reference;
    }

    public final int hashCode()
    {
        return equivalence.hash(reference);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(equivalence).append(".wrap(").append(reference).append(")").toString();
    }

    private (Equivalence equivalence1, Object obj)
    {
        equivalence = (Equivalence)p.a(equivalence1);
        reference = obj;
    }

    reference(Equivalence equivalence1, Object obj, c c)
    {
        this(equivalence1, obj);
    }
}
