// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.a:
//            jl, jg, ja, iw, 
//            jf

class je extends jl
{

    final ja a;

    je(ja ja1)
    {
        a = ja1;
        super();
    }

    jf a()
    {
        return a;
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof jg)
        {
            obj = (jg)obj;
            Collection collection = (Collection)a.a().b().get(((jg) (obj)).a());
            return collection != null && collection.size() == ((jg) (obj)).b();
        } else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        return a.a().e();
    }

    public Iterator iterator()
    {
        return a.c();
    }

    public boolean remove(Object obj)
    {
        if (obj instanceof jg)
        {
            obj = (jg)obj;
            Collection collection = (Collection)a.a().b().get(((jg) (obj)).a());
            if (collection != null && collection.size() == ((jg) (obj)).b())
            {
                collection.clear();
                return true;
            }
        }
        return false;
    }

    public int size()
    {
        return a.d();
    }
}
