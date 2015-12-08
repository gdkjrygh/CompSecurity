// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import com.bumptech.glide.load.c;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.bumptech.glide.load.b:
//            l, o

final class g
{

    private final ExecutorService a;
    private final ExecutorService b;
    private final o c;

    public g(ExecutorService executorservice, ExecutorService executorservice1, o o)
    {
        a = executorservice;
        b = executorservice1;
        c = o;
    }

    public final l a(c c1, boolean flag)
    {
        return new l(c1, a, b, flag, c);
    }
}
