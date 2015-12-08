// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.b;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.io.b;

public final class c extends com.fasterxml.jackson.core.c
{

    protected final c f;
    protected int g;
    protected int h;
    protected String i;
    protected c j;

    public c(c c1, int l, int i1, int j1)
    {
        j = null;
        d = l;
        f = c1;
        g = i1;
        h = j1;
        e = -1;
    }

    public static c a(int l, int i1)
    {
        return new c(null, 0, l, i1);
    }

    public static c i()
    {
        return new c(null, 0, 1, 0);
    }

    public JsonLocation a(Object obj)
    {
        return new JsonLocation(obj, -1L, g, h);
    }

    public com.fasterxml.jackson.core.c a()
    {
        return j();
    }

    protected void a(int l, int i1, int j1)
    {
        d = l;
        e = -1;
        g = i1;
        h = j1;
        i = null;
    }

    public void a(String s)
    {
        i = s;
    }

    public c b(int l, int i1)
    {
        c c1 = j;
        if (c1 == null)
        {
            c1 = new c(this, 1, l, i1);
            j = c1;
            return c1;
        } else
        {
            c1.a(1, l, i1);
            return c1;
        }
    }

    public c c(int l, int i1)
    {
        c c1 = j;
        if (c1 == null)
        {
            c1 = new c(this, 2, l, i1);
            j = c1;
            return c1;
        } else
        {
            c1.a(2, l, i1);
            return c1;
        }
    }

    public String h()
    {
        return i;
    }

    public c j()
    {
        return f;
    }

    public boolean k()
    {
        int l = e + 1;
        e = l;
        return d != 0 && l > 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        d;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 45
    //                   1 55
    //                   2 81;
           goto _L1 _L2 _L3 _L4
_L1:
        return stringbuilder.toString();
_L2:
        stringbuilder.append("/");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append('[');
        stringbuilder.append(g());
        stringbuilder.append(']');
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append('{');
        if (i != null)
        {
            stringbuilder.append('"');
            com.fasterxml.jackson.core.io.b.a(stringbuilder, i);
            stringbuilder.append('"');
        } else
        {
            stringbuilder.append('?');
        }
        stringbuilder.append('}');
        if (true) goto _L1; else goto _L5
_L5:
    }
}
