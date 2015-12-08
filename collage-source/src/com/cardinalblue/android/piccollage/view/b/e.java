// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.b;

import android.view.View;
import com.cardinalblue.android.b.h;
import com.cardinalblue.android.piccollage.view.k;
import java.util.Queue;

// Referenced classes of package com.cardinalblue.android.piccollage.view.b:
//            d

public abstract class e extends h
{

    private boolean a;
    protected k f;
    protected View g;
    protected long h;

    protected e(k k1, View view, long l)
    {
        super(l, 33L);
        a = true;
        f = k1;
        g = view;
        h = l;
        a = true;
    }

    public static float a(float f1, float f2, float f3)
    {
        return (f2 - f1) * f3 + f1;
    }

    public static float b(float f1)
    {
        f1 *= 2.0F;
        if (f1 <= 1.0F)
        {
            return (f1 * (f1 * f1)) / 2.0F;
        } else
        {
            f1 -= 2.0F;
            return (f1 * (f1 * f1) + 2.0F) / 2.0F;
        }
    }

    public static float b(float f1, float f2, float f3)
    {
        return (f2 - f1) * b(f3) + f1;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        c();
        f.H();
        g.postInvalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public abstract void a(float f1);

    public boolean a(long l)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (!a) goto _L2; else goto _L1
_L1:
        Queue queue = f.ad();
        queue;
        JVM INSTR monitorenter ;
        if (!queue.contains(this))
        {
            queue.add(this);
        }
        if (queue.peek() == this) goto _L4; else goto _L3
_L3:
        if (!f())
        {
            e();
        }
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        queue;
        JVM INSTR monitorexit ;
        f.d(true);
        a = false;
        b();
_L2:
        a((float)(h - l) / (float)h);
        g.postInvalidate();
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception1;
        exception1;
        queue;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
    }

    protected void c()
    {
        f.d(false);
        Queue queue = f.ad();
        queue;
        JVM INSTR monitorenter ;
        for (; queue.peek() == this || (queue.peek() instanceof d); queue.poll()) { }
        break MISSING_BLOCK_LABEL_55;
        Exception exception;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
        if (queue.peek() != null)
        {
            ((e)queue.peek()).d();
        }
        queue;
        JVM INSTR monitorexit ;
    }
}
