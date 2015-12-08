// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.b.a.b.a.d;
import com.b.a.b.a.e;
import com.b.a.b.a.f;
import com.b.a.b.a.h;
import com.b.a.b.b.b;
import com.b.a.b.b.c;
import com.b.a.b.e.a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.b.a.b:
//            f, e, h, c, 
//            k, j, b, l

final class i
    implements com.b.a.c.b.a, Runnable
{
    final class a extends Exception
    {

        final i a;

        a()
        {
            a = i.this;
            super();
        }
    }


    final com.b.a.b.e a;
    final String b;
    final com.b.a.b.e.a c;
    final com.b.a.b.c d;
    final com.b.a.b.f.a e;
    final com.b.a.b.f.b f;
    private final com.b.a.b.f g;
    private final com.b.a.b.h h;
    private final Handler i;
    private final com.b.a.b.d.b j;
    private final com.b.a.b.d.b k;
    private final com.b.a.b.d.b l;
    private final b m;
    private final String n;
    private final e o;
    private final boolean p;
    private f q;

    public i(com.b.a.b.f f1, com.b.a.b.h h1, Handler handler)
    {
        q = f.a;
        g = f1;
        h = h1;
        i = handler;
        a = f1.a;
        j = a.p;
        k = a.s;
        l = a.t;
        m = a.q;
        b = h1.a;
        n = h1.b;
        c = h1.c;
        o = h1.d;
        d = h1.e;
        e = h1.f;
        f = h1.g;
        p = d.s;
    }

    private Bitmap a(String s)
        throws IOException
    {
        int i1 = c.c();
        s = new c(n, s, b, o, i1, e(), d);
        return m.a(s);
    }

    private void a(int i1, Throwable throwable)
    {
        if (p || k() || g())
        {
            return;
        } else
        {
            a(((Runnable) (new k(this, i1, throwable))), false, i, g);
            return;
        }
    }

    static void a(Runnable runnable, boolean flag, Handler handler, com.b.a.b.f f1)
    {
        if (flag)
        {
            runnable.run();
            return;
        }
        if (handler == null)
        {
            f1.d.execute(runnable);
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
        atomicboolean = g.f;
        if (!atomicboolean.get())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        Object obj = g.i;
        obj;
        JVM INSTR monitorenter ;
        if (!atomicboolean.get())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        com.b.a.c.c.a("ImageLoader is paused. Waiting...  [%s]", new Object[] {
            n
        });
        g.i.wait();
        com.b.a.c.c.a(".. Resume loading [%s]", new Object[] {
            n
        });
        return g();
        Object obj1;
        obj1;
        com.b.a.c.c.d("Task was interrupted [%s]", new Object[] {
            n
        });
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private boolean b()
    {
        boolean flag;
        if (d.l > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            com.b.a.c.c.a("Delay %d ms before loading...  [%s]", new Object[] {
                Integer.valueOf(d.l), n
            });
            try
            {
                Thread.sleep(d.l);
            }
            catch (InterruptedException interruptedexception)
            {
                com.b.a.c.c.d("Task was interrupted [%s]", new Object[] {
                    n
                });
                return true;
            }
            return g();
        } else
        {
            return false;
        }
    }

    private Bitmap c()
        throws a
    {
        Object obj = a.o.a(b);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((File) (obj)).exists()) goto _L2; else goto _L3
_L3:
        com.b.a.c.c.a("Load image from disk cache [%s]", new Object[] {
            n
        });
        q = f.b;
        f();
        obj = a(com.b.a.b.d.b.a.c.b(((File) (obj)).getAbsolutePath()));
_L12:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (((Bitmap) (obj)).getWidth() <= 0)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        Object obj5;
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (((Bitmap) (obj)).getHeight() > 0)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        com.b.a.c.c.a("Load image from network [%s]", new Object[] {
            n
        });
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        q = f.a;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        String s = b;
        obj5 = s;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (!d.i)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        obj5 = s;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (!d())
        {
            break MISSING_BLOCK_LABEL_276;
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        File file = a.o.a(b);
        obj5 = s;
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        obj5 = com.b.a.b.d.b.a.c.b(file.getAbsolutePath());
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        f();
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        obj = a(((String) (obj5)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (((Bitmap) (obj)).getWidth() <= 0)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (((Bitmap) (obj)).getHeight() > 0)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        a(com.b.a.b.a.b.a.b, ((Throwable) (null)));
        obj5 = obj;
        return ((Bitmap) (obj5));
        obj;
        obj4 = null;
_L10:
        a(com.b.a.b.a.b.a.c, ((Throwable) (null)));
        return ((Bitmap) (obj4));
        obj;
        throw obj;
        obj;
        obj3 = null;
_L9:
        com.b.a.c.c.a(((Throwable) (obj)));
        a(com.b.a.b.a.b.a.a, ((Throwable) (obj)));
        return ((Bitmap) (obj3));
        obj;
        obj2 = null;
_L7:
        com.b.a.c.c.a(((Throwable) (obj)));
        a(com.b.a.b.a.b.a.d, ((Throwable) (obj)));
        return ((Bitmap) (obj2));
        obj;
        obj1 = null;
_L5:
        com.b.a.c.c.a(((Throwable) (obj)));
        a(com.b.a.b.a.b.a.e, ((Throwable) (obj)));
        return ((Bitmap) (obj1));
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        obj;
        if (true) goto _L9; else goto _L8
_L8:
        obj;
        if (true) goto _L10; else goto _L2
_L2:
        obj = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private boolean d()
        throws a
    {
        com.b.a.c.c.a("Cache image on disk [%s]", new Object[] {
            n
        });
        Object obj;
        Object obj1;
        Object obj2;
        com.b.a.b.c c1;
        int i1;
        int j1;
        boolean flag;
        try
        {
            java.io.InputStream inputstream = e().a(b, d.n);
            flag = a.o.a(b, inputstream, this);
        }
        catch (IOException ioexception)
        {
            com.b.a.c.c.a(ioexception);
            return false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_490;
        }
        i1 = a.d;
        j1 = a.e;
        if (i1 <= 0 && j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_490;
        }
        com.b.a.c.c.a("Resize image in disk cache [%s]", new Object[] {
            n
        });
        obj = a.o.a(b);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_490;
        }
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_490;
        }
        obj1 = new e(i1, j1);
        obj2 = new c.a();
        c1 = d;
        obj2.a = c1.a;
        obj2.b = c1.b;
        obj2.c = c1.c;
        obj2.d = c1.d;
        obj2.e = c1.e;
        obj2.f = c1.f;
        obj2.g = c1.g;
        obj2.h = c1.h;
        obj2.i = c1.i;
        obj2.j = c1.j;
        obj2.k = c1.k;
        obj2.l = c1.l;
        obj2.m = c1.m;
        obj2.n = c1.n;
        obj2.o = c1.o;
        obj2.p = c1.p;
        obj2.q = c1.q;
        obj2.r = c1.r;
        obj2.s = c1.s;
        obj2.j = d.c;
        obj2 = ((c.a) (obj2)).b();
        obj = new c(n, com.b.a.b.d.b.a.c.b(((File) (obj)).getAbsolutePath()), b, ((e) (obj1)), h.a, e(), ((com.b.a.b.c) (obj2)));
        obj1 = m.a(((c) (obj)));
        obj = obj1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        obj = obj1;
        if (a.f == null)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        com.b.a.c.c.a("Process image before cache on disk [%s]", new Object[] {
            n
        });
        obj1 = a.f.a();
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        com.b.a.c.c.d("Bitmap processor for disk cache returned null [%s]", new Object[] {
            n
        });
        obj = obj1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_490;
        }
        a.o.a(b, ((Bitmap) (obj)));
        ((Bitmap) (obj)).recycle();
        return flag;
    }

    private com.b.a.b.d.b e()
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

    private void f()
        throws a
    {
        if (h())
        {
            throw new a();
        }
        if (i())
        {
            throw new a();
        } else
        {
            return;
        }
    }

    private boolean g()
    {
        return h() || i();
    }

    private boolean h()
    {
        if (c.e())
        {
            com.b.a.c.c.a("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] {
                n
            });
            return true;
        } else
        {
            return false;
        }
    }

    private boolean i()
    {
        String s = g.a(c);
        boolean flag;
        if (!n.equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            com.b.a.c.c.a("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] {
                n
            });
            return true;
        } else
        {
            return false;
        }
    }

    private void j()
        throws a
    {
        if (k())
        {
            throw new a();
        } else
        {
            return;
        }
    }

    private boolean k()
    {
        if (Thread.interrupted())
        {
            com.b.a.c.c.a("Task was interrupted [%s]", new Object[] {
                n
            });
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(int i1, int j1)
    {
        if (p || k() || g())
        {
            return false;
        }
        if (f != null)
        {
            a(((Runnable) (new j(this, i1, j1))), false, i, g);
        }
        return true;
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
        com.b.a.c.c.a("Start display image task [%s]", new Object[] {
            n
        });
        if (reentrantlock.isLocked())
        {
            com.b.a.c.c.a("Image already is loading. Waiting... [%s]", new Object[] {
                n
            });
        }
        reentrantlock.lock();
        Bitmap bitmap1;
        f();
        bitmap1 = (Bitmap)a.n.a(n);
        if (bitmap1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (!bitmap1.isRecycled())
        {
            break MISSING_BLOCK_LABEL_380;
        }
        Bitmap bitmap = c();
        if (bitmap == null)
        {
            reentrantlock.unlock();
            return;
        }
        f();
        j();
        if (d.o == null)
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        com.b.a.c.c.a("PreProcess image before caching in memory [%s]", new Object[] {
            n
        });
        bitmap1 = d.o.a();
        bitmap = bitmap1;
        if (bitmap1 != null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        com.b.a.c.c.d("Pre-processor returned null [%s]", new Object[] {
            n
        });
        bitmap = bitmap1;
        bitmap1 = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        bitmap1 = bitmap;
        if (!d.h)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        com.b.a.c.c.a("Cache image in memory [%s]", new Object[] {
            n
        });
        a.n.a(n, bitmap);
        bitmap1 = bitmap;
_L2:
        bitmap = bitmap1;
        if (bitmap1 == null)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        bitmap = bitmap1;
        if (!d.a())
        {
            break MISSING_BLOCK_LABEL_326;
        }
        com.b.a.c.c.a("PostProcess image before displaying [%s]", new Object[] {
            n
        });
        bitmap1 = d.p.a();
        bitmap = bitmap1;
        if (bitmap1 != null)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        com.b.a.c.c.d("Post-processor returned null [%s]", new Object[] {
            n
        });
        bitmap = bitmap1;
        f();
        j();
        reentrantlock.unlock();
        a(new com.b.a.b.b(bitmap, h, g, q), p, i, g);
        return;
        q = f.c;
        com.b.a.c.c.a("...Get cached bitmap from memory after waiting. [%s]", new Object[] {
            n
        });
        if (true) goto _L2; else goto _L1
_L1:
        Object obj;
        obj;
        boolean flag1;
        if (p)
        {
            break MISSING_BLOCK_LABEL_426;
        }
        flag1 = k();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_431;
        }
_L4:
        reentrantlock.unlock();
        return;
        a(new l(this), false, i, g);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        reentrantlock.unlock();
        throw obj;
    }
}
