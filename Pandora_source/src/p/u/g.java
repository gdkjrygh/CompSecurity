// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.u;

import p.ap.e;
import p.q.c;
import p.s.k;

// Referenced classes of package p.u:
//            h

public class g extends e
    implements h
{

    private h.a a;

    public g(int i)
    {
        super(i);
    }

    protected volatile int a(Object obj)
    {
        return a((k)obj);
    }

    protected int a(k k1)
    {
        return k1.c();
    }

    public k a(c c1)
    {
        return (k)super.c(c1);
    }

    public void a(int i)
    {
        if (i >= 60)
        {
            a();
        } else
        if (i >= 40)
        {
            b(b() / 2);
            return;
        }
    }

    protected volatile void a(Object obj, Object obj1)
    {
        a((c)obj, (k)obj1);
    }

    protected void a(c c1, k k1)
    {
        if (a != null)
        {
            a.b(k1);
        }
    }

    public void a(h.a a1)
    {
        a = a1;
    }

    public volatile k b(c c1, k k1)
    {
        return (k)super.b(c1, k1);
    }
}
