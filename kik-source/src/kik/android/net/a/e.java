// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.a;

import android.content.Context;
import android.os.PowerManager;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.o;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.net.a:
//            f, g, b

public final class e
{

    private static e a = null;
    private static Object b = new Object();
    private static final b c = org.c.c.a("FileUploadManager");
    private final String d;
    private final f e = new f();
    private final Object f = new Object();
    private final List g = Collections.synchronizedList(new LinkedList());
    private final HashMap h = new HashMap();
    private final android.os.PowerManager.WakeLock i;
    private final int j = 3;
    private final i k = new kik.android.net.a.f(this);
    private final Runnable l = new g(this);

    private e(String s, android.os.PowerManager.WakeLock wakelock, kik.a.e.f f1)
    {
        d = s;
        i = wakelock;
        (new Thread(l, (new StringBuilder("FileUp-")).append(s).toString())).start();
        e.a(f1.b(), k, new o());
        e.a(f1.e(), k, new o());
    }

    public static e a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = a;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        throw new IllegalStateException("No instance of file uploader");
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        return ((e) (obj1));
    }

    public static e a(Context context, kik.a.e.f f1)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        e e2 = a;
        e e1;
        e1 = e2;
        if (e2 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        e1 = new e("", ((PowerManager)context.getSystemService("power")).newWakeLock(1, "FileUp-"), f1);
        a = e1;
        obj;
        JVM INSTR monitorexit ;
        return e1;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(e e1)
    {
        e1.e();
    }

    static b b()
    {
        return c;
    }

    static void b(e e1)
    {
        int i1 = 0;
_L3:
        int j1;
        int k1;
        if (e1.g.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        obj = (kik.android.net.a.b)e1.g.remove(0);
        if (!e1.i.isHeld())
        {
            e1.i.acquire();
        }
        k1 = -1;
        j1 = k1;
        long l1 = System.currentTimeMillis();
        j1 = k1;
        k1 = ((kik.android.net.a.b) (obj)).c();
        j1 = k1;
        l1 = System.currentTimeMillis() - l1;
        j1 = k1;
        if (!((kik.android.net.a.b) (obj)).c(k1)) goto _L2; else goto _L1
_L1:
        j1 = k1;
        IOException ioexception;
        (new StringBuilder("Item successfully uploaded, took: ")).append(l1).append("ms");
          goto _L3
_L7:
        j1 = i1;
        if (!kik.android.net.a.b.b(k1))
        {
            j1 = i1 + 1;
        }
        if (((kik.android.net.a.b) (obj)).g())
        {
            e1.g.add(obj);
            i1 = j1;
        } else
        {
            ((kik.android.net.a.b) (obj)).i();
            i1 = j1;
        }
_L8:
        if (e1.g.size() <= 0 || i1 >= 3) goto _L5; else goto _L4
_L4:
        synchronized (e1.f)
        {
            e1.f.wait(1000L);
        }
          goto _L3
_L2:
        Object obj1;
        if (k1 == -800)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0) goto _L3; else goto _L6
_L6:
        j1 = k1;
        if (!kik.android.net.a.b.b(k1))
        {
            break MISSING_BLOCK_LABEL_243;
        }
        j1 = k1;
        try
        {
            ((kik.android.net.a.b) (obj)).e();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            ((kik.android.net.a.b) (obj)).f();
            k1 = j1;
        }
          goto _L7
        j1 = k1;
        (new StringBuilder("Upload failed with response code: ")).append(k1).append(" after: ").append(l1).append("ms");
          goto _L7
        e1;
        obj;
        JVM INSTR monitorexit ;
        throw e1;
_L5:
        for (; e1.i.isHeld(); e1.i.release()) { }
        obj1 = e1.f;
        obj1;
        JVM INSTR monitorenter ;
        if (i1 < 3)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        ((kik.android.net.a.b) (obj)).i();
        e1.f();
        e1.f.wait();
        obj1;
        JVM INSTR monitorexit ;
        i1 = 0;
          goto _L3
        e1;
        obj1;
        JVM INSTR monitorexit ;
        throw e1;
        obj = null;
          goto _L8
    }

    static Object c()
    {
        return b;
    }

    static String c(e e1)
    {
        return e1.d;
    }

    static android.os.PowerManager.WakeLock d(e e1)
    {
        return e1.i;
    }

    static e d()
    {
        a = null;
        return null;
    }

    private void e()
    {
        synchronized (f)
        {
            f.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void f()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = h.values().iterator();
_L2:
        kik.android.net.a.b b1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_69;
            }
            b1 = (kik.android.net.a.b)((WeakReference)iterator.next()).get();
        } while (b1 == null);
        if (b1.b() == 4) goto _L2; else goto _L1
_L1:
        b1.i();
          goto _L2
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public final WeakReference a(String s)
    {
        return (WeakReference)h.get(s);
    }

    public final void a(kik.android.net.a.b b1)
    {
        if (b1.m() > 0xf00000L)
        {
            b1.j();
            return;
        }
        b1.k();
        if (g.contains(b1))
        {
            g.remove(g.indexOf(b1));
            g.add(0, b1);
        } else
        {
            g.add(g.size(), b1);
        }
        synchronized (f)
        {
            h.put(b1.d(), new WeakReference(b1));
        }
        e();
        return;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void b(kik.android.net.a.b b1)
    {
        if (b1 == null)
        {
            return;
        } else
        {
            b1.i();
            b1.h();
            g.remove(b1);
            return;
        }
    }

}
