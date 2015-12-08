// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.util.NoSuchElementException;

public final class c
{

    private static final c a = new c();
    private final Object b;

    private c()
    {
        b = null;
    }

    private c(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            b = obj;
            return;
        }
    }

    public static c a()
    {
        return a;
    }

    public static c a(Object obj)
    {
        return new c(obj);
    }

    public final Object b()
    {
        if (b == null)
        {
            throw new NoSuchElementException("No value present");
        } else
        {
            return b;
        }
    }

    public final boolean c()
    {
        return b != null;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof c))
            {
                return false;
            }
            Object obj1 = (c)obj;
            obj = b;
            obj1 = ((c) (obj1)).b;
            if (obj != obj1 && (obj == null || !obj.equals(obj1)))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        Object obj = b;
        if (obj != null)
        {
            return obj.hashCode();
        } else
        {
            return 0;
        }
    }

    public final String toString()
    {
        if (b != null)
        {
            return String.format("Optional[%s]", new Object[] {
                b
            });
        } else
        {
            return "Optional.empty";
        }
    }

}
