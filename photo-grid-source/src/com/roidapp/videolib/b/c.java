// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import com.roidapp.videolib.gl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.co.cyberagent.android.a.ag;
import jp.co.cyberagent.android.a.h;
import jp.co.cyberagent.android.a.k;

// Referenced classes of package com.roidapp.videolib.b:
//            u, d, l, k, 
//            v, x, e

public class c
{

    private List A;
    private u B[];
    private u C[];
    private int D;
    private e E;
    private long F;
    protected List a;
    protected List b;
    protected List c;
    protected List d;
    protected List e;
    protected List f;
    protected Context g;
    protected h h;
    protected h i;
    protected h j;
    protected k k;
    protected List l;
    protected ag m;
    protected int n;
    protected e o;
    x p[];
    l q[];
    protected com.roidapp.videolib.b.k r;
    protected com.roidapp.videolib.b.k s;
    protected com.roidapp.videolib.b.k t;
    protected long u;
    protected long v;
    protected l w[];
    private u x;
    private long y;
    private int z;

    public c(Context context)
    {
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        l = null;
        n = 640;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = 1000L;
        v = 0L;
        x = u.a;
        y = 5000L;
        z = 0;
        A = new ArrayList();
        B = null;
        C = null;
        w = null;
        D = 0;
        E = new d(this);
        F = 0L;
        g = context;
    }

    static int a(c c1)
    {
        return c1.D;
    }

    public final int a(long l1, boolean flag)
    {
        if (q == null || q.length <= 0)
        {
            int i1;
            int k1;
            long l2;
            if (flag)
            {
                l2 = 0L;
            } else
            {
                l2 = F;
            }
            k1 = (int)((l2 + l1) / y);
            i1 = k1;
            if (k1 >= z)
            {
                i1 = z - 1;
            }
            return i1;
        }
        for (int j1 = 0; j1 < q.length; j1++)
        {
            if (flag && w != null)
            {
                if (l1 >= w[j1].b && l1 <= w[j1].c)
                {
                    return w[j1].a;
                }
                continue;
            }
            if (l1 >= q[j1].b && l1 < q[j1].c)
            {
                return q[j1].a;
            }
        }

        if (l1 >= q[q.length - 1].c)
        {
            return q.length - 1;
        } else
        {
            return -1;
        }
    }

    public final long a(int i1)
    {
        if (q == null || q.length <= 0)
        {
            return Math.max(0L, (long)i1 * y - 0L);
        }
        for (int j1 = 0; j1 < q.length; j1++)
        {
            if (i1 == q[j1].a)
            {
                return q[j1].b;
            }
        }

        return 0L;
    }

