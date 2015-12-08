// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import ctz;

// Referenced classes of package com.google.common.base:
//            Optional

final class Present extends Optional
{

    private static final long serialVersionUID = 0L;
    private final Object reference;

    Present(Object obj)
    {
        reference = obj;
    }

    public final Object a(Object obj)
    {
        ctz.a(obj, "use Optional.orNull() instead of Optional.or(null)");
        return reference;
    }

    public final boolean b()
    {
        return true;
    }

    public final Object c()
    {
        return reference;
    }

    public final Object d()
    {
        return reference;
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

    public final int hashCode()
    {
        return 0x598df91c + reference.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(reference));
        return (new StringBuilder(s.length() + 13)).append("Optional.of(").append(s).append(")").toString();
    }
}
