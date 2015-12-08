// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.squareup.picasso:
//            a, r, t, z, 
//            Picasso, MemoryPolicy, d, v, 
//            ab, NetworkPolicy, n, i, 
//            w

final class c
    implements Runnable
{

    private static final Object t = new Object();
    private static final ThreadLocal u = new ThreadLocal() {

        protected final Object initialValue()
        {
            return new StringBuilder("Picasso-");
        }

    };
    private static final AtomicInteger v = new AtomicInteger();
    private static final t w = new t() {

        public final boolean a(r r1)
        {
            return true;
        }

        public final t.a b(r r1)
            throws IOException
        {
            throw new IllegalStateException((new StringBuilder("Unrecognized type of request: ")).append(r1).toString());
        }

    };
    final int a;
    final Picasso b;
    final i c;
    final d d;
    final v e;
    final String f;
    final r g;
    final int h;
    int i;
    final t j;
    a k;
    List l;
    Bitmap m;
    Future n;
    Picasso.LoadedFrom o;
    Exception p;
    int q;
    int r;
    Picasso.Priority s;

    private c(Picasso picasso, i i1, d d1, v v1, a a1, t t1)
    {
        a = v.incrementAndGet();
        b = picasso;
        c = i1;
        d = d1;
        e = v1;
        k = a1;
        f = a1.i;
        g = a1.b;
        s = a1.b.r;
        h = a1.e;
        i = a1.f;
        j = t1;
        r = t1.a();
    }

    private static Bitmap a(List list, Bitmap bitmap)
    {
        int j1 = list.size();
        for (int i1 = 0; i1 < j1;)
        {
            z z1 = (z)list.get(i1);
            Bitmap bitmap1;
            try
            {
                bitmap1 = z1.transform(bitmap);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                Picasso.a.post(new Runnable(z1, list) {

                    final z a;
                    final RuntimeException b;

                    public final void run()
                    {
                        throw new RuntimeException((new StringBuilder("Transformation ")).append(a.key()).append(" crashed with exception.").toString(), b);
                    }

            
            {
                a = z1;
                b = runtimeexception;
                super();
            }
                });
                return null;
            }
            if (bitmap1 == null)
            {
                bitmap = (new StringBuilder("Transformation ")).append(z1.key()).append(" returned null after ").append(i1).append(" previous transformation(s).\n\nTransformation list:\n");
                for (list = list.iterator(); list.hasNext(); bitmap.append(((z)list.next()).key()).append('\n')) { }
                Picasso.a.post(new Runnable(bitmap) {

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
                Picasso.a.post(new Runnable(z1) {

                    final z a;

                    public final void run()
                    {
                        throw new IllegalStateException((new StringBuilder("Transformation ")).append(a.key()).append(" returned input Bitmap but recycled it.").toString());
                    }

            
            {
                a = z1;
                super();
            }
                });
                return null;
            }
            if (bitmap1 != bitmap && !bitmap.isRecycled())
            {
                Picasso.a.post(new Runnable(z1) {

                    final z a;

                    public final void run()
                    {
                        throw new IllegalStateException((new StringBuilder("Transformation ")).append(a.key()).append(" mutated input Bitmap but failed to recycle the original.").toString());
                    }

            
            {
                a = z1;
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

    static c a(Picasso picasso, i i1, d d1, v v1, a a1)
    {
        r r1 = a1.b;
        List list = picasso.d;
        int j1 = 0;
        for (int k1 = list.size(); j1 < k1; j1++)
        {
            t t1 = (t)list.get(j1);
            if (t1.a(r1))
            {
                return new c(picasso, i1, d1, v1, a1, t1);
            }
        }

        return new c(picasso, i1, d1, v1, a1, w);
    }

    private static boolean a(boolean flag, int i1, int j1, int k1, int l1)
    {
        return !flag || i1 > k1 || j1 > l1;
    }

    private Bitmap c()
        throws IOException
    {
        Object obj = null;
        if (!MemoryPolicy.a(h)) goto _L2; else goto _L1
_L1:
        Object obj2;
        obj2 = d.a(f);
        obj = obj2;
        if (obj2 == null) goto _L2; else goto _L3
_L3:
        Object obj1;
        e.a();
        o = Picasso.LoadedFrom.a;
        obj1 = obj2;
        if (b.n)
        {
            ab.a("Hunter", "decoded", g.a(), "from cache");
            obj1 = obj2;
        }
_L10:
        return ((Bitmap) (obj1));
_L2:
        float f1;
        float f2;
        java.io.InputStream inputstream;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int l2;
        int i3;
        long l3;
        boolean flag1;
        obj1 = g;
        int k2;
        boolean flag2;
        if (r == 0)
        {
            i1 = NetworkPolicy.c.d;
        } else
        {
            i1 = i;
        }
        obj1.c = i1;
        obj2 = j.b(g);
        if (obj2 == null) goto _L5; else goto _L4
_L4:
        o = ((t.a) (obj2)).a;
        q = ((t.a) (obj2)).d;
        obj1 = ((t.a) (obj2)).b;
        obj = obj1;
        if (obj1 != null) goto _L5; else goto _L6
_L6:
        obj2 = ((t.a) (obj2)).c;
        obj = g;
        inputstream = new n(((java.io.InputStream) (obj2)));
        l3 = inputstream.a(0x10000);
        obj1 = com.squareup.picasso.t.d(((r) (obj)));
        flag1 = com.squareup.picasso.t.a(((android.graphics.BitmapFactory.Options) (obj1)));
        flag2 = ab.c(inputstream);
        inputstream.a(l3);
        if (!flag2) goto _L8; else goto _L7
_L7:
        inputstream = ab.b(inputstream);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        com.squareup.picasso.t.a(((r) (obj)).h, ((r) (obj)).i, ((android.graphics.BitmapFactory.Options) (obj1)), ((r) (obj)));
        obj = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length, ((android.graphics.BitmapFactory.Options) (obj1)));
_L28:
        ab.a(((java.io.InputStream) (obj2)));
_L5:
        obj1 = obj;
        if (obj == null) goto _L10; else goto _L9
_L9:
        if (b.n)
        {
            ab.a("Hunter", "decoded", g.a());
        }
        e.a(((Bitmap) (obj)), 2);
        obj1 = g;
        Exception exception;
        if (((r) (obj1)).d() || ((r) (obj1)).e())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (q == 0) goto _L10; else goto _L11
_L11:
        inputstream = ((java.io.InputStream) (t));
        inputstream;
        JVM INSTR monitorenter ;
        if (g.d()) goto _L13; else goto _L12
_L12:
        obj2 = obj;
        if (q == 0) goto _L14; else goto _L13
_L13:
        obj1 = g;
        k2 = q;
        i1 = ((Bitmap) (obj)).getWidth();
        j1 = ((Bitmap) (obj)).getHeight();
        flag1 = ((r) (obj1)).l;
        obj2 = new Matrix();
        if (!((r) (obj1)).d()) goto _L16; else goto _L15
_L15:
        l2 = ((r) (obj1)).h;
        i3 = ((r) (obj1)).i;
        f1 = ((r) (obj1)).m;
        if (f1 == 0.0F) goto _L18; else goto _L17
_L17:
        if (!((r) (obj1)).p) goto _L20; else goto _L19
_L19:
        ((Matrix) (obj2)).setRotate(f1, ((r) (obj1)).n, ((r) (obj1)).o);
_L18:
        if (!((r) (obj1)).j) goto _L22; else goto _L21
_L21:
        f1 = (float)l2 / (float)i1;
        f2 = (float)i3 / (float)j1;
        if (f1 <= f2) goto _L24; else goto _L23
_L23:
        k1 = (int)Math.ceil((float)j1 * (f2 / f1));
        j2 = (j1 - k1) / 2;
        f2 = (float)i3 / (float)k1;
        l1 = i1;
        i2 = 0;
_L29:
        if (a(flag1, i1, j1, l2, i3))
        {
            ((Matrix) (obj2)).preScale(f1, f2);
        }
          goto _L25
_L37:
        if (k2 == 0)
        {
            break MISSING_BLOCK_LABEL_622;
        }
        ((Matrix) (obj2)).preRotate(k2);
        obj2 = Bitmap.createBitmap(((Bitmap) (obj)), i1, j1, l1, k1, ((Matrix) (obj2)), true);
        obj1 = obj;
        if (obj2 == obj)
        {
            break MISSING_BLOCK_LABEL_660;
        }
        ((Bitmap) (obj)).recycle();
        obj1 = obj2;
        obj2 = obj1;
        if (!b.n) goto _L14; else goto _L26
_L26:
        ab.a("Hunter", "transformed", g.a());
        obj2 = obj1;
_L14:
        obj = obj2;
        if (!g.e())
        {
            break MISSING_BLOCK_LABEL_757;
        }
        obj1 = a(g.g, ((Bitmap) (obj2)));
        obj = obj1;
        if (!b.n)
        {
            break MISSING_BLOCK_LABEL_757;
        }
        ab.a("Hunter", "transformed", g.a(), "from custom transformations");
        obj = obj1;
        inputstream;
        JVM INSTR monitorexit ;
        obj1 = obj;
        if (obj != null)
        {
            e.a(((Bitmap) (obj)), 3);
            return ((Bitmap) (obj));
        }
          goto _L10
_L8:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_829;
        }
        BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj1)));
        com.squareup.picasso.t.a(((r) (obj)).h, ((r) (obj)).i, ((android.graphics.BitmapFactory.Options) (obj1)), ((r) (obj)));
        inputstream.a(l3);
        obj1 = BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj1)));
        obj = obj1;
        if (obj1 != null) goto _L28; else goto _L27
_L27:
        throw new IOException("Failed to decode stream.");
        exception;
        ab.a(((java.io.InputStream) (obj2)));
        throw exception;
_L20:
        ((Matrix) (obj2)).setRotate(f1);
          goto _L18
        Exception exception1;
        exception1;
        inputstream;
        JVM INSTR monitorexit ;
        throw exception1;
_L24:
        double d1 = (float)i1 * (f1 / f2);
        l1 = (int)Math.ceil(d1);
        i2 = (i1 - l1) / 2;
        f1 = (float)l2 / (float)l1;
        j2 = 0;
        k1 = j1;
          goto _L29
_L22:
        if (!((r) (obj1)).k) goto _L31; else goto _L30
_L30:
        f1 = (float)l2 / (float)i1;
        f2 = (float)i3 / (float)j1;
        if (f1 >= f2)
        {
            f1 = f2;
        }
        if (a(flag1, i1, j1, l2, i3))
        {
            ((Matrix) (obj2)).preScale(f1, f1);
        }
          goto _L32
_L40:
        if (l2 == 0) goto _L34; else goto _L33
_L33:
        f1 = (float)l2 / (float)i1;
_L38:
        if (i3 == 0) goto _L36; else goto _L35
_L35:
        f2 = (float)i3 / (float)j1;
_L39:
        if (a(flag1, i1, j1, l2, i3))
        {
            ((Matrix) (obj2)).preScale(f1, f2);
        }
_L16:
        i2 = 0;
        k1 = j1;
        l1 = i1;
        j1 = 0;
        i1 = i2;
          goto _L37
_L34:
        f1 = (float)i3 / (float)j1;
          goto _L38
_L36:
        f2 = (float)l2 / (float)i1;
          goto _L39
_L25:
        j1 = j2;
        i1 = i2;
          goto _L37
_L32:
        boolean flag = false;
        k1 = j1;
        l1 = i1;
        j1 = 0;
        i1 = ((flag) ? 1 : 0);
          goto _L37
_L31:
        if (l2 == 0 && i3 == 0 || l2 == i1 && i3 == j1) goto _L16; else goto _L40
    }

    final void a(a a1)
    {
        boolean flag1 = true;
        boolean flag = false;
        boolean flag2;
        if (k == a1)
        {
            k = null;
            flag2 = true;
        } else
        if (l != null)
        {
            flag2 = l.remove(a1);
        } else
        {
            flag2 = false;
        }
        if (flag2 && a1.b.r == s)
        {
            Picasso.Priority priority = Picasso.Priority.a;
            Picasso.Priority priority1;
            int i1;
            int j1;
            if (l != null && !l.isEmpty())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j1 = ((flag1) ? 1 : 0);
            if (k == null)
            {
                if (i1 != 0)
                {
                    j1 = ((flag1) ? 1 : 0);
                } else
                {
                    j1 = 0;
                }
            }
            if (j1 != 0)
            {
                if (k != null)
                {
                    priority = k.b.r;
                }
                priority1 = priority;
                if (i1 != 0)
                {
                    j1 = l.size();
                    i1 = ((flag) ? 1 : 0);
                    do
                    {
                        priority1 = priority;
                        if (i1 >= j1)
                        {
                            break;
                        }
                        priority1 = ((a)l.get(i1)).b.r;
                        if (priority1.ordinal() > priority.ordinal())
                        {
                            priority = priority1;
                        }
                        i1++;
                    } while (true);
                }
            } else
            {
                priority1 = priority;
            }
            s = priority1;
        }
        if (b.n)
        {
            ab.a("Hunter", "removed", a1.b.a(), ab.a(this, "from "));
        }
    }

    final boolean a()
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

    final boolean b()
    {
        return n != null && n.isCancelled();
    }

    public final void run()
    {
        Object obj = g;
        if (((r) (obj)).d == null) goto _L2; else goto _L1
_L1:
        obj = String.valueOf(((r) (obj)).d.getPath());
_L5:
        StringBuilder stringbuilder = (StringBuilder)u.get();
        stringbuilder.ensureCapacity(((String) (obj)).length() + 8);
        stringbuilder.replace(8, stringbuilder.length(), ((String) (obj)));
        Thread.currentThread().setName(stringbuilder.toString());
        if (b.n)
        {
            ab.a("Hunter", "executing", ab.a(this));
        }
        m = c();
        if (m != null) goto _L4; else goto _L3
_L3:
        c.b(this);
_L6:
        Thread.currentThread().setName("Picasso-Idle");
        return;
_L2:
        obj = Integer.toHexString(((r) (obj)).e);
          goto _L5
_L4:
        i i1 = c;
        i1.i.sendMessage(i1.i.obtainMessage(4, this));
          goto _L6
        Object obj1;
        obj1;
        if (!((Downloader.ResponseException) (obj1)).a || ((Downloader.ResponseException) (obj1)).b != 504)
        {
            p = ((Exception) (obj1));
        }
        c.b(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj1;
        p = ((Exception) (obj1));
        c.a(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj1;
        p = ((Exception) (obj1));
        c.a(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj1;
        StringWriter stringwriter = new StringWriter();
        Object obj2 = e;
        obj2 = new w(((v) (obj2)).b.b(), ((v) (obj2)).b.a(), ((v) (obj2)).d, ((v) (obj2)).e, ((v) (obj2)).f, ((v) (obj2)).g, ((v) (obj2)).h, ((v) (obj2)).i, ((v) (obj2)).j, ((v) (obj2)).k, ((v) (obj2)).l, ((v) (obj2)).m, ((v) (obj2)).n, System.currentTimeMillis());
        PrintWriter printwriter = new PrintWriter(stringwriter);
        printwriter.println("===============BEGIN PICASSO STATS ===============");
        printwriter.println("Memory Cache Stats");
        printwriter.print("  Max Cache Size: ");
        printwriter.println(((w) (obj2)).a);
        printwriter.print("  Cache Size: ");
        printwriter.println(((w) (obj2)).b);
        printwriter.print("  Cache % Full: ");
        printwriter.println((int)Math.ceil(((float)((w) (obj2)).b / (float)((w) (obj2)).a) * 100F));
        printwriter.print("  Cache Hits: ");
        printwriter.println(((w) (obj2)).c);
        printwriter.print("  Cache Misses: ");
        printwriter.println(((w) (obj2)).d);
        printwriter.println("Network Stats");
        printwriter.print("  Download Count: ");
        printwriter.println(((w) (obj2)).k);
        printwriter.print("  Total Download Size: ");
        printwriter.println(((w) (obj2)).e);
        printwriter.print("  Average Download Size: ");
        printwriter.println(((w) (obj2)).h);
        printwriter.println("Bitmap Stats");
        printwriter.print("  Total Bitmaps Decoded: ");
        printwriter.println(((w) (obj2)).l);
        printwriter.print("  Total Bitmap Size: ");
        printwriter.println(((w) (obj2)).f);
        printwriter.print("  Total Transformed Bitmaps: ");
        printwriter.println(((w) (obj2)).m);
        printwriter.print("  Total Transformed Bitmap Size: ");
        printwriter.println(((w) (obj2)).g);
        printwriter.print("  Average Bitmap Size: ");
        printwriter.println(((w) (obj2)).i);
        printwriter.print("  Average Transformed Bitmap Size: ");
        printwriter.println(((w) (obj2)).j);
        printwriter.println("===============END PICASSO STATS ===============");
        printwriter.flush();
        p = new RuntimeException(stringwriter.toString(), ((Throwable) (obj1)));
        c.b(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj1;
        p = ((Exception) (obj1));
        c.b(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj1;
        Thread.currentThread().setName("Picasso-Idle");
        throw obj1;
          goto _L5
    }

}
