// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            o, p

static abstract class a
{

    private final p a;

    protected abstract void a();

    public final void a(o o1)
    {
        o.a(o1).lock();
        p p;
        p p1;
        p = o.b(o1);
        p1 = a;
        if (p != p1)
        {
            o.a(o1).unlock();
            return;
        }
        a();
        o.a(o1).unlock();
        return;
        Exception exception;
        exception;
        o.a(o1).unlock();
        throw exception;
    }

    protected (p p)
    {
        a = p;
    }
}
