// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class olr
{

    private volatile olm a;
    private final Object b;
    private final ols c;
    private final boolean d;

    public olr(ols ols1)
    {
        this(true, ols1);
    }

    olr(boolean flag, ols ols1)
    {
        b = new Object();
        d = flag;
        c = ols1;
    }

    public final olm a(Context context)
    {
        if (a == null)
        {
            synchronized (b)
            {
                if (a == null)
                {
                    olm olm1 = new olm(context);
                    if (d)
                    {
                        olm1.a = olm.c(context);
                    }
                    if (c != null)
                    {
                        c.a(context, olm1);
                    }
                    a = olm1;
                }
            }
        }
        return a;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }
}
