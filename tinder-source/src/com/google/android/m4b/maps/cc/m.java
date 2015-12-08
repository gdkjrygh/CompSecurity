// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.ah;
import com.google.android.m4b.maps.bx.ak;
import com.google.android.m4b.maps.bx.n;
import com.google.android.m4b.maps.bx.v;
import com.google.android.m4b.maps.cg.aa;
import java.util.HashMap;
import javax.microedition.khronos.opengles.GL10;

public final class m
    implements v, Comparable
{

    private static float I[] = new float[8];
    private static g J = new g();
    private static int K;
    private float A;
    private final float B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private boolean G;
    private aq H;
    private final g L = new g();
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private Rect R;
    public Bitmap a;
    public final Bitmap b = null;
    public int c;
    public int d;
    public String e;
    public String f;
    public String g;
    public ak h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public aa n;
    private g o;
    private j p;
    private j q;
    private com.google.android.m4b.maps.bn.g r;
    private com.google.android.m4b.maps.bn.g s;
    private float t;
    private int u;
    private boolean v;
    private boolean w;
    private final boolean x = false;
    private boolean y;
    private float z;

    public m(g g1, Bitmap bitmap, int i1, int j1)
    {
        g = null;
        w = true;
        y = true;
        z = 0.0F;
        A = 1.0F;
        o = g1;
        a = bitmap;
        c = i1;
        d = j1;
        e = null;
        f = null;
        v = true;
        i1 = K;
        K = i1 + 1;
        Q = i1;
        if (x && !com.google.android.m4b.maps.ay.w.a())
        {
            B = (float)w.d / 240F;
        } else
        {
            B = 1.0F;
        }
        l = a(c);
        a(c / 2, 0);
        if (a != null)
        {
            C = a(a.getWidth());
            D = a(a.getHeight());
        } else
        {
            C = 0;
            D = 0;
        }
        if (b != null)
        {
            E = a(b.getWidth());
            F = a(b.getHeight());
        } else
        {
            E = 0;
            F = 0;
        }
        m = a(d);
    }

    private j a(d d1, Bitmap bitmap)
    {
        j j1 = (j)h.a.get(bitmap);
        if (j1 != null)
        {
            j1.b();
            return j1;
        } else
        {
            d1 = new j(d1);
            d1.d = true;
            d1.b(bitmap);
            h.a.put(bitmap, d1);
            return d1;
        }
    }

    private static com.google.android.m4b.maps.bn.g a(j j1)
    {
        com.google.android.m4b.maps.bn.g g1 = new com.google.android.m4b.maps.bn.g(8);
        float f1 = j1.f;
        float f2 = j1.g;
        g1.a(0.0F, 0.0F);
        g1.a(0.0F, f2);
        g1.a(f1, 0.0F);
        g1.a(f1, f2);
        return g1;
    }

    private void c(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        int k1;
        int l1;
        int i2;
        int j2;
        b1 = b1.c(o);
        i2 = b1[0] - l;
        l1 = C + i2;
        j2 = b1[1] - m;
        k1 = D + j2;
        int i1;
        int j1;
        j1 = k1;
        i1 = l1;
        if (b != null)
        {
            i1 = Math.max(l1, E + i2);
            j1 = Math.max(k1, F + j2);
        }
        R = new Rect(i2, j2, i1, j1);
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
    }

    public final int a(float f1, float f2, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        int ai[] = b1.c(o);
        if (!y) goto _L2; else goto _L1
_L1:
        float f4 = z;
_L4:
        float f3;
        float f5;
        f5 = f1;
        f3 = f2;
        if (f4 == 0.0F)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        double d1 = Math.toRadians(f4);
        f3 = (float)Math.sin(d1);
        f4 = (float)Math.cos(d1);
        f1 -= ai[0];
        f2 = -(f2 - (float)ai[1]);
        f5 = (float)ai[0] + (f1 * f4 - f2 * f3);
        f3 = (float)ai[1] - (f3 * f1 + f4 * f2);
        int l1 = ai[0];
        int i2;
        int j2;
        i2 = l;
        j2 = C / 2;
        int i1 = ai[1];
        int j1 = m;
        int k1 = D / 2;
        l1 = Math.max((int)Math.abs(f5 - (float)((l1 - i2) + j2)) - C / 2, 0);
        i1 = Math.max((int)Math.abs(f3 - (float)((i1 - j1) + k1)) - D / 2, 0);
        this;
        JVM INSTR monitorexit ;
        return l1 * l1 + i1 * i1;
_L2:
        f3 = z;
        f4 = b1.b.d;
        f4 = f3 - f4;
        if (true) goto _L4; else goto _L3
_L3:
        b1;
        throw b1;
    }

    public final int a(int i1)
    {
        int j1 = i1;
        if (x)
        {
            j1 = i1;
            if (!com.google.android.m4b.maps.ay.w.a())
            {
                j1 = Math.round((float)i1 * B);
            }
        }
        return j1;
    }

    public final void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        z = f1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i1, int j1)
    {
        M = i1;
        N = j1;
        O = a(M);
        P = a(N);
    }

    public final void a(d d1, b b1, ab ab1)
    {
        if (ab1.b <= 1 && h != null && t != 0.0F && a != null && w) goto _L2; else goto _L1
_L1:
        return;
_L2:
        this;
        JVM INSTR monitorenter ;
        float f1;
        float f2;
        boolean flag;
        f1 = z;
        flag = y;
        f2 = A;
        this;
        JVM INSTR monitorexit ;
        Bitmap bitmap;
        Bitmap bitmap1;
        GL10 gl10;
        gl10 = d1.a;
        bitmap = b;
        bitmap1 = a;
        if (ab1.b != 0) goto _L4; else goto _L3
_L3:
        if (q != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (bitmap == null) goto _L1; else goto _L5
_L5:
        q = a(d1, bitmap);
        s = a(q);
_L11:
        J.b(o);
        if (b1.c || b1.b.c != 0.0F) goto _L7; else goto _L6
_L6:
        if (!flag) goto _L9; else goto _L8
_L8:
        int i1;
        if (f1 % 90F == 0.0F)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L13:
        if (i1 != 0)
        {
            b1.a(J, I);
            J = b1.b(Math.round(I[0]), Math.round(I[1]));
        }
        if (o == null) goto _L1; else goto _L10
_L10:
        gl10.glPushMatrix();
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.bx.n.a(d1, b1, J, t);
        this;
        JVM INSTR monitorexit ;
        int j1;
        int k1;
        int l1;
        if (ab1.b == 0)
        {
            gl10.glRotatex(0xffd30000, 0, 0, 0x10000);
            gl10.glRotatex(0xffa60000, 0x10000, 0, 0);
            s.d(d1);
            q.a(gl10);
            j1 = E;
            i1 = F;
            d1 = bitmap;
        } else
        {
            if (flag)
            {
                com.google.android.m4b.maps.bx.n.a(gl10, b1);
            } else
            {
                gl10.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
            }
            gl10.glRotatef(f1, 0.0F, 1.0F, 0.0F);
            r.d(d1);
            p.a(gl10);
            j1 = C;
            i1 = D;
            gl10.glBlendFunc(1, 771);
            gl10.glTexEnvx(8960, 8704, 8448);
            gl10.glColor4f(f2, f2, f2, f2);
            d1 = bitmap1;
        }
        k1 = -(c << 16) / d1.getWidth();
        l1 = (d << 16) / d1.getHeight();
        gl10.glScalex(j1 << 16, 0x10000, i1 << 16);
        gl10.glTranslatex(k1, 0, l1 - 0x10000);
        gl10.glDrawArrays(5, 0, 4);
        gl10.glPopMatrix();
        return;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
_L4:
        if (p == null)
        {
            p = a(d1, bitmap1);
            r = a(p);
        }
          goto _L11
_L9:
        if ((b1.b.d - f1) % 90F != 0.0F) goto _L7; else goto _L12
_L12:
        i1 = 1;
          goto _L13
_L7:
        i1 = 0;
          goto _L13
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
          goto _L11
    }

    public final void a(g g1)
    {
        this;
        JVM INSTR monitorenter ;
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_11;
        }
        o = g1;
        this;
        JVM INSTR monitorexit ;
        return;
        g1;
        throw g1;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        y = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = w;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a(b b1)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag = flag2;
        if (!w) goto _L2; else goto _L1
_L1:
        Bitmap bitmap = a;
        if (bitmap != null) goto _L4; else goto _L3
_L3:
        flag = flag2;
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        if (R == null)
        {
            c(b1);
        }
        if (b1.h().equals(H))
        {
            flag = G;
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (R.left >= b1.h)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        flag = flag1;
        if (R.right < 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        flag = flag1;
        if (R.top >= b1.i)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        flag = flag1;
        if (R.bottom >= 0)
        {
            flag = true;
        }
        G = flag;
        H = b1.h();
        flag = G;
        if (true) goto _L2; else goto _L5
_L5:
        b1;
        throw b1;
    }

    public final void b()
    {
        i = true;
    }

    public final void b(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        A = f1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        w = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean b(float f1, float f2, b b1)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap = a;
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        int i1 = a(f1, f2, b1);
        if (i1 == 0)
        {
            flag = true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        b1;
        throw b1;
    }

    public final boolean b(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = w;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return true;
_L2:
        double d2;
        double d3;
        int i1;
        int k1;
        t = b1.a(1.0F, b1.e);
        b1.a(o, I);
        u = (int)(I[1] * 65536F);
        c(b1);
        d2 = Math.cos(Math.toRadians(-z));
        d3 = Math.sin(Math.toRadians(-z));
        i1 = O - l;
        k1 = -(P - m);
        double d1;
        d1 = (double)i1 * d2 - (double)k1 * d3;
        double d4 = i1;
        d2 = d2 * (double)k1 + d3 * d4;
        if (!y)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        ah.a(b1, f(), (int)d1, (int)d2, L);
          goto _L1
        b1;
        throw b1;
        float f1 = b1.e;
        b1 = L;
        int j1 = o.a;
        int l1 = (int)((double)t * d1);
        int i2 = o.b;
        b1.a(j1 + l1, (int)(d2 * (double)t) + i2, o.c);
          goto _L1
    }

    public final void c()
    {
        i = false;
        if (j)
        {
            j = false;
            h.c(this);
        }
    }

    public final int compareTo(Object obj)
    {
        obj = (m)obj;
        if (u == ((m) (obj)).u)
        {
            return Q - ((m) (obj)).Q;
        } else
        {
            return u - ((m) (obj)).u;
        }
    }

    public final com.google.android.m4b.maps.ak.b d()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ak.b b1 = new com.google.android.m4b.maps.ak.b(o.a(), o.c());
        this;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int e()
    {
        int i1 = 0;
        if (p != null)
        {
            p.c();
            i1 = p.l;
            p = null;
        }
        return i1;
    }

    public final g f()
    {
        this;
        JVM INSTR monitorenter ;
        g g1 = o;
        this;
        JVM INSTR monitorexit ;
        return g1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int g()
    {
        int i1 = 0;
        if (q != null)
        {
            q.c();
            i1 = q.l;
            q = null;
        }
        return i1;
    }

    public final Rect h()
    {
        this;
        JVM INSTR monitorenter ;
        Rect rect = R;
        this;
        JVM INSTR monitorexit ;
        return rect;
        Exception exception;
        exception;
        throw exception;
    }

    public final g j()
    {
        return L;
    }

    public final String k()
    {
        return e;
    }

    public final boolean l()
    {
        return v;
    }

    public final com.google.android.m4b.maps.ak.c n_()
    {
        return null;
    }

}
