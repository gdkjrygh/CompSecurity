// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal:
//            bb

final class a
    implements Executor
{

    final Handler a;
    final bb b;

    public final void execute(Runnable runnable)
    {
        a.post(runnable);
    }

    (bb bb1, Handler handler)
    {
        b = bb1;
        a = handler;
        super();
    }
}
