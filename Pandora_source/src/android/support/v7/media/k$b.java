// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;

// Referenced classes of package android.support.v7.media:
//            k

private final class b extends b
{

    final k a;
    private final String b;
    private boolean c;
    private int d;
    private int e;
    private g f;
    private int g;

    public void a()
    {
        k.a(a, this);
    }

    public void a(int i)
    {
        if (f != null)
        {
            f.a(g, i);
            return;
        } else
        {
            d = i;
            e = 0;
            return;
        }
    }

    public void a(e e1)
    {
        f = e1;
        g = e1.a(b);
        if (c)
        {
            e1.d(g);
            if (d >= 0)
            {
                e1.a(g, d);
                d = -1;
            }
            if (e != 0)
            {
                e1.b(g, e);
                e = 0;
            }
        }
    }

    public boolean a(Intent intent, e e1)
    {
        if (f != null)
        {
            return f.a(g, intent, e1);
        } else
        {
            return false;
        }
    }

    public void b()
    {
        c = true;
        if (f != null)
        {
            f.d(g);
        }
    }

    public void b(int i)
    {
        if (f != null)
        {
            f.b(g, i);
            return;
        } else
        {
            e = e + i;
            return;
        }
    }

    public void c()
    {
        c = false;
        if (f != null)
        {
            f.e(g);
        }
    }

    public void d()
    {
        if (f != null)
        {
            f.c(g);
            f = null;
            g = 0;
        }
    }

    public (k k1, String s)
    {
        a = k1;
        super();
        d = -1;
        b = s;
    }
}
