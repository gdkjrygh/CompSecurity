// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.os.Handler;

// Referenced classes of package com.google.android.apps.unveil.env:
//            f, h

final class g
    implements Runnable
{

    final Handler a;
    final f b;

    g(f f1, Handler handler)
    {
        b = f1;
        a = handler;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (b)
            {
                if (!b.a)
                {
                    break label0;
                }
            }
            return;
        }
        Object obj = b.a();
        a.post(new h(this, obj));
        f1;
        JVM INSTR monitorexit ;
        return;
        exception;
        f1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
