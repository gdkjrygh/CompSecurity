// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.d.b;

import com.facebook.common.process.c;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentMap;

public class a
{

    private final String a;
    private final c b;
    private final ConcurrentMap c = ik.c();
    private final ConcurrentMap d = ik.c();
    private final ConcurrentMap e = ik.c();

    public a(String s, c c1)
    {
        a = s;
        b = c1;
    }

    private String b(String s, c c1)
    {
        s = (new StringBuilder()).append(a).append(".").append(s).toString();
        if (c1 == null || c1.d())
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append(".").append(c1.c()).toString();
        }
    }

    private c c(Class class1)
    {
        c c2 = (c)c.get(class1);
        c c1 = c2;
        if (c2 == null)
        {
            c1 = (c)d.get(class1);
        }
        return c1;
    }

    public String a(String s)
    {
        return b(s, (c)e.get(s));
    }

    public void a(Class class1, c c1)
    {
        if ((c)c.putIfAbsent(class1, c1) != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Tried to register ").append(class1).append(" multiple times.").toString());
        } else
        {
            return;
        }
    }

    public void a(String s, c c1)
    {
        e.put(s, c1);
    }

    public boolean a(Class class1)
    {
        class1 = c(class1);
        if (class1 != null)
        {
            if (class1.d())
            {
                if (!b.d() && !b.a())
                {
                    return false;
                }
            } else
            {
                return Objects.equal(b, class1);
            }
        }
        return true;
    }

    public void b(Class class1)
    {
        Preconditions.checkState(a(class1), (new StringBuilder()).append("Cannot access ").append(class1).append(" database from process. Current: ").append(b).append(", Expected: ").append(c(class1)).toString());
    }

    public void b(Class class1, c c1)
    {
        d.put(class1, c1);
    }

    public void b(String s)
    {
        c c1 = (c)e.get(s);
        if (c1 == null)
        {
            return;
        } else
        {
            Preconditions.checkState(Objects.equal(c1, b), (new StringBuilder()).append("Cannot access ContentProvider ").append(s).append(" from current process. Current: ").append(b).append(", Expected: ").append(c1).toString());
            return;
        }
    }
}
