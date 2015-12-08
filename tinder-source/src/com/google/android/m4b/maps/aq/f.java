// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.n;
import com.google.android.m4b.maps.cg.cc;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            l, m, b

public final class f
    implements l, com.google.android.m4b.maps.cg.cc.a
{

    private final com.google.android.m4b.maps.aq.m a;
    private final cc b;
    private g c;
    private ar d;
    private k e;
    private j f;
    private com.google.android.m4b.maps.bn.g g;
    private float h;

    public f(com.google.android.m4b.maps.aq.m m1, cc cc1)
    {
        c = new g();
        a = m1;
        b = cc1;
        a(-1);
    }

    private void g()
    {
        if (f != null)
        {
            f.c();
            f = null;
        }
    }

    public final void a()
    {
        synchronized (a)
        {
            a.a(this);
        }
        a.b();
        return;
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if ((i & 0x10) == 0) goto _L2; else goto _L1
_L1:
        Object obj1 = b.g();
        if (((LatLngBounds) (obj1)).c.c >= ((LatLngBounds) (obj1)).b.c) goto _L4; else goto _L3
_L3:
        obj = com.google.android.m4b.maps.aq.b.b(((LatLngBounds) (obj1)).c).e(new g(0x40000000, 0));
_L9:
        obj1 = com.google.android.m4b.maps.aq.b.b(((LatLngBounds) (obj1)).b);
        double d3 = b.k();
        double d1 = b.l();
        double d4 = ((g) (obj1)).a;
        int i1 = (int)(d3 * (double)((g) (obj)).a + (1.0D - d3) * d4);
        d3 = ((g) (obj)).b;
        c = new g(i1, (int)((double)((g) (obj1)).b * d1 + (1.0D - d1) * d3));
_L2:
        if ((i & 0x17) == 0) goto _L6; else goto _L5
_L5:
        e = new k(4);
        e.a(-b.k(), b.l(), 0.0F);
        e.a(-b.k(), b.l() - 1.0F, 0.0F);
        e.a(1.0F - b.k(), b.l(), 0.0F);
        e.a(1.0F - b.k(), b.l() - 1.0F, 0.0F);
        obj = com.google.android.m4b.maps.aq.b.a(b.g());
        if (b.e() != 0.0F) goto _L8; else goto _L7
_L7:
        d = ((ar) (obj));
_L6:
        if ((i & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        g();
        if ((i & 8) == 0)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        synchronized (a)
        {
            h = b.p();
            a.c();
        }
        a.b();
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        obj = com.google.android.m4b.maps.aq.b.b(((LatLngBounds) (obj1)).c);
          goto _L9
_L8:
        double d2 = Math.hypot(((ar) (obj)).a.f(), ((ar) (obj)).d());
        obj = new g((int)d2, (int)d2);
        d = ar.a(new m(c.f(((g) (obj))), c.e(((g) (obj)))));
          goto _L6
        obj;
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
          goto _L9
    }

    public final void a(long l1)
    {
    }

    public final void a(b b1, d d1)
    {
    }

    public final void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        g();
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public final void a(d d1, b b1, ab ab)
    {
        this;
        JVM INSTR monitorenter ;
        ab = b;
        ab;
        JVM INSTR monitorenter ;
        if (b.r()) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b1.h().b(d.a) || d.b.a > d.c.a)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ab;
        JVM INSTR monitorexit ;
          goto _L1
        d1;
        ab;
        JVM INSTR monitorexit ;
        throw d1;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
        GL10 gl10 = d1.a;
        e.d(d1);
        d1.c();
        if (f == null)
        {
            f = new j(d1);
            f.d = true;
            f.e = true;
            f.a(b.s().b);
        }
        if (g == null)
        {
            g = new com.google.android.m4b.maps.bn.g(8);
            float f1 = f.f;
            float f3 = f.g;
            g.a(0.0F, 0.0F);
            g.a(0.0F, f3);
            g.a(f1, 0.0F);
            g.a(f1, f3);
        }
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvx(8960, 8704, 8448);
        float f2 = b.n();
        gl10.glColor4f(1.0F - f2, 1.0F - f2, 1.0F - f2, 1.0F - f2);
        gl10.glPushMatrix();
        n.a(d1, b1, c, 1.0F);
        gl10.glRotatef(b.e(), 0.0F, 0.0F, -1F);
        b1 = com.google.android.m4b.maps.aq.b.a(b.g());
        gl10.glScalef(((ar) (b1)).a.f(), b1.d(), 1.0F);
        g.d(d1);
        f.a(gl10);
        gl10.glDrawArrays(5, 0, 4);
        gl10.glPopMatrix();
        ab;
        JVM INSTR monitorexit ;
          goto _L1
    }

    public final void a(d d1, com.google.android.m4b.maps.bx.j j1)
    {
    }

    public final void a(boolean flag)
    {
    }

    public final boolean a(g g1, b b1)
    {
        return false;
    }

    public final void b()
    {
    }

    public final void b(int i)
    {
    }

    public final boolean c()
    {
        return true;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        g();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final String e()
    {
        return b.a();
    }

    public final float f()
    {
        return h;
    }
}
