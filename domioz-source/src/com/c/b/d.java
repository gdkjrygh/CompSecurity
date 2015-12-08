// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

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

// Referenced classes of package com.c.b:
//            e, f, a, aw, 
//            az, bg, aj, g, 
//            h, i, j, ae, 
//            k, bc, ap, bj, 
//            af, ba, ab, aq, 
//            x, ah, q, bf

final class d
    implements Runnable
{

    private static final Object t = new Object();
    private static final ThreadLocal u = new e();
    private static final AtomicInteger v = new AtomicInteger();
    private static final az w = new f();
    final int a;
    final aj b;
    final q c;
    final k d;
    final bc e;
    final String f;
    final aw g;
    final int h;
    int i;
    final az j;
    a k;
    List l;
    Bitmap m;
    Future n;
    ap o;
    Exception p;
    int q;
    int r;
    int s;

    private d(aj aj1, q q1, k k1, bc bc1, a a1, az az1)
    {
        a = v.incrementAndGet();
        b = aj1;
        c = q1;
        d = k1;
        e = bc1;
        k = a1;
        f = a1.i;
        g = a1.b;
        s = a1.b.r;
        h = a1.e;
        i = a1.f;
        j = az1;
        r = az1.a();
    }

    private static Bitmap a(List list, Bitmap bitmap)
    {
        int j1 = list.size();
        for (int i1 = 0; i1 < j1;)
        {
            bg bg1 = (bg)list.get(i1);
            Bitmap bitmap1;
            try
            {
                bitmap1 = bg1.a();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                aj.a.post(new g(bg1, list));
                return null;
            }
            if (bitmap1 == null)
            {
                bitmap = (new StringBuilder("Transformation ")).append(bg1.b()).append(" returned null after ").append(i1).append(" previous transformation(s).\n\nTransformation list:\n");
                for (list = list.iterator(); list.hasNext(); bitmap.append(((bg)list.next()).b()).append('\n')) { }
                aj.a.post(new h(bitmap));
                return null;
            }
            if (bitmap1 == bitmap && bitmap.isRecycled())
            {
                aj.a.post(new i(bg1));
                return null;
            }
            if (bitmap1 != bitmap && !bitmap.isRecycled())
            {
                aj.a.post(new j(bg1));
                return null;
            }
            i1++;
            bitmap = bitmap1;
        }

        return bitmap;
    }

    static d a(aj aj1, q q1, k k1, bc bc1, a a1)
    {
        aw aw1 = a1.b;
        List list = aj1.a();
        int i1 = 0;
        for (int j1 = list.size(); i1 < j1; i1++)
        {
            az az1 = (az)list.get(i1);
            if (az1.a(aw1))
            {
                return new d(aj1, q1, k1, bc1, a1, az1);
            }
        }

        return new d(aj1, q1, k1, bc1, a1, w);
    }

    private static boolean a(boolean flag, int i1, int j1, int k1, int l1)
    {
        return !flag || i1 > k1 || j1 > l1;
    }

    private Bitmap c()
    {
        Object obj = null;
        if (!ae.a(h)) goto _L2; else goto _L1
_L1:
        Object obj2;
        obj2 = d.a(f);
        obj = obj2;
        if (obj2 == null) goto _L2; else goto _L3
_L3:
        Object obj1;
        e.a();
        o = ap.a;
        obj1 = obj2;
        if (b.l)
        {
            bj.a("Hunter", "decoded", g.a(), "from cache");
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
            i1 = af.c.d;
        } else
        {
            i1 = i;
        }
        obj1.c = i1;
        obj2 = j.b(g);
        if (obj2 == null) goto _L5; else goto _L4
_L4:
        o = ((ba) (obj2)).c();
        q = ((ba) (obj2)).d();
        obj1 = ((ba) (obj2)).a();
        obj = obj1;
        if (obj1 != null) goto _L5; else goto _L6
_L6:
        obj2 = ((ba) (obj2)).b();
        obj = g;
        inputstream = new ab(((java.io.InputStream) (obj2)));
        l3 = inputstream.a(0x10000);
        obj1 = az.d(((aw) (obj)));
        flag1 = az.a(((android.graphics.BitmapFactory.Options) (obj1)));
        flag2 = bj.c(inputstream);
        inputstream.a(l3);
        if (!flag2) goto _L8; else goto _L7
_L7:
        inputstream = bj.b(inputstream);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        az.a(((aw) (obj)).h, ((aw) (obj)).i, ((android.graphics.BitmapFactory.Options) (obj1)), ((aw) (obj)));
        obj = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length, ((android.graphics.BitmapFactory.Options) (obj1)));
_L28:
        bj.a(((java.io.InputStream) (obj2)));
_L5:
        obj1 = obj;
        if (obj == null) goto _L10; else goto _L9
_L9:
        if (b.l)
        {
            bj.a("Hunter", "decoded", g.a());
        }
        e.a(((Bitmap) (obj)));
        obj1 = g;
        Exception exception;
        if (((aw) (obj1)).d() || ((aw) (obj1)).e())
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
        flag1 = ((aw) (obj1)).l;
        obj2 = new Matrix();
        if (!((aw) (obj1)).d()) goto _L16; else goto _L15
_L15:
        l2 = ((aw) (obj1)).h;
        i3 = ((aw) (obj1)).i;
        f1 = ((aw) (obj1)).m;
        if (f1 == 0.0F) goto _L18; else goto _L17
_L17:
        if (!((aw) (obj1)).p) goto _L20; else goto _L19
_L19:
        ((Matrix) (obj2)).setRotate(f1, ((aw) (obj1)).n, ((aw) (obj1)).o);
_L18:
        if (!((aw) (obj1)).j) goto _L22; else goto _L21
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
            break MISSING_BLOCK_LABEL_620;
        }
        ((Matrix) (obj2)).preRotate(k2);
        obj2 = Bitmap.createBitmap(((Bitmap) (obj)), i1, j1, l1, k1, ((Matrix) (obj2)), true);
        obj1 = obj;
        if (obj2 == obj)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        ((Bitmap) (obj)).recycle();
        obj1 = obj2;
        obj2 = obj1;
        if (!b.l) goto _L14; else goto _L26
