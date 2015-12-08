// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.c;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.bumptech.glide.load.engine:
//            c, d, e

static class c
{

    private final ExecutorService a;
    private final ExecutorService b;
    private final e c;

    public d a(c c1, boolean flag)
    {
        return new d(c1, a, b, flag, c);
    }

    public e(ExecutorService executorservice, ExecutorService executorservice1, e e)
    {
        a = executorservice;
        b = executorservice1;
        c = e;
    }
}