    public h a(long l1)
    {
        byte byte0 = 1;
        if (x == u.b) goto _L2; else goto _L1
_L1:
        if (l1 < v - u || j == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        l = (List)a.get(1);
        flag = true;
_L10:
        if (f != null && f.size() > 0)
        {
            int i1 = l.size();
            int j1 = f.size();
            if (flag)
            {
                byte0 = 2;
            }
            D = i1 - j1 - byte0;
        }
        k.a(l);
_L2:
        if (r != null)
        {
            r.a(l1);
        }
        if (s != null)
        {
            s.a(l1);
        }
        if (t != null)
        {
            t.a(l1);
        }
        return k;
_L4:
        if (x == u.a || l1 >= y * (long)(z - 1) + F) goto _L6; else goto _L5
_L5:
        Iterator iterator = A.iterator();
_L9:
        if (!iterator.hasNext()) goto _L6; else goto _L7
_L7:
        v v1 = (v)iterator.next();
        if (l1 < v1.a || l1 >= v1.b) goto _L9; else goto _L8
_L8:
        flag = true;
_L11:
        if (flag)
        {
            l = (List)a.get(2);
            flag = false;
        } else
        {
            l = (List)a.get(3);
            flag = false;
        }
        if (true) goto _L10; else goto _L6
_L6:
        flag = false;
          goto _L11
    }

    protected void a()
    {
        ArrayList arraylist = new ArrayList();
        if (i != null)
        {
            arraylist.add(i);
        }
        if (e.size() != 0)
        {
            arraylist.add(e.get(0));
        }
        if (h != null)
        {
            arraylist.add(h);
        }
        if (j != null)
        {
            arraylist.add(j);
        }
        ArrayList arraylist1 = new ArrayList();
        if (i != null)
        {
            arraylist1.add(i);
        }
        if (h != null)
        {
            arraylist1.add(h);
        }
        if (j != null)
        {
            arraylist1.add(j);
        }
        ArrayList arraylist2 = new ArrayList();
        if (i != null)
        {
            arraylist2.add(i);
        }
        if (e.size() != 0)
        {
            arraylist2.add(e.get(0));
        }
        if (h != null)
        {
            arraylist2.add(h);
        }
        ArrayList arraylist3 = new ArrayList();
        if (i != null)
        {
            arraylist3.add(i);
        }
        if (h != null)
        {
            arraylist3.add(h);
        }
        a.add(arraylist);
        a.add(arraylist1);
        a.add(arraylist2);
        a.add(arraylist3);
    }

    public final void a(int i1, int j1)
    {
        GLES20.glUseProgram(k.p());
        k.a(b);
        k.a(i1, j1);
    }

    public final void a(u u1)
    {
        x = u1;
    }

    public void a(e e1)
    {
        o = e1;
        if (o.a(ag.y) != 0)
        {
            m = new ag();
            m.a(g.getResources().openRawResource(o.a(ag.y)));
        }
    }

    public final void a(h h1)
    {
        h = h1;
    }

    public final void a(u au[])
    {
        B = au;
    }

    public final transient void a(h ah[])
    {
        e.clear();
        for (int i1 = 0; i1 < 2; i1++)
        {
            e.add(ah[i1]);
        }

    }

    protected void b()
    {
        c.clear();
        c.add(m);
    }

    public final void b(int i1)
    {
        z = i1;
    }

    public final void b(long l1)
    {
        v = l1;
    }

    public final void b(h h1)
    {
        i = h1;
    }

    protected void c()
    {
        b.clear();
        if (i != null)
        {
            b.add(i);
        }
        if (e.size() != 0)
        {
            b.add(e.get(0));
        }
        if (h != null)
        {
            b.add(h);
        }
        if (j != null)
        {
            b.add(j);
        }
        if (m != null)
        {
            b.add(m);
        }
    }

    public final void c(h h1)
    {
        j = h1;
    }

    protected void d()
    {
        if (f.size() > 0)
        {
            c.removeAll(f);
            c.addAll(f);
            b.removeAll(f);
            b.addAll(f);
            for (int i1 = 0; i1 < a.size(); i1++)
            {
                boolean flag = ((List)a.get(i1)).remove(j);
                ((List)a.get(i1)).removeAll(f);
                ((List)a.get(i1)).addAll(f);
                if (flag)
                {
                    ((List)a.get(i1)).add(j);
                }
            }

        }
    }

    public void e()
    {
        b();
        c();
        f();
        a();
        d();
        if (k == null)
        {
            k = new k();
        }
        k.a(c);
        k.h();
        k.a(b);
    }

    protected void f()
    {
        if (r == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        u au[];
        x x2;
        x x3;
        x x4;
        int i1;
        long l3 = v;
        long l2 = l3;
        if (j != null)
        {
            l2 = l3 - u;
        }
        if (z != 0)
        {
            y = l2 / (long)z;
        }
        if (x == u.a)
        {
            l2 = 0L;
        } else
        if (y > 400L)
        {
            l2 = y / 8L;
        } else
        {
            l2 = y / 4L;
        }
        F = l2;
        if (t == null)
        {
            t = new com.roidapp.videolib.b.k();
        }
        t.a();
        obj = new x();
        obj.b = v - u;
        obj.c = v;
        obj.a = 8;
        obj.d = 0.0F;
        obj.e = 1.0F;
        t.a(((x) (obj)));
        if (r == null)
        {
            r = new com.roidapp.videolib.b.k();
        }
        if (s == null)
        {
            s = new com.roidapp.videolib.b.k();
        }
        r.a();
        s.a();
        A.clear();
        C = new u[z - 1];
        if (x == u.b)
        {
            break MISSING_BLOCK_LABEL_1961;
        }
        i1 = 0;
        if (i1 >= z - 1)
        {
            break MISSING_BLOCK_LABEL_1997;
        }
        x3 = new x();
        x4 = new x();
        x2 = new x();
        new x();
        obj = x;
        if (x != u.d) goto _L4; else goto _L3
_L3:
        if (B == null || B.length < i1 + 1) goto _L6; else goto _L5
_L5:
        au = C;
        obj = B[i1];
_L14:
        au[i1] = ((u) (obj));
        obj = C[i1];
_L16:
        e.a[((u) (obj)).ordinal()];
        JVM INSTR tableswitch 1 7: default 392
    //                   1 392
    //                   2 545
    //                   3 797
    //                   4 983
    //                   5 1167
    //                   6 1354
    //                   7 1472;
           goto _L7 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L7:
        break; /* Loop/switch isn't completed */
_L13:
        break MISSING_BLOCK_LABEL_1472;
_L17:
        i1++;
        break MISSING_BLOCK_LABEL_235;
_L6:
        int k1;
        int l1;
        obj = C;
        l1 = (int)((Math.random() * 10D) % 6D + 3D);
        k1 = 0;
_L15:
label0:
        {
            if (k1 >= com.roidapp.videolib.b.u.k.ordinal())
            {
                break MISSING_BLOCK_LABEL_515;
            }
            if (l1 != com.roidapp.videolib.b.u.values()[k1].ordinal())
            {
                break label0;
            }
            u u1 = com.roidapp.videolib.b.u.values()[k1];
            au = ((u []) (obj));
            obj = u1;
        }
          goto _L14
        k1++;
          goto _L15
        u u2 = com.roidapp.videolib.b.u.values()[0];
        au = ((u []) (obj));
        obj = u2;
          goto _L14
_L4:
        C[i1] = x;
          goto _L16
_L8:
        x3.b = (long)(i1 + 1) * y - F;
        x3.c = (long)(i1 + 1) * y + F;
        x3.d = 0.0F;
        x3.e = 1.0F;
        x3.a = 3;
        r.a(x3);
        x2.b = (long)(i1 + 1) * y - F;
        x2.c = (long)(i1 + 1) * y + F;
        x2.d = 0.0F;
        x2.e = 1.0F;
        x2.a = 8;
        r.a(x2);
        x4.b = (long)(i1 + 1) * y - F;
        x4.c = (long)(i1 + 1) * y + F;
        x4.d = 1.0F;
        x4.e = 0.0F;
        x4.a = 3;
        s.a(x4);
        A.add(new v((long)(i1 + 1) * y - F, (long)(i1 + 1) * y + F));
          goto _L17
_L9:
        x3.b = (long)(i1 + 1) * y - F;
        x3.c = (long)(i1 + 1) * y + F;
        x3.d = 2.0F;
        x3.e = 0.0F;
        x3.a = 4;
        r.a(x3);
        x4.b = (long)(i1 + 1) * y - F;
        x4.c = (long)(i1 + 1) * y + F;
        x4.d = 0.0F;
        x4.e = -2F;
        x4.a = 4;
        s.a(x4);
        A.add(new v((long)(i1 + 1) * y - F, (long)(i1 + 1) * y + F));
          goto _L17
_L10:
        x4.b = (long)(i1 + 1) * y - F;
        x4.c = (long)(i1 + 1) * y + F;
        x4.d = 1.0F;
        x4.e = 0.0F;
        x4.a = 3;
        s.a(x4);
        x3.b = (long)(i1 + 1) * y - F;
        x3.c = (long)(i1 + 1) * y + F;
        x3.d = 2.0F;
        x3.e = 0.0F;
        x3.a = 4;
        r.a(x3);
        A.add(new v((long)(i1 + 1) * y - F, (long)(i1 + 1) * y + F));
          goto _L17
_L11:
        x4.b = (long)(i1 + 1) * y - F;
        x4.c = (long)(i1 + 1) * y + F;
        x4.d = 1.0F;
        x4.e = 0.5F;
        x4.a = 8;
        s.a(x4);
        x3.b = (long)(i1 + 1) * y - F;
        x3.c = (long)(i1 + 1) * y + F;
        x3.d = 2.0F;
        x3.e = 0.0F;
        x3.a = 4;
        r.a(x3);
        A.add(new v((long)(i1 + 1) * y - F, (long)(i1 + 1) * y + F));
          goto _L17
_L12:
        x3.b = (long)(i1 + 1) * y - F;
        x3.c = (long)(i1 + 1) * y + F;
        x3.d = 0.0F;
        x3.e = 1.0F;
        x3.a = 8;
        r.a(x3);
        A.add(new v((long)(i1 + 1) * y - F, (long)(i1 + 1) * y + F));
          goto _L17
        float f2 = (0.3F / (float)(y + F)) * (float)F;
        float f1;
        if (i1 == 0)
        {
            x3.b = 0L;
            x3.d = 1.0F;
            f1 = 1.3F - f2;
        } else
        {
            x3.b = (long)i1 * y - F;
            if (i1 % 2 == 0)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 1.3F;
            }
            x3.d = f1;
            if (i1 % 2 == 0)
            {
                f1 = 1.3F - f2;
            } else
            {
                f1 = 1.0F + f2;
            }
        }
        x3.e = f1;
        x3.c = (long)(i1 + 1) * y - F;
        x3.a = 3;
        r.a(x3);
        x4.b = (long)(i1 + 1) * y - F;
        x4.c = (long)(i1 + 1) * y;
        x4.a = 3;
        if (i1 == 0)
        {
            x4.d = 1.3F - f2;
            f1 = 1.3F;
        } else
        {
            if (i1 % 2 == 0)
            {
                f1 = 1.3F - f2;
            } else
            {
                f1 = 1.0F + f2;
            }
            x4.d = f1;
            if (i1 % 2 == 0)
            {
                f1 = 1.3F;
            } else
            {
                f1 = 1.0F;
            }
        }
        x4.e = f1;
        x4.a = 3;
        s.a(x4);
        if (i1 == z - 2)
        {
            x x1 = new x();
            x1.b = (long)(i1 + 1) * y - F;
            x1.c = (long)(i1 + 2) * y;
            if (i1 % 2 == 0)
            {
                f1 = 1.3F;
            } else
            {
                f1 = 1.0F;
            }
            x1.d = f1;
            if (i1 % 2 == 0)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 1.3F;
            }
            x1.e = f1;
            x1.a = 3;
            r.a(x1);
        }
        x2.b = (long)(i1 + 1) * y - F;
        x2.c = (long)(i1 + 1) * y;
        x2.d = 0.0F;
        x2.e = 1.0F;
        x2.a = 8;
        r.a(x2);
        A.add(new v((long)(i1 + 1) * y - F, (long)(i1 + 1) * y));
          goto _L17
        for (int j1 = 0; j1 < p.length; j1++)
        {
            r.a(p[j1]);
        }

        if (e.size() != 0)
        {
            s.a((h)e.get(0));
        }
        if (h != null)
        {
            r.a(h);
        }
        if (j != null)
        {
            t.a(j);
            return;
        }
        if (true) goto _L1; else goto _L18
_L18:
    }

    public int g()
    {
        return 0;
    }

    public void h()
    {
        b.clear();
        a.clear();
        if (k != null)
        {
            k.a(c);
            k.i();
        }
        c.clear();
        m = null;
        if (s != null)
        {
            s.a();
        }
        if (r != null)
        {
            r.a();
        }
        if (t != null)
        {
            t.a();
        }
        s = null;
        t = null;
        r = null;
        k = null;
        h = null;
        e.clear();
        j = null;
        i = null;
        q = null;
        p = null;
    }
}
