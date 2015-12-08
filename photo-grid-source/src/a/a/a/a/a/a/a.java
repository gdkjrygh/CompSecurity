// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.a;

import android.content.Context;

// Referenced classes of package a.a.a.a.a.a:
//            c, d

public abstract class a
    implements c
{

    private final c a = null;

    public a()
    {
    }

    protected abstract Object a();

    public final Object a(Context context, d d1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = a();
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        context = ((Context) (a.a(context, d1)));
_L1:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        throw new NullPointerException();
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        context = ((Context) (d1.a(context)));
          goto _L1
        a(context);
        obj = context;
        this;
        JVM INSTR monitorexit ;
        return obj;
    }

    protected abstract void a(Object obj);
}
