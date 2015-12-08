// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;

import java.util.ArrayList;
import java.util.List;

final class h
{

    h a;
    h b;
    private final Object c;
    private List d;

    public h()
    {
        this(null);
    }

    public h(Object obj)
    {
        b = this;
        a = this;
        c = obj;
    }

    static Object a(h h1)
    {
        return h1.c;
    }

    public final Object a()
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

    public final void a(Object obj)
    {
        if (d == null)
        {
            d = new ArrayList();
        }
        d.add(obj);
    }

    public final int b()
    {
        if (d != null)
        {
            return d.size();
        } else
        {
            return 0;
        }
    }
}
