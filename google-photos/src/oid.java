// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public final class oid
{

    static final oib a = new oic(64);
    private int A;
    private int B;
    private final Rect C[] = {
        new Rect(), new Rect()
    };
    private boolean D;
    private View E;
    final jo b = new jo();
    final Object c = new Object();
    final oig d = new oig();
    final oig e = new oig();
    final oig f = new oig();
    int g;
    int h;
    float i;
    boolean j;
    final Rect k = new Rect();
    oif l;
    int m;
    int n;
    private int o;
    private oih p;
    private mzm q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private final RectF x = new RectF();
    private final RectF y = new RectF();
    private int z;

    public oid(View view)
    {
        s = 0;
        z = -1;
        A = -1;
        E = view;
        l = new oif(this);
        l.setName("TileDecoder");
        l.start();
    }

    public static int a(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        boolean flag;
        if (displaymetrics.heightPixels > 2048 || displaymetrics.widthPixels > 2048)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag ? 256 : 512;
    }

    static int a(oid oid1)
    {
        return oid1.o;
    }

    private oie a(int i1, int j1, int k1)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        oie oie1 = d.a();
        if (oie1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        oie1.l = 1;
        oie1.a(i1, j1, k1);
        obj;
        JVM INSTR monitorexit ;
        return oie1;
        oie1 = new oie(this, i1, j1, k1);
        obj;
        JVM INSTR monitorexit ;
        return oie1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Rect rect, int i1, int j1, int k1, float f1, int l1)
    {
        double d4 = Math.toRadians(-l1);
        double d1 = m;
        double d2 = n;
        double d3 = Math.cos(d4);
        d4 = Math.sin(d4);
        int i2 = (int)Math.ceil(Math.max(Math.abs(d3 * d1 - d4 * d2), Math.abs(d3 * d1 + d4 * d2)));
        l1 = (int)Math.ceil(Math.max(Math.abs(d4 * d1 + d3 * d2), Math.abs(d4 * d1 - d3 * d2)));
        i1 = (int)Math.floor((float)i1 - (float)i2 / (2.0F * f1));
        j1 = (int)Math.floor((float)j1 - (float)l1 / (2.0F * f1));
        i2 = (int)Math.ceil((float)i1 + (float)i2 / f1);
        float f2 = j1;
        l1 = (int)Math.ceil((float)l1 / f1 + f2);
        k1 = o << k1;
        rect.set(Math.max(0, (i1 / k1) * k1), Math.max(0, (j1 / k1) * k1), Math.min(z, i2), Math.min(A, l1));
    }

    static void a(oid oid1, oie oie1)
    {
label0:
        {
            synchronized (oid1.c)
            {
                if (oie1.l == 2)
                {
                    break label0;
                }
            }
            return;
        }
        oie1.l = 4;
        obj;
        JVM INSTR monitorexit ;
        boolean flag;
        flag = oie1.m();
        synchronized (oid1.c)
        {
            if (oie1.l != 32)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            oie1.l = 64;
            if (oie1.k != null)
            {
                a.a(oie1.k);
                oie1.k = null;
            }
            oid1.d.a(oie1);
        }
        return;
        oid1;
        obj;
        JVM INSTR monitorexit ;
        throw oid1;
        oid1;
        obj;
        JVM INSTR monitorexit ;
        throw oid1;
        int i1;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 16;
        }
        oie1.l = i1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        oid1.e.a(oie1);
        obj;
        JVM INSTR monitorexit ;
        oid1.E.postInvalidate();
        return;
    }

    private void a(oie oie1)
    {
        synchronized (c)
        {
            if (oie1.l == 1)
            {
                oie1.l = 2;
                if (f.a(oie1))
                {
                    c.notifyAll();
                }
            }
        }
        return;
        oie1;
        obj;
        JVM INSTR monitorexit ;
        throw oie1;
    }

    private boolean a(oie oie1, mzo mzo1, RectF rectf, RectF rectf1)
    {
        oie oie2 = oie1;
        do
        {
            if (oie2.l())
            {
                mzo1.a(oie2, rectf, rectf1);
                return true;
            }
            if (oie2.i + 1 == oie2.m.r)
            {
                oie1 = null;
            } else
            {
                int i1 = oie2.m.o << oie2.i + 1;
                int j1 = oie2.g / i1;
                int k1 = oie2.h / i1;
                oie1 = oie2.m.b(j1 * i1, i1 * k1, oie2.i + 1);
            }
            if (oie1 == null)
            {
                return false;
            }
            if (oie2.g == oie1.g)
            {
                rectf.left = rectf.left / 2.0F;
                rectf.right = rectf.right / 2.0F;
            } else
            {
                rectf.left = ((float)o + rectf.left) / 2.0F;
                rectf.right = ((float)o + rectf.right) / 2.0F;
            }
            if (oie2.h == oie1.h)
            {
                rectf.top = rectf.top / 2.0F;
                rectf.bottom = rectf.bottom / 2.0F;
            } else
            {
                rectf.top = ((float)o + rectf.top) / 2.0F;
                rectf.bottom = ((float)o + rectf.bottom) / 2.0F;
            }
            oie2 = oie1;
        } while (true);
    }

    static oib b()
    {
        return a;
    }

    private oie b(int i1, int j1, int k1)
    {
        return (oie)b.get(c(i1, j1, k1));
    }

    static oih b(oid oid1)
    {
        return oid1.p;
    }

    private void b(oie oie1)
    {
label0:
        {
            synchronized (c)
            {
                if (oie1.l != 4)
                {
                    break label0;
                }
                oie1.l = 32;
            }
            return;
        }
        oie1.l = 64;
        if (oie1.k != null)
        {
            a.a(oie1.k);
            oie1.k = null;
        }
        d.a(oie1);
        obj;
        JVM INSTR monitorexit ;
        return;
        oie1;
        obj;
        JVM INSTR monitorexit ;
        throw oie1;
    }

    static int c(oid oid1)
    {
        return oid1.z;
    }

    private static long c(int i1, int j1, int k1)
    {
        return ((long)i1 << 16 | (long)j1) << 16 | (long)k1;
    }

    private void c()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        int j1;
        f.a = null;
        e.a = null;
        j1 = b.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        b((oie)b.valueAt(i1));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        b.clear();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static int d(oid oid1)
    {
        return oid1.A;
    }

    private void d()
    {
        D = true;
        int j1 = b.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            oie oie1 = (oie)b.valueAt(i1);
            if (!oie1.l())
            {
                a(oie1);
            }
        }

    }

    static int e(oid oid1)
    {
        return oid1.r;
    }

    static int f(oid oid1)
    {
        return oid1.s;
    }

    static Object g(oid oid1)
    {
        return oid1.c;
    }

    static oig h(oid oid1)
    {
        return oid1.f;
    }

    public final void a()
    {
        j = true;
        l.interrupt();
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        oie oie1;
        e.a = null;
        f.a = null;
        oie1 = d.a();
_L1:
        if (oie1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        oie1.h();
        oie1 = d.a();
          goto _L1
        obj;
        JVM INSTR monitorexit ;
        int j1 = b.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((oie)b.valueAt(i1)).h();
        }

        break MISSING_BLOCK_LABEL_107;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        b.clear();
        k.set(0, 0, 0, 0);
        while (a.a() != null) ;
        return;
    }

    public final void a(oih oih1, int i1)
    {
        if (p != oih1)
        {
            p = oih1;
            c();
            if (p == null)
            {
                z = 0;
                A = 0;
                r = 0;
                q = null;
            } else
            {
                z = p.b();
                A = p.c();
                q = p.d();
                o = p.a();
                if (q != null)
                {
                    r = Math.max(0, mzl.a((float)z / (float)q.b()));
                } else
                {
                    int l1 = Math.max(z, A);
                    int k1 = o;
                    int j1;
                    for (j1 = 1; k1 < l1; j1++)
                    {
                        k1 <<= 1;
                    }

                    r = j1;
                }
            }
            j = true;
        }
        if (B != i1)
        {
            B = i1;
            j = true;
        }
    }

    public final boolean a(mzo mzo1)
    {
        int i1;
        if (m != 0 && n != 0 && j) goto _L2; else goto _L1
_L2:
        j = false;
        s = mzl.a(mzl.b(1.0F / i), 0, r);
        if (s != r)
        {
            obj = k;
            a(((Rect) (obj)), g, h, s, i, B);
            t = Math.round((float)m / 2.0F + (float)(((Rect) (obj)).left - g) * i);
            u = Math.round((float)n / 2.0F + (float)(((Rect) (obj)).top - h) * i);
            int j1;
            int l1;
            int i3;
            if (i * (float)(1 << s) > 0.75F)
            {
                i1 = s - 1;
            } else
            {
                i1 = s;
            }
        } else
        {
            i1 = s - 2;
            t = Math.round((float)m / 2.0F - (float)g * i);
            u = Math.round((float)n / 2.0F - (float)h * i);
        }
        j2 = Math.max(0, Math.min(i1, r - 2));
        k3 = Math.min(j2 + 2, r);
        obj = C;
        for (i1 = j2; i1 < k3; i1++)
        {
            obj1 = obj[i1 - j2];
            j1 = g;
            l1 = h;
            i3 = B;
            a(((Rect) (obj1)), j1, l1, i1, Math.scalb(1.0F, -(i1 + 1)), i3);
        }

        if (B % 90 != 0) goto _L1; else goto _L3
_L3:
        obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        f.a = null;
        e.a = null;
        D = false;
        i1 = b.size();
        int k1 = 0;
_L28:
        if (k1 >= i1) goto _L5; else goto _L4
_L4:
        oie1 = (oie)b.valueAt(k1);
        i4 = oie1.i;
        if (i4 < j2 || i4 >= k3) goto _L7; else goto _L6
_L6:
        int i2;
        int j3;
        j3 = k1;
        i2 = i1;
        if (obj[i4 - j2].contains(oie1.g, oie1.h)) goto _L8; else goto _L7
_L7:
        b.removeAt(k1);
        j3 = k1 - 1;
        i2 = i1 - 1;
        b(oie1);
          goto _L8
_L5:
        obj1;
        JVM INSTR monitorexit ;
        i1 = j2;
_L13:
        if (i1 >= k3) goto _L10; else goto _L9
_L9:
        j3 = o << i1;
        obj1 = obj[i1 - j2];
        k1 = ((Rect) (obj1)).top;
        i4 = ((Rect) (obj1)).bottom;
_L12:
        if (k1 >= i4)
        {
            continue; /* Loop/switch isn't completed */
        }
        i2 = ((Rect) (obj1)).left;
        int k4 = ((Rect) (obj1)).right;
        while (i2 < k4) 
        {
            long l5 = c(i2, k1, i1);
            oie oie2 = (oie)b.get(l5);
            if (oie2 != null)
            {
                if (oie2.l == 2)
                {
                    oie2.l = 1;
                }
            } else
            {
                oie oie3 = a(i2, k1, i1);
                b.put(l5, oie3);
            }
            i2 += j3;
        }
        break MISSING_BLOCK_LABEL_756;
        mzo1;
        obj1;
        JVM INSTR monitorexit ;
        throw mzo1;
        k1 += j3;
        if (true) goto _L12; else goto _L11
_L11:
        i1++;
          goto _L13
_L10:
        E.postInvalidate();
          goto _L1
        mzo1;
        obj;
        JVM INSTR monitorexit ;
        throw mzo1;
_L1:
        int l2;
        int j4;
        i1 = 1;
        obj = null;
        do
        {
            if (i1 <= 0)
            {
                break;
            }
            Object obj1;
            synchronized (c)
            {
                obj1 = e.a();
            }
            obj = obj1;
            if (obj1 == null)
            {
                break;
            }
            obj = obj1;
            oie oie1;
            int j2;
            int k3;
            int i4;
            if (!((oie) (obj1)).l())
            {
                if (((oie) (obj1)).l == 8)
                {
                    ((oie) (obj1)).b(mzo1);
                    i1--;
                    obj = obj1;
                } else
                {
                    k1 = ((oie) (obj1)).l;
                    Log.w("TiledImageRenderer", (new StringBuilder(51)).append("Tile in upload queue has invalid state: ").append(k1).toString());
                    obj = obj1;
                }
            }
        } while (true);
        if (obj != null)
        {
            E.postInvalidate();
        }
        v = 1;
        w = true;
        int l3 = s;
        k1 = B;
        float f1;
        float f2;
        float f3;
        float f4;
        Rect rect;
        Exception exception;
        RectF rectf;
        RectF rectf1;
        oie oie4;
        int l4;
        if (k1 != 0)
        {
            i1 = 2;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            mzo1.a(2);
            if (k1 != 0)
            {
                i2 = m / 2;
                int k2 = n / 2;
                mzo1.a(i2, k2);
                mzo1.a(k1, 0.0F, 0.0F, 1.0F);
                mzo1.a(-i2, -k2);
            }
        }
        if (l3 == r) goto _L15; else goto _L14
_L14:
        j4 = o << l3;
        f1 = (float)j4 * i;
        rect = k;
        i2 = rect.top;
        k1 = 0;
_L30:
        if (i2 >= rect.bottom) goto _L17; else goto _L16
_L16:
        f2 = (float)u + (float)k1 * f1;
        j3 = rect.left;
        l2 = 0;
_L29:
        if (j3 >= rect.right)
        {
            break MISSING_BLOCK_LABEL_1453;
        }
        f3 = (float)t + (float)l2 * f1;
        rectf = x;
        rectf1 = y;
        rectf1.set(f3, f2, f3 + f1, f2 + f1);
        rectf.set(0.0F, 0.0F, o, o);
        oie4 = b(j3, i2, l3);
        if (oie4 == null) goto _L19; else goto _L18
_L18:
        if (oie4.l()) goto _L21; else goto _L20
_L20:
        if (oie4.l != 8) goto _L23; else goto _L22
_L22:
        if (v <= 0) goto _L25; else goto _L24
_L24:
        v = v - 1;
        oie4.b(mzo1);
_L21:
        if (a(oie4, mzo1, rectf, rectf1)) goto _L26; else goto _L19
_L19:
        if (q != null)
        {
            l4 = o << l3;
            f3 = (float)q.b() / (float)z;
            f4 = (float)q.c() / (float)A;
            rectf.set((float)j3 * f3, (float)i2 * f4, f3 * (float)(j3 + l4), (float)(l4 + i2) * f4);
            mzo1.a(q, rectf, rectf1);
        }
          goto _L26
_L25:
        w = false;
          goto _L21
        exception;
        if (i1 != 0)
        {
            mzo1.b();
        }
        throw exception;
_L23:
        if (oie4.l == 16) goto _L21; else goto _L27
_L27:
        w = false;
        a(oie4);
          goto _L21
_L15:
        if (q != null)
        {
            mzo1.a(q, t, u, Math.round((float)z * i), Math.round((float)A * i));
        }
_L17:
        if (i1 != 0)
        {
            mzo1.b();
        }
        if (w)
        {
            if (!D)
            {
                d();
            }
        } else
        {
            E.postInvalidate();
        }
        return w || q != null;
_L8:
        i1 = i2;
        k1 = j3 + 1;
          goto _L28
_L26:
        j3 += j4;
        l2++;
          goto _L29
        i2 += j4;
        k1++;
          goto _L30
    }

}
