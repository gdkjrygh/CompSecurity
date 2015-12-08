// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Handler;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class gvc
    implements Runnable
{

    private static final Object p = new Object();
    private static final ThreadLocal q = new ThreadLocal() {

        protected final Object initialValue()
        {
            return new StringBuilder("Picasso-");
        }

    };
    private static final AtomicInteger r = new AtomicInteger();
    private static final gwc s = new gwc() {

        public final boolean a(gvz gvz1)
        {
            return true;
        }

        public final gwd b(gvz gvz1)
        {
            throw new IllegalStateException((new StringBuilder("Unrecognized type of request: ")).append(gvz1).toString());
        }

    };
    final int a;
    public final Picasso b;
    final String c;
    public final gvz d;
    final int e = 0;
    int f;
    final gwc g;
    public guz h;
    public List i;
    public Bitmap j;
    Future k;
    public com.squareup.picasso.Picasso.LoadedFrom l;
    public Exception m;
    int n;
    com.squareup.picasso.Picasso.Priority o;
    private gvi t;
    private gvd u;
    private gwf v;
    private int w;

    private gvc(Picasso picasso, gvi gvi1, gvd gvd1, gwf gwf1, guz guz1, gwc gwc1)
    {
        a = r.incrementAndGet();
        b = picasso;
        t = gvi1;
        u = gvd1;
        v = gwf1;
        h = guz1;
        c = guz1.g;
        d = guz1.b;
        o = guz1.b.o;
        f = 0;
        g = gwc1;
        n = gwc1.a();
    }

    private static Bitmap a(List list, Bitmap bitmap)
    {
        int j1 = list.size();
        for (int i1 = 0; i1 < j1;)
        {
            gwk gwk1 = (gwk)list.get(i1);
            Bitmap bitmap1;
            try
            {
                bitmap1 = gwk1.a(bitmap);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                Picasso.a.post(new Runnable(gwk1, list) {

                    private gwk a;
                    private RuntimeException b;

                    public final void run()
                    {
                        throw new RuntimeException((new StringBuilder("Transformation ")).append(a.a()).append(" crashed with exception.").toString(), b);
                    }

            
            {
                a = gwk1;
                b = runtimeexception;
                super();
            }
                });
                return null;
            }
            if (bitmap1 == null)
            {
                bitmap = (new StringBuilder("Transformation ")).append(gwk1.a()).append(" returned null after ").append(i1).append(" previous transformation(s).\n\nTransformation list:\n");
                for (list = list.iterator(); list.hasNext(); bitmap.append(((gwk)list.next()).a()).append('\n')) { }
                Picasso.a.post(new Runnable(bitmap) {

                    private StringBuilder a;

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
                Picasso.a.post(new Runnable(gwk1) {

                    private gwk a;

                    public final void run()
                    {
                        throw new IllegalStateException((new StringBuilder("Transformation ")).append(a.a()).append(" returned input Bitmap but recycled it.").toString());
                    }

            
            {
                a = gwk1;
                super();
            }
                });
                return null;
            }
            if (bitmap1 != bitmap && !bitmap.isRecycled())
            {
                Picasso.a.post(new Runnable(gwk1) {

                    private gwk a;

                    public final void run()
                    {
                        throw new IllegalStateException((new StringBuilder("Transformation ")).append(a.a()).append(" mutated input Bitmap but failed to recycle the original.").toString());
                    }

            
            {
                a = gwk1;
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

    static gvc a(Picasso picasso, gvi gvi1, gvd gvd1, gwf gwf1, guz guz1)
    {
        gvz gvz1 = guz1.b;
        List list = picasso.c;
        int i1 = 0;
        for (int j1 = list.size(); i1 < j1; i1++)
        {
            gwc gwc1 = (gwc)list.get(i1);
            if (gwc1.a(gvz1))
            {
                return new gvc(picasso, gvi1, gvd1, gwf1, guz1, gwc1);
            }
        }

        return new gvc(picasso, gvi1, gvd1, gwf1, guz1, s);
    }

    private static boolean a(boolean flag, int i1, int j1, int k1, int l1)
    {
        return !flag || i1 > k1 || j1 > l1;
    }

    private Bitmap c()
    {
        Object obj = null;
        if (!MemoryPolicy.a(0)) goto _L2; else goto _L1
_L1:
        Object obj2;
        obj2 = u.a(c);
        obj = obj2;
        if (obj2 == null) goto _L2; else goto _L3
_L3:
        Object obj1;
        v.a();
        l = com.squareup.picasso.Picasso.LoadedFrom.a;
        obj1 = obj2;
        if (b.h)
        {
            gwm.a("Hunter", "decoded", d.a(), "from cache");
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
        boolean flag2;
        obj1 = d;
        int k2;
        boolean flag3;
        if (n == 0)
        {
            i1 = NetworkPolicy.b.index;
        } else
        {
            i1 = f;
        }
        obj1.c = i1;
        obj2 = g.b(d);
        if (obj2 == null) goto _L5; else goto _L4
_L4:
        l = ((gwd) (obj2)).a;
        w = ((gwd) (obj2)).d;
        obj1 = ((gwd) (obj2)).b;
        obj = obj1;
        if (obj1 != null) goto _L5; else goto _L6
_L6:
        obj2 = ((gwd) (obj2)).c;
        obj = d;
        inputstream = new gvr(((java.io.InputStream) (obj2)));
        l3 = inputstream.a(0x10000);
        obj1 = gwc.d(((gvz) (obj)));
        flag2 = gwc.a(((android.graphics.BitmapFactory.Options) (obj1)));
        flag3 = gwm.c(inputstream);
        inputstream.a(l3);
        if (!flag3) goto _L8; else goto _L7
_L7:
        inputstream = gwm.b(inputstream);
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        gwc.a(((gvz) (obj)).h, ((gvz) (obj)).i, ((android.graphics.BitmapFactory.Options) (obj1)), ((gvz) (obj)));
        obj = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length, ((android.graphics.BitmapFactory.Options) (obj1)));
_L24:
        gwm.a(((java.io.InputStream) (obj2)));
_L5:
        obj1 = obj;
        if (obj == null) goto _L10; else goto _L9
_L9:
        if (b.h)
        {
            gwm.a("Hunter", "decoded", d.a());
        }
        v.a(((Bitmap) (obj)), 2);
        obj1 = d;
        Exception exception;
        if (((gvz) (obj1)).d() || ((gvz) (obj1)).e())
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
        if (w == 0) goto _L10; else goto _L11
_L11:
        inputstream = ((java.io.InputStream) (p));
        inputstream;
        JVM INSTR monitorenter ;
        if (d.d()) goto _L13; else goto _L12
_L12:
        obj2 = obj;
        if (w == 0) goto _L14; else goto _L13
_L13:
        obj1 = d;
        k2 = w;
        i1 = ((Bitmap) (obj)).getWidth();
        j1 = ((Bitmap) (obj)).getHeight();
        flag2 = ((gvz) (obj1)).l;
        obj2 = new Matrix();
        if (!((gvz) (obj1)).d()) goto _L16; else goto _L15
_L15:
        l2 = ((gvz) (obj1)).h;
        i3 = ((gvz) (obj1)).i;
        f1 = ((gvz) (obj1)).m;
        if (!((gvz) (obj1)).j) goto _L18; else goto _L17
_L17:
        f1 = (float)l2 / (float)i1;
        f2 = (float)i3 / (float)j1;
        if (f1 <= f2) goto _L20; else goto _L19
_L19:
        k1 = (int)Math.ceil((float)j1 * (f2 / f1));
        j2 = (j1 - k1) / 2;
        f2 = (float)i3 / (float)k1;
        l1 = i1;
        i2 = 0;
_L25:
        if (a(flag2, i1, j1, l2, i3))
        {
            ((Matrix) (obj2)).preScale(f1, f2);
        }
          goto _L21
_L33:
        if (k2 == 0)
        {
            break MISSING_BLOCK_LABEL_588;
        }
        ((Matrix) (obj2)).preRotate(k2);
        obj2 = Bitmap.createBitmap(((Bitmap) (obj)), i1, j1, l1, k1, ((Matrix) (obj2)), true);
        obj1 = obj;
        if (obj2 == obj)
        {
            break MISSING_BLOCK_LABEL_626;
        }
        ((Bitmap) (obj)).recycle();
        obj1 = obj2;
        obj2 = obj1;
        if (!b.h) goto _L14; else goto _L22
_L22:
        gwm.a("Hunter", "transformed", d.a());
        obj2 = obj1;
_L14:
        obj = obj2;
        if (!d.e())
        {
            break MISSING_BLOCK_LABEL_723;
        }
        obj1 = a(d.g, ((Bitmap) (obj2)));
        obj = obj1;
        if (!b.h)
        {
            break MISSING_BLOCK_LABEL_723;
        }
        gwm.a("Hunter", "transformed", d.a(), "from custom transformations");
        obj = obj1;
        inputstream;
        JVM INSTR monitorexit ;
        obj1 = obj;
        if (obj != null)
        {
            v.a(((Bitmap) (obj)), 3);
            return ((Bitmap) (obj));
        }
          goto _L10
_L8:
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_795;
        }
        BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj1)));
        gwc.a(((gvz) (obj)).h, ((gvz) (obj)).i, ((android.graphics.BitmapFactory.Options) (obj1)), ((gvz) (obj)));
        inputstream.a(l3);
        obj1 = BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj1)));
        obj = obj1;
        if (obj1 != null) goto _L24; else goto _L23
_L23:
        throw new IOException("Failed to decode stream.");
        exception;
        gwm.a(((java.io.InputStream) (obj2)));
        throw exception;
_L20:
        double d1 = (float)i1 * (f1 / f2);
        l1 = (int)Math.ceil(d1);
        i2 = (i1 - l1) / 2;
        f1 = (float)l2 / (float)l1;
        j2 = 0;
        k1 = j1;
          goto _L25
_L18:
        if (!((gvz) (obj1)).k) goto _L27; else goto _L26
_L26:
        f1 = (float)l2 / (float)i1;
        f2 = (float)i3 / (float)j1;
        Exception exception1;
        if (f1 >= f2)
        {
            f1 = f2;
        }
        if (a(flag2, i1, j1, l2, i3))
        {
            ((Matrix) (obj2)).preScale(f1, f1);
        }
          goto _L28
_L34:
        if (l2 == 0) goto _L30; else goto _L29
_L29:
        f1 = (float)l2 / (float)i1;
_L31:
        if (i3 == 0)
        {
            break MISSING_BLOCK_LABEL_1010;
        }
        f2 = (float)i3 / (float)j1;
_L32:
        if (a(flag2, i1, j1, l2, i3))
        {
            ((Matrix) (obj2)).preScale(f1, f2);
        }
        break; /* Loop/switch isn't completed */
_L30:
        f1 = (float)i3 / (float)j1;
          goto _L31
        f2 = (float)l2 / (float)i1;
          goto _L32
        exception1;
        inputstream;
        JVM INSTR monitorexit ;
        throw exception1;
_L21:
        j1 = j2;
        i1 = i2;
          goto _L33
_L28:
        boolean flag = false;
        k1 = j1;
        l1 = i1;
        j1 = 0;
        i1 = ((flag) ? 1 : 0);
          goto _L33
_L27:
        if (l2 == 0 && i3 == 0 || l2 == i1 && i3 == j1) goto _L16; else goto _L34
_L16:
        boolean flag1 = false;
        k1 = j1;
        l1 = i1;
        j1 = 0;
        i1 = ((flag1) ? 1 : 0);
          goto _L33
    }

    final void a(guz guz1)
    {
        boolean flag1 = true;
        boolean flag = false;
        boolean flag2;
        if (h == guz1)
        {
            h = null;
            flag2 = true;
        } else
        if (i != null)
        {
            flag2 = i.remove(guz1);
        } else
        {
            flag2 = false;
        }
        if (flag2 && guz1.b.o == o)
        {
            com.squareup.picasso.Picasso.Priority priority = com.squareup.picasso.Picasso.Priority.a;
            com.squareup.picasso.Picasso.Priority priority1;
            int i1;
            int j1;
            if (i != null && !i.isEmpty())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j1 = ((flag1) ? 1 : 0);
            if (h == null)
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
                if (h != null)
                {
                    priority = h.b.o;
                }
                priority1 = priority;
                if (i1 != 0)
                {
                    j1 = i.size();
                    i1 = ((flag) ? 1 : 0);
                    do
                    {
                        priority1 = priority;
                        if (i1 >= j1)
                        {
                            break;
                        }
                        priority1 = ((guz)i.get(i1)).b.o;
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
            o = priority1;
        }
        if (b.h)
        {
            gwm.a("Hunter", "removed", guz1.b.a(), gwm.a(this, "from "));
        }
    }

    final boolean a()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (h != null)
            {
                break label0;
            }
            if (i != null)
            {
                flag = flag1;
                if (!i.isEmpty())
                {
                    break label0;
                }
            }
            flag = flag1;
            if (k != null)
            {
                flag = flag1;
                if (k.cancel(false))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    final boolean b()
    {
        return k != null && k.isCancelled();
    }

    public final void run()
    {
        Object obj = d;
        if (((gvz) (obj)).d == null) goto _L2; else goto _L1
_L1:
        obj = String.valueOf(((gvz) (obj)).d.getPath());
_L5:
        StringBuilder stringbuilder = (StringBuilder)q.get();
        stringbuilder.ensureCapacity(((String) (obj)).length() + 8);
        stringbuilder.replace(8, stringbuilder.length(), ((String) (obj)));
        Thread.currentThread().setName(stringbuilder.toString());
        if (b.h)
        {
            gwm.a("Hunter", "executing", gwm.a(this));
        }
        j = c();
        if (j != null) goto _L4; else goto _L3
_L3:
        t.b(this);
_L6:
        Thread.currentThread().setName("Picasso-Idle");
        return;
_L2:
        obj = Integer.toHexString(((gvz) (obj)).e);
          goto _L5
_L4:
        gvi gvi1 = t;
        gvi1.f.sendMessage(gvi1.f.obtainMessage(4, this));
          goto _L6
        Object obj1;
        obj1;
        if (!((com.squareup.picasso.Downloader.ResponseException) (obj1)).localCacheOnly || ((com.squareup.picasso.Downloader.ResponseException) (obj1)).responseCode != 504)
        {
            m = ((Exception) (obj1));
        }
        t.b(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj1;
        m = ((Exception) (obj1));
        t.a(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj1;
        m = ((Exception) (obj1));
        t.a(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj1;
        StringWriter stringwriter = new StringWriter();
        Object obj2 = v;
        obj2 = new gwh(((gwf) (obj2)).a.b(), ((gwf) (obj2)).a.a(), ((gwf) (obj2)).c, ((gwf) (obj2)).d, ((gwf) (obj2)).e, ((gwf) (obj2)).f, ((gwf) (obj2)).g, ((gwf) (obj2)).h, ((gwf) (obj2)).i, ((gwf) (obj2)).j, ((gwf) (obj2)).k, ((gwf) (obj2)).l, ((gwf) (obj2)).m, System.currentTimeMillis());
        PrintWriter printwriter = new PrintWriter(stringwriter);
        printwriter.println("===============BEGIN PICASSO STATS ===============");
        printwriter.println("Memory Cache Stats");
        printwriter.print("  Max Cache Size: ");
        printwriter.println(((gwh) (obj2)).a);
        printwriter.print("  Cache Size: ");
        printwriter.println(((gwh) (obj2)).b);
        printwriter.print("  Cache % Full: ");
        printwriter.println((int)Math.ceil(((float)((gwh) (obj2)).b / (float)((gwh) (obj2)).a) * 100F));
        printwriter.print("  Cache Hits: ");
        printwriter.println(((gwh) (obj2)).c);
        printwriter.print("  Cache Misses: ");
        printwriter.println(((gwh) (obj2)).d);
        printwriter.println("Network Stats");
        printwriter.print("  Download Count: ");
        printwriter.println(((gwh) (obj2)).k);
        printwriter.print("  Total Download Size: ");
        printwriter.println(((gwh) (obj2)).e);
        printwriter.print("  Average Download Size: ");
        printwriter.println(((gwh) (obj2)).h);
        printwriter.println("Bitmap Stats");
        printwriter.print("  Total Bitmaps Decoded: ");
        printwriter.println(((gwh) (obj2)).l);
        printwriter.print("  Total Bitmap Size: ");
        printwriter.println(((gwh) (obj2)).f);
        printwriter.print("  Total Transformed Bitmaps: ");
        printwriter.println(((gwh) (obj2)).m);
        printwriter.print("  Total Transformed Bitmap Size: ");
        printwriter.println(((gwh) (obj2)).g);
        printwriter.print("  Average Bitmap Size: ");
        printwriter.println(((gwh) (obj2)).i);
        printwriter.print("  Average Transformed Bitmap Size: ");
        printwriter.println(((gwh) (obj2)).j);
        printwriter.println("===============END PICASSO STATS ===============");
        printwriter.flush();
        m = new RuntimeException(stringwriter.toString(), ((Throwable) (obj1)));
        t.b(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj1;
        m = ((Exception) (obj1));
        t.b(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj1;
        Thread.currentThread().setName("Picasso-Idle");
        throw obj1;
          goto _L5
    }

}
