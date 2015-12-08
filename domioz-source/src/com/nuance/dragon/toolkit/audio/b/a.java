// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.b;

import android.os.Handler;
import com.nuance.dragon.toolkit.audio.a.m;
import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.l;
import com.nuance.dragon.toolkit.d.b.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.audio.b:
//            c, l, j, k, 
//            i, h, b, g, 
//            e, f, m

public abstract class a extends l
{

    protected Handler a;
    private final e b;
    private com.nuance.dragon.toolkit.d.b c;
    private final Handler d = new Handler();
    private com.nuance.dragon.toolkit.audio.b.m e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private com.nuance.dragon.toolkit.audio.b.l k;
    private m l;

    public a(e e1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("audioType", e1);
        com.nuance.dragon.toolkit.d.b.c.a("audioType", "a type supported by this player", b(e1));
        b = e1;
        f = true;
        c = null;
        l = new m();
        k = null;
    }

    static int a(a a1, int i1)
    {
        a1.i = i1;
        return i1;
    }

    static int a(a a1, b b1, int i1, List list)
    {
        return a1.a(b1, i1, list);
    }

    private int a(b b1, int i1, List list)
    {
        int j1 = 0;
        int k1;
        do
        {
            g g1 = (g)b1.b(this);
            k1 = j1;
            if (g1 == null)
            {
                break;
            }
            k1 = j1 + g1.d;
            list.add(g1);
            j1 = k1;
        } while (k1 < i1);
        return k1;
    }

    static e a(a a1)
    {
        return a1.b;
    }

    static int b(a a1, int i1)
    {
        i1 = a1.j - i1;
        a1.j = i1;
        return i1;
    }

    static com.nuance.dragon.toolkit.audio.b.l b(a a1)
    {
        return a1.k;
    }

    static int c(a a1)
    {
        a1.j = 0;
        return 0;
    }

    static boolean d(a a1)
    {
        return a1.g;
    }

    static b e(a a1)
    {
        return a1.i();
    }

    static int f(a a1)
    {
        return a1.i;
    }

    static com.nuance.dragon.toolkit.audio.b.m g(a a1)
    {
        return a1.e;
    }

    static boolean h(a a1)
    {
        a1.g = false;
        return false;
    }

    static com.nuance.dragon.toolkit.d.b i(a a1)
    {
        return a1.c;
    }

    static com.nuance.dragon.toolkit.d.b j(a a1)
    {
        a1.c = null;
        return null;
    }

    static com.nuance.dragon.toolkit.audio.b.m k(a a1)
    {
        a1.e = null;
        return null;
    }

    static com.nuance.dragon.toolkit.audio.b.l l(a a1)
    {
        a1.k = null;
        return null;
    }

    static m m(a a1)
    {
        a1.l = null;
        return null;
    }

    public final void a()
    {
    }

    protected final void a(int i1)
    {
        if (j > 0)
        {
            i1 = 400 - j;
        }
        if (i1 > 0)
        {
            j = j + i1;
            d.post(new com.nuance.dragon.toolkit.audio.b.c(this, i1));
        }
    }

    public final void a(com.nuance.dragon.toolkit.audio.b.m m1)
    {
        boolean flag;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a(this, flag, "Already started.");
        if (f)
        {
            c = new com.nuance.dragon.toolkit.d.b("com.nuance.dragon.toolkit.audio.sinks.PlayerSink");
            c.a();
            a = c.();
        }
        g = true;
        e = m1;
        i = 0;
        k = new com.nuance.dragon.toolkit.audio.b.l(this);
        if (l == null)
        {
            l = new m();
        }
        l.a(k);
        a.post(new j(this));
    }

    public final void a(b b1)
    {
        while (!g || i <= 0) 
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        int i1 = a(b1, i, ((List) (arraylist)));
        i = i - i1;
        a.post(new k(this, arraylist));
    }

    protected abstract void a(List list);

    public final boolean a(e e1)
    {
        return b.m == e1.m && b.l == e1.l;
    }

    public final void b()
    {
        if (g && !h)
        {
            h = true;
            a.post(new i(this));
        }
    }

    public final void b(b b1)
    {
        if (!g)
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        for (; b1.a(this) > 0; arraylist.add(b1.b(this))) { }
        a.post(new h(this, arraylist));
    }

    protected final void b(List list)
    {
        d.post(new com.nuance.dragon.toolkit.audio.b.b(this, list));
    }

    protected abstract boolean b(e e1);

    protected abstract void c();

    protected final void c(b b1)
    {
        if (!g)
        {
            return;
        } else
        {
            a.post(new com.nuance.dragon.toolkit.audio.b.g(this));
            super.c(b1);
            return;
        }
    }

    protected abstract boolean c(e e1);

    protected abstract void d();

    protected final e e()
    {
        return b;
    }

    protected final void f()
    {
        d.post(new com.nuance.dragon.toolkit.audio.b.e(this));
    }

    protected final void g()
    {
        d.post(new f(this));
    }
}
