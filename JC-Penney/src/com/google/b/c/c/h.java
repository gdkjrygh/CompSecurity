// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;

import com.google.b.f;
import java.nio.charset.Charset;

// Referenced classes of package com.google.b.c.c:
//            l, k

final class h
{

    int a;
    private final String b;
    private l c;
    private f d;
    private f e;
    private final StringBuilder f;
    private int g;
    private k h;
    private int i;

    h(String s)
    {
        byte abyte0[] = s.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder stringbuilder = new StringBuilder(abyte0.length);
        int i1 = 0;
        for (int j1 = abyte0.length; i1 < j1; i1++)
        {
            char c1 = (char)(abyte0[i1] & 0xff);
            if (c1 == '?' && s.charAt(i1) != '?')
            {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            stringbuilder.append(c1);
        }

        b = stringbuilder.toString();
        c = l.a;
        f = new StringBuilder(s.length());
        g = -1;
    }

    private int l()
    {
        return b.length() - i;
    }

    public String a()
    {
        return b;
    }

    public void a(char c1)
    {
        f.append(c1);
    }

    public void a(int i1)
    {
        i = i1;
    }

    public void a(l l1)
    {
        c = l1;
    }

    public void a(f f1, f f2)
    {
        d = f1;
        e = f2;
    }

    public void a(String s)
    {
        f.append(s);
    }

    public char b()
    {
        return b.charAt(a);
    }

    public void b(int i1)
    {
        g = i1;
    }

    public StringBuilder c()
    {
        return f;
    }

    public void c(int i1)
    {
        if (h == null || i1 > h.h())
        {
            h = com.google.b.c.c.k.a(i1, c, d, e, true);
        }
    }

    public int d()
    {
        return f.length();
    }

    public int e()
    {
        return g;
    }

    public void f()
    {
        g = -1;
    }

    public boolean g()
    {
        return a < l();
    }

    public int h()
    {
        return l() - a;
    }

    public k i()
    {
        return h;
    }

    public void j()
    {
        c(d());
    }

    public void k()
    {
        h = null;
    }
}
