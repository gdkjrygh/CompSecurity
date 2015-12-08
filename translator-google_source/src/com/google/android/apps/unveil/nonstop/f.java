// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.w;
import com.google.android.apps.unveil.sensors.CameraManager;
import com.google.android.apps.unveil.sensors.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            n, h, i, g, 
//            c, m

public final class f
    implements android.hardware.Camera.PreviewCallback, n
{

    public volatile boolean a;
    int b;
    final Paint c;
    final Vector d;
    private final af e;
    private final CameraManager f;
    private final w g;
    private final h h[];
    private int i;
    private boolean j;
    private volatile boolean k;
    private final long l;
    private final Handler m;
    private boolean n;
    private final Size o;
    private int p;
    private final Matrix q;
    private List r;
    private final Thread s;

    public f(CameraManager cameramanager, int i1)
    {
        this(cameramanager, i1, 3, null);
    }

    public f(CameraManager cameramanager, int i1, int j1, Matrix matrix)
    {
        e = new af();
        n = false;
        b = -1;
        c = new Paint();
        d = new Vector();
        f = cameramanager;
        s = Thread.currentThread();
        p = i1;
        q = matrix;
        g = new w();
        j = true;
        a = false;
        n = false;
        l = 33L;
        o = cameramanager.getPreviewSize();
        h = new h[j1];
        p = i1;
        m = new Handler();
        cameramanager = null;
        for (i1 = j1 - 1; i1 > 0; i1--)
        {
            j1 = Math.max(5 - i1, 5);
            cameramanager = new i((new StringBuilder(28)).append("ProcessingThread ").append(i1).toString(), j1, cameramanager);
            h[i1] = cameramanager;
        }

        h[0] = new h(cameramanager);
    }

    static boolean a(f f1)
    {
        f1.n = false;
        return false;
    }

    static void b(f f1)
    {
        f1.d();
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (n) goto _L2; else goto _L1
_L1:
        boolean flag = a;
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        long l1;
        n = true;
        l1 = g.d();
        l1 = l - l1;
        if (l1 <= 5L)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        m.postDelayed(new g(this), l1);
          goto _L2
        Exception exception;
        exception;
        throw exception;
        e();
        n = false;
          goto _L2
    }

    private void e()
    {
        f.a(this);
        g.c();
    }

    private boolean f()
    {
        if (!k)
        {
            return false;
        }
        f.a(null);
        h();
        g();
        h();
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((c)iterator.next()).b()) { }
        a = false;
        return true;
    }

    private void g()
    {
        Object obj = new ArrayList();
        h ah[] = h;
        int j1 = ah.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ah[i1].a(((java.util.Collection) (obj)));
        }

        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Runnable)((Iterator) (obj)).next()).run()) { }
    }

    private void h()
    {
        for (int i1 = 1; i1 < h.length; i1++)
        {
            h[i1].a();
        }

    }

    final List a()
    {
        if (r == null)
        {
            r = new ArrayList();
            h ah[] = h;
            int j1 = ah.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                h h1 = ah[i1];
                r.addAll(Collections.unmodifiableList(h1.b));
            }

        }
        return r;
    }

    public final void a(Size size)
    {
        this;
        JVM INSTR monitorenter ;
        e.a("startLoop with size %s", new Object[] {
            size
        });
        if (!a) goto _L2; else goto _L1
_L1:
        e.b("Starting a PreviewLooper that was already started, just resetting preview callback.", new Object[0]);
        f.a(null);
        e();
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = true;
        k = false;
        g.a();
        n = false;
        i = 0;
        if (j)
        {
            Matrix matrix = q;
            h();
            for (Iterator iterator = a().iterator(); iterator.hasNext(); ((c)iterator.next()).a(o, size, p, matrix)) { }
        }
        break MISSING_BLOCK_LABEL_146;
        size;
        throw size;
        int j1;
        j = false;
        size = h;
        j1 = size.length;
        int i1 = 0;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        size[i1].b();
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        h();
        for (size = a().iterator(); size.hasNext(); ((c)size.next()).a()) { }
        e();
          goto _L5
    }

    public final void a(c c1, int i1)
    {
        synchronized (h[i1])
        {
            h[i1].b.add(c1);
            r = null;
        }
        return;
        c1;
        h1;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final void a(byte abyte0[])
    {
        CameraManager cameramanager = f;
        Object obj = cameramanager.j;
        obj;
        JVM INSTR monitorenter ;
        u u1;
        if (cameramanager.i == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        u1 = cameramanager.i;
        synchronized (u1.c)
        {
            u1.c.add(abyte0);
        }
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        arraylist;
        JVM INSTR monitorexit ;
        throw abyte0;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
        CameraManager.a.c("Tried to give buffer to null PreviewFetcher", new Object[0]);
          goto _L1
    }

    public final void b()
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        e.a("pauseLoop", new Object[0]);
        if (a) goto _L2; else goto _L1
_L1:
        e.c("Pausing a PreviewLooper that was already paused.", new Object[0]);
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        h ah[];
        int j1;
        ah = h;
        j1 = ah.length;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ah[i1].c = true;
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        k = true;
        if (Thread.currentThread() == s)
        {
            f();
        }
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        h ah[];
        int j1;
        e.b("shutdown", new Object[0]);
        b();
        ah = h;
        j1 = ah.length;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ah[i1].c();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((c)iterator.next()).c()) { }
        break MISSING_BLOCK_LABEL_87;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final void onPreviewFrame(byte abyte0[], Camera camera)
    {
        this;
        JVM INSTR monitorenter ;
        if (a) goto _L2; else goto _L1
_L1:
        e.c("Dropping frame due to pause event.", new Object[0]);
        f.a(null);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!f())
        {
            g();
            i = i + 1;
            abyte0 = new m(abyte0, o, i, SystemClock.uptimeMillis(), p, this);
            abyte0.g();
            h[0].b(abyte0);
            d();
        }
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }
}
