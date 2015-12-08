// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import com.microsoft.a.a;
import com.microsoft.a.c;
import com.microsoft.a.d;
import com.microsoft.a.f;
import com.microsoft.a.i;
import com.microsoft.a.j;
import com.microsoft.a.k;
import com.microsoft.a.l;
import com.microsoft.a.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package a.a.a:
//            k, i, a, c, 
//            j, g, d

public final class h
{
    public static final class a
    {

        private static final d A;
        private static final d B;
        private static final d C;
        private static final d D;
        private static final d E;
        private static final d F;
        private static final d G;
        public static final j a;
        public static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;
        private static final d h;
        private static final d i;
        private static final d j;
        private static final d k;
        private static final d l;
        private static final d m;
        private static final d n;
        private static final d o;
        private static final d p;
        private static final d q;
        private static final d r;
        private static final d s;
        private static final d t;
        private static final d u;
        private static final d v;
        private static final d w;
        private static final d x;
        private static final d y;
        private static final d z;

        static d A()
        {
            return C;
        }

        static d B()
        {
            return D;
        }

        static d C()
        {
            return E;
        }

        static d D()
        {
            return F;
        }

        static d E()
        {
            return G;
        }

        static d a()
        {
            return c;
        }

        static d b()
        {
            return d;
        }

        static d c()
        {
            return e;
        }

        static d d()
        {
            return f;
        }

        static d e()
        {
            return g;
        }

        static d f()
        {
            return h;
        }

        static d g()
        {
            return i;
        }

        static d h()
        {
            return j;
        }

        static d i()
        {
            return k;
        }

        static d j()
        {
            return l;
        }

        static d k()
        {
            return m;
        }

        static d l()
        {
            return n;
        }

        static d m()
        {
            return o;
        }

        static d n()
        {
            return p;
        }

        static d o()
        {
            return q;
        }

        static d p()
        {
            return r;
        }

        static d q()
        {
            return s;
        }

        static d r()
        {
            return t;
        }

        static d s()
        {
            return u;
        }

        static d t()
        {
            return v;
        }

        static d u()
        {
            return w;
        }

        static d v()
        {
            return x;
        }

        static d w()
        {
            return y;
        }

        static d x()
        {
            return z;
        }

        static d y()
        {
            return A;
        }

        static d z()
        {
            return B;
        }

