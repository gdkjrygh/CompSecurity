// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.dncs.domain:
//            a, b

public abstract class c
{

    protected List attributes;
    private Object holderId;

    public c()
    {
        attributes = new ArrayList();
    }

    public a a(b b)
    {
        for (Iterator iterator = attributes.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1.a() == b)
            {
                return a1;
            }
        }

        return null;
    }

    public void a(a a1)
    {
        a a2 = a(a1.a());
        if (a2 != null)
        {
            attributes.remove(a2);
        }
        attributes.add(a1);
    }

    public void a(Object obj)
    {
        holderId = obj;
    }

    public void a(List list)
    {
        attributes = list;
    }

    public List d()
    {
        return attributes;
    }

    public Object e()
    {
        return holderId;
    }
}
