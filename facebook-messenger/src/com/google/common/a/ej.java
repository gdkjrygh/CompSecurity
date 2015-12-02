// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            ev, av, el, ek, 
//            fi, em

public abstract class ej extends ev
    implements av
{

    private static final ej a = new el();

    ej()
    {
    }

    public static ej e()
    {
        return a;
    }

    public static ek f()
    {
        return new ek();
    }

    public fi a()
    {
        return g().a();
    }

    public av b()
    {
        return h();
    }

    public em c()
    {
        return i();
    }

    public boolean containsKey(Object obj)
    {
        return g().containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return h().containsKey(obj);
    }

    public Set entrySet()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        return obj == this || g().equals(obj);
    }

    abstract ev g();

    public Object get(Object obj)
    {
        return g().get(obj);
    }

    public abstract ej h();

    public int hashCode()
    {
        return g().hashCode();
    }

    public fi i()
    {
        return h().i_();
    }

    public fi i_()
    {
        return g().i_();
    }

    public boolean isEmpty()
    {
        return g().isEmpty();
    }

    public Set keySet()
    {
        return i_();
    }

    public int size()
    {
        return g().size();
    }

    public String toString()
    {
        return g().toString();
    }

    public Collection values()
    {
        return i();
    }

}
