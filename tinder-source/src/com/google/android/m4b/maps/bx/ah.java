// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.m4b.maps.az.f;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bb.e;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.g;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            r, v, ab, n, 
//            x, j

public final class ah extends r
{
    public static interface a
    {

        public abstract void b(v v1);
    }


    private final r.a a;
    private final float b[];
    private v c;
    private final g d;
    private Bitmap e;
    private x f;
    private Bitmap g;
    private j h;
    private a i;
    private int j;
    private int k;
    private int l;
    private int m;
    private float n;
    private final int o;
    private final e p;

    public ah(Resources resources)
    {
        this(r.a.q, resources);
    }

    private ah(r.a a1, Resources resources)
    {
        b = new float[8];
        d = new g();
        p = new e(3000L, 10000L, com.google.android.m4b.maps.bb.e.a.c, 0x10000, 32768);
        a = a1;
        int i1;
        if (resources == null)
        {
            i1 = 0xffff00;
        } else
        {
            i1 = resources.getColor(com.google.android.m4b.maps.h.c.maps_bubble_highlight);
        }
        o = i1;
    }

    public static void a(b b1, g g1, int i1, int j1, g g2)
    {
        float f1 = b1.a(j1, b1.e);
        float f2 = b1.a(i1, b1.e);
        double d1 = Math.cos(Math.toRadians(b1.b.c));
        double d2 = Math.sin(Math.toRadians(b1.b.c));
        double d3 = Math.cos(Math.toRadians(b1.b.d));
        double d4 = Math.sin(Math.toRadians(b1.b.d));
        i1 = g1.a;
        j1 = (int)((double)f1 * d1 * d4 + (double)f2 * d3);
        int k1 = g1.b;
        int l1 = (int)(d1 * (double)f1 * d3 - (double)f2 * d4);
        int i2 = g1.c;
        g2.a(i1 + j1, l1 + k1, (int)(d2 * (double)f1) + i2);
    }

    private boolean e(float f1, float f2, b b1)
    {
        boolean flag = true;
        if (c == null || c.f() == null)
        {
            flag = false;
        } else
        {
            b1 = b1.c(c.j());
            int i1 = b1[0] - l / 2;
            int j1 = l;
            if (f1 < (float)i1 || f1 > (float)(j1 + i1))
            {
                return false;
            }
            i1 = b1[1];
            if (f2 < (float)(i1 - m) || f2 > (float)i1)
            {
                return false;
            }
        }
        return flag;
    }

    private void j()
    {
        if (h != null)
        {
            h.c();
            h = null;
        }
        if (g != null)
        {
            g.recycle();
            g = null;
        }
    }

    private Bitmap k()
    {
        l = e.getWidth();
        m = e.getHeight();
        int j1 = com.google.android.m4b.maps.bm.j.a(l, 64);
        int i1 = com.google.android.m4b.maps.bm.j.a(m, 32);
        Bitmap bitmap = Bitmap.createBitmap(j1, i1, android.graphics.Bitmap.Config.ARGB_8888);
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        j1 = (j1 - l) / 2;
        int k1 = m;
        canvas.translate(j1, i1 - k1);
        canvas.drawBitmap(e, 0.0F, 0.0F, new Paint());
        return bitmap;
    }