        static 
        {
            short word0;
            Object obj;
            l l1;
            obj = new d();
            b = ((d) (obj));
            ((d) (obj)).a("Record");
            b.b("clienttelemetry.data.v3.Record");
            obj = new d();
            c = ((d) (obj));
            ((d) (obj)).a("Id");
            obj = new d();
            d = ((d) (obj));
            ((d) (obj)).a("Context");
            obj = new d();
            e = ((d) (obj));
            ((d) (obj)).a("Timestamp");
            e.a().a(0L);
            obj = new d();
            f = ((d) (obj));
            ((d) (obj)).a("ConfigurationIds");
            obj = new d();
            g = ((d) (obj));
            ((d) (obj)).a("Type");
            obj = new d();
            h = ((d) (obj));
            ((d) (obj)).a("EventType");
            obj = new d();
            i = ((d) (obj));
            ((d) (obj)).a("ResultCode");
            i.a().a(0L);
            obj = new d();
            j = ((d) (obj));
            ((d) (obj)).a("ResultDetail");
            obj = new d();
            k = ((d) (obj));
            ((d) (obj)).a("ResultValue");
            obj = new d();
            l = ((d) (obj));
            ((d) (obj)).a("InitiatingUser");
            obj = new d();
            m = ((d) (obj));
            ((d) (obj)).a("InitiatingUserEndpoint");
            obj = new d();
            n = ((d) (obj));
            ((d) (obj)).a("TargetUsers");
            obj = new d();
            o = ((d) (obj));
            ((d) (obj)).a("Extension");
            obj = new d();
            p = ((d) (obj));
            ((d) (obj)).a("SampleTimestamp");
            p.a().a(0L);
            obj = new d();
            q = ((d) (obj));
            ((d) (obj)).a("SampleRate");
            obj = new d();
            r = ((d) (obj));
            ((d) (obj)).a("SamplingData");
            obj = new d();
            s = ((d) (obj));
            ((d) (obj)).a("InitiatingUiVersion");
            obj = new d();
            t = ((d) (obj));
            ((d) (obj)).a("PstnNumbers");
            obj = new d();
            u = ((d) (obj));
            ((d) (obj)).a("ContextIds");
            obj = new d();
            v = ((d) (obj));
            ((d) (obj)).a("InitiatingUserEndpointType");
            obj = new d();
            w = ((d) (obj));
            ((d) (obj)).a("DeprecatedInitiatingUserComposite");
            obj = new d();
            x = ((d) (obj));
            ((d) (obj)).a("DeprecatedTargetUsersComposite");
            obj = new d();
            y = ((d) (obj));
            ((d) (obj)).a("PstnNumbersComposite");
            obj = new d();
            z = ((d) (obj));
            ((d) (obj)).a("RecordType");
            z.a().a(a.a.a.i.a.a());
            obj = new d();
            A = ((d) (obj));
            ((d) (obj)).a("ExtensionInt64");
            obj = new d();
            B = ((d) (obj));
            ((d) (obj)).a("_reserved");
            obj = new d();
            C = ((d) (obj));
            ((d) (obj)).a("ConferenceComposite");
            obj = new d();
            D = ((d) (obj));
            ((d) (obj)).a("ExceptionInfo");
            obj = new d();
            E = ((d) (obj));
            ((d) (obj)).a("PIIExtensions");
            obj = new d();
            F = ((d) (obj));
            ((d) (obj)).a("InitiatingUserComposite");
            obj = new d();
            G = ((d) (obj));
            ((d) (obj)).a("TargetUsersComposite");
            obj = new j();
            a = ((j) (obj));
            l1 = new l();
            l1.a(com.microsoft.a.a.k);
            word0 = 0;
_L3:
            if (word0 >= ((j) (obj)).a().size())
            {
                break MISSING_BLOCK_LABEL_709;
            }
            if (((k)((j) (obj)).a().get(word0)).a() != b) goto _L2; else goto _L1
_L1:
            l1.a(word0);
            ((j) (obj)).a(l1);
            return;
_L2:
            word0++;
              goto _L3
            k k1 = new k();
            ((j) (obj)).a().add(k1);
            k1.a(b);
            c c1 = new c();
            c1.a((short)1);
            c1.a(c);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)2);
            c1.a(d);
            c1.a().a(com.microsoft.a.a.l);
            c1.a().a(new l());
            c1.a().a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)3);
            c1.a(e);
            c1.a().a(com.microsoft.a.a.r);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)4);
            c1.a(f);
            c1.a().a(com.microsoft.a.a.n);
            c1.a().b(new l());
            c1.a().a(new l());
            c1.a().b().a(com.microsoft.a.a.j);
            c1.a().a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)5);
            c1.a(g);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)6);
            c1.a(h);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)7);
            c1.a(i);
            c1.a().a(com.microsoft.a.a.q);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)8);
            c1.a(j);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)9);
            c1.a(k);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)10);
            c1.a(l);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)11);
            c1.a(m);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)12);
            c1.a(n);
            c1.a().a(com.microsoft.a.a.l);
            c1.a().a(new l());
            c1.a().a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)13);
            c1.a(o);
            c1.a().a(com.microsoft.a.a.n);
            c1.a().b(new l());
            c1.a().a(new l());
            c1.a().b().a(com.microsoft.a.a.j);
            c1.a().a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)14);
            c1.a(p);
            c1.a().a(com.microsoft.a.a.r);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)15);
            c1.a(q);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)16);
            c1.a(r);
            c1.a().a(com.microsoft.a.a.n);
            c1.a().b(new l());
            c1.a().a(new l());
            c1.a().b().a(com.microsoft.a.a.j);
            c1.a().a().a(com.microsoft.a.a.l);
            c1.a().a().a(new l());
            c1.a().a().a().a(com.microsoft.a.a.r);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)17);
            c1.a(s);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)18);
            c1.a(t);
            c1.a().a(com.microsoft.a.a.n);
            c1.a().b(new l());
            c1.a().a(new l());
            c1.a().b().a(com.microsoft.a.a.j);
            c1.a().a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)19);
            c1.a(u);
            c1.a().a(com.microsoft.a.a.n);
            c1.a().b(new l());
            c1.a().a(new l());
            c1.a().b().a(com.microsoft.a.a.j);
            c1.a().a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)20);
            c1.a(v);
            c1.a().a(com.microsoft.a.a.j);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)21);
            c1.a(w);
            c1.a(a.a.a.k.a.a(((j) (obj))));
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)22);
            c1.a(x);
            c1.a().a(com.microsoft.a.a.l);
            c1.a().a(new l());
            c1.a().a(a.a.a.k.a.a(((j) (obj))));
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)23);
            c1.a(y);
            c1.a().a(com.microsoft.a.a.n);
            c1.a().b(new l());
            c1.a().a(new l());
            c1.a().b().a(com.microsoft.a.a.j);
            c1.a().a(a.a.a.g.a.a(((j) (obj))));
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)24);
            c1.a(z);
            c1.a().a(com.microsoft.a.a.q);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)25);
            c1.a(A);
            c1.a().a(com.microsoft.a.a.n);
            c1.a().b(new l());
            c1.a().a(new l());
            c1.a().b().a(com.microsoft.a.a.j);
            c1.a().a().a(com.microsoft.a.a.r);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)26);
            c1.a(B);
            c1.a().a(com.microsoft.a.a.n);
            c1.a().b(new l());
            c1.a().a(new l());
            c1.a().b().a(com.microsoft.a.a.j);
            c1.a().a().a(com.microsoft.a.a.i);
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)28);
            c1.a(C);
            c1.a(a.a.a.a.a.a(((j) (obj))));
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)29);
            c1.a(D);
            c1.a(a.a.a.c.a.a(((j) (obj))));
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)30);
            c1.a(E);
            c1.a().a(com.microsoft.a.a.n);
            c1.a().b(new l());
            c1.a().a(new l());
            c1.a().b().a(com.microsoft.a.a.j);
            c1.a().a(a.a.a.d.a.a(((j) (obj))));
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)31);
            c1.a(F);
            c1.a(a.a.a.j.a.a(((j) (obj))));
            k1.b().add(c1);
            c1 = new c();
            c1.a((short)32);
            c1.a(G);
            c1.a().a(com.microsoft.a.a.l);
            c1.a().a(new l());
            c1.a().a(a.a.a.j.a.a(((j) (obj))));
            k1.b().add(c1);
              goto _L1
        }
    }


    private a.a.a.a A;
    private a.a.a.c B;
    private HashMap C;
    private a.a.a.j D;
    private ArrayList E;
    private String a;
    private ArrayList b;
    private long c;
    private HashMap d;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;
    private String k;
    private ArrayList l;
    private HashMap m;
    private long n;
    private String o;
    private HashMap p;
    private String q;
    private HashMap r;
    private HashMap s;
    private String t;
    private a.a.a.k u;
    private ArrayList v;
    private HashMap w;
    private a.a.a.i x;
    private HashMap y;
    private HashMap z;

    public h()
    {
        a = "";
        if (b == null)
        {
            b = new ArrayList();
        } else
        {
            b.clear();
        }
        c = 0L;
        if (d == null)
        {
            d = new HashMap();
        } else
        {
            d.clear();
        }
        e = "";
        f = "";
        g = 0;
        h = "";
        i = "";
        j = "";
        k = "";
        if (l == null)
        {
            l = new ArrayList();
        } else
        {
            l.clear();
        }
        if (m == null)
        {
            m = new HashMap();
        } else
        {
            m.clear();
        }
        n = 0L;
        o = "";
        if (p == null)
        {
            p = new HashMap();
        } else
        {
            p.clear();
        }
        q = "";
        if (r == null)
        {
            r = new HashMap();
        } else
        {
            r.clear();
        }
        if (s == null)
        {
            s = new HashMap();
        } else
        {
            s.clear();
        }
        t = "";
        u = new a.a.a.k();
        if (v == null)
        {
            v = new ArrayList();
        } else
        {
            v.clear();
        }
        if (w == null)
        {
            w = new HashMap();
        } else
        {
            w.clear();
        }
        a = UUID.randomUUID().toString();
        c = System.currentTimeMillis();
        x = a.a.a.i.a;
        if (y == null)
        {
            y = new HashMap();
        } else
        {
            y.clear();
        }
        if (z == null)
        {
            z = new HashMap();
        } else
        {
            z.clear();
        }
        A = new a.a.a.a();
        B = new a.a.a.c();
        if (C == null)
        {
            C = new HashMap();
        } else
        {
            C.clear();
        }
        D = new a.a.a.j();
        if (E == null)
        {
            E = new ArrayList();
            return;
        } else
        {
            E.clear();
            return;
        }
    }

    public final long a()
    {
        return c;
    }

    public final void a(long l1)
    {
        c = l1;
    }

    public final void a(a.a.a.a a1)
    {
        A = a1;
    }

    public final void a(a.a.a.i i1)
    {
        x = i1;
    }

    public final void a(a.a.a.j j1)
    {
        D = j1;
    }

    public final void a(i i1)
        throws IOException
    {
        boolean flag = i1.a(f.d);
        Object obj = a.b;
        int j1;
        if (!flag || a != a.a.a.a.a().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.a();
            i1.a(((com.microsoft.a.a) (obj)), 1);
            i1.a(a);
        } else
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.a();
        }
        j1 = b.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.l;
            a.b();
            i1.a(((com.microsoft.a.a) (obj)), 2);
            i1.a(j1, com.microsoft.a.a.j);
            for (obj = b.iterator(); ((Iterator) (obj)).hasNext(); i1.a((String)((Iterator) (obj)).next())) { }
        } else
        {
            obj = com.microsoft.a.a.l;
            a.b();
        }
        if (!flag || c != a.a.a.a.c().a().a())
        {
            obj = com.microsoft.a.a.r;
            a.a.a.a.c();
            i1.a(((com.microsoft.a.a) (obj)), 3);
            i1.a(c);
        } else
        {
            obj = com.microsoft.a.a.r;
            a.a.a.a.c();
        }
        j1 = d.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.n;
            a.a.a.a.d();
            i1.a(((com.microsoft.a.a) (obj)), 4);
            i1.a(d.size(), com.microsoft.a.a.j, com.microsoft.a.a.j);
            java.util.Map.Entry entry;
            for (obj = d.entrySet().iterator(); ((Iterator) (obj)).hasNext(); i1.a((String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                i1.a((String)entry.getKey());
            }

        } else
        {
            obj = com.microsoft.a.a.n;
            a.a.a.a.d();
        }
        if (!flag || e != a.e().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.e();
            i1.a(((com.microsoft.a.a) (obj)), 5);
            i1.a(e);
        } else
        {
            obj = com.microsoft.a.a.j;
            a.e();
        }
        if (!flag || f != a.a.a.a.f().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.f();
            i1.a(((com.microsoft.a.a) (obj)), 6);
            i1.a(f);
        } else
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.f();
        }
        if (!flag || (long)g != a.g().a().a())
        {
            obj = com.microsoft.a.a.q;
            a.g();
            i1.a(((com.microsoft.a.a) (obj)), 7);
            i1.a(g);
        } else
        {
            obj = com.microsoft.a.a.q;
            a.g();
        }
        if (!flag || h != a.h().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.h();
            i1.a(((com.microsoft.a.a) (obj)), 8);
            i1.a(h);
        } else
        {
            obj = com.microsoft.a.a.j;
            a.h();
        }
        if (!flag || i != a.a.a.a.i().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.i();
            i1.a(((com.microsoft.a.a) (obj)), 9);
            i1.a(i);
        } else
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.i();
        }
        if (!flag || j != a.a.a.a.j().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.j();
            i1.a(((com.microsoft.a.a) (obj)), 10);
            i1.a(j);
        } else
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.j();
        }
        if (!flag || k != a.a.a.a.k().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.k();
            i1.a(((com.microsoft.a.a) (obj)), 11);
            i1.a(k);
        } else
        {
            obj = com.microsoft.a.a.j;
            a.a.a.a.k();
        }
        j1 = l.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.l;
            a.a.a.a.l();
            i1.a(((com.microsoft.a.a) (obj)), 12);
            i1.a(j1, com.microsoft.a.a.j);
            for (obj = l.iterator(); ((Iterator) (obj)).hasNext(); i1.a((String)((Iterator) (obj)).next())) { }
        } else
        {
            obj = com.microsoft.a.a.l;
            a.a.a.a.l();
        }
        j1 = m.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.n;
            a.a.a.a.m();
            i1.a(((com.microsoft.a.a) (obj)), 13);
            i1.a(m.size(), com.microsoft.a.a.j, com.microsoft.a.a.j);
            java.util.Map.Entry entry1;
            for (obj = m.entrySet().iterator(); ((Iterator) (obj)).hasNext(); i1.a((String)entry1.getValue()))
            {
                entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                i1.a((String)entry1.getKey());
            }

        } else
        {
            obj = com.microsoft.a.a.n;
            a.a.a.a.m();
        }
        if (!flag || n != a.n().a().a())
        {
            obj = com.microsoft.a.a.r;
            a.n();
            i1.a(((com.microsoft.a.a) (obj)), 14);
            i1.a(n);
        } else
        {
            obj = com.microsoft.a.a.r;
            a.n();
        }
        if (!flag || o != a.o().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.o();
            i1.a(((com.microsoft.a.a) (obj)), 15);
            i1.a(o);
        } else
        {
            obj = com.microsoft.a.a.j;
            a.o();
        }
        j1 = p.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.n;
            a.p();
            i1.a(((com.microsoft.a.a) (obj)), 16);
            i1.a(p.size(), com.microsoft.a.a.j, com.microsoft.a.a.l);
            for (obj = p.entrySet().iterator(); ((Iterator) (obj)).hasNext();)
            {
                Object obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                i1.a((String)((java.util.Map.Entry) (obj1)).getKey());
                i1.a(((ArrayList)((java.util.Map.Entry) (obj1)).getValue()).size(), com.microsoft.a.a.r);
                obj1 = ((ArrayList)((java.util.Map.Entry) (obj1)).getValue()).iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    i1.a(((Long)((Iterator) (obj1)).next()).longValue());
                }
            }

        } else
        {
            obj = com.microsoft.a.a.n;
            a.p();
        }
        if (!flag || q != a.q().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.q();
            i1.a(((com.microsoft.a.a) (obj)), 17);
            i1.a(q);
        } else
        {
            obj = com.microsoft.a.a.j;
            a.q();
        }
        j1 = r.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.n;
            a.r();
            i1.a(((com.microsoft.a.a) (obj)), 18);
            i1.a(r.size(), com.microsoft.a.a.j, com.microsoft.a.a.j);
            java.util.Map.Entry entry2;
            for (obj = r.entrySet().iterator(); ((Iterator) (obj)).hasNext(); i1.a((String)entry2.getValue()))
            {
                entry2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                i1.a((String)entry2.getKey());
            }

        } else
        {
            obj = com.microsoft.a.a.n;
            a.r();
        }
        j1 = s.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.n;
            a.s();
            i1.a(((com.microsoft.a.a) (obj)), 19);
            i1.a(s.size(), com.microsoft.a.a.j, com.microsoft.a.a.j);
            java.util.Map.Entry entry3;
            for (obj = s.entrySet().iterator(); ((Iterator) (obj)).hasNext(); i1.a((String)entry3.getValue()))
            {
                entry3 = (java.util.Map.Entry)((Iterator) (obj)).next();
                i1.a((String)entry3.getKey());
            }

        } else
        {
            obj = com.microsoft.a.a.n;
            a.s();
        }
        if (!flag || t != a.t().a().b())
        {
            obj = com.microsoft.a.a.j;
            a.t();
            i1.a(((com.microsoft.a.a) (obj)), 20);
            i1.a(t);
        } else
        {
            obj = com.microsoft.a.a.j;
            a.t();
        }
        obj = com.microsoft.a.a.k;
        a.u();
        i1.a(((com.microsoft.a.a) (obj)), 21);
        u.a(i1);
        j1 = v.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.l;
            a.v();
            i1.a(((com.microsoft.a.a) (obj)), 22);
            i1.a(j1, com.microsoft.a.a.k);
            for (obj = v.iterator(); ((Iterator) (obj)).hasNext(); ((a.a.a.k)((Iterator) (obj)).next()).a(i1)) { }
        } else
        {
            obj = com.microsoft.a.a.l;
            a.v();
        }
        j1 = w.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.n;
            a.w();
            i1.a(((com.microsoft.a.a) (obj)), 23);
            i1.a(w.size(), com.microsoft.a.a.j, com.microsoft.a.a.k);
            java.util.Map.Entry entry4;
            for (obj = w.entrySet().iterator(); ((Iterator) (obj)).hasNext(); ((g)entry4.getValue()).a(i1))
            {
                entry4 = (java.util.Map.Entry)((Iterator) (obj)).next();
                i1.a((String)entry4.getKey());
            }

        } else
        {
            obj = com.microsoft.a.a.n;
            a.w();
        }
        if (!flag || (long)x.a() != a.x().a().a())
        {
            obj = com.microsoft.a.a.q;
            a.x();
            i1.a(((com.microsoft.a.a) (obj)), 24);
            i1.a(x.a());
        } else
        {
            obj = com.microsoft.a.a.q;
            a.x();
        }
        j1 = y.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.n;
            a.y();
            i1.a(((com.microsoft.a.a) (obj)), 25);
            i1.a(y.size(), com.microsoft.a.a.j, com.microsoft.a.a.r);
            java.util.Map.Entry entry5;
            for (obj = y.entrySet().iterator(); ((Iterator) (obj)).hasNext(); i1.a(((Long)entry5.getValue()).longValue()))
            {
                entry5 = (java.util.Map.Entry)((Iterator) (obj)).next();
                i1.a((String)entry5.getKey());
            }

        } else
        {
            obj = com.microsoft.a.a.n;
            a.y();
        }
        j1 = z.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.n;
            a.z();
            i1.a(((com.microsoft.a.a) (obj)), 26);
            i1.a(z.size(), com.microsoft.a.a.j, com.microsoft.a.a.i);
            java.util.Map.Entry entry6;
            for (obj = z.entrySet().iterator(); ((Iterator) (obj)).hasNext(); i1.a(((Double)entry6.getValue()).doubleValue()))
            {
                entry6 = (java.util.Map.Entry)((Iterator) (obj)).next();
                i1.a((String)entry6.getKey());
            }

        } else
        {
            obj = com.microsoft.a.a.n;
            a.z();
        }
        obj = com.microsoft.a.a.k;
        a.A();
        i1.a(((com.microsoft.a.a) (obj)), 28);
        A.a(i1);
        obj = com.microsoft.a.a.k;
        a.B();
        i1.a(((com.microsoft.a.a) (obj)), 29);
        B.a(i1);
        j1 = C.size();
        if (!flag || j1 != 0)
        {
            obj = com.microsoft.a.a.n;
            a.C();
            i1.a(((com.microsoft.a.a) (obj)), 30);
            i1.a(C.size(), com.microsoft.a.a.j, com.microsoft.a.a.k);
            java.util.Map.Entry entry7;
            for (obj = C.entrySet().iterator(); ((Iterator) (obj)).hasNext(); ((a.a.a.d)entry7.getValue()).a(i1))
            {
                entry7 = (java.util.Map.Entry)((Iterator) (obj)).next();
                i1.a((String)entry7.getKey());
            }

        } else
        {
            obj = com.microsoft.a.a.n;
            a.C();
        }
        obj = com.microsoft.a.a.k;
        a.D();
        i1.a(((com.microsoft.a.a) (obj)), 31);
        D.a(i1);
        j1 = E.size();
        if (!flag || j1 != 0)
        {
            com.microsoft.a.a a1 = com.microsoft.a.a.l;
            a.E();
            i1.a(a1, 32);
            i1.a(j1, com.microsoft.a.a.k);
            for (Iterator iterator = E.iterator(); iterator.hasNext(); ((a.a.a.j)iterator.next()).a(i1)) { }
        } else
        {
            com.microsoft.a.a a2 = com.microsoft.a.a.l;
            a.E();
        }
        i1.a();
    }

    public final void a(String s1)
    {
        a = s1;
    }

    public final void a(HashMap hashmap)
    {
        d = hashmap;
    }

    public final String b()
    {
        return f;
    }

    public final void b(String s1)
    {
        e = s1;
    }

    public final void b(HashMap hashmap)
    {
        m = hashmap;
    }

    public final ArrayList c()
    {
        return l;
    }

    public final void c(String s1)
    {
        f = s1;
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return null;
    }

    public final HashMap d()
    {
        return s;
    }

    public final void d(String s1)
    {
        i = s1;
    }

    public final ArrayList e()
    {
        return E;
    }

    public final void e(String s1)
    {
        j = s1;
    }
}
