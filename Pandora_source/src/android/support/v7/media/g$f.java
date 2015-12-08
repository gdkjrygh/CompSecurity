// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            g, a, f, c

public static final class c
{

    private final ing a;
    private final String b;
    private final String c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private final ArrayList h = new ArrayList();
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private Display n;
    private int o;
    private Bundle p;
    private a q;

    static String a(c c1)
    {
        return c1.b;
    }

    static boolean b(b b1)
    {
        return b1.f;
    }

    static String c(f f1)
    {
        return f1.c;
    }

    static a d(c c1)
    {
        return c1.q;
    }

    int a(a a1)
    {
        boolean flag = false;
        int j1 = 0;
        int i1 = ((flag) ? 1 : 0);
        if (q != a1)
        {
            q = a1;
            i1 = ((flag) ? 1 : 0);
            if (a1 != null)
            {
                if (!android.support.v7.media.g.a(d, a1.b()))
                {
                    d = a1.b();
                    j1 = 1;
                }
                i1 = j1;
                if (!android.support.v7.media.g.a(e, a1.c()))
                {
                    e = a1.c();
                    i1 = j1 | true;
                }
                j1 = i1;
                if (f != a1.d())
                {
                    f = a1.d();
                    j1 = i1 | 1;
                }
                i1 = j1;
                if (g != a1.e())
                {
                    g = a1.e();
                    i1 = j1 | 1;
                }
                j1 = i1;
                if (!h.equals(a1.f()))
                {
                    h.clear();
                    h.addAll(a1.f());
                    j1 = i1 | 1;
                }
                i1 = j1;
                if (i != a1.g())
                {
                    i = a1.g();
                    i1 = j1 | 1;
                }
                j1 = i1;
                if (j != a1.h())
                {
                    j = a1.h();
                    j1 = i1 | 1;
                }
                i1 = j1;
                if (k != a1.k())
                {
                    k = a1.k();
                    i1 = j1 | 3;
                }
                j1 = i1;
                if (l != a1.i())
                {
                    l = a1.i();
                    j1 = i1 | 3;
                }
                i1 = j1;
                if (m != a1.j())
                {
                    m = a1.j();
                    i1 = j1 | 3;
                }
                j1 = i1;
                if (o != a1.l())
                {
                    o = a1.l();
                    n = null;
                    j1 = i1 | 5;
                }
                i1 = j1;
                if (!android.support.v7.media.g.a(p, a1.m()))
                {
                    p = a1.m();
                    i1 = j1 | 1;
                }
            }
        }
        return i1;
    }

    public String a()
    {
        return c;
    }

    public void a(int i1)
    {
        android.support.v7.media.g.d();
        g.a.a(this, Math.min(m, Math.max(0, i1)));
    }

    public boolean a(f f1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            android.support.v7.media.g.d();
            return f1.a(h);
        }
    }

    public boolean a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("category must not be null");
        }
        android.support.v7.media.g.d();
        int j1 = h.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((IntentFilter)h.get(i1)).hasCategory(s))
            {
                return true;
            }
        }

        return false;
    }

    public String b()
    {
        return d;
    }

    public void b(int i1)
    {
        android.support.v7.media.g.d();
        if (i1 != 0)
        {
            g.a.b(this, i1);
        }
    }

    public String c()
    {
        return e;
    }

    public boolean d()
    {
        return f;
    }

    public boolean e()
    {
        return g;
    }

    public boolean f()
    {
        android.support.v7.media.g.d();
        return g.a.d() == this;
    }

    public boolean g()
    {
        android.support.v7.media.g.d();
        return g.a.c() == this;
    }

    public int h()
    {
        return i;
    }

    public int i()
    {
        return j;
    }

    public int j()
    {
        return k;
    }

    public int k()
    {
        return l;
    }

    public int l()
    {
        return m;
    }

    public Bundle m()
    {
        return p;
    }

    public void n()
    {
        android.support.v7.media.g.d();
        g.a.a(this);
    }

    String o()
    {
        return b;
    }

    c p()
    {
        return a.a();
    }

    public String toString()
    {
        return (new StringBuilder()).append("MediaRouter.RouteInfo{ uniqueId=").append(c).append(", name=").append(d).append(", description=").append(e).append(", enabled=").append(f).append(", connecting=").append(g).append(", playbackType=").append(i).append(", playbackStream=").append(j).append(", volumeHandling=").append(k).append(", volume=").append(l).append(", volumeMax=").append(m).append(", presentationDisplayId=").append(o).append(", extras=").append(p).append(", providerPackageName=").append(a.b()).append(" }").toString();
    }

    ption(ption ption, String s, String s1)
    {
        o = -1;
        a = ption;
        b = s;
        c = s1;
    }
}
