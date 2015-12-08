// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Optional, Preconditions

final class Present extends Optional
{

    private final Object reference;

    Present(Object obj)
    {
        reference = obj;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Present)
        {
            obj = (Present)obj;
            return reference.equals(((Present) (obj)).reference);
        } else
        {
            return false;
        }
    }

    public final Object get()
    {
        return reference;
    }

    public final int hashCode()
    {
        return 0x598df91c + reference.hashCode();
    }

    public final boolean isPresent()
    {
        return true;
    }

    public final Object or(Object obj)
    {
        Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return reference;
    }

    public final Object orNull()
    {
        return reference;
    }

    public final String toString()
    {
        return (new StringBuilder("Optional.of(")).append(reference).append(")").toString();
    }
}
