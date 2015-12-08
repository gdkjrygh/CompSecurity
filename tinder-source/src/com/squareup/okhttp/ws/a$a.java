// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.ws;

import com.squareup.okhttp.i;
import com.squareup.okhttp.internal.c.a;
import com.squareup.okhttp.internal.d;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Executor;
import okio.e;

// Referenced classes of package com.squareup.okhttp.ws:
//            a, b

private static final class f extends a
{

    private final i f;

    protected final void b()
        throws IOException
    {
        d.b.a(f, this);
    }

    or(i i, e e, okio.d d1, Random random, Executor executor, b b1, String s)
    {
        super(e, d1, random, executor, b1, s);
        f = i;
    }
}
