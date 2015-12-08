// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;
import android.os.Handler;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package bo.app:
//            kt, jk, it, ir, 
//            iv, kn, kc, kb, 
//            io, iy, ku, hz, 
//            jj, ip, ji, ki, 
//            jp, kp, ks, kh, 
//            ja, je, ix, ii, 
//            in, iz, jg, jh

public final class iw
    implements kt, Runnable
{

    final ir a;
    final String b;
    final kn c;
    final io d;
    final jg e;
    final jh f;
    private final it g;
    private final iv h;
    private final Handler i;
    private final kh j;
    private final kh k;
    private final kh l;
    private final kb m;
    private final boolean n;
    private final String o;
    private final jj p;
    private jk q;

    public iw(it it1, iv iv1, Handler handler)
    {
        q = jk.a;
        g = it1;
        h = iv1;
        i = handler;
        a = it1.a;
        j = a.r;
        k = a.w;
        l = a.x;
        m = a.s;
        n = a.u;
        b = iv1.a;
        o = iv1.b;
        c = iv1.c;
        p = iv1.d;
        d = iv1.e;
        e = iv1.f;
        f = iv1.g;
    }

    private Bitmap a(String s)
    {
        int i1 = c.c();
        s = new kc(o, s, p, i1, d(), d);
        return m.a(s);
    }

    private void a(int i1, Throwable throwable)
    {
        if (d.s || j() || f())
        {
            return;
        } else
        {
            i.post(new iy(this, i1, throwable));
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
        ku.d("Task was interrupted [%s]", new Object[] {
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
        ku.a(ioexception);
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
        obj = new jj(i1, j1);
        Object obj1 = new ip();
        io io1 = d;
        obj1.a = io1.a;
        obj1.b = io1.b;
        obj1.c = io1.c;
        obj1.d = io1.d;
        obj1.e = io1.e;
        obj1.f = io1.f;
        obj1.g = io1.g;
        obj1.h = io1.h;
        obj1.i = io1.i;
        obj1.j = io1.j;
        obj1.k = io1.k;
        obj1.l = io1.l;
        obj1.m = io1.m;
        obj1.n = io1.n;
        obj1.o = io1.o;
        obj1.p = io1.p;
        obj1.q = io1.q;
        obj1.r = io1.r;
        obj1.s = io1.s;
        obj1.j = ji.c;
        obj1 = ((ip) (obj1)).a();
        obj = new kc(o, ki.c.b(file.getAbsolutePath()), ((jj) (obj)), jp.a, d(), ((io) (obj1)));
        obj1 = m.a(((kc) (obj)));
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
                    ku.d("Bitmap processor for disc cache returned null [%s]", new Object[] {
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
        ks.a(file);
        ((Bitmap) (obj)).recycle();
        return true;
        Exception exception;
        exception;
        ks.a(file);
        throw exception;
    }

    private void b(String s)
    {
        if (n)
        {
            ku.a(s, new Object[] {
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
                ku.a("Delay %d ms before loading...  [%s]", new Object[] {
                    Integer.valueOf(i1), s
                });
            }
            try
            {
                Thread.sleep(d.l);
            }
            catch (InterruptedException interruptedexception)
            {
                ku.d("Task was interrupted [%s]", new Object[] {
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
        boolean flag = ks.a(inputstream, file, this);
        ks.a(file);
        ks.a(inputstream);
        return flag;
        Exception exception;
        exception;
        ks.a(file);
        throw exception;
        file;
        ks.a(inputstream);
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
        String s = ki.c.b(file2.getAbsolutePath());
        if (!file2.exists()) goto _L2; else goto _L1
_L1:
        Object obj;
        b("Load image from disc cache [%s]");
        q = jk.b;
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
        q = jk.a;
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
        a(je.b, ((Throwable) (null)));
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
        a(je.c, ((Throwable) (null)));
        return ((Bitmap) (obj));
        obj;
        throw obj;
        obj;
        obj3 = null;
_L13:
        ku.a(((Throwable) (obj)));
        a(je.a, ((Throwable) (obj)));
        if (file2.exists())
        {
            file2.delete();
        }
        return ((Bitmap) (obj3));
        obj1;
        obj = null;
_L11:
        ku.a(((Throwable) (obj1)));
        a(je.d, ((Throwable) (obj1)));
        return ((Bitmap) (obj));
        obj1;
        obj = null;
_L9:
        ku.a(((Throwable) (obj1)));
        a(je.e, ((Throwable) (obj1)));
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

    private kh d()
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
            throw new ja(this);
        }
        if (h())
        {
            throw new ja(this);
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
            throw new ja(this);
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
                    i.post(new ix(this, i1, j1));
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
        ku.d("Pre-processor returned null [%s]", new Object[] {
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
        ku.d("Post-processor returned null [%s]", new Object[] {
            o
        });
        obj = bitmap;
        e();
        i();
        reentrantlock.unlock();
        obj = new in(((Bitmap) (obj)), h, g, q);
        obj.a = n;
        boolean flag1;
        if (d.s)
        {
            ((in) (obj)).run();
            return;
        } else
        {
            i.post(((Runnable) (obj)));
            return;
        }
        q = jk.c;
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
        i.post(new iz(this));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        reentrantlock.unlock();
        throw obj;
    }
}
