// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Optional, Preconditions

final class reference extends Optional
{

    private final Object reference;

    public boolean equals(Object obj)
    {
        if (obj instanceof reference)
        {
            obj = (reference)obj;
            return reference.equals(((reference) (obj)).reference);
        } else
        {
            return false;
        }
    }

    public Object get()
    {
        return reference;
    }

    public int hashCode()
    {
        return 0x598df91c + reference.hashCode();
    }

    public boolean isPresent()
    {
        return true;
    }

    public Object or(Object obj)
    {
        Preconditions.checkNotNull(obj, "use orNull() instead of or(null)");
        return reference;
    }

    public Object orNull()
    {
        return reference;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Optional.of(").append(reference).append(")").toString();
    }

    (Object obj)
    {
        super(null);
        reference = obj;
    }
}
