// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.Lazy;

// Referenced classes of package dagger.internal:
//            LazyBinding, Binding

class cess._cls000
    implements Lazy
{

    private volatile Object cacheValue;
    final LazyBinding this$0;

    public Object get()
    {
        if (cacheValue != LazyBinding.access$000()) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (cacheValue == LazyBinding.access$000())
        {
            cacheValue = LazyBinding.access$100(LazyBinding.this).get();
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return cacheValue;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = LazyBinding.this;
        super();
        cacheValue = LazyBinding.access$000();
    }
}
