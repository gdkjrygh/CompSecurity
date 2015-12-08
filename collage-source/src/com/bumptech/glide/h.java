// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.a.d;
import com.bumptech.glide.load.engine.a.f;
import com.bumptech.glide.load.engine.b.g;
import com.bumptech.glide.load.engine.b.i;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.executor.FifoPriorityThreadPoolExecutor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.bumptech.glide:
//            g

public class h
{

    private final Context a;
    private c b;
    private com.bumptech.glide.load.engine.a.c c;
    private com.bumptech.glide.load.engine.b.h d;
    private ExecutorService e;
    private ExecutorService f;
    private a g;
    private com.bumptech.glide.load.engine.b.a.a h;

    public h(Context context)
    {
        a = context.getApplicationContext();
    }

    com.bumptech.glide.g a()
    {
        if (e == null)
        {
            e = new FifoPriorityThreadPoolExecutor(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (f == null)
        {
            f = new FifoPriorityThreadPoolExecutor(1);
        }
        i j = new i(a);
        if (c == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                c = new f(j.b());
            } else
            {
                c = new d();
            }
        }
        if (d == null)
        {
            d = new g(j.a());
        }
        if (h == null)
        {
            h = new com.bumptech.glide.load.engine.b.f(a);
        }
        if (b == null)
        {
            b = new c(d, h, f, e);
        }
        if (g == null)
        {
            g = a.d;
        }
        return new com.bumptech.glide.g(b, d, c, a, g);
    }
}