    public final void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        j();
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public final void a(d d1, b b1, ab ab1)
    {
        int i1 = 1;
        if (ab1.b != 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (c != null && g != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        Object obj1;
        obj = c.j();
        obj1 = c.n_();
        ab1 = ((ab) (obj));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        ab1 = ((ab) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj1 = com.google.android.m4b.maps.az.i.a().a(((com.google.android.m4b.maps.ak.c) (obj1)).a, false, false);
        ab1 = ((ab) (obj));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        d.b(((g) (obj)));
        d.c = (int)((f) (obj1)).a(b1, ((g) (obj)));
        ab1 = d;
        obj = b1.h();
        obj1 = ((as) (obj)).a();
        if (ab1 != null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
        if (((ar) (obj1)).a(ab1) && ((as) (obj)).a(ab1) || c.a(b1)) goto _L4; else goto _L3
_L3:
        if (g == null) goto _L6; else goto _L5
_L5:
        int ai[];
        int j1;
        int k1;
        ai = b1.c(c.j());
        j1 = g.getWidth() / 2;
        k1 = g.getHeight();
        int l1;
        int i2;
        int j2;
        int k2;
        l1 = ai[0];
        i2 = ai[0];
        j2 = ai[1];
        k2 = ai[1];
        int l2;
        int i3;
        l2 = b1.h;
        i3 = b1.i;
        if (j1 + i2 < 0 || l1 - j1 >= l2 || k2 + k1 < 0 || j2 - k1 >= i3) goto _L6; else goto _L7
_L7:
        if (i1 != 0) goto _L4; else goto _L8
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        ai = ab1;
        if (!b1.c)
        {
            b1.a(ab1, b);
            ai = b1.b(Math.round(b[0]), Math.round(b[1]));
        }
        if (ai != null)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ab1 = d1.a;
        d1.c();
        ab1.glBlendFunc(1, 771);
        ab1.glTexEnvx(8960, 8704, 7681);
        if (h == null)
        {
            h = new j(d1);
            h.b(g);
        }
        ab1.glPushMatrix();
        com.google.android.m4b.maps.bx.n.a(d1, b1, ai, n);
        com.google.android.m4b.maps.bx.n.a(ab1, b1);
        float f1 = com.google.android.m4b.maps.bo.g.c(b1.c(), com.google.android.m4b.maps.bo.g.a(b1.d), ai);
        float f2 = (float)g.getWidth() * f1;
        float f3 = g.getHeight();
        ab1.glTranslatef(-f2 * 0.5F, 0.0F, 0.0F);
        ab1.glScalef(f2, 1.0F, f1 * f3);
        if (f.b)
        {
            ab1.glTexEnvx(8960, 8704, 8448);
            i1 = o;
            ab1.glColor4x(i1 >> 8 & 0xff00, i1 & 0xff00, i1 << 8 & 0xff00, i1 >> 16 & 0xff00);
        }
        b1 = d1.s;
        ai = d1.p;
        b1.d(d1);
        ai.d(d1);
        h.a(ab1);
        ab1.glDrawArrays(5, 0, 4);
        ab1.glPopMatrix();
        this;
        JVM INSTR monitorexit ;
        d1 = f.c;
_L2:
        return;
_L6:
        i1 = 0;
        if (true) goto _L7; else goto _L9
_L9:
    }

    public final void a(d d1, com.google.android.m4b.maps.bx.j j1)
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            g = k();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public final void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        i = a1;
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public final void a(v v1, x x1)
    {
        this;
        JVM INSTR monitorenter ;
        f = x1;
        p.a.start();
        if (c != v1 || e != x1.a) goto _L2; else goto _L1
_L1:
        if (c != null)
        {
            c.b();
        }
        if (e != null)
        {
            j();
            g = k();
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (c != null)
        {
            c.c();
        }
        c = v1;
        c.b();
        if (x1 == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        e = x1.a;
        if (e != null)
        {
            j();
            g = k();
        }
        if (true) goto _L4; else goto _L3
_L3:
        v1;
        throw v1;
    }

    public final boolean a(float f1, float f2, g g1, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!e(f1, f2, b1))
        {
            break MISSING_BLOCK_LABEL_22;
        }
        j_();
        this;
        JVM INSTR monitorexit ;
        return true;
        if (c != null)
        {
            c();
            j_();
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        g1;
        this;
        JVM INSTR monitorexit ;
        throw g1;
    }

    public final boolean a(b b1, d d1)
    {
        this;
        JVM INSTR monitorenter ;
        n = b1.a(1.0F, b1.e);
        if (b1.h != j || b1.i != k)
        {
            j = b1.h;
            k = b1.i;
            if (g != null)
            {
                j();
                g = k();
            }
        }
        this;
        JVM INSTR monitorexit ;
        return true;
        b1;
        throw b1;
    }

    public final boolean a_(float f1, float f2, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e(f1, f2, b1))
        {
            return true;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final boolean b(float f1, float f2, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!e(f1, f2, b1))
        {
            break MISSING_BLOCK_LABEL_20;
        }
        i_();
        return true;
        this;
        JVM INSTR monitorexit ;
        return false;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            c.c();
        }
        c = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c(float f1, float f2, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!e(f1, f2, b1)) goto _L2; else goto _L1
_L1:
        p.a.start();
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        b1;
        throw b1;
    }

    public final r.a d()
    {
        return a;
    }

    public final void i_()
    {
        this;
        JVM INSTR monitorenter ;
    }

    protected final boolean j_()
    {
        boolean flag = super.j_();
        if (i != null)
        {
            i.b(c);
            flag = true;
        }
        return flag;
    }
}
