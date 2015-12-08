// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            gh

static final class wy
    implements Callable
{

    final Runnable wy;

    public Object call()
        throws Exception
    {
        return ds();
    }

    public Void ds()
    {
        wy.run();
        return null;
    }

    (Runnable runnable)
    {
        wy = runnable;
        super();
    }
}
