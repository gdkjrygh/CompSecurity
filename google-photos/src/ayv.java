// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ayv
    implements ayo, ayu, azg, bao
{

    private static final jw a = bai.a(150, new ayw());
    private final String b = String.valueOf(hashCode());
    private final baq c = baq.a();
    private ayp d;
    private ama e;
    private Object f;
    private Class g;
    private aym h;
    private int i;
    private int j;
    private amb k;
    private azh l;
    private ays m;
    private apf n;
    private azr o;
    private aqa p;
    private apk q;
    private long r;
    private int s;
    private Drawable t;
    private Drawable u;
    private Drawable v;
    private int w;
    private int x;

    ayv()
    {
    }

    private Drawable a(int i1)
    {
        return b.a(e.getResources(), i1, h.t);
    }

    public static ayv a(ama ama1, Object obj, Class class1, aym aym1, int i1, int j1, amb amb, azh azh1, 
            ays ays1, ayp ayp1, apf apf1, azr azr1)
    {
        ayv ayv2 = (ayv)a.a();
        ayv ayv1 = ayv2;
        if (ayv2 == null)
        {
            ayv1 = new ayv();
        }
        ayv1.e = ama1;
        ayv1.f = obj;
        ayv1.g = class1;
        ayv1.h = aym1;
        ayv1.i = i1;
        ayv1.j = j1;
        ayv1.k = amb;
        ayv1.l = azh1;
        ayv1.m = ays1;
        ayv1.d = ayp1;
        ayv1.n = apf1;
        ayv1.o = azr1;
        ayv1.s = ayx.a;
        return ayv1;
    }

    private void a(aqa aqa1)
    {
        bag.a();
        if (aqa1 instanceof apt)
        {
            ((apt)aqa1).f();
            p = null;
            return;
        } else
        {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
    }

    private void a(String s1)
    {
        String s2 = b;
        (new StringBuilder(String.valueOf(s1).length() + 7 + String.valueOf(s2).length())).append(s1).append(" this: ").append(s2);
    }

    private Drawable j()
    {
        if (u == null)
        {
            u = h.f;
            if (u == null && h.g > 0)
            {
                u = a(h.g);
            }
        }
        return u;
    }

    private boolean k()
    {
        return d == null || d.b(this);
    }

    private boolean l()
    {
        return d == null || !d.b();
    }

    public final void a()
    {
        c.b();
        r = bac.a();
        if (f == null)
        {
            if (bag.a(i, j))
            {
                w = i;
                x = j;
            }
            a(new apv("Received null model"));
        } else
        {
            s = ayx.c;
            if (bag.a(i, j))
            {
                a(i, j);
            } else
            {
                l.a(this);
            }
            if ((s == ayx.b || s == ayx.c) && k())
            {
                l.b(j());
            }
            if (Log.isLoggable("Request", 2))
            {
                double d1 = bac.a(r);
                a((new StringBuilder(47)).append("finished run method in ").append(d1).toString());
                return;
            }
        }
    }

    public final void a(int i1, int j1)
    {
        c.b();
        if (Log.isLoggable("Request", 2))
        {
            double d1 = bac.a(r);
            a((new StringBuilder(43)).append("Got onSizeReady in ").append(d1).toString());
        }
        if (s == ayx.c) goto _L2; else goto _L1
_L1:
        return;
_L2:
        apr apr1;
        apf apf1;
        ama ama1;
        Object obj2;
        ane ane;
        Class class1;
        Class class2;
        amb amb;
        apa apa;
        Map map;
        ani ani;
        long l1;
        boolean flag;
        boolean flag1;
        s = ayx.b;
        float f1 = h.a;
        w = Math.round((float)i1 * f1);
        x = Math.round(f1 * (float)j1);
        if (Log.isLoggable("Request", 2))
        {
            double d2 = bac.a(r);
            a((new StringBuilder(59)).append("finished setup for calling load in ").append(d2).toString());
        }
        apf1 = n;
        ama1 = e;
        obj2 = f;
        ane = h.k;
        i1 = w;
        j1 = x;
        class1 = h.r;
        class2 = g;
        amb = k;
        apa = h.b;
        map = h.q;
        flag = h.l;
        ani = h.p;
        flag1 = h.h;
        bag.a();
        l1 = bac.a();
        apr1 = new apr(obj2, ane, i1, j1, map, class1, class2, ani);
        if (flag1) goto _L4; else goto _L3
_L3:
        Object obj1 = null;
_L5:
        Object obj;
        if (obj1 != null)
        {
            a(((aqa) (obj1)), amz.e);
            if (Log.isLoggable("Engine", 2))
            {
                apf.a("Loaded resource from cache", l1, apr1);
            }
            obj = null;
        } else
        {
            if (!flag1)
            {
                obj = null;
            } else
            {
                obj = (WeakReference)apf1.d.get(apr1);
                apn apn1;
                aop aop1;
                aou aou;
                int k1;
                if (obj != null)
                {
                    obj = (apt)((WeakReference) (obj)).get();
                    if (obj != null)
                    {
                        ((apt) (obj)).e();
                    } else
                    {
                        apf1.d.remove(apr1);
                    }
                } else
                {
                    obj = null;
                }
            }
            if (obj != null)
            {
                a(((aqa) (obj)), amz.e);
                if (Log.isLoggable("Engine", 2))
                {
                    apf.a("Loaded resource from active resources", l1, apr1);
                }
                obj = null;
            } else
            {
                obj = (apn)apf1.a.get(apr1);
                if (obj != null)
                {
                    ((apn) (obj)).a(this);
                    if (Log.isLoggable("Engine", 2))
                    {
                        apf.a("Added to existing load", l1, apr1);
                    }
                    obj = new apk(this, ((apn) (obj)));
                } else
                {
                    apn1 = (apn)apf1.c.d.a();
                    apn1.f = apr1;
                    apn1.g = flag1;
                    obj = apf1.e;
                    aop1 = (aop)((apg) (obj)).b.a();
                    k1 = ((apg) (obj)).c;
                    obj.c = k1 + 1;
                    obj = aop1.a;
                    aou = aop1.b;
                    obj.c = ama1;
                    obj.d = obj2;
                    obj.n = ane;
                    obj.e = i1;
                    obj.f = j1;
                    obj.p = apa;
                    obj.g = class1;
                    obj.h = aou;
                    obj.k = class2;
                    obj.o = amb;
                    obj.i = ani;
                    obj.j = map;
                    obj.q = flag;
                    aop1.d = ama1;
                    aop1.e = ane;
                    aop1.f = amb;
                    aop1.g = apr1;
                    aop1.h = i1;
                    aop1.i = j1;
                    aop1.j = apa;
                    aop1.k = ani;
                    aop1.l = apn1;
                    aop1.m = k1;
                    aop1.n = aow.a;
                    apf1.a.put(apr1, apn1);
                    apn1.a(this);
                    apn1.k = aop1;
                    obj = aop1.a(aox.a);
                    if (obj == aox.b || obj == aox.c)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 != 0)
                    {
                        obj = apn1.d;
                    } else
                    {
                        obj = apn1.e;
                    }
                    ((arw) (obj)).execute(aop1);
                    if (Log.isLoggable("Engine", 2))
                    {
                        apf.a("Started new load", l1, apr1);
                    }
                    obj = new apk(this, apn1);
                }
            }
        }
        q = ((apk) (obj));
        if (Log.isLoggable("Request", 2))
        {
            double d3 = bac.a(r);
            a((new StringBuilder(48)).append("finished onSizeReady in ").append(d3).toString());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        obj = apf1.b.a(apr1);
        if (obj == null)
        {
            obj = null;
        } else
        if (obj instanceof apt)
        {
            obj = (apt)obj;
        } else
        {
            obj = new apt(((aqa) (obj)), true);
        }
        obj1 = obj;
        if (obj != null)
        {
            ((apt) (obj)).e();
            apf1.d.put(apr1, new apm(apr1, ((apt) (obj)), apf1.a()));
            obj1 = obj;
        }
          goto _L5
    }

    public final void a(apv apv1)
    {
        c.b();
        int i1 = e.e;
        if (i1 <= 5)
        {
            String s1 = String.valueOf(f);
            int j1 = w;
            int k1 = x;
            Log.w("Glide", (new StringBuilder(String.valueOf(s1).length() + 52)).append("Load failed for ").append(s1).append(" with size [").append(j1).append("x").append(k1).append("]").toString(), apv1);
            if (i1 <= 4)
            {
                apv1.a("Glide");
            }
        }
        q = null;
        s = ayx.e;
        if (m != null)
        {
            ays ays1 = m;
            l();
            ays1.a(apv1);
        }
        if (k())
        {
            Object obj;
            if (f == null)
            {
                if (v == null)
                {
                    v = h.n;
                    if (v == null && h.o > 0)
                    {
                        v = a(h.o);
                    }
                }
                apv1 = v;
            } else
            {
                if (t == null)
                {
                    t = h.d;
                    if (t == null && h.e > 0)
                    {
                        t = a(h.e);
                    }
                }
                apv1 = t;
            }
            obj = apv1;
            if (apv1 == null)
            {
                obj = j();
            }
            l.c(((Drawable) (obj)));
        }
    }

    public final void a(aqa aqa1, amz amz1)
    {
        c.b();
        q = null;
        if (aqa1 == null)
        {
            aqa1 = String.valueOf("Expected to receive a Resource<R> with an object of ");
            amz1 = String.valueOf(g);
            a(new apv((new StringBuilder(String.valueOf(aqa1).length() + 30 + String.valueOf(amz1).length())).append(aqa1).append(amz1).append(" inside, but instead got null.").toString()));
        } else
        {
            Object obj = aqa1.b();
            if (obj == null || !g.isAssignableFrom(obj.getClass()))
            {
                a(aqa1);
                String s1 = String.valueOf(g);
                String s3;
                String s5;
                if (obj != null)
                {
                    amz1 = obj.getClass();
                } else
                {
                    amz1 = "";
                }
                amz1 = String.valueOf(amz1);
                s3 = String.valueOf(obj);
                s5 = String.valueOf(aqa1);
                if (obj != null)
                {
                    aqa1 = "";
                } else
                {
                    aqa1 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                }
                a(new apv((new StringBuilder(String.valueOf(s1).length() + 71 + String.valueOf(amz1).length() + String.valueOf(s3).length() + String.valueOf(s5).length() + String.valueOf(aqa1).length())).append("Expected to receive an object of ").append(s1).append(" but instead got ").append(amz1).append("{").append(s3).append("} inside ").append("Resource{").append(s5).append("}.").append(aqa1).toString()));
                return;
            }
            boolean flag;
            if (d == null || d.a(this))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                a(aqa1);
                s = ayx.d;
                return;
            }
            boolean flag1 = l();
            s = ayx.d;
            p = aqa1;
            if (e.e <= 3)
            {
                aqa1 = String.valueOf(obj.getClass().getSimpleName());
                String s2 = String.valueOf(amz1);
                String s4 = String.valueOf(f);
                int i1 = w;
                int j1 = x;
                double d1 = bac.a(r);
                (new StringBuilder(String.valueOf(aqa1).length() + 95 + String.valueOf(s2).length() + String.valueOf(s4).length())).append("Finished loading ").append(aqa1).append(" from ").append(s2).append(" for ").append(s4).append(" with size [").append(i1).append("x").append(j1).append("] in ").append(d1).append(" ms");
            }
            if (m == null || !m.a(obj, f, l, amz1, flag1))
            {
                aqa1 = o.a(amz1, flag1);
                l.a(obj, aqa1);
            }
            if (d != null)
            {
                d.c(this);
                return;
            }
        }
    }

    public final void c()
    {
        d();
        s = ayx.h;
    }

    public final void d()
    {
        bag.a();
        if (s == ayx.g)
        {
            return;
        }
        c.b();
        s = ayx.f;
        if (q == null) goto _L2; else goto _L1
_L1:
        apn apn1;
        Object obj;
        obj = q;
        apn1 = ((apk) (obj)).a;
        obj = ((apk) (obj)).b;
        bag.a();
        apn1.b.b();
        if (!apn1.h && !apn1.i) goto _L4; else goto _L3
_L3:
        if (apn1.j == null)
        {
            apn1.j = new ArrayList(2);
        }
        if (!apn1.j.contains(obj))
        {
            apn1.j.add(obj);
        }
_L6:
        q = null;
_L2:
        if (p != null)
        {
            a(p);
        }
        if (k())
        {
            l.a(j());
        }
        s = ayx.g;
        return;
_L4:
        apn1.a.remove(obj);
        if (apn1.a.isEmpty() && !apn1.i && !apn1.h && !apn1.l)
        {
            apn1.l = true;
            Object obj1 = apn1.k;
            obj1.p = true;
            obj1 = ((aop) (obj1)).o;
            if (obj1 != null)
            {
                ((aom) (obj1)).b();
            }
            boolean flag;
            if (apn1.d.remove(apn1.k) || apn1.e.remove(apn1.k))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            apn1.c.a(apn1, apn1.f);
            if (flag)
            {
                apn1.a(true);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean e()
    {
        return s == ayx.b || s == ayx.c;
    }

    public final boolean f()
    {
        return s == ayx.d;
    }

    public final boolean g()
    {
        return f();
    }

    public final boolean h()
    {
        return s == ayx.f || s == ayx.g;
    }

    public final void i()
    {
        e = null;
        f = null;
        g = null;
        h = null;
        i = -1;
        j = -1;
        l = null;
        m = null;
        d = null;
        o = null;
        q = null;
        t = null;
        u = null;
        v = null;
        w = -1;
        x = -1;
        a.a(this);
    }

    public final baq q_()
    {
        return c;
    }

}
