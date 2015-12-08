// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.util.concurrent:
//            v, d, t

final class h
    implements Runnable
{

    final t a;
    final d b;

    h(t t, d d1)
    {
        a = t;
        b = d1;
        super();
    }

    public final void run()
    {
        Object obj;
        try
        {
            obj = v.a(a);
        }
        catch (ExecutionException executionexception)
        {
            b.a(executionexception.getCause());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            b.a(runtimeexception);
            return;
        }
        catch (Error error)
        {
            b.a(error);
            return;
        }
        b.a(obj);
    }
}
