// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.a;

// Referenced classes of package com.google.gson:
//            s, q, p, j, 
//            e, r

private static final class <init>
    implements s
{

    private final com.google.gson.b.a a;
    private final boolean b;
    private final Class c;
    private final p d;
    private final j e;

    public final r a(e e1, com.google.gson.b.a a1)
    {
        boolean flag;
        if (a != null)
        {
            if (a.equals(a1) || b && a.b == a1.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = c.isAssignableFrom(a1.a);
        }
        if (flag)
        {
            return new q(d, e, e1, a1, this, (byte)0);
        } else
        {
            return null;
        }
    }

    private rnal.a(Object obj, com.google.gson.b.a a1)
    {
        p p1;
        boolean flag;
        if (obj instanceof p)
        {
            p1 = (p)obj;
        } else
        {
            p1 = null;
        }
        d = p1;
        if (obj instanceof j)
        {
            obj = (j)obj;
        } else
        {
            obj = null;
        }
        e = ((j) (obj));
        if (d != null || e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.gson.internal.a.a(flag);
        a = a1;
        b = false;
        c = null;
    }

    c(Object obj, com.google.gson.b.a a1, byte byte0)
    {
        this(obj, a1);
    }
}
