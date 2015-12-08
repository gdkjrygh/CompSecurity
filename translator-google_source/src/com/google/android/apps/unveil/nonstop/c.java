// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.SystemClock;
import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import java.util.ArrayList;
import java.util.Vector;

// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            d, m

public abstract class c
{

    private final af a = new af();
    public final d b = new d(this);
    public Size c;
    public Size d;
    public Matrix e;
    final ArrayList f = new ArrayList();
    public int g;
    public boolean h;
    boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private long n;

    public c()
    {
        l = 1;
        m = 0;
        i = true;
    }

    protected final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (f.size() > 0)
        {
            a.e("Left over queued runnables from last time!", new Object[0]);
            f.clear();
        }
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Size size, Size size1, int i1, Matrix matrix)
    {
        this;
        JVM INSTR monitorenter ;
        j = true;
        c = size;
        d = size1;
        g = i1;
        if (matrix == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        e = matrix;
_L1:
        n = -1L;
        this;
        JVM INSTR monitorexit ;
        return;
        a.c("Null frameToCanvas Matrix, debug drawing may not line up!", new Object[0]);
        e = ImageUtils.a(size, size1, i1);
          goto _L1
        size;
        throw size;
    }

    public abstract void a(m m1);

    protected final void b()
    {
        this;
        JVM INSTR monitorenter ;
        f.clear();
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(Canvas canvas)
    {
    }

    protected final void b(m m1)
    {
        this;
        JVM INSTR monitorenter ;
        if (m != 0) goto _L2; else goto _L1
_L1:
        d d1;
        long l1;
        k = false;
        if (i)
        {
            l1 = SystemClock.currentThreadTimeMillis();
            a(m1);
            l1 = SystemClock.currentThreadTimeMillis() - l1;
            if (!k)
            {
                d1 = b;
                d1.a = d1.a + 1;
                d1.b = d1.b + l1;
                float f1 = (float)d1.b / (float)d1.a;
                if (d1.a != 1)
                {
                    break MISSING_BLOCK_LABEL_123;
                }
                d1.c = f1;
            }
        }
_L3:
        n = m1.b;
_L2:
        m = (m + 1) % l;
        this;
        JVM INSTR monitorexit ;
        return;
        float f2 = d1.c;
        d1.c = (float)l1 * 0.05000001F + 0.95F * f2;
          goto _L3
        m1;
        throw m1;
    }

    protected final void c()
    {
        this;
        JVM INSTR monitorenter ;
        j = false;
        f();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void d()
    {
    }

    public void e()
    {
    }

    public void f()
    {
    }

    public Vector g()
    {
        return new Vector();
    }
}
