// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.b:
//            g

class h
    implements Executor
{

    final Handler a;
    final g b;

    h(g g, Handler handler)
    {
        b = g;
        a = handler;
        super();
    }

    public void execute(Runnable runnable)
    {
        a.post(runnable);
    }
}
