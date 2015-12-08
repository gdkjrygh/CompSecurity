// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.f;

public final class c
{

    protected final Object a;
    protected JsonEncoding b;
    protected final boolean c;
    protected final BufferRecycler d;
    protected byte e[];
    protected byte f[];
    protected byte g[];
    protected char h[];
    protected char i[];
    protected char j[];

    public c(BufferRecycler bufferrecycler, Object obj, boolean flag)
    {
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        d = bufferrecycler;
        a = obj;
        c = flag;
    }

    private final void a(Object obj)
    {
        if (obj != null)
        {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        } else
        {
            return;
        }
    }

    private final void a(Object obj, Object obj1)
    {
        if (obj != obj1)
        {
            throw new IllegalArgumentException("Trying to release buffer not owned by the context");
        } else
        {
            return;
        }
    }

    public Object a()
    {
        return a;
    }

    public void a(JsonEncoding jsonencoding)
    {
        b = jsonencoding;
    }

    public void a(byte abyte0[])
    {
        if (abyte0 != null)
        {
            a(abyte0, e);
            e = null;
            d.a(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.a, abyte0);
        }
    }

    public void a(char ac[])
    {
        if (ac != null)
        {
            a(ac, h);
            h = null;
            d.a(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.a, ac);
        }
    }

    public char[] a(int k)
    {
        a(j);
        char ac[] = d.a(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.d, k);
        j = ac;
        return ac;
    }

    public JsonEncoding b()
    {
        return b;
    }

    public void b(byte abyte0[])
    {
        if (abyte0 != null)
        {
            a(abyte0, f);
            f = null;
            d.a(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.b, abyte0);
        }
    }

    public void b(char ac[])
    {
        if (ac != null)
        {
            a(ac, i);
            i = null;
            d.a(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.b, ac);
        }
    }

    public void c(byte abyte0[])
    {
        if (abyte0 != null)
        {
            a(abyte0, g);
            g = null;
            d.a(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.d, abyte0);
        }
    }

    public void c(char ac[])
    {
        if (ac != null)
        {
            a(ac, j);
            j = null;
            d.a(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.d, ac);
        }
    }

    public boolean c()
    {
        return c;
    }

    public f d()
    {
        return new f(d);
    }

    public byte[] e()
    {
        a(e);
        byte abyte0[] = d.a(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.a);
        e = abyte0;
        return abyte0;
    }

    public byte[] f()
    {
        a(f);
        byte abyte0[] = d.a(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.b);
        f = abyte0;
        return abyte0;
    }

    public byte[] g()
    {
        a(g);
        byte abyte0[] = d.a(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.d);
        g = abyte0;
        return abyte0;
    }

    public char[] h()
    {
        a(h);
        char ac[] = d.a(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.a);
        h = ac;
        return ac;
    }

    public char[] i()
    {
        a(i);
        char ac[] = d.a(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.b);
        i = ac;
        return ac;
    }
}
