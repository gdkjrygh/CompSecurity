// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

final class b
    implements Runnable
{

    final a.a a;

    b(a.a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        a.a a1 = a;
        if (!a1.b.isEmpty())
        {
            long l = rx.f.a.a.b();
            Iterator iterator = a1.b.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                a.c c = (a.c)iterator.next();
                if (c.d > l)
                {
                    break;
                }
                if (a1.b.remove(c))
                {
                    c.unsubscribe();
                }
            } while (true);
        }
    }
}
