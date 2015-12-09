// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.a;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load.engine.a:
//            e

private static class c
{

    d a;
    d b;
    private final Object c;
    private List d;

    static Object a(c c1)
    {
        return c1.c;
    }

    public Object a()
    {
        int i = b();
        if (i > 0)
        {
            return d.remove(i - 1);
        } else
        {
            return null;
        }
    }

    public void a(Object obj)
    {
        if (d == null)
        {
            d = new ArrayList();
        }
        d.add(obj);
    }

    public int b()
    {
        if (d != null)
        {
            return d.size();
        } else
        {
            return 0;
        }
    }

    public ()
    {
        this(null);
    }

    public <init>(Object obj)
    {
        b = this;
        a = this;
        c = obj;
    }
}
