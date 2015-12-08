// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            ck, cs

static final class b
    implements Runnable
{

    final cs a;
    final Future b;

    public final void run()
    {
        if (a.isCancelled())
        {
            b.cancel(true);
        }
    }

    (cs cs1, Future future)
    {
        a = cs1;
        b = future;
        super();
    }
}
