// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            cj, ch

abstract class u
    implements cj
{

    private transient Set a;
    private transient Map b;

    u()
    {
    }

    public boolean a(Object obj, Object obj1)
    {
        return b(obj).add(obj1);
    }

    Set c()
    {
        return new ch(f());
    }

    abstract Map d();

    public Set e()
    {
        Set set1 = a;
        Set set = set1;
        if (set1 == null)
        {
            set = c();
            a = set;
        }
        return set;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof cj)
        {
            obj = (cj)obj;
            return f().equals(((cj) (obj)).f());
        } else
        {
            return false;
        }
    }

    public Map f()
    {
        Map map1 = b;
        Map map = map1;
        if (map1 == null)
        {
            map = d();
            b = map;
        }
        return map;
    }

    public int hashCode()
    {
        return f().hashCode();
    }

    public String toString()
    {
        return f().toString();
    }
}
