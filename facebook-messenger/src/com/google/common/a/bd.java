// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.a:
//            dd, cm

final class bd
    implements dd
{

    final Throwable a;

    bd(Throwable throwable)
    {
        a = throwable;
    }

    public cm a()
    {
        return null;
    }

    public dd a(ReferenceQueue referencequeue, cm cm)
    {
        return this;
    }

    public void a(dd dd1)
    {
    }

    public boolean b()
    {
        return false;
    }

    public Object c()
    {
        throw new ExecutionException(a);
    }

    public Object get()
    {
        return null;
    }
}
