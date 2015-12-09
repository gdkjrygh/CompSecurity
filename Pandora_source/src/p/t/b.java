// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.t;

import java.util.Queue;
import p.ap.h;

// Referenced classes of package p.t:
//            h

abstract class b
{

    private final Queue a = h.a(20);

    b()
    {
    }

    public void a(p.t.h h1)
    {
        if (a.size() < 20)
        {
            a.offer(h1);
        }
    }

    protected abstract p.t.h b();

    protected p.t.h c()
    {
        p.t.h h2 = (p.t.h)a.poll();
        p.t.h h1 = h2;
        if (h2 == null)
        {
            h1 = b();
        }
        return h1;
    }
}
