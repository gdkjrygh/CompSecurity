// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cv;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p.bd.e;
import p.bd.g;
import p.bf.a;
import p.bg.aa;
import p.bg.ad;
import p.bg.ae;
import p.bg.af;
import p.bg.ag;
import p.bg.ah;
import p.bg.ai;
import p.bg.aj;
import p.bg.ak;
import p.bg.al;
import p.bg.am;
import p.bg.an;
import p.bg.ao;
import p.bg.ap;
import p.bg.aq;
import p.bg.ar;
import p.bg.as;
import p.bg.au;
import p.bg.ax;
import p.bg.ay;
import p.bg.bb;
import p.bg.bc;
import p.bg.be;
import p.bg.bf;
import p.bg.bh;
import p.bg.bj;
import p.bg.bl;
import p.bg.bm;
import p.bg.bq;
import p.bg.bt;
import p.bg.bu;
import p.bg.bx;
import p.bg.cb;
import p.bg.cc;
import p.bg.d;
import p.bg.f;
import p.bg.i;
import p.bg.l;
import p.bg.m;
import p.bg.o;
import p.bg.q;
import p.bg.r;
import p.bg.s;
import p.bg.u;
import p.bg.v;
import p.bg.x;
import p.bh.w;
import p.cu.c;

// Referenced classes of package p.cv:
//            e, c

public class b extends p.cv.e
{

    p.cv.e a;
    private AtomicInteger b;
    private ConcurrentHashMap c;

    public b(p.cv.e e1)
    {
        this(e1, new AtomicInteger(0));
    }

    protected b(p.cv.e e1, AtomicInteger atomicinteger)
    {
        a = null;
        b = null;
        c = new ConcurrentHashMap();
        a = e1;
        b = atomicinteger;
    }

    public void a()
    {
        b = new AtomicInteger(0);
        c.clear();
    }

    public void a(String s, Exception exception)
    {
        if (a != null)
        {
            a.a(s, exception);
        }
    }

    public void a(String s, Exception exception, w w)
    {
        if (a != null)
        {
            a.a(s, exception, w);
        }
    }

    protected void a(g g1, p.cv.c c1)
    {
        if (c != null)
        {
            int i = g1.c().intValue();
            p.cv.c c2 = (p.cv.c)c.get(Integer.valueOf(i));
            if (c2 != null)
            {
                c2.a(g1);
                c.remove(Integer.valueOf(i));
            }
            if (c1 != null)
            {
                c1.a(g1);
            }
        } else
        if (c1 != null)
        {
            c1.a(g1);
            return;
        }
    }

    public void a(a a1)
    {
        if (a != null)
        {
            a.a(a1);
        }
    }

