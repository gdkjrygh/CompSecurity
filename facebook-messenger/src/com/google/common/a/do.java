// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            ev, fi, em

final class do extends ev
{

    static final do a = new do();

    private do()
    {
    }

    public fi a()
    {
        return fi.d();
    }

    public em c()
    {
        return em.c;
    }

    public boolean containsKey(Object obj)
    {
        return false;
    }

    public boolean containsValue(Object obj)
    {
        return false;
    }

    boolean d()
    {
        return false;
    }

    public Set entrySet()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Map)
        {
            return ((Map)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public Object get(Object obj)
    {
        return null;
    }

    public int hashCode()
    {
        return 0;
    }

    public fi i_()
    {
        return fi.d();
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Set keySet()
    {
        return i_();
    }

    public int size()
    {
        return 0;
    }

    public String toString()
    {
        return "{}";
    }

    public Collection values()
    {
        return c();
    }

}
