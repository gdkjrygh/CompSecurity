// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.cache;

import android.content.Context;

// Referenced classes of package io.fabric.sdk.android.services.cache:
//            ValueCache, ValueLoader

public abstract class AbstractValueCache
    implements ValueCache
{

    private final ValueCache a;

    public AbstractValueCache(ValueCache valuecache)
    {
        a = valuecache;
    }

    private void b(Context context, Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            a(context, obj);
            return;
        }
    }

    protected abstract Object a(Context context);

    public final Object a(Context context, ValueLoader valueloader)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = a(context);
        Object obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        valueloader = ((ValueLoader) (a.a(context, valueloader)));
_L3:
        b(context, valueloader);
        obj = valueloader;
_L2:
        this;
        JVM INSTR monitorexit ;
        return obj;
        valueloader = ((ValueLoader) (valueloader.c(context)));
          goto _L3
        context;
        throw context;
    }

    protected abstract void a(Context context, Object obj);
}
