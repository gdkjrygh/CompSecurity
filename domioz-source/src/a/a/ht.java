// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.graphics.Bitmap;
import android.os.Handler;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package a.a:
//            jr, ii, hq, ho, 
//            hs, jl, iz, iy, 
//            hl, hv, js, gv, 
//            ih, hm, ig, jg, 
//            im, jn, jq, jf, 
//            hx, ib, hu, hf, 
//            hk, hw, ie, if

public final class ht
    implements jr, Runnable
{

    final ho a;
    final String b;
    final jl c;
    final hl d;
    final ie e;
    final if f;
    private final hq g;
    private final hs h;
    private final Handler i;
    private final jf j;
    private final jf k;
    private final jf l;
    private final iy m;
    private final boolean n;
    private final String o;
    private final ih p;
    private ii q;

    public ht(hq hq1, hs hs1, Handler handler)
    {
        q = ii.a;
        g = hq1;
        h = hs1;
        i = handler;
        a = hq1.a;
        j = a.r;
        k = a.w;
        l = a.x;
        m = a.s;
        n = a.u;
        b = hs1.a;
        o = hs1.b;
        c = hs1.c;
        p = hs1.d;
        d = hs1.e;
        e = hs1.f;
        f = hs1.g;
    }

    private Bitmap a(String s)
    {
        int i1 = c.c();
        s = new iz(o, s, p, i1, d(), d);
        return m.a(s);
    }

    private void a(int i1, Throwable throwable)
    {
        if (d.s || j() || f())
        {
            return;
        } else
        {
            i.post(new hv(this, i1, throwable));
            return;
        }
    }

    private boolean a()
    {
        AtomicBoolean atomicboolean;
        atomicboolean = g.f;
        if (!atomicboolean.get())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Object obj = g.i;
        obj;
        JVM INSTR monitorenter ;
        if (!atomicboolean.get())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        b("ImageLoader is paused. Waiting...  [%s]");
        g.i.wait();
        b(".. Resume loading [%s]");
        return f();
        Object obj1;
        obj1;
        js.d("Task was interrupted [%s]", new Object[] {
            o
        });
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj1;
        throw obj1;
    }

    private boolean a(File file)
    {
        b("Cache image on disc [%s]");
        boolean flag = b(file);
        boolean flag1;
        boolean flag2;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        flag2 = flag;
        int i1 = a.d;
        flag2 = flag;
        int j1 = a.e;
        if (i1 <= 0)
        {
            flag1 = flag;
            if (j1 <= 0)
            {
                break MISSING_BLOCK_LABEL_84;
            }
        }
        flag2 = flag;
        b("Resize image in disc cache [%s]");
        flag2 = flag;
        flag1 = a(file, i1, j1);
        flag2 = flag1;
        a.q.a(file);
_L2:
        return flag1;
        IOException ioexception;
        ioexception;
        flag2 = false;
_L3:
        js.a(ioexception);
        flag1 = flag2;
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        file.delete();
        return flag2;
        ioexception;
          goto _L3
    }

    private boolean a(File file, int i1, int j1)
    {
        Object obj;
        obj = new ih(i1, j1);
        Object obj1 = new hm();
        hl hl1 = d;
        obj1.a = hl1.a;
        obj1.b = hl1.b;
        obj1.c = hl1.c;
        obj1.d = hl1.d;
        obj1.e = hl1.e;
        obj1.f = hl1.f;
        obj1.g = hl1.g;
        obj1.h = hl1.h;
        obj1.i = hl1.i;
        obj1.j = hl1.j;
        obj1.k = hl1.k;
        obj1.l = hl1.l;
        obj1.m = hl1.m;
        obj1.n = hl1.n;
        obj1.o = hl1.o;
        obj1.p = hl1.p;
        obj1.q = hl1.q;
        obj1.r = hl1.r;
        obj1.s = hl1.s;
        obj1.j = ig.c;
        obj1 = ((hm) (obj1)).a();
        obj = new iz(o, jg.c.b(file.getAbsolutePath()), ((ih) (obj)), im.a, d(), ((hl) (obj1)));
        obj1 = m.a(((iz) (obj)));
        obj = obj1;
        if (obj1 != null)
        {
            obj = obj1;
            if (a.h != null)
            {
                b("Process image before cache on disc [%s]");
                Bitmap bitmap = a.h.a();
                obj = bitmap;
                if (bitmap == null)
                {
                    js.d("Bitmap processor for disc cache returned null [%s]", new Object[] {
                        o
                    });
                    obj = bitmap;
                }
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_406;
        }
        file = new BufferedOutputStream(new FileOutputStream(file), 32768);
        ((Bitmap) (obj)).compress(a.f, a.g, file);
        jq.a(file);
        ((Bitmap) (obj)).recycle();
        return true;
        Exception exception;
        exception;
        jq.a(file);
        throw exception;
    }

    private void b(String s)
    {
        if (n)
        {
            js.a(s, new Object[] {
                o
            });
        }
    }

    private boolean b()
    {
        int i1;
        if (d.l > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = d.l;
            String s = o;
            if (n)
            {
                js.a("Delay %d ms before loading...  [%s]", new Object[] {
                    Integer.valueOf(i1), s
                });
            }
            try
            {
                Thread.sleep(d.l);
            }
            catch (InterruptedException interruptedexception)
            {
                js.d("Task was interrupted [%s]", new Object[] {
                    o
                });
                return true;
            }
            return f();
        } else
        {
            return false;
        }
    }

    private boolean b(File file)
    {
        java.io.InputStream inputstream = d().a(b, d.n);
        file = new BufferedOutputStream(new FileOutputStream(file), 32768);
        boolean flag = jq.a(inputstream, file, this);
        jq.a(file);
        jq.a(inputstream);
        return flag;
        Exception exception;
        exception;
        jq.a(file);
        throw exception;
        file;
        jq.a(inputstream);
        throw file;
    }

    private Bitmap c()
    {
        File file2;
label0:
        {
            File file = a.q.a(b);
            File file1 = file.getParentFile();
            if (file1 != null)
            {
                file2 = file;
                if (file1.exists())
                {
                    break label0;
                }
                file2 = file;
                if (file1.mkdirs())
                {
                    break label0;
                }
            }
            file = a.v.a(b);
            file1 = file.getParentFile();
            file2 = file;
            if (file1 != null)
            {
                file2 = file;
                if (!file1.exists())
                {
                    file1.mkdirs();
                    file2 = file;
                }
            }
        }
        String s = jg.c.b(file2.getAbsolutePath());
        if (!file2.exists()) goto _L2; else goto _L1
_L1:
        Object obj;
        b("Load image from disc cache [%s]");
        q = ii.b;
        e();
        obj = a(s);
_L16:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (((Bitmap) (obj)).getWidth() <= 0)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        Object obj5;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        obj5 = obj;
        if (((Bitmap) (obj)).getHeight() > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        b("Load image from network [%s]");
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        q = ii.a;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (!d.i) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (!a(file2)) goto _L4; else goto _L5
_L5:
        obj5 = s;
_L7:
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        e();
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        obj = a(((String) (obj5)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (((Bitmap) (obj)).getWidth() <= 0)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        obj5 = obj;
        if (((Bitmap) (obj)).getHeight() > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        a(ib.b, ((Throwable) (null)));
        obj5 = obj;
        break; /* Loop/switch isn't completed */
_L4:
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        obj5 = b;
        if (true) goto _L7; else goto _L6
_L6:
        break; /* Loop/switch isn't completed */
        obj;
        obj = null;
_L14:
        a(ib.c, ((Throwable) (null)));
        return ((Bitmap) (obj));
        obj;
        throw obj;
        obj;
        obj3 = null;
_L13:
        js.a(((Throwable) (obj)));
        a(ib.a, ((Throwable) (obj)));
        if (file2.exists())
        {
            file2.delete();
        }
        return ((Bitmap) (obj3));
        obj1;
        obj = null;
_L11:
        js.a(((Throwable) (obj1)));
        a(ib.d, ((Throwable) (obj1)));
        return ((Bitmap) (obj));
        obj1;
        obj = null;
_L9:
        js.a(((Throwable) (obj1)));
        a(ib.e, ((Throwable) (obj1)));
        return ((Bitmap) (obj));
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L9; else goto _L8
_L8:
        obj1;
        obj = obj2;
        if (true) goto _L11; else goto _L10
_L10:
        obj;
        if (true) goto _L13; else goto _L12
_L12:
        obj;
        obj = obj4;
        if (true) goto _L14; else goto _L2
_L2:
        obj = null;
        if (true) goto _L16; else goto _L15
_L15:
        return ((Bitmap) (obj5));
    }

    private jf d()
    {
        if (g.g.get())
        {
            return k;
        }
        if (g.h.get())
        {
            return l;
        } else
        {
            return j;
        }
    }

    private void e()
    {
        if (g())
        {
            throw new hx(this);
        }
        if (h())
        {
            throw new hx(this);
        } else
        {
            return;
        }
    }

    private boolean f()
    {
        return g() || h();
    }

    private boolean g()
    {
        if (c.e())
        {
            b("ImageAware was collected by GC. Task is cancelled. [%s]");
            return true;
        } else
        {
            return false;
        }
    }

    private boolean h()
    {
        String s = g.a(c);
        boolean flag;
        if (!o.equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b("ImageAware is reused for another image. Task is cancelled. [%s]");
            return true;
        } else
        {
            return false;
        }
    }

    private void i()
    {
        if (j())
        {
            throw new hx(this);
        } else
        {
            return;
        }
    }

    private boolean j()
    {
        if (Thread.interrupted())
        {
            b("Task was interrupted [%s]");
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(int i1, int j1)
    {
label0:
        {
            boolean flag = false;
            if (f != null)
            {
                if (d.s || j() || f())
                {
                    i1 = 0;
                } else
                {
                    i.post(new hu(this, i1, j1));
                    i1 = 1;
                }
                if (i1 == 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public final void run()
    {
        ReentrantLock reentrantlock;
        boolean flag;
        for (flag = true; a() || b();)
        {
            return;
        }

        reentrantlock = h.h;
        b("Start display image task [%s]");
        if (reentrantlock.isLocked())
        {
            b("Image already is loading. Waiting... [%s]");
        }
        reentrantlock.lock();
        Bitmap bitmap;
        e();
        bitmap = (Bitmap)a.p.a(o);
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        Object obj = c();
        if (obj == null)
        {
            reentrantlock.unlock();
            return;
        }
        e();
        i();
        if (d.o == null)
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        b("PreProcess image before caching in memory [%s]");
        bitmap = d.o.a();
        obj = bitmap;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        js.d("Pre-processor returned null [%s]", new Object[] {
            o
        });
        obj = bitmap;
        bitmap = ((Bitmap) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        bitmap = ((Bitmap) (obj));
        if (!d.h)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        b("Cache image in memory [%s]");
        a.p.a(o, obj);
        bitmap = ((Bitmap) (obj));
_L2:
        obj = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        obj = bitmap;
        if (!d.a())
        {
            break MISSING_BLOCK_LABEL_269;
        }
        b("PostProcess image before displaying [%s]");
        bitmap = d.p.a();
        obj = bitmap;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        js.d("Post-processor returned null [%s]", new Object[] {
            o
        });
        obj = bitmap;
        e();
        i();
        reentrantlock.unlock();
        obj = new hk(((Bitmap) (obj)), h, g, q);
        obj.a = n;
        boolean flag1;
        if (d.s)
        {
            ((hk) (obj)).run();
            return;
        } else
        {
            i.post(((Runnable) (obj)));
            return;
        }
        q = ii.c;
        b("...Get cached bitmap from memory after waiting. [%s]");
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (d.s)
        {
            break MISSING_BLOCK_LABEL_370;
        }
        flag1 = j();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_375;
        }
_L4:
        reentrantlock.unlock();
        return;
        i.post(new hw(this));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        reentrantlock.unlock();
        throw obj;
    }
}