_L26:
        bj.a("Hunter", "transformed", g.a());
        obj2 = obj1;
_L14:
        obj = obj2;
        if (!g.e())
        {
            break MISSING_BLOCK_LABEL_755;
        }
        obj1 = a(g.g, ((Bitmap) (obj2)));
        obj = obj1;
        if (!b.l)
        {
            break MISSING_BLOCK_LABEL_755;
        }
        bj.a("Hunter", "transformed", g.a(), "from custom transformations");
        obj = obj1;
        inputstream;
        JVM INSTR monitorexit ;
        obj1 = obj;
        if (obj != null)
        {
            e.b(((Bitmap) (obj)));
            return ((Bitmap) (obj));
        }
          goto _L10
_L8:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_826;
        }
        BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj1)));
        az.a(((aw) (obj)).h, ((aw) (obj)).i, ((android.graphics.BitmapFactory.Options) (obj1)), ((aw) (obj)));
        inputstream.a(l3);
        obj1 = BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj1)));
        obj = obj1;
        if (obj1 != null) goto _L28; else goto _L27
_L27:
        throw new IOException("Failed to decode stream.");
        exception;
        bj.a(((java.io.InputStream) (obj2)));
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
        if (!((aw) (obj1)).k) goto _L31; else goto _L30
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
            int i1 = aq.a;
            int j1;
            int k1;
            if (l != null && !l.isEmpty())
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            j1 = ((flag1) ? 1 : 0);
            if (k == null)
            {
                if (k1 != 0)
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
                    i1 = k.b.r;
                }
                j1 = i1;
                if (k1 != 0)
                {
                    int l1 = l.size();
                    k1 = ((flag) ? 1 : 0);
                    do
                    {
                        j1 = i1;
                        if (k1 >= l1)
                        {
                            break;
                        }
                        j1 = ((a)l.get(k1)).b.r;
                        if (j1 - 1 > i1 - 1)
                        {
                            i1 = j1;
                        }
                        k1++;
                    } while (true);
                }
            } else
            {
                j1 = i1;
            }
            s = j1;
        }
        if (b.l)
        {
            bj.a("Hunter", "removed", a1.b.a(), bj.a(this, "from "));
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
        if (((aw) (obj)).d == null) goto _L2; else goto _L1
_L1:
        obj = String.valueOf(((aw) (obj)).d.getPath());
_L5:
        StringBuilder stringbuilder = (StringBuilder)u.get();
        stringbuilder.ensureCapacity(((String) (obj)).length() + 8);
        stringbuilder.replace(8, stringbuilder.length(), ((String) (obj)));
        Thread.currentThread().setName(stringbuilder.toString());
        if (b.l)
        {
            bj.a("Hunter", "executing", bj.a(this));
        }
        m = c();
        if (m != null) goto _L4; else goto _L3
_L3:
        c.b(this);
_L6:
        Thread.currentThread().setName("Picasso-Idle");
        return;
_L2:
        obj = Integer.toHexString(((aw) (obj)).e);
          goto _L5
_L4:
        q q1 = c;
        q1.i.sendMessage(q1.i.obtainMessage(4, this));
          goto _L6
        Object obj1;
        obj1;
        if (!((x) (obj1)).a || ((x) (obj1)).b != 504)
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
        obj2 = new bf(((bc) (obj2)).b.b(), ((bc) (obj2)).b.a(), ((bc) (obj2)).d, ((bc) (obj2)).e, ((bc) (obj2)).f, ((bc) (obj2)).g, ((bc) (obj2)).h, ((bc) (obj2)).i, ((bc) (obj2)).j, ((bc) (obj2)).k, ((bc) (obj2)).l, ((bc) (obj2)).m, ((bc) (obj2)).n, System.currentTimeMillis());
        PrintWriter printwriter = new PrintWriter(stringwriter);
        printwriter.println("===============BEGIN PICASSO STATS ===============");
        printwriter.println("Memory Cache Stats");
        printwriter.print("  Max Cache Size: ");
        printwriter.println(((bf) (obj2)).a);
        printwriter.print("  Cache Size: ");
        printwriter.println(((bf) (obj2)).b);
        printwriter.print("  Cache % Full: ");
        printwriter.println((int)Math.ceil(((float)((bf) (obj2)).b / (float)((bf) (obj2)).a) * 100F));
        printwriter.print("  Cache Hits: ");
        printwriter.println(((bf) (obj2)).c);
        printwriter.print("  Cache Misses: ");
        printwriter.println(((bf) (obj2)).d);
        printwriter.println("Network Stats");
        printwriter.print("  Download Count: ");
        printwriter.println(((bf) (obj2)).k);
        printwriter.print("  Total Download Size: ");
        printwriter.println(((bf) (obj2)).e);
        printwriter.print("  Average Download Size: ");
        printwriter.println(((bf) (obj2)).h);
        printwriter.println("Bitmap Stats");
        printwriter.print("  Total Bitmaps Decoded: ");
        printwriter.println(((bf) (obj2)).l);
        printwriter.print("  Total Bitmap Size: ");
        printwriter.println(((bf) (obj2)).f);
        printwriter.print("  Total Transformed Bitmaps: ");
        printwriter.println(((bf) (obj2)).m);
        printwriter.print("  Total Transformed Bitmap Size: ");
        printwriter.println(((bf) (obj2)).g);
        printwriter.print("  Average Bitmap Size: ");
        printwriter.println(((bf) (obj2)).i);
        printwriter.print("  Average Transformed Bitmap Size: ");
        printwriter.println(((bf) (obj2)).j);
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
