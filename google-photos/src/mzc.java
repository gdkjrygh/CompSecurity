// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.WeakReference;

public abstract class mzc
{

    private Object a;
    private WeakReference b;
    private boolean c;

    public mzc()
    {
        c = false;
    }

    public abstract Object a();

    public final Object b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            c = true;
            mzd.a(this);
        }
        if (b != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        Object obj1;
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj1 = p.a(a());
        a = obj1;
        b = new WeakReference(a);
        this;
        JVM INSTR monitorexit ;
        return obj1;
_L2:
        obj = b.get();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final int hashCode()
    {
        return super.hashCode();
    }
}
