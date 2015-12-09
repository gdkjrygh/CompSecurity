// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bj;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p.ba.f;
import p.bb.e;

// Referenced classes of package p.bj:
//            a, b, c

private class <init>
    implements a
{

    final b a;

    public void a(byte byte0)
    {
        for (Iterator iterator = p.bj.b.a(a).iterator(); iterator.hasNext(); ((c)iterator.next()).a(byte0)) { }
    }

    public void a(String s)
    {
        for (Iterator iterator = p.bj.b.a(a).iterator(); iterator.hasNext(); ((c)iterator.next()).a(s)) { }
    }

    public void a(String s, Exception exception)
    {
        for (Iterator iterator = p.bj.b.a(a).iterator(); iterator.hasNext(); ((c)iterator.next()).a(s, exception)) { }
    }

    public void a(f f1)
    {
        c c1 = p.bj.b.a(a, f1.b());
        if (c1 != null)
        {
            c1.a(f1);
        }
    }

    public void a(e e, byte byte0, byte byte1, String s)
    {
        Iterator iterator = p.bj.b.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (c1.b() != 0)
            {
                continue;
            }
            c1.a(e, byte0, byte1, s);
            break;
        } while (true);
    }

    public void a(e e, byte byte0, String s)
    {
        c c1 = p.bj.b.a(a, byte0);
        if (c1 != null)
        {
            c1.a(e, byte0, s);
        }
    }

    public void b(String s, Exception exception)
    {
        for (Iterator iterator = p.bj.b.a(a).iterator(); iterator.hasNext(); ((c)iterator.next()).b(s, exception)) { }
    }

    private n(b b1)
    {
        a = b1;
        super();
    }

    .Object(b b1, .Object obj)
    {
        this(b1);
    }
}
