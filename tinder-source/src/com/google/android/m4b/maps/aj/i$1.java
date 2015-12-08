// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.m4b.maps.aj:
//            i, f

static final class b
    implements Runnable
{

    private BlockingQueue a;
    private f b;

    public final void run()
    {
        a.add(b);
    }

    (BlockingQueue blockingqueue, f f)
    {
        a = blockingqueue;
        b = f;
        super();
    }
}
