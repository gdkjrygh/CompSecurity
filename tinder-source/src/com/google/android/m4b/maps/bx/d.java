// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.bb.i;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bn.a;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.f;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.y.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            w, u, v, a, 
//            n, ab, af, ag, 
//            h, j, ad, ah

public final class d extends w
    implements u, v
{
    public static final class a
    {

        final Boolean a;
        final Boolean b = null;
        final Boolean c = null;
        public final boolean d;
        public final int e;
        public final int f;
        public final int g = 0;
        public final int h = 0;
        public final int i;
        public final int j;

        public a(Boolean boolean1, boolean flag, int i1, int j1, int k1, int l1)
        {
            a = boolean1;
            d = flag;
            e = i1;
            f = j1;
            i = k1;
            j = l1;
        }
    }

    public static final class a.a
    {

        boolean a;
        private Boolean b;
        private Integer c;
        private Integer d;
        private int e;
        private int f;

        public final a.a a(int i1)
        {
            c = Integer.valueOf(i1);
            d = Integer.valueOf(i1);
            return this;
        }

        public final a.a a(int i1, int j1)
        {
            e = i1;
            f = j1;
            return this;
        }

        public final a.a a(boolean flag)
        {
            b = Boolean.valueOf(flag);
            return this;
        }

        public final a a()
        {
            boolean flag;
            if (d != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "Texture ID must be specified.");
            return new a(b, a, c.intValue(), d.intValue(), e, f);
        }

        public a.a()
        {
        }
    }


    private static com.google.android.m4b.maps.bn.a x;
    public float a;
    public float b;
    public float c;
    private final Resources f;
    private final boolean g = true;
    private int h;
    private volatile com.google.android.m4b.maps.bx.j i;
    private final Map j = ax.b();
    private List k;
    private com.google.android.m4b.maps.bb.h l;
    private com.google.android.m4b.maps.bx.a m;
    private final f n = new f();
    private final f o = new f();
    private final f p = new f();
    private boolean q;
    private boolean r;
    private volatile com.google.android.m4b.maps.ak.c s;
    private volatile boolean t;
    private final int u;
    private float v;
    private final g w = new g();

    public d(Resources resources, ah ah1)
    {
        super(ah1);
        q = false;
        t = true;
        f = resources;
        ah1 = (new a.a()).a(true);
        ah1.a = true;
        ah1 = ah1.a(com.google.android.m4b.maps.h.e.maps_chevron).a(resources.getColor(com.google.android.m4b.maps.h.c.maps_accuracy_circle_line_color), resources.getColor(com.google.android.m4b.maps.h.c.maps_accuracy_circle_fill_color)).a();
        a.a a1 = (new a.a()).a(false);
        a1.a = false;
        a(new a[] {
            ah1, a1.a(com.google.android.m4b.maps.h.e.maps_blue_dot).a(resources.getColor(com.google.android.m4b.maps.h.c.maps_accuracy_circle_line_color), resources.getColor(com.google.android.m4b.maps.h.c.maps_accuracy_circle_fill_color)).a()
        });
        a = 64F;
        b = 0.5F;
        c = 0.5F;
        u = f.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_dav_my_location_bubble_y_offset);
        l = new i();
    }

    private j a(com.google.android.m4b.maps.bm.d d1, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        j j2 = (j)j.get(Integer.valueOf(i1));
        j j1;
        j1 = j2;
        if (j2 != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        j1 = new j(d1);
        j1.d = true;
        j1.a(f, i1);
        j.put(Integer.valueOf(i1), j1);
        this;
        JVM INSTR monitorexit ;
        return j1;
        d1;
        throw d1;
    }

    private a a(boolean flag, boolean flag1, boolean flag2)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = k.iterator();
_L10:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        a a1 = (a)iterator.next();
        if (a1.a == null) goto _L4; else goto _L3
_L3:
        boolean flag4 = a1.a.booleanValue();
        if (flag4 == flag) goto _L4; else goto _L5
_L5:
        boolean flag3 = false;
_L6:
        if (!flag3)
        {
            continue; /* Loop/switch isn't completed */
        }
_L7:
        this;
        JVM INSTR monitorexit ;
        return a1;
_L4:
        if (a1.b == null || a1.b.booleanValue() == flag1)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        flag3 = false;
          goto _L6
        if (a1.c == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        flag4 = a1.c.booleanValue();
        if (flag4 == flag2)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        flag3 = false;
          goto _L6
        flag3 = true;
          goto _L6
_L2:
        a1 = null;
          goto _L7
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L6; else goto _L8
_L8:
        if (true) goto _L10; else goto _L9
_L9:
    }

    private transient void a(a aa[])
    {
        this;
        JVM INSTR monitorenter ;
        k = ae.a(aa);
        n();
        this;
        JVM INSTR monitorexit ;
        return;
        aa;
        throw aa;
    }

    private void b(com.google.android.m4b.maps.bm.d d1, b b1, ab ab1)
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        if (p.c > 0)
        {
            if (m == null)
            {
                m = new com.google.android.m4b.maps.bx.a("MyLocation");
                m.e = 2.0F;
            }
            Object obj = m;
            Object obj1 = p;
            obj1 = (g)com.google.android.m4b.maps.y.h.b(((f) (obj1)).d, ((f) (obj1)).a);
            int i1 = p.c * 2;
            if (obj1 != ((com.google.android.m4b.maps.bx.a) (obj)).a || ((com.google.android.m4b.maps.bx.a) (obj)).b != i1)
            {
                obj.a = ((g) (obj1));
                obj.b = i1;
                ((com.google.android.m4b.maps.bx.a) (obj)).b();
            }
            obj = p();
            m.c = ((a) (obj)).i;
            m.d = ((a) (obj)).j;
            m.a(d1, b1, ab1);
        }
        float f1 = b1.b(p.a);
        f1 = b1.a(a, f1);
        float f3 = v;
        ab1 = d1.a;
        com.google.android.m4b.maps.bx.n.a(d1, b1, p.a, f1 * f3);
        d1.c();
        d1.t.d(d1);
        d1.p.d(d1);
        a1 = p();
        boolean flag;
        if (a1.f != a1.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ab1.glBlendFunc(1, 771);
        ab1.glTexEnvx(8960, 8704, 7681);
        ab1.glColor4x(0x10000, 0x10000, 0x10000, 0x10000);
        if (a1.g != 0)
        {
            ab1.glTexEnvx(8960, 8704, 8448);
            a(d1, a1.g).a(ab1);
            float f2 = p.h * 10F + 1.0F;
            float f4 = 1.0F - p.h * 3F;
            float f5 = p.h * 4F;
            float f6 = p.h * -4F;
            ab1.glColor4f(f4, f4, f4, f4);
            ab1.glTranslatef(f5, f6, 0.0F);
            ab1.glScalef(f2, f2, f2);
            ab1.glDrawArrays(5, 0, 4);
            ab1.glScalef(1.0F / f2, 1.0F / f2, 1.0F / f2);
            ab1.glTranslatef(-f5, -f6, 0.0F);
            ab1.glColor4x(0x10000, 0x10000, 0x10000, 0x10000);
            ab1.glTexEnvx(8960, 8704, 7681);
        }
        if (p.h != 0.0F)
        {
            ab1.glTranslatef(0.0F, 0.0F, p.h * (float)com.google.android.m4b.maps.bo.g.a(p.a.b()));
        }
        if (p.e && a1.h != 0)
        {
            ab1.glRotatef(-p.b, 0.0F, 0.0F, 1.0F);
            ab1.glScalef(2.0F, 2.0F, 2.0F);
            a(d1, a1.h).a(ab1);
            ab1.glDrawArrays(5, 0, 4);
            ab1.glScalef(0.5F, 0.5F, 0.5F);
            ab1.glRotatef(p.b, 0.0F, 0.0F, 1.0F);
        }
        if (!p().d) goto _L2; else goto _L1
_L1:
        ab1.glRotatef(-p.b, 0.0F, 0.0F, 1.0F);
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_755;
        }
        if (p.j != 1.0F)
        {
            break MISSING_BLOCK_LABEL_755;
        }
        a(d1, a1.f).a(ab1);
_L4:
        ab1.glDrawArrays(5, 0, 4);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ab1.glRotatef(-b1.b.d, 0.0F, 0.0F, 1.0F);
        ab1.glRotatef(b1.b.c, 1.0F, 0.0F, 0.0F);
          goto _L3
        d1;
        throw d1;
        a(d1, a1.e).a(ab1);
          goto _L4
    }

    private void n()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = j.values().iterator(); iterator.hasNext(); ((j)iterator.next()).c()) { }
        break MISSING_BLOCK_LABEL_46;
        Exception exception;
        exception;
        throw exception;
        j.clear();
        this;
        JVM INSTR monitorexit ;
    }

    private f o()
    {
        this;
        JVM INSTR monitorenter ;
        f f1 = n;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    private a p()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        boolean flag2;
        f f1 = o();
        flag = f1.e;
        flag1 = f1.g;
        flag2 = f1.i;
        this;
        JVM INSTR monitorexit ;
        return a(flag, flag2, flag1);
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int a(float f1, float f2, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (n.a())
        {
            break MISSING_BLOCK_LABEL_18;
        }
        this;
        JVM INSTR monitorexit ;
        return 0x7fffffff;
        b1 = b1.c(n.a);
        this;
        JVM INSTR monitorexit ;
        float f3 = b1[0];
        float f4 = b1[0];
        float f5 = b1[1];
        return (int)((f2 - (float)b1[1]) * (f2 - f5) + (f1 - f3) * (f1 - f4));
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void a(com.google.android.m4b.maps.bm.d d1)
    {
        n();
        t = true;
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, b b1, ab ab1)
    {
        if (ab1.b > 0 || !n.a())
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        h = 0;
        if (h == 0 || !l.a(o) || !o.a()) goto _L2; else goto _L1
_L1:
        long l1;
        p.a(o);
        l1 = d1.j + 200L;
        if (d1.i != 0L) goto _L4; else goto _L3
_L3:
        d1.i = l1;
_L7:
        af af1 = d1.b;
        l1 = d1.i;
        af1;
        JVM INSTR monitorenter ;
        if (af1.l != null)
        {
            af1.l.a(l1);
        }
        af1;
        JVM INSTR monitorexit ;
_L8:
        if (p.a()) goto _L6; else goto _L5
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
_L4:
        d1.i = Math.min(d1.i, l1);
          goto _L7
        d1;
        af1;
        JVM INSTR monitorexit ;
        throw d1;
_L2:
        p.a(n);
          goto _L8
_L6:
        this;
        JVM INSTR monitorexit ;
        GL10 gl10 = d1.a;
        gl10.glPushMatrix();
        com.google.android.m4b.maps.bx.h h1 = null;
        if (s != null)
        {
            com.google.android.m4b.maps.bx.h h2 = ab1.c.a(s.a);
            h1 = h2;
            if (h2 != null)
            {
                h2.a(d1, b1, ab1, p.a);
                h1 = h2;
            }
        }
        b(d1, b1, ab1);
        if (h1 != null)
        {
            h1.a(d1, ab1);
        }
        gl10.glPopMatrix();
        return;
          goto _L7
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bx.j j1)
    {
        i = j1;
    }

    public final void a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (n.a() != f1.a() || !com.google.android.m4b.maps.y.h.a(n.f, f1.f) || n.g != f1.g)
        {
            t = true;
        }
        n.a(f1);
        if (!n.a())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        l.b(n);
_L1:
        if (i != null)
        {
            i.a(false, false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        l = new i();
          goto _L1
        f1;
        throw f1;
    }

    public final void a(List list, float f1, float f2, b b1, int i1)
    {
        if (g)
        {
            int j1 = a(f1, f2, b1);
            if (j1 < i1)
            {
                list.add(new ad(this, this, j1));
            }
        }
    }

    public final boolean a(b b1)
    {
        g g1 = f();
        if (g1 == null)
        {
            return false;
        }
        int ai[] = b1.c(g1);
        float f1;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (p().d)
        {
            f1 = c;
        } else
        {
            f1 = b;
        }
        i1 = (int)Math.ceil(f1 * (a * v));
        j1 = ai[0];
        k1 = ai[0];
        l1 = ai[1];
        i2 = ai[1];
        return j1 - i1 < b1.h && k1 + i1 >= 0 && l1 - i1 < b1.i && i1 + i2 >= 0;
    }

    public final boolean a(b b1, com.google.android.m4b.maps.bm.d d1)
    {
        float f1;
        float f2;
        f1 = 0.8F;
        d1 = f();
        if (d1 != null)
        {
            com.google.android.m4b.maps.bx.ah.a(b1, d1, 0, Math.round((float)u * v), w);
        }
        f2 = b1.b.b;
        if (f2 < 14F) goto _L2; else goto _L1
_L1:
        f1 = 1.0F;
_L4:
        v = f1;
        return true;
_L2:
        if (f2 >= 10F)
        {
            f1 = 0.8F + (f2 - 10F) * 0.05F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(List list)
    {
        if (t)
        {
            t = false;
            s = n_();
            com.google.android.m4b.maps.az.f f1 = null;
            if (s != null)
            {
                f1 = com.google.android.m4b.maps.az.i.a().a(s.a, false, false);
            }
            list.clear();
            if (s == null || f1 == null)
            {
                return super.a(list);
            } else
            {
                list.add(a(com.google.android.m4b.maps.bx.ag.a.i, new com.google.android.m4b.maps.bx.h[] {
                    f1
                }));
                return true;
            }
        } else
        {
            return false;
        }
    }

    public final int b(b b1)
    {
        return h;
    }

    public final void b()
    {
        r = true;
    }

    public final void c()
    {
        r = false;
    }

    public final r.a d()
    {
        return r.a.p;
    }

    public final g f()
    {
        this;
        JVM INSTR monitorenter ;
        g g1 = n.a;
        this;
        JVM INSTR monitorexit ;
        return g1;
        Exception exception;
        exception;
        throw exception;
    }

    public final u g()
    {
        return this;
    }

    public final c h()
    {
        return null;
    }

    public final g j()
    {
        return w;
    }

    public final String k()
    {
        return null;
    }

    public final boolean l()
    {
        return g;
    }

    public final com.google.android.m4b.maps.ak.c n_()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ak.c c1 = o().f;
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        com.google.android.m4b.maps.bn.a a1 = new com.google.android.m4b.maps.bn.a(4);
        x = a1;
        a1.b(0x73217bce, 4);
    }
}
