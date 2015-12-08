// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core;

import android.graphics.Bitmap;
import com.roidapp.videolib.gl.a;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.roidapp.videolib.core:
//            h

public class i extends Thread
{

    private static final String a = com/roidapp/videolib/core/i.getSimpleName();
    private int b;
    private a c[];
    private Object d;
    private int e;
    private h f;
    private AtomicBoolean g;

    public i(h h1, int j)
    {
        b = 0;
        c = null;
        d = new Object();
        e = 0;
        f = null;
        g = new AtomicBoolean(false);
        f = h1;
        b = j;
        c = new a[j];
    }

    private static void a(a a1)
    {
        if (a1 == null)
        {
            return;
        }
        synchronized (a1.a)
        {
            if (a1.b != null && !a1.b.isRecycled())
            {
                a1.b.recycle();
                a1.b = null;
            }
        }
        a1.d = true;
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private boolean b(int j)
    {
        while (j < 0 || j >= b || f == null || c[j] != null) 
        {
            return false;
        }
        c[j] = f.f(j);
        return true;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (e < 0 || e >= b) goto _L2; else goto _L1
_L1:
        h h1 = f;
        if (h1 != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!b(e) && !b(e + 1) && !b(e - 1) && !b(e + 2))
        {
            b(e - 2);
        }
        break MISSING_BLOCK_LABEL_153;
_L5:
        int j;
        if (j >= c.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j < e - 2 || j > e + 2)
        {
            a(c[j]);
            c[j] = null;
        }
        j++;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
        j = 0;
        if (true) goto _L5; else goto _L6
_L6:
        if (true) goto _L2; else goto _L7
_L7:
    }

    public final a a(int j)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if (j >= b)
        {
            return null;
        }
        if (c[j] == null)
        {
            synchronized (d)
            {
                e = j;
                c();
                if (Math.abs(e - j) > 1)
                {
                    e = j;
                }
            }
        }
        obj = c[j];
        return ((a) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public final void b()
    {
        g.set(true);
        interrupt();
        int k = c.length;
        for (int j = 0; j < k; j++)
        {
            a(c[j]);
            c[j] = null;
        }

        e = 0;
        c = null;
        System.gc();
    }

    public void run()
    {
_L2:
        if (g.get())
        {
            break; /* Loop/switch isn't completed */
        }
        sleep(1L);
        synchronized (d)
        {
            c();
        }
        if (true) goto _L2; else goto _L1
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception) { }
_L1:
    }

}
