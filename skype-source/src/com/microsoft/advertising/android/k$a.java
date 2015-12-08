// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            k, af, n, h, 
//            ai, d

final class a
    implements a
{

    private volatile n a;
    private volatile d b;

    public final d a()
    {
        this;
        JVM INSTR monitorenter ;
        d d;
        d = b;
        b = null;
        this;
        JVM INSTR monitorexit ;
        return d;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(n n1, b b1)
    {
        d d;
        boolean flag;
        flag = true;
        d = null;
        af.a(new Object[] {
            n1, b1
        });
        this;
        JVM INSTR monitorenter ;
        if (a != n1 || b != null)
        {
            flag = false;
        }
        if (!af.a(flag))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        a = null;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        d = b1.a;
        b = d;
        if (b != null && n1.a() != null)
        {
            n1.a().a(new h(null, com.microsoft.advertising.android.a.d, b));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        n1;
        this;
        JVM INSTR monitorexit ;
        throw n1;
    }
}
