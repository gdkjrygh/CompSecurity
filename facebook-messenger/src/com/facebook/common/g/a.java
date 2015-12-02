// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.g;

import java.util.concurrent.CancellationException;

// Referenced classes of package com.facebook.common.g:
//            b

public abstract class a
    implements b
{

    private volatile boolean a;

    public a()
    {
    }

    public void a()
    {
        a = true;
    }

    public final void a(Object obj)
    {
        if (a)
        {
            return;
        } else
        {
            b(obj);
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        if (a)
        {
            return;
        }
        if (throwable instanceof CancellationException)
        {
            a((CancellationException)throwable);
            return;
        } else
        {
            b(throwable);
            return;
        }
    }

    protected void a(CancellationException cancellationexception)
    {
    }

    protected abstract void b(Object obj);

    protected abstract void b(Throwable throwable);

    public boolean c()
    {
        return a;
    }
}
