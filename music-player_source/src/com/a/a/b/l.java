// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.a.a.a.a.b;
import com.a.a.b.a.f;
import com.a.a.b.a.g;
import com.a.a.b.a.i;
import com.a.a.b.b.e;
import com.a.a.b.e.a;
import com.a.a.c.c;
import com.a.a.c.d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.a.a.b:
//            i, g, k, d, 
//            n, e, p, m, 
//            c, o

final class l
    implements d, Runnable
{

    final String a;
    final a b;
    final com.a.a.b.d c;
    final com.a.a.b.f.a d;
    final com.a.a.b.f.b e;
    private final com.a.a.b.i f;
    private final k g;
    private final Handler h;
    private final com.a.a.b.g i;
    private final com.a.a.b.d.c j;
    private final com.a.a.b.d.c k;
    private final com.a.a.b.d.c l;
    private final com.a.a.b.b.d m;
    private final boolean n;
    private final String o;
    private final f p;
    private g q;

    public l(com.a.a.b.i i1, k k1, Handler handler)
    {
        q = g.a;
        f = i1;
        g = k1;
        h = handler;
        i = i1.a;
        j = i.r;
        k = i.w;
        l = i.x;
        m = i.s;
        n = i.u;
        a = k1.a;
        o = k1.b;
        b = k1.c;
        p = k1.d;
        c = k1.e;
        d = k1.f;
        e = k1.g;
    }

    private Bitmap a(String s)
    {
        i i1 = b.c();
        s = new e(o, s, p, i1, d(), c);
        return m.a(s);
    }

    static com.a.a.b.g a(l l1)
    {
        return l1.i;
    }

    private void a(com.a.a.b.a.c c1, Throwable throwable)
    {
        if (c.s() || j() || f())
        {
            return;
        } else
        {
            a(((Runnable) (new n(this, c1, throwable))), false, h);
            return;
        }
    }

    static void a(Runnable runnable, boolean flag, Handler handler)
    {
        if (flag)
        {
            runnable.run();
            return;
        }
        if (handler == null)
        {
            (new Thread(runnable)).start();
            return;
        } else
        {
            handler.post(runnable);
            return;
        }
    }

    private boolean a()
    {
        AtomicBoolean atomicboolean;
        atomicboolean = f.a();
        if (!atomicboolean.get())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Object obj = f.b();
        obj;
        JVM INSTR monitorenter ;
        if (!atomicboolean.get())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        b("ImageLoader is paused. Waiting...  [%s]");
        f.b().wait();
        b(".. Resume loading [%s]");
        return f();
        Object obj1;
        obj1;
        com.a.a.c.e.d("Task was interrupted [%s]", new Object[] {
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
            break MISSING_BLOCK_LABEL_119;
        }
        flag2 = flag;
        int i1 = i.d;
        flag2 = flag;
        int j1 = i.e;
        if (i1 <= 0)
        {
            flag1 = flag;
            if (j1 <= 0)
            {
                break MISSING_BLOCK_LABEL_87;
            }
        }
        flag2 = flag;
        b("Resize image in disc cache [%s]");
        flag2 = flag;
        flag1 = a(file, i1, j1);
        flag2 = flag1;
        b b1 = i.q;
        flag2 = flag1;
        String s = a;
        flag2 = flag1;
        b1.a(file);
_L2:
        return flag1;
        IOException ioexception;
        ioexception;
        flag2 = false;
_L3:
        com.a.a.c.e.a(ioexception);
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
        obj = new f(i1, j1);
        Object obj1 = (new com.a.a.b.e()).(c).(com.a.a.b.a.e.c).d();
        obj = new e(o, com.a.a.b.d.d.c.b(file.getAbsolutePath()), ((f) (obj)), i.a, d(), ((com.a.a.b.d) (obj1)));
        obj1 = m.a(((e) (obj)));
        obj = obj1;
        if (obj1 != null)
        {
            obj = obj1;
            if (i.h != null)
            {
                b("Process image before cache on disc [%s]");
                Bitmap bitmap = i.h.a();
                obj = bitmap;
                if (bitmap == null)
                {
                    com.a.a.c.e.d("Bitmap processor for disc cache returned null [%s]", new Object[] {
                        o
                    });
                    obj = bitmap;
                }
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        file = new BufferedOutputStream(new FileOutputStream(file), 32768);
        ((Bitmap) (obj)).compress(i.f, i.g, file);
        com.a.a.c.c.a(file);
        ((Bitmap) (obj)).recycle();
        return true;
        Exception exception;
        exception;
        com.a.a.c.c.a(file);
        throw exception;
    }

    private void b(String s)
    {
        if (n)
        {
            com.a.a.c.e.a(s, new Object[] {
                o
            });
        }
    }

    private boolean b()
    {
        if (c.f())
        {
            int i1 = c.l();
            String s = o;
            if (n)
            {
                com.a.a.c.e.a("Delay %d ms before loading...  [%s]", new Object[] {
                    Integer.valueOf(i1), s
                });
            }
            try
            {
                Thread.sleep(c.l());
            }
            catch (InterruptedException interruptedexception)
            {
                com.a.a.c.e.d("Task was interrupted [%s]", new Object[] {
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
        java.io.InputStream inputstream = d().a(a, c.n());
        file = new BufferedOutputStream(new FileOutputStream(file), 32768);
        boolean flag = com.a.a.c.c.a(inputstream, file, this);
        com.a.a.c.c.a(file);
        com.a.a.c.c.a(inputstream);
        return flag;
        Exception exception;
        exception;
        com.a.a.c.c.a(file);
        throw exception;
        file;
        com.a.a.c.c.a(inputstream);
        throw file;
    }

    private Bitmap c()
    {
        File file2;
label0:
        {
            File file = i.q.a(a);
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
            file = i.v.a(a);
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
        String s = com.a.a.b.d.d.c.b(file2.getAbsolutePath());
        if (!file2.exists()) goto _L2; else goto _L1
_L1:
        Object obj;
        b("Load image from disc cache [%s]");
        q = g.b;
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
        q = g.a;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (!c.i()) goto _L4; else goto _L3
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
        a(com.a.a.b.a.c.b, ((Throwable) (null)));
        obj5 = obj;
        break; /* Loop/switch isn't completed */
_L4:
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        obj5 = a;
        if (true) goto _L7; else goto _L6
_L6:
        break; /* Loop/switch isn't completed */
        obj;
        obj = null;
_L14:
        a(com.a.a.b.a.c.c, ((Throwable) (null)));
        return ((Bitmap) (obj));
        obj;
        throw obj;
        obj;
        obj3 = null;
_L13:
        com.a.a.c.e.a(((Throwable) (obj)));
        a(com.a.a.b.a.c.a, ((Throwable) (obj)));
        if (file2.exists())
        {
            file2.delete();
        }
        return ((Bitmap) (obj3));
        obj1;
        obj = null;
_L11:
        com.a.a.c.e.a(((Throwable) (obj1)));
        a(com.a.a.b.a.c.d, ((Throwable) (obj1)));
        return ((Bitmap) (obj));
        obj1;
        obj = null;
_L9:
        com.a.a.c.e.a(((Throwable) (obj1)));
        a(com.a.a.b.a.c.e, ((Throwable) (obj1)));
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

    private com.a.a.b.d.c d()
    {
        if (f.c())
        {
            return k;
        }
        if (f.d())
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
            throw new p(this);
        }
        if (h())
        {
            throw new p(this);
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
        if (b.e())
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
        String s = f.a(b);
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
            throw new p(this);
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
            if (e != null)
            {
                if (c.s() || j() || f())
                {
                    i1 = 0;
                } else
                {
                    a(((Runnable) (new m(this, i1, j1))), false, h);
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
        while (a() || b()) 
        {
            return;
        }
        reentrantlock = g.h;
        b("Start display image task [%s]");
        if (reentrantlock.isLocked())
        {
            b("Image already is loading. Waiting... [%s]");
        }
        reentrantlock.lock();
        Bitmap bitmap;
        e();
        bitmap = (Bitmap)i.p.a(o);
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        Object obj = c();
        if (obj == null)
        {
            reentrantlock.unlock();
            return;
        }
        e();
        i();
        if (!c.d())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        b("PreProcess image before caching in memory [%s]");
        bitmap = c.o().a();
        obj = bitmap;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        com.a.a.c.e.d("Pre-processor returned null [%s]", new Object[] {
            o
        });
        obj = bitmap;
        bitmap = ((Bitmap) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        bitmap = ((Bitmap) (obj));
        if (!c.h())
        {
            break MISSING_BLOCK_LABEL_198;
        }
        b("Cache image in memory [%s]");
        i.p.a(o, obj);
        bitmap = ((Bitmap) (obj));
_L2:
        obj = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        obj = bitmap;
        if (!c.e())
        {
            break MISSING_BLOCK_LABEL_261;
        }
        b("PostProcess image before displaying [%s]");
        bitmap = c.p().a();
        obj = bitmap;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        com.a.a.c.e.d("Post-processor returned null [%s]", new Object[] {
            o
        });
        obj = bitmap;
        e();
        i();
        reentrantlock.unlock();
        obj = new com.a.a.b.c(((Bitmap) (obj)), g, f, q);
        ((com.a.a.b.c) (obj)).a(n);
        a(((Runnable) (obj)), c.s(), h);
        return;
        q = g.c;
        b("...Get cached bitmap from memory after waiting. [%s]");
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1;
        boolean flag;
        if (c.s())
        {
            break MISSING_BLOCK_LABEL_357;
        }
        flag = j();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_362;
        }
_L4:
        reentrantlock.unlock();
        return;
        a(new o(this), false, h);
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        reentrantlock.unlock();
        throw obj1;
    }
}
