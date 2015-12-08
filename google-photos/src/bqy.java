// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bqy
    implements cve
{

    private cvf a;
    private k b;
    private cve c;

    bqy()
    {
    }

    public final void T_()
    {
        c.a(c, "mDelegate", "Cannot resume without an active StoryboardPlayer!");
        c.T_();
    }

    public final boolean U_()
    {
        if (c != null)
        {
            return c.U_();
        } else
        {
            return false;
        }
    }

    public final void a()
    {
        c.a(c, "mDelegate", "Cannot stop without an active StoryboardPlayer!");
        c.a();
    }

    public final void a(long l)
    {
        c.a(c, "mDelegate", "Cannot seek without an active StoryboardPlayer!");
        c.a(l);
    }

    public final void a(cqf cqf)
    {
        if (c != null)
        {
            c.a(cqf);
        }
    }

    public final void a(cqf cqf, cuc cuc, chp chp)
    {
        c.a(c, "mDelegate", "Cannot start without an active StoryboardPlayer!");
        c.a(cqf, cuc, chp);
    }

    public final void a(cve cve1)
    {
        if (c != cve1)
        {
            if (c != null)
            {
                c.a(null);
                c.a(null);
                c.a();
            }
            c = cve1;
            if (c != null)
            {
                c.a(a);
                c.a(b);
                return;
            }
        }
    }

    public final void a(cvf cvf)
    {
        a = cvf;
        if (c != null)
        {
            c.a(cvf);
        }
    }

    public final void a(k k)
    {
        b = k;
        if (c != null)
        {
            c.a(k);
        }
    }

    public final void b()
    {
        c.a(c, "mDelegate", "Cannot pause without an active StoryboardPlayer!");
        c.b();
    }

    public final boolean d()
    {
        if (c != null)
        {
            return c.d();
        } else
        {
            return false;
        }
    }

    public final void f()
    {
        if (c != null)
        {
            c.f();
        }
    }
}
