// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import android.os.Handler;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.squareup.a:
//            e, f, a, bb, 
//            ax, ac, bm, bi, 
//            ak, g, h, i, 
//            j, ar, af, k, 
//            be, aq, ag, bc, 
//            y, ai, r, bh

class d
    implements Runnable
{

    private static final Object t = new Object();
    private static final ThreadLocal u = new e();
    private static final AtomicInteger v = new AtomicInteger();
    private static final bb w = new f();
    final int a;
    final ak b;
    final r c;
    final k d;
    final be e;
    final String f;
    final ax g;
    final int h;
    int i;
    final bb j;
    a k;
    List l;
    Bitmap m;
    Future n;
    aq o;
    Exception p;
    int q;
    int r;
    ar s;

    d(ak ak1, r r1, k k1, be be1, a a1, bb bb1)
    {
        a = v.incrementAndGet();
        b = ak1;
        c = r1;
        d = k1;
        e = be1;
        k = a1;
        f = a1.e();
        g = a1.c();
        s = a1.k();
        h = a1.h();
        i = a1.i();
        j = bb1;
        r = bb1.a();
    }

    static Bitmap a(ax ax1, Bitmap bitmap, int i1)
    {
        Object obj;
        int j1;
        int k1;
        boolean flag4;
        j1 = bitmap.getWidth();
        k1 = bitmap.getHeight();
        flag4 = ax1.l;
        obj = new Matrix();
        if (!ax1.f()) goto _L2; else goto _L1
_L1:
        float f1;
        int l1;
        int i2;
        int l2;
        int i3;
        l2 = ax1.h;
        i3 = ax1.i;
        f1 = ax1.m;
        float f7;
        if (f1 != 0.0F)
        {
            if (ax1.p)
            {
                ((Matrix) (obj)).setRotate(f1, ax1.n, ax1.o);
            } else
            {
                ((Matrix) (obj)).setRotate(f1);
            }
        }
        if (!ax1.j) goto _L4; else goto _L3
_L3:
        float f4 = (float)l2 / (float)j1;
        f1 = (float)i3 / (float)k1;
        int j2;
        int k2;
        if (f4 > f1)
        {
            f7 = k1;
            i2 = (int)Math.ceil((f1 / f4) * f7);
            l1 = (k1 - i2) / 2;
            f1 = (float)i3 / (float)i2;
            j2 = 0;
            k2 = j1;
        } else
        {
            float f8 = j1;
            k2 = (int)Math.ceil((f4 / f1) * f8);
            j2 = (j1 - k2) / 2;
            f4 = (float)l2 / (float)k2;
            l1 = 0;
            i2 = k1;
        }
        if (a(flag4, j1, k1, l2, i3))
        {
            ((Matrix) (obj)).preScale(f4, f1);
        }
        j1 = j2;
        k1 = l1;
        l1 = k2;
_L6:
        if (i1 != 0)
        {
            ((Matrix) (obj)).preRotate(i1);
        }
        obj = Bitmap.createBitmap(bitmap, j1, k1, l1, i2, ((Matrix) (obj)), true);
        ax1 = bitmap;
        if (obj != bitmap)
        {
            bitmap.recycle();
            ax1 = ((ax) (obj));
        }
        return ax1;
_L4:
        if (ax1.k)
        {
            float f2 = (float)l2 / (float)j1;
            float f5 = (float)i3 / (float)k1;
            boolean flag;
            boolean flag2;
            if (f2 >= f5)
            {
                f2 = f5;
            }
            if (a(flag4, j1, k1, l2, i3))
            {
                ((Matrix) (obj)).preScale(f2, f2);
            }
            flag = false;
            flag2 = false;
            i2 = k1;
            l1 = j1;
            j1 = ((flag2) ? 1 : 0);
            k1 = ((flag) ? 1 : 0);
            continue; /* Loop/switch isn't completed */
        }
        if ((l2 != 0 || i3 != 0) && (l2 != j1 || i3 != k1))
        {
            float f3;
            float f6;
            boolean flag1;
            boolean flag3;
            if (l2 != 0)
            {
                f3 = (float)l2 / (float)j1;
            } else
            {
                f3 = (float)i3 / (float)k1;
            }
            if (i3 != 0)
            {
                f6 = (float)i3 / (float)k1;
            } else
            {
                f6 = (float)l2 / (float)j1;
            }
            if (a(flag4, j1, k1, l2, i3))
            {
                ((Matrix) (obj)).preScale(f3, f6);
            }
        }
_L2:
        flag1 = false;
        flag3 = false;
        i2 = k1;
        l1 = j1;
        j1 = ((flag3) ? 1 : 0);
        k1 = ((flag1) ? 1 : 0);
        if (true) goto _L6; else goto _L5
_L5:
    }

    static Bitmap a(InputStream inputstream, ax ax1)
    {
        InputStream inputstream1 = new ac(inputstream);
        long l1 = inputstream1.a(0x10000);
        inputstream = bb.c(ax1);
        boolean flag = bb.a(inputstream);
        boolean flag1 = bm.c(inputstream1);
        inputstream1.a(l1);
        if (flag1)
        {
            inputstream1 = bm.b(inputstream1);
            if (flag)
            {
                BitmapFactory.decodeByteArray(inputstream1, 0, inputstream1.length, inputstream);
                bb.a(ax1.h, ax1.i, inputstream, ax1);
            }
            inputstream = BitmapFactory.decodeByteArray(inputstream1, 0, inputstream1.length, inputstream);
        } else
        {
            if (flag)
            {
                BitmapFactory.decodeStream(inputstream1, null, inputstream);
                bb.a(ax1.h, ax1.i, inputstream, ax1);
                inputstream1.a(l1);
            }
            ax1 = BitmapFactory.decodeStream(inputstream1, null, inputstream);
            inputstream = ax1;
            if (ax1 == null)
            {
                throw new IOException("Failed to decode stream.");
            }
        }
        return inputstream;
    }

    static Bitmap a(List list, Bitmap bitmap)
    {
        int j1 = list.size();
        for (int i1 = 0; i1 < j1;)
        {
            bi bi1 = (bi)list.get(i1);
            Bitmap bitmap1;
            try
            {
                bitmap1 = bi1.a(bitmap);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                ak.a.post(new g(bi1, list));
                return null;
            }
            if (bitmap1 == null)
            {
                bitmap = (new StringBuilder()).append("Transformation ").append(bi1.a()).append(" returned null after ").append(i1).append(" previous transformation(s).\n\nTransformation list:\n");
                for (list = list.iterator(); list.hasNext(); bitmap.append(((bi)list.next()).a()).append('\n')) { }
                ak.a.post(new h(bitmap));
                return null;
            }
            if (bitmap1 == bitmap && bitmap.isRecycled())
            {
                ak.a.post(new i(bi1));
                return null;
            }
            if (bitmap1 != bitmap && !bitmap.isRecycled())
            {
                ak.a.post(new j(bi1));
                return null;
            }
            i1++;
            bitmap = bitmap1;
        }

        return bitmap;
    }

    static d a(ak ak1, r r1, k k1, be be1, a a1)
    {
        ax ax1 = a1.c();
        List list = ak1.a();
        int i1 = 0;
        for (int j1 = list.size(); i1 < j1; i1++)
        {
            bb bb1 = (bb)list.get(i1);
            if (bb1.a(ax1))
            {
                return new d(ak1, r1, k1, be1, a1, bb1);
            }
        }

        return new d(ak1, r1, k1, be1, a1, w);
    }

    static void a(ax ax1)
    {
        ax1 = ax1.c();
        StringBuilder stringbuilder = (StringBuilder)u.get();
        stringbuilder.ensureCapacity("Picasso-".length() + ax1.length());
        stringbuilder.replace("Picasso-".length(), stringbuilder.length(), ax1);
        Thread.currentThread().setName(stringbuilder.toString());
    }

    private static boolean a(boolean flag, int i1, int j1, int k1, int l1)
    {
        return !flag || i1 > k1 || j1 > l1;
    }

    private ar o()
    {
        ar ar1;
        ar ar2;
        boolean flag;
        boolean flag2;
        boolean flag3 = true;
        flag2 = false;
        ar1 = ar.a;
        boolean flag1;
        if (l != null && !l.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag3;
        if (k == null)
        {
            if (flag)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1) goto _L2; else goto _L1
_L1:
        ar2 = ar1;
_L4:
        return ar2;
_L2:
        if (k != null)
        {
            ar1 = k.k();
        }
        ar2 = ar1;
        if (!flag)
        {
            continue;
        }
        int j1 = l.size();
        int i1 = ((flag2) ? 1 : 0);
        do
        {
            ar2 = ar1;
            if (i1 >= j1)
            {
                continue;
            }
            ar2 = ((a)l.get(i1)).k();
            if (ar2.ordinal() > ar1.ordinal())
            {
                ar1 = ar2;
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    Bitmap a()
    {
        Object obj = null;
        if (!af.a(h)) goto _L2; else goto _L1
_L1:
        Object obj2;
        obj2 = d.a(f);
        obj = obj2;
        if (obj2 == null) goto _L2; else goto _L3
_L3:
        Object obj1;
        e.a();
        o = aq.a;
        obj1 = obj2;
        if (b.l)
        {
            bm.a("Hunter", "decoded", g.a(), "from cache");
            obj1 = obj2;
        }
_L5:
        return ((Bitmap) (obj1));
_L2:
        obj1 = g;
        int i1;
        if (r == 0)
        {
            i1 = ag.c.d;
        } else
        {
            i1 = i;
        }
        obj1.c = i1;
        obj2 = j.a(g, i);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        o = ((bc) (obj2)).c();
        q = ((bc) (obj2)).d();
        obj1 = ((bc) (obj2)).a();
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj1 = ((bc) (obj2)).b();
        obj = a(((InputStream) (obj1)), g);
        bm.a(((InputStream) (obj1)));
        obj1 = obj;
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (b.l)
        {
            bm.a("Hunter", "decoded", g.a());
        }
        e.a(((Bitmap) (obj)));
        if (g.e())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (q == 0) goto _L5; else goto _L6
_L6:
        obj2 = t;
        obj2;
        JVM INSTR monitorenter ;
        if (g.f())
        {
            break MISSING_BLOCK_LABEL_256;
        }
        obj1 = obj;
        if (q == 0)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        obj = a(g, ((Bitmap) (obj)), q);
        obj1 = obj;
        if (!b.l)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        bm.a("Hunter", "transformed", g.a());
        obj1 = obj;
        obj = obj1;
        if (!g.g())
        {
            break MISSING_BLOCK_LABEL_356;
        }
        obj1 = a(g.g, ((Bitmap) (obj1)));
        obj = obj1;
        if (!b.l)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        bm.a("Hunter", "transformed", g.a(), "from custom transformations");
        obj = obj1;
        obj2;
        JVM INSTR monitorexit ;
        obj1 = obj;
        if (obj == null) goto _L5; else goto _L7
_L7:
        e.b(((Bitmap) (obj)));
        return ((Bitmap) (obj));
        Exception exception;
        exception;
        bm.a(((InputStream) (obj1)));
        throw exception;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void a(a a1)
    {
        ax ax1;
        boolean flag;
        flag = b.l;
        ax1 = a1.b;
        if (k != null) goto _L2; else goto _L1
_L1:
        k = a1;
        if (!flag) goto _L4; else goto _L3
_L3:
        if (l != null && !l.isEmpty()) goto _L6; else goto _L5
_L5:
        bm.a("Hunter", "joined", ax1.a(), "to empty hunter");
_L4:
        return;
_L6:
        bm.a("Hunter", "joined", ax1.a(), bm.a(this, "to "));
        return;
_L2:
        if (l == null)
        {
            l = new ArrayList(3);
        }
        l.add(a1);
        if (flag)
        {
            bm.a("Hunter", "joined", ax1.a(), bm.a(this, "to "));
        }
        a1 = a1.k();
        if (a1.ordinal() > s.ordinal())
        {
            s = a1;
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    boolean a(boolean flag, NetworkInfo networkinfo)
    {
        boolean flag1;
        if (r > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            return false;
        } else
        {
            r = r - 1;
            return j.a(flag, networkinfo);
        }
    }

    void b(a a1)
    {
        boolean flag = false;
        if (k != a1) goto _L2; else goto _L1
_L1:
        k = null;
        flag = true;
_L4:
        if (flag && a1.k() == s)
        {
            s = o();
        }
        if (b.l)
        {
            bm.a("Hunter", "removed", a1.b.a(), bm.a(this, "from "));
        }
        return;
_L2:
        if (l != null)
        {
            flag = l.remove(a1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean b()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (k != null)
            {
                break label0;
            }
            if (l != null)
            {
                flag = flag1;
                if (!l.isEmpty())
                {
                    break label0;
                }
            }
            flag = flag1;
            if (n != null)
            {
                flag = flag1;
                if (n.cancel(false))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    boolean c()
    {
        return n != null && n.isCancelled();
    }

    boolean d()
    {
        return j.b();
    }

    Bitmap e()
    {
        return m;
    }

    String f()
    {
        return f;
    }

    int g()
    {
        return h;
    }

    ax h()
    {
        return g;
    }

    a i()
    {
        return k;
    }

    ak j()
    {
        return b;
    }

    List k()
    {
        return l;
    }

    Exception l()
    {
        return p;
    }

    aq m()
    {
        return o;
    }

    ar n()
    {
        return s;
    }

    public void run()
    {
        a(g);
        if (b.l)
        {
            bm.a("Hunter", "executing", bm.a(this));
        }
        m = a();
        if (m != null) goto _L2; else goto _L1
_L1:
        c.c(this);
_L4:
        Thread.currentThread().setName("Picasso-Idle");
        return;
_L2:
        c.a(this);
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        if (!((y) (obj)).a || ((y) (obj)).b != 504)
        {
            p = ((Exception) (obj));
        }
        c.c(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj;
        p = ((Exception) (obj));
        c.b(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj;
        p = ((Exception) (obj));
        c.b(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj;
        StringWriter stringwriter = new StringWriter();
        e.e().a(new PrintWriter(stringwriter));
        p = new RuntimeException(stringwriter.toString(), ((Throwable) (obj)));
        c.c(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj;
        p = ((Exception) (obj));
        c.c(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj;
        Thread.currentThread().setName("Picasso-Idle");
        throw obj;
    }

}
