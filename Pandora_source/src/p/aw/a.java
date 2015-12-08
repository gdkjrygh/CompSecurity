// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aw;

import com.comscore.utils.c;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import p.aq.b;

// Referenced classes of package p.aw:
//            b, c

public class a
{

    b a;
    private p.aw.b b;
    private BlockingQueue c;

    public a(b b1)
    {
        a = b1;
        c = new LinkedBlockingQueue();
        b = new p.aw.b(this);
        b.start();
    }

    long a()
    {
        Iterator iterator = c.iterator();
        long l;
        for (l = 50000L; iterator.hasNext(); l = Math.min(l, ((p.aw.c)iterator.next()).a())) { }
        return l;
    }

    void a(p.aw.c c1)
    {
        c.remove(c1);
    }

    public boolean a(Runnable runnable)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            p.aw.c c1 = (p.aw.c)iterator.next();
            if (c1.e() == runnable || (runnable instanceof p.aw.c) && c1 == runnable)
            {
                return true;
            }
        }

        return false;
    }

    public boolean a(Runnable runnable, long l)
    {
        return a(runnable, l, false, 0L);
    }

    public boolean a(Runnable runnable, long l, boolean flag, long l1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            p.aw.c c1 = (p.aw.c)iterator.next();
            if (c1 != null && c1.e() == runnable)
            {
                return false;
            }
        }

        c.add(new p.aw.c(runnable, a, l, flag, l1));
        b.b();
        return true;
    }

    public boolean a(Runnable runnable, boolean flag)
    {
        if (!a.aq())
        {
            return false;
        }
        if (!flag)
        {
            try
            {
                runnable.run();
            }
            // Misplaced declaration of an exception variable
            catch (Runnable runnable)
            {
                com.comscore.utils.c.b(getClass(), "Unexpected error: ");
                com.comscore.utils.c.a(runnable);
                return true;
            }
            return true;
        } else
        {
            a(runnable, 0L);
            return true;
        }
    }

    p.aw.c b()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            p.aw.c c1 = (p.aw.c)iterator.next();
            if (c1.b() <= System.currentTimeMillis())
            {
                return c1;
            }
        }

        return null;
    }

    public void b(Runnable runnable)
    {
        if (runnable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        p.aw.c c1;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            c1 = (p.aw.c)iterator.next();
        } while (c1.e() != runnable);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        c.remove(c1);
        return;
    }

    public void c()
    {
        c.clear();
    }
}
