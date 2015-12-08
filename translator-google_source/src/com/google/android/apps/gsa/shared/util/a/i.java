// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.a;

import com.google.android.apps.gsa.shared.util.common.L;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.apps.gsa.shared.util.a:
//            j

public final class i extends j
{

    final Future a;
    final long b = 2000L;

    public i(String s, Future future)
    {
        a = future;
        super(s, 1, 4);
    }

    public final void run()
    {
        if (a.cancel(true))
        {
            L.a(5, "NamedFutures", "Timeout future task has been cancelled: %d milliseconds", new Object[] {
                Long.valueOf(b)
            });
        }
    }
}
