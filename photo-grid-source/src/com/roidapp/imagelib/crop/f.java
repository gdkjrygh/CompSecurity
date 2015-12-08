// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.os.Handler;

// Referenced classes of package com.roidapp.imagelib.crop:
//            g, a

final class f
    implements Runnable
{

    final a a;
    private Runnable b;
    private Handler c;

    public f(a a1, Runnable runnable, Handler handler)
    {
        a = a1;
        super();
        b = runnable;
        c = handler;
    }

    public final void run()
    {
        b.run();
        c.post(new g(this));
        return;
        Exception exception;
        exception;
        c.post(new g(this));
        throw exception;
    }
}
