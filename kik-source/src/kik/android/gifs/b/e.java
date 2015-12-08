// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.b;

import com.kik.g.p;
import com.kik.l.ab;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kik.android.util.bx;

// Referenced classes of package kik.android.gifs.b:
//            c, d, f

public final class e
{
    private final class a
        implements Runnable
    {

        final e a;
        private c b;

        public final void run()
        {
            if (!b.a().g())
            {
                b.b();
                e.a(a).remove(b.a);
            }
        }

        private a(c c1)
        {
            a = e.this;
            super();
            b = c1;
        }

        a(c c1, byte byte0)
        {
            this(c1);
        }
    }


    private static e d;
    private final ExecutorService a = Executors.newFixedThreadPool(2);
    private final ScheduledExecutorService b = Executors.newScheduledThreadPool(1);
    private final ab c;
    private ConcurrentMap e;

    private e(ab ab)
    {
        e = new ConcurrentHashMap();
        c = ab;
    }

    static ConcurrentMap a(e e1)
    {
        return e1.e;
    }

    public static e a()
    {
        if (d == null)
        {
            bx.d(new IllegalArgumentException("Must be init'd with ClientStorage. Unfortunate consequence of our injection system."));
        }
        return d;
    }

    public static e a(ab ab)
    {
        if (d == null)
        {
            d = new e(ab);
        }
        return d;
    }

    public final p a(String s, kik.android.gifs.a.f.a a1, int i)
    {
        if (e.containsKey(s))
        {
            c c1 = (c)e.get(s);
            if (c1 != null)
            {
                return c1.a();
            }
        }
        a1 = kik.android.gifs.b.d.a(s, c, a1, i);
        a.submit(a1);
        b.schedule(new a(a1, (byte)0), 1500L, TimeUnit.MILLISECONDS);
        e.put(s, a1);
        a1.a().a(new f(this, s));
        return a1.a();
    }
}
