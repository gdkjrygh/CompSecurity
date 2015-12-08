// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            rf

final class py
    implements Runnable
{

    final rf a;
    final Future b;

    py(rf rf1, Future future)
    {
        a = rf1;
        b = future;
        super();
    }

    public final void run()
    {
        if (a.isCancelled())
        {
            b.cancel(true);
        }
    }
}
