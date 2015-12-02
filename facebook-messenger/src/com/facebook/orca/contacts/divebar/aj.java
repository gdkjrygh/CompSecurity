// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            ad

class aj
    implements Callable
{

    final ad a;

    aj(ad ad1)
    {
        a = ad1;
        super();
    }

    public Void a()
    {
        synchronized (ad.c(a))
        {
            ad.a(a, false);
            ad.c(a).notifyAll();
        }
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object call()
    {
        return a();
    }
}
