// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            a, d

public abstract class h
{

    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    protected final m e;
    protected d f;
    protected int g;
    private boolean h;

    public h(String s, m m)
    {
        h = false;
        g = -1;
        a = s;
        e = m;
        b = ar.com.hjg.pngj.chunks.a.b(s);
        c = ar.com.hjg.pngj.chunks.a.c(s);
        d = ar.com.hjg.pngj.chunks.a.d(s);
    }

    final void a(int i)
    {
        g = i;
    }

    protected abstract void a(d d1);

    protected abstract boolean a();

    final void b(d d1)
    {
        f = d1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("chunk id= ")).append(a).append(" (len=");
        int i;
        long l;
        if (f != null)
        {
            i = f.a;
        } else
        {
            i = -1;
        }
        stringbuilder = stringbuilder.append(i).append(" offset=");
        if (f != null)
        {
            l = f.b();
        } else
        {
            l = -1L;
        }
        return stringbuilder.append(l).append(")").toString();
    }
}
