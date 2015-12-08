// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class oty
    implements jif
{

    private jif a;
    private boolean b;
    private int c;
    private final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public oty(int i, int j, int k)
    {
        b = false;
        c = 0;
        a = new jii(4, 0, 0);
        c = 4;
    }

    private void b(boolean flag)
    {
        a.a(flag);
        b = false;
    }

    private boolean g()
    {
        for (int i = 0; i < c; i++)
        {
            if (a.a(i) < 0)
            {
                return false;
            }
        }

        return true;
    }

    public final int a()
    {
        return a.a();
    }

    public final int a(int i)
    {
        return a.a(i);
    }

    public final void a(int i, boolean flag)
    {
        a.a(i, flag);
        if (b && g())
        {
            b(true);
        }
    }

    public final void a(long l)
    {
        a.a(l);
    }

    public final void a(jig jig, int i, Object obj)
    {
        a.a(jig, i, obj);
    }

    public final void a(jih jih)
    {
        a.a(jih);
    }

    public final void a(otz otz1)
    {
        d.add(otz1);
    }

    public final void a(boolean flag)
    {
        b = flag;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((otz)iterator.next()).r()) { }
        boolean flag1;
        if (!flag || g())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            b(flag);
        }
    }

    public final transient void a(jig ajig[])
    {
        c = ajig.length;
        a.a(ajig);
    }

    public final void b(jig jig, int i, Object obj)
    {
        a.b(jig, i, obj);
    }

    public final void b(jih jih)
    {
        a.b(jih);
    }

    public final boolean b()
    {
        return b || a.b();
    }

    public final void c()
    {
        a.c();
    }

    public final void d()
    {
        a.d();
    }

    public final long e()
    {
        return a.e();
    }

    public final long f()
    {
        return a.f();
    }
}
