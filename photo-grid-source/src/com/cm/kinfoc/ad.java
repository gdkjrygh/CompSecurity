// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import com.cm.kinfoc.a.f;

// Referenced classes of package com.cm.kinfoc:
//            ae, z

final class ad
    implements Runnable
{

    final z a;
    private Boolean b;
    private final Object c = new Object();

    ad(z z)
    {
        a = z;
        super();
        b = Boolean.valueOf(false);
    }

    static Boolean a(ad ad1, Boolean boolean1)
    {
        ad1.b = boolean1;
        return boolean1;
    }

    public final void run()
    {
        synchronized (c)
        {
            if (!b.booleanValue())
            {
                f.a("Auto Post");
                b = Boolean.valueOf(true);
                (new ae(this)).start();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
