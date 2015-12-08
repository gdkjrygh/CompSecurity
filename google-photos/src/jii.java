// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

public final class jii
    implements jif
{

    final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    final jjh b[][];
    boolean c;
    int d;
    int e;
    private final Handler f = new jij(this);
    private final jik g;
    private final int h[];

    public jii(int i, int j, int k)
    {
        c = false;
        d = 1;
        b = new jjh[i][];
        h = new int[i];
        g = new jik(f, c, h, j, k);
    }

    public final int a()
    {
        return d;
    }

    public final int a(int i)
    {
        return h[i];
    }

    public final void a(int i, boolean flag)
    {
        int j;
        if (flag)
        {
            j = 0;
        } else
        {
            j = -1;
        }
        if (h[i] != j)
        {
            h[i] = j;
            g.a.obtainMessage(8, i, j).sendToTarget();
        }
    }

    public final void a(long l)
    {
        jik jik1 = g;
        jik1.d = l;
        jik1.b.incrementAndGet();
        jik1.a.obtainMessage(6, jno.a(l), jno.b(l)).sendToTarget();
    }

    public final void a(jig jig, int i, Object obj)
    {
        jik jik1 = g;
        jik1.c = jik1.c + 1;
        jik1.a.obtainMessage(9, i, 0, Pair.create(jig, obj)).sendToTarget();
    }

    public final void a(jih jih1)
    {
        a.add(jih1);
    }

    public final void a(boolean flag)
    {
        if (c != flag)
        {
            c = flag;
            e = e + 1;
            Handler handler = g.a;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            handler.obtainMessage(3, i, 0).sendToTarget();
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((jih)iterator.next()).a(flag, d)) { }
        }
    }

    public final transient void a(jig ajig[])
    {
        Arrays.fill(b, null);
        g.a.obtainMessage(1, ajig).sendToTarget();
    }

    public final void b(jig jig, int i, Object obj)
    {
        g.a(jig, i, obj);
    }

    public final void b(jih jih1)
    {
        a.remove(jih1);
    }

    public final boolean b()
    {
        return c;
    }

    public final void c()
    {
        g.a.sendEmptyMessage(4);
    }

    public final void d()
    {
        g.a();
        f.removeCallbacksAndMessages(null);
    }

    public final long e()
    {
        jik jik1 = g;
        if (jik1.e == -1L)
        {
            return -1L;
        } else
        {
            return jik1.e / 1000L;
        }
    }

    public final long f()
    {
        jik jik1 = g;
        if (jik1.b.get() > 0)
        {
            return jik1.d;
        } else
        {
            return jik1.f / 1000L;
        }
    }
}
