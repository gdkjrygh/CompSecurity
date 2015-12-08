// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            n, o

static abstract class a
{

    private final o a;

    protected abstract void a();

    public final void a(n n1)
    {
        n.a(n1).lock();
        o o;
        o o1;
        o = n.b(n1);
        o1 = a;
        if (o != o1)
        {
            n.a(n1).unlock();
            return;
        }
        a();
        n.a(n1).unlock();
        return;
        Exception exception;
        exception;
        n.a(n1).unlock();
        throw exception;
    }

    protected (o o)
    {
        a = o;
    }
}
