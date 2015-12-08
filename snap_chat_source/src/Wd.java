// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class Wd
{
    final class a
        implements Wc
    {

        private Wd a;

        public final void a()
        {
            a.d = true;
        }

        private a()
        {
            a = Wd.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements Wc
    {

        private Wd a;

        public final void a()
        {
            a.b = true;
        }

        private b()
        {
            a = Wd.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c
        implements Wc
    {

        private Wd a;

        public final void a()
        {
            a.c = true;
        }

        private c()
        {
            a = Wd.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d
        implements Wc
    {

        private Wd a;

        public final void a()
        {
            a.a = true;
        }

        private d()
        {
            a = Wd.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    boolean a;
    boolean b;
    boolean c;
    boolean d;
    public volatile boolean e;
    private Wa f;
    private VZ g;
    private VZ h;
    private WS i;
    private VF j;
    private int k;

    public Wd(Wa wa, VX vx, VX vx1)
    {
        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        k = -1;
        f = wa;
        WL.a();
        if (!WL.b())
        {
            throw new Wu("There is no looper thread");
        }
        if (wa.b)
        {
            i = new WS(f, new c((byte)0), vx);
            g = a(i, new d((byte)0));
        } else
        {
            i = null;
            g = null;
            c = true;
            a = true;
        }
        if (wa.c)
        {
            j = new VF(f, new a((byte)0), vx1);
            h = b(j, new b((byte)0));
            return;
        } else
        {
            j = null;
            d = true;
            b = true;
            return;
        }
    }

    public abstract VZ a(VW vw, Wc wc);

    public final void a()
    {
        if (g != null)
        {
            g.a();
            g = null;
        }
        if (i != null)
        {
            i.a();
            i = null;
        }
        if (h != null)
        {
            h.a();
            h = null;
        }
        if (j != null)
        {
            j.a();
            j = null;
        }
        f = null;
    }

    public final void a(Wv.b b1)
    {
        do
        {
            if (d && c || e)
            {
                break;
            }
            if (h != null && !b)
            {
                h.processFrame();
            }
            if (j != null && !d)
            {
                j.processFrame();
            }
            if (!a)
            {
                g.processFrame();
            }
            if (!c)
            {
                i.processFrame();
            }
            if (b1 != null)
            {
                int l;
                int i1;
                if (g != null)
                {
                    l = Math.min(100, g.b());
                } else
                {
                    l = 100;
                }
                i1 = l;
                if (h != null)
                {
                    i1 = Math.min(l, h.b());
                }
                if (i1 != k)
                {
                    k = i1;
                    b1.a(i1);
                }
            }
        } while (true);
    }

    public abstract VZ b(VW vw, Wc wc);
}
