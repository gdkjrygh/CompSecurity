// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import okio.q;

// Referenced classes of package com.squareup.okhttp.internal:
//            c, b

final class nit> extends c
{

    static final boolean a;
    final b b;

    protected final void a()
    {
        if (!a && !Thread.holdsLock(b))
        {
            throw new AssertionError();
        } else
        {
            com.squareup.okhttp.internal.b.g(b);
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/squareup/okhttp/internal/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    (b b1, q q)
    {
        b = b1;
        super(q);
    }
}
