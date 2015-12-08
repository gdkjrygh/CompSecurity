// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//            d

final class 
    implements Executor
{

    final Handler a;
    final d b;

    public final void execute(Runnable runnable)
    {
        a.post(runnable);
    }

    ecutor(d d1, Handler handler)
    {
        b = d1;
        a = handler;
        super();
    }
}
