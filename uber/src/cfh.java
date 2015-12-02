// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

final class cfh
    implements Runnable
{

    private static final Object t = new Object();
    private static final ThreadLocal u = new ThreadLocal() {

        private static StringBuilder a()
        {
            return new StringBuilder("Picasso-");
        }

        protected final Object initialValue()
        {
            return a();
        }

    };
    private static final AtomicInteger v = new AtomicInteger();
    private static final cgu w = new cgu() {

        public final boolean a(cgr cgr1)
        {
            return true;
        }

        public final cgv b(cgr cgr1)
        {
            throw new IllegalStateException((new StringBuilder("Unrecognized type of request: ")).append(cgr1).toString());
        }

    };
    final int a;
    final cgh b;
    final cfo c;
    final cfi d;
    final cgx e;
    final String f;
    final cgr g;
    final int h;
    int i;
    final cgu j;
    cfe k;
    List l;
    Bitmap m;
    Future n;
    cgl o;
    Exception p;
    int q;
    int r;
    int s;

    private cfh(cgh cgh1, cfo cfo1, cfi cfi1, cgx cgx1, cfe cfe1, cgu cgu1)
    {
        a = v.incrementAndGet();
        b = cgh1;
        c = cfo1;
        d = cfi1;
        e = cgx1;
        k = cfe1;
        f = cfe1.e();
        g = cfe1.c();
        s = cfe1.k();
        h = cfe1.h();
        i = cfe1.i();
        j = cgu1;
        r = cgu1.a();
    }

    private static Bitmap a(cgr cgr1, Bitmap bitmap, int i1)
    {
        Object obj;
        int j1;
        int k1;
        boolean flag2;
        j1 = bitmap.getWidth();
        k1 = bitmap.getHeight();
        flag2 = cgr1.l;
        obj = new Matrix();
        if (!cgr1.f()) goto _L2; else goto _L1
_L1:
        float f1;
        int l1;
        int i2;
        int l2;
        int i3;
        l2 = cgr1.h;
        i3 = cgr1.i;
        f1 = cgr1.m;
        float f7;
        if (f1 != 0.0F)
        {
            if (cgr1.p)
            {
                ((Matrix) (obj)).setRotate(f1, cgr1.n, cgr1.o);
            } else
            {
                ((Matrix) (obj)).setRotate(f1);
            }
        }
        if (!cgr1.j) goto _L4; else goto _L3
_L3:
        float f4 = (float)l2 / (float)j1;
        f1 = (float)i3 / (float)k1;
        int j2;
        int k2;
        if (f4 > f1)
        {
            f7 = k1;
            k2 = (int)Math.ceil((f1 / f4) * f7);
            j2 = (k1 - k2) / 2;
            f1 = (float)i3 / (float)k2;
            i2 = 0;
            l1 = j1;
        } else
        {
            l1 = (int)Math.ceil((float)j1 * (f4 / f1));
            i2 = (j1 - l1) / 2;
            f4 = (float)l2 / (float)l1;
            j2 = 0;
            k2 = k1;
        }
        if (a(flag2, j1, k1, l2, i3))
        {
            ((Matrix) (obj)).preScale(f4, f1);
        }
        k1 = j2;
        j1 = i2;
        i2 = k2;
_L6:
        if (i1 != 0)
        {
            ((Matrix) (obj)).preRotate(i1);
        }
        obj = Bitmap.createBitmap(bitmap, j1, k1, l1, i2, ((Matrix) (obj)), true);
        cgr1 = bitmap;
        if (obj != bitmap)
        {
            bitmap.recycle();
            cgr1 = ((cgr) (obj));
        }
        return cgr1;
_L4:
        if (cgr1.k)
        {
            float f2 = (float)l2 / (float)j1;
            float f5 = (float)i3 / (float)k1;
            boolean flag;
            if (f2 >= f5)
            {
                f2 = f5;
            }
            if (a(flag2, j1, k1, l2, i3))
            {
                ((Matrix) (obj)).preScale(f2, f2);
            }
            flag = false;
            i2 = k1;
            k1 = 0;
            l1 = j1;
            j1 = ((flag) ? 1 : 0);
            continue; /* Loop/switch isn't completed */
        }
        if ((l2 != 0 || i3 != 0) && (l2 != j1 || i3 != k1))
        {
            float f3;
            float f6;
            boolean flag1;
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
            if (a(flag2, j1, k1, l2, i3))
            {
                ((Matrix) (obj)).preScale(f3, f6);
            }
        }
_L2:
        flag1 = false;
        i2 = k1;
        k1 = 0;
        l1 = j1;
        j1 = ((flag1) ? 1 : 0);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static Bitmap a(InputStream inputstream, cgr cgr1)
    {
        InputStream inputstream1 = new cfz(inputstream);
        long l1 = inputstream1.a(0x10000);
        inputstream = cgu.d(cgr1);
        boolean flag = cgu.a(inputstream);
        boolean flag1 = chf.c(inputstream1);
        inputstream1.a(l1);
        if (flag1)
        {
            inputstream1 = chf.b(inputstream1);
            if (flag)
            {
                BitmapFactory.decodeByteArray(inputstream1, 0, inputstream1.length, inputstream);
                cgu.a(cgr1.h, cgr1.i, inputstream, cgr1);
            }
            inputstream = BitmapFactory.decodeByteArray(inputstream1, 0, inputstream1.length, inputstream);
        } else
        {
            if (flag)
            {
                BitmapFactory.decodeStream(inputstream1, null, inputstream);
                cgu.a(cgr1.h, cgr1.i, inputstream, cgr1);
                inputstream1.a(l1);
            }
            cgr1 = BitmapFactory.decodeStream(inputstream1, null, inputstream);
            inputstream = cgr1;
            if (cgr1 == null)
            {
                throw new IOException("Failed to decode stream.");
            }
        }
        return inputstream;
    }

    private static Bitmap a(List list, Bitmap bitmap)
    {
        int j1 = list.size();
        for (int i1 = 0; i1 < j1;)
        {
            chc chc1 = (chc)list.get(i1);
            Bitmap bitmap1;
            try
            {
                bitmap1 = chc1.a(bitmap);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                cgh.a.post(new Runnable(chc1, list) {

                    final chc a;
                    final RuntimeException b;

                    public final void run()
                    {
                        throw new RuntimeException((new StringBuilder("Transformation ")).append(a.a()).append(" crashed with exception.").toString(), b);
                    }

            
            {
                a = chc1;
                b = runtimeexception;
                super();
            }
                });
                return null;
            }
            if (bitmap1 == null)
            {
                bitmap = (new StringBuilder("Transformation ")).append(chc1.a()).append(" returned null after ").append(i1).append(" previous transformation(s).\n\nTransformation list:\n");
                for (list = list.iterator(); list.hasNext(); bitmap.append(((chc)list.next()).a()).append('\n')) { }
                cgh.a.post(new Runnable(bitmap) {

                    final StringBuilder a;

                    public final void run()
                    {
                        throw new NullPointerException(a.toString());
                    }

            
            {
                a = stringbuilder;
                super();
            }
                });
                return null;
            }
            if (bitmap1 == bitmap && bitmap.isRecycled())
            {
                cgh.a.post(new Runnable(chc1) {

                    final chc a;

                    public final void run()
                    {
                        throw new IllegalStateException((new StringBuilder("Transformation ")).append(a.a()).append(" returned input Bitmap but recycled it.").toString());
                    }

            
            {
                a = chc1;
                super();
            }
                });
                return null;
            }
            if (bitmap1 != bitmap && !bitmap.isRecycled())
            {
                cgh.a.post(new Runnable(chc1) {

                    final chc a;

                    public final void run()
                    {
                        throw new IllegalStateException((new StringBuilder("Transformation ")).append(a.a()).append(" mutated input Bitmap but failed to recycle the original.").toString());
                    }

            
            {
                a = chc1;
                super();
            }
                });
                return null;
            }
            i1++;
            bitmap = bitmap1;
        }

        return bitmap;
    }

    static cfh a(cgh cgh1, cfo cfo1, cfi cfi1, cgx cgx1, cfe cfe1)
    {
        cgr cgr1 = cfe1.c();
        List list = cgh1.a();
        int i1 = 0;
        for (int j1 = list.size(); i1 < j1; i1++)
        {
            cgu cgu1 = (cgu)list.get(i1);
            if (cgu1.a(cgr1))
            {
                return new cfh(cgh1, cfo1, cfi1, cgx1, cfe1, cgu1);
            }
        }

        return new cfh(cgh1, cfo1, cfi1, cgx1, cfe1, w);
    }

    private static void a(cgr cgr1)
    {
        cgr1 = cgr1.c();
        StringBuilder stringbuilder = (StringBuilder)u.get();
        stringbuilder.ensureCapacity(cgr1.length() + 8);
        stringbuilder.replace(8, stringbuilder.length(), cgr1);
        Thread.currentThread().setName(stringbuilder.toString());
    }

    private static boolean a(boolean flag, int i1, int j1, int k1, int l1)
    {
        return !flag || i1 > k1 || j1 > l1;
    }

    private int o()
    {
        int i1;
        int j1;
        boolean flag;
        boolean flag1;
        boolean flag2 = true;
        flag1 = false;
        i1 = cgm.a;
        if (l != null && !l.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = ((flag2) ? 1 : 0);
        if (k == null)
        {
            if (flag)
            {
                j1 = ((flag2) ? 1 : 0);
            } else
            {
                j1 = 0;
            }
        }
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        j1 = i1;
_L4:
        return j1;
_L2:
        if (k != null)
        {
            i1 = k.k();
        }
        j1 = i1;
        if (!flag)
        {
            continue;
        }
        int l1 = l.size();
        int k1 = ((flag1) ? 1 : 0);
        do
        {
            j1 = i1;
            if (k1 >= l1)
            {
                continue;
            }
            j1 = ((cfe)l.get(k1)).k();
            if (j1 - 1 > i1 - 1)
            {
                i1 = j1;
            }
            k1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final Bitmap a()
    {
        Object obj = null;
        if (!cgc.a(h)) goto _L2; else goto _L1
_L1:
        Object obj2;
        obj2 = d.a(f);
        obj = obj2;
        if (obj2 == null) goto _L2; else goto _L3
_L3:
        Object obj1;
        e.a();
        o = cgl.a;
        obj1 = obj2;
        if (b.l)
        {
            chf.a("Hunter", "decoded", g.a(), "from cache");
            obj1 = obj2;
        }
_L5:
        return ((Bitmap) (obj1));
_L2:
        obj1 = g;
        int i1;
        if (r == 0)
        {
            i1 = cgd.c.d;
        } else
        {
            i1 = i;
        }
        obj1.c = i1;
        obj2 = j.b(g);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        o = ((cgv) (obj2)).c();
        q = ((cgv) (obj2)).d();
        obj1 = ((cgv) (obj2)).a();
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        obj1 = ((cgv) (obj2)).b();
        obj = a(((InputStream) (obj1)), g);
        chf.a(((InputStream) (obj1)));
        obj1 = obj;
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (b.l)
        {
            chf.a("Hunter", "decoded", g.a());
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
            break MISSING_BLOCK_LABEL_252;
        }
        obj1 = obj;
        if (q == 0)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        obj = a(g, ((Bitmap) (obj)), q);
        obj1 = obj;
        if (!b.l)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        chf.a("Hunter", "transformed", g.a());
        obj1 = obj;
        obj = obj1;
        if (!g.g())
        {
            break MISSING_BLOCK_LABEL_352;
        }
        obj1 = a(g.g, ((Bitmap) (obj1)));
        obj = obj1;
        if (!b.l)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        chf.a("Hunter", "transformed", g.a(), "from custom transformations");
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
        chf.a(((InputStream) (obj1)));
        throw exception;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(cfe cfe1)
    {
        cgr cgr1;
        boolean flag;
        flag = b.l;
        cgr1 = cfe1.b;
        if (k != null) goto _L2; else goto _L1
_L1:
        k = cfe1;
        if (!flag) goto _L4; else goto _L3
_L3:
        if (l != null && !l.isEmpty()) goto _L6; else goto _L5
_L5:
        chf.a("Hunter", "joined", cgr1.a(), "to empty hunter");
_L4:
        return;
_L6:
        chf.a("Hunter", "joined", cgr1.a(), chf.a(this, "to "));
        return;
_L2:
        if (l == null)
        {
            l = new ArrayList(3);
        }
        l.add(cfe1);
        if (flag)
        {
            chf.a("Hunter", "joined", cgr1.a(), chf.a(this, "to "));
        }
        int i1 = cfe1.k();
        if (i1 - 1 > s - 1)
        {
            s = i1;
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    final boolean a(NetworkInfo networkinfo)
    {
        boolean flag;
        if (r > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return false;
        } else
        {
            r = r - 1;
            return j.a(networkinfo);
        }
    }

    final void b(cfe cfe1)
    {
        boolean flag = false;
        if (k != cfe1) goto _L2; else goto _L1
_L1:
        k = null;
        flag = true;
_L4:
        if (flag && cfe1.k() == s)
        {
            s = o();
        }
        if (b.l)
        {
            chf.a("Hunter", "removed", cfe1.b.a(), chf.a(this, "from "));
        }
        return;
_L2:
        if (l != null)
        {
            flag = l.remove(cfe1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final boolean b()
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

    final boolean c()
    {
        return n != null && n.isCancelled();
    }

    final boolean d()
    {
        return j.b();
    }

    final Bitmap e()
    {
        return m;
    }

    final String f()
    {
        return f;
    }

    final int g()
    {
        return h;
    }

    final cgr h()
    {
        return g;
    }

    final cfe i()
    {
        return k;
    }

    final cgh j()
    {
        return b;
    }

    final List k()
    {
        return l;
    }

    final Exception l()
    {
        return p;
    }

    final cgl m()
    {
        return o;
    }

    final int n()
    {
        return s;
    }

    public final void run()
    {
        a(g);
        if (b.l)
        {
            chf.a("Hunter", "executing", chf.a(this));
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
        if (!((cfu) (obj)).a || ((cfu) (obj)).b != 504)
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
