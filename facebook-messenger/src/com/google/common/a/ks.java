// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            ev, ik, fi, kt, 
//            em

final class ks extends ev
{

    final transient Object a;
    final transient Object b;
    private transient java.util.Map.Entry c;
    private transient fi d;
    private transient fi e;
    private transient em f;

    ks(Object obj, Object obj1)
    {
        a = obj;
        b = obj1;
    }

    ks(java.util.Map.Entry entry)
    {
        c = entry;
        a = entry.getKey();
        b = entry.getValue();
    }

    private java.util.Map.Entry e()
    {
        java.util.Map.Entry entry1 = c;
        java.util.Map.Entry entry = entry1;
        if (entry1 == null)
        {
            entry = ik.a(a, b);
            c = entry;
        }
        return entry;
    }

    public fi a()
    {
        fi fi2 = d;
        fi fi1 = fi2;
        if (fi2 == null)
        {
            fi1 = fi.b(e());
            d = fi1;
        }
        return fi1;
    }

    public em c()
    {
        em em = f;
        Object obj = em;
        if (em == null)
        {
            obj = new kt(b);
            f = ((em) (obj));
        }
        return ((em) (obj));
    }

    public boolean containsKey(Object obj)
    {
        return a.equals(obj);
    }

    public boolean containsValue(Object obj)
    {
        return b.equals(obj);
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
        boolean flag2 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag2;
            if (obj instanceof Map)
            {
                obj = (Map)obj;
                flag = flag2;
                if (((Map) (obj)).size() == 1)
                {
                    obj = (java.util.Map.Entry)((Map) (obj)).entrySet().iterator().next();
                    boolean flag1;
                    if (a.equals(((java.util.Map.Entry) (obj)).getKey()) && b.equals(((java.util.Map.Entry) (obj)).getValue()))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    return flag1;
                }
            }
        }
        return flag;
    }

    public Object get(Object obj)
    {
        if (a.equals(obj))
        {
            return b;
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        return a.hashCode() ^ b.hashCode();
    }

    public fi i_()
    {
        fi fi2 = e;
        fi fi1 = fi2;
        if (fi2 == null)
        {
            fi1 = fi.b(a);
            e = fi1;
        }
        return fi1;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Set keySet()
    {
        return i_();
    }

    public int size()
    {
        return 1;
    }

    public String toString()
    {
        return (new StringBuilder()).append('{').append(a.toString()).append('=').append(b.toString()).append('}').toString();
    }

    public Collection values()
    {
        return c();
    }
}
