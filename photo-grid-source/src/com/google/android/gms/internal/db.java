// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            da, tj

final class db
    implements Runnable
{

    final tj a;
    final da b;

    db(da da1, tj tj)
    {
        b = da1;
        a = tj;
        super();
    }

    public final void run()
    {
        try
        {
            da.a(b).put(a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
