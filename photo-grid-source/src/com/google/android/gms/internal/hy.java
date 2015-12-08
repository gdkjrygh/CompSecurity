// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal:
//            hx

final class hy
    implements Executor
{

    final Handler a;
    final hx b;

    hy(hx hx, Handler handler)
    {
        b = hx;
        a = handler;
        super();
    }

    public final void execute(Runnable runnable)
    {
        a.post(runnable);
    }
}
