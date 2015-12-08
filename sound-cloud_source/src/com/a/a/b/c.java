// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.app.Activity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.a.a.b:
//            a, b, d

final class c extends b.a.a.a.a.b
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void b(Activity activity)
    {
        activity = a;
        ((a) (activity)).b.set(true);
        if (((a) (activity)).a.get())
        {
            a.c.submit(new d(this));
        }
    }
}
