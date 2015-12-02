// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//            f

class 
    implements Executor
{

    final f a;
    private final Handler b;

    public void execute(Runnable runnable)
    {
        b.post(runnable);
    }

    ecutor(f f1, Handler handler)
    {
        a = f1;
        b = handler;
        super();
    }
}