    public void a(aa aa)
    {
        a(((g) (aa)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((aa)g1);
            }

            public void a(aa aa1)
            {
                if (a.a != null)
                {
                    a.a.a(aa1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(ad ad)
    {
        if (a != null)
        {
            a.a(ad);
        }
    }

    public void a(ae ae)
    {
        if (a != null)
        {
            a.a(ae);
        }
    }

    public void a(af af)
    {
        if (a != null)
        {
            a.a(af);
        }
    }

    public void a(ag ag)
    {
        if (a != null)
        {
            a.a(ag);
        }
    }

    public void a(ah ah)
    {
        if (a != null)
        {
            a.a(ah);
        }
    }

    public void a(ai ai)
    {
        if (a != null)
        {
            a.a(ai);
        }
    }

    public void a(aj aj)
    {
        if (a != null)
        {
            a.a(aj);
        }
    }

    public void a(ak ak)
    {
        if (a != null)
        {
            a.a(ak);
        }
    }

    public void a(al al)
    {
        if (a != null)
        {
            a.a(al);
        }
    }

    public void a(am am)
    {
        if (a != null)
        {
            a.a(am);
        }
    }

    public void a(an an)
    {
        if (a != null)
        {
            a.a(an);
        }
    }

    public void a(ao ao)
    {
        if (a != null)
        {
            a.a(ao);
        }
    }

    public void a(ap ap)
    {
        if (a != null)
        {
            a.a(ap);
        }
    }

    public void a(aq aq)
    {
        if (a != null)
        {
            a.a(aq);
        }
    }

    public void a(ar ar)
    {
        if (a != null)
        {
            a.a(ar);
        }
    }

    public void a(as as)
    {
        a(((g) (as)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((as)g1);
            }

            public void a(as as1)
            {
                if (a.a != null)
                {
                    a.a.a(as1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(au au)
    {
        a(((g) (au)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((au)g1);
            }

            public void a(au au1)
            {
                if (a.a != null)
                {
                    a.a.a(au1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(ax ax)
    {
        a(((g) (ax)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((ax)g1);
            }

            public void a(ax ax1)
            {
                if (a.a != null)
                {
                    a.a.a(ax1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(ay ay)
    {
        a(((g) (ay)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((ay)g1);
            }

            public void a(ay ay1)
            {
                if (a.a != null)
                {
                    a.a.a(ay1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(p.bg.b b1)
    {
        a(((g) (b1)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((p.bg.b)g1);
            }

            public void a(p.bg.b b2)
            {
                if (a.a != null)
                {
                    a.a.a(b2);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bb bb)
    {
        a(((g) (bb)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bb)g1);
            }

            public void a(bb bb1)
            {
                if (a.a != null)
                {
                    a.a.a(bb1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bc bc)
    {
        a(((g) (bc)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bc)g1);
            }

            public void a(bc bc1)
            {
                if (a.a != null)
                {
                    a.a.a(bc1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(be be)
    {
        a(((g) (be)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((be)g1);
            }

            public void a(be be1)
            {
                if (a.a != null)
                {
                    a.a.a(be1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bf bf)
    {
        a(((g) (bf)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bf)g1);
            }

            public void a(bf bf1)
            {
                if (a.a != null)
                {
                    a.a.a(bf1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bh bh)
    {
        a(((g) (bh)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bh)g1);
            }

            public void a(bh bh1)
            {
                if (a.a != null)
                {
                    a.a.a(bh1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bj bj)
    {
        a(((g) (bj)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bj)g1);
            }

            public void a(bj bj1)
            {
                if (a.a != null)
                {
                    a.a.a(bj1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bl bl)
    {
        a(((g) (bl)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bl)g1);
            }

            public void a(bl bl1)
            {
                if (a.a != null)
                {
                    a.a.a(bl1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bm bm)
    {
        a(((g) (bm)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bm)g1);
            }

            public void a(bm bm1)
            {
                if (a.a != null)
                {
                    a.a.a(bm1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bq bq)
    {
        a(((g) (bq)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bq)g1);
            }

            public void a(bq bq1)
            {
                if (a.a != null)
                {
                    a.a.a(bq1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bt bt)
    {
        a(((g) (bt)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bt)g1);
            }

            public void a(bt bt1)
            {
                if (a.a != null)
                {
                    a.a.a(bt1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bu bu)
    {
        a(((g) (bu)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bu)g1);
            }

            public void a(bu bu1)
            {
                if (a.a != null)
                {
                    a.a.a(bu1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(bx bx)
    {
        a(((g) (bx)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((bx)g1);
            }

            public void a(bx bx1)
            {
                if (a.a != null)
                {
                    a.a.a(bx1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(cb cb)
    {
        a(((g) (cb)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((cb)g1);
            }

            public void a(cb cb1)
            {
                if (a.a != null)
                {
                    a.a.a(cb1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(cc cc)
    {
        a(((g) (cc)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((cc)g1);
            }

            public void a(cc cc1)
            {
                if (a.a != null)
                {
                    a.a.a(cc1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(d d)
    {
        a(((g) (d)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((d)g1);
            }

            public void a(d d1)
            {
                if (a.a != null)
                {
                    a.a.a(d1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(f f)
    {
        a(((g) (f)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((f)g1);
            }

            public void a(f f1)
            {
                if (a.a != null)
                {
                    a.a.a(f1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(i i)
    {
        a(((g) (i)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((i)g1);
            }

            public void a(i j)
            {
                if (a.a != null)
                {
                    a.a.a(j);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(l l)
    {
        a(((g) (l)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((l)g1);
            }

            public void a(l l1)
            {
                if (a.a != null)
                {
                    a.a.a(l1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(m m)
    {
        a(((g) (m)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((m)g1);
            }

            public void a(m m1)
            {
                if (a.a != null)
                {
                    a.a.a(m1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(o o)
    {
        a(((g) (o)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((o)g1);
            }

            public void a(o o1)
            {
                if (a.a != null)
                {
                    a.a.a(o1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(q q)
    {
        a(((g) (q)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((q)g1);
            }

            public void a(q q1)
            {
                if (a.a != null)
                {
                    a.a.a(q1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(r r)
    {
        a(((g) (r)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((r)g1);
            }

            public void a(r r1)
            {
                if (a.a != null)
                {
                    a.a.a(r1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(s s)
    {
        a(((g) (s)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((s)g1);
            }

            public void a(s s1)
            {
                if (a.a != null)
                {
                    a.a.a(s1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(u u)
    {
        a(((g) (u)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((u)g1);
            }

            public void a(u u1)
            {
                if (a.a != null)
                {
                    a.a.a(u1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(v v)
    {
        a(((g) (v)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((v)g1);
            }

            public void a(v v1)
            {
                if (a.a != null)
                {
                    a.a.a(v1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(p.bg.w w)
    {
        a(((g) (w)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((p.bg.w)g1);
            }

            public void a(p.bg.w w1)
            {
                if (a.a != null)
                {
                    a.a.a(w1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public void a(x x)
    {
        a(((g) (x)), new p.cv.c() {

            final b a;

            public volatile void a(g g1)
            {
                a((x)g1);
            }

            public void a(x x1)
            {
                if (a.a != null)
                {
                    a.a.a(x1);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public e b(c c1)
    {
        if (c1 != null)
        {
            e e1 = c1.a();
            if (e1 != null)
            {
                e1.a(new Integer(b.getAndIncrement()));
                c1 = c1.b();
                if (c1 != null && c != null)
                {
                    c.put(e1.c(), c1);
                }
                return e1;
            }
        }
        return null;
    }

    public void b(a a1)
    {
        if (a != null)
        {
            a.b(a1);
        }
    }
}
