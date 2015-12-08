// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public abstract class mzm
    implements mzv
{

    private static WeakHashMap i = new WeakHashMap();
    private static ThreadLocal j = new ThreadLocal();
    public int a;
    public int b;
    public int c;
    public int d;
    boolean e;
    public mzo f;
    private int g;
    private int h;

    protected mzm()
    {
        this(null, 0, 0);
    }

    protected mzm(mzo mzo1, int k, int l)
    {
        a = -1;
        c = -1;
        d = -1;
        f = null;
        f = null;
        a = 0;
        b = 0;
        synchronized (i)
        {
            i.put(this, null);
        }
        return;
        exception;
        mzo1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void i()
    {
        WeakHashMap weakhashmap = i;
        weakhashmap;
        JVM INSTR monitorenter ;
        for (Iterator iterator = i.keySet().iterator(); iterator.hasNext();)
        {
            mzm mzm1 = (mzm)iterator.next();
            mzm1.b = 0;
            mzm1.f = null;
        }

        break MISSING_BLOCK_LABEL_55;
        Exception exception;
        exception;
        weakhashmap;
        JVM INSTR monitorexit ;
        throw exception;
        weakhashmap;
        JVM INSTR monitorexit ;
    }

    public final void a(int k, int l)
    {
        c = k;
        d = l;
        if (k > 0)
        {
            k = mzl.a(k);
        } else
        {
            k = 0;
        }
        g = k;
        if (l > 0)
        {
            k = mzl.a(l);
        } else
        {
            k = 0;
        }
        h = k;
        if (g > 4096 || h > 4096)
        {
            Log.w("BasicTexture", String.format("texture is too large: %d x %d", new Object[] {
                Integer.valueOf(g), Integer.valueOf(h)
            }), new Exception());
        }
    }

    public boolean a()
    {
        return false;
    }

    protected abstract boolean a(mzo mzo1);

    public int b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public int d()
    {
        return g;
    }

    public int e()
    {
        return h;
    }

    protected abstract int f();

    protected void finalize()
    {
        j.set(mzm);
        h();
        j.set(null);
    }

    public final boolean g()
    {
        return b == 1;
    }

    public void h()
    {
        mzo mzo1 = f;
        if (mzo1 != null && a != -1)
        {
            mzo1.a(this);
            a = -1;
        }
        b = 0;
        f = null;
    }

}
