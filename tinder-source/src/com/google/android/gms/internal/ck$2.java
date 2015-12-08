// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            ck

static final class a
    implements Callable
{

    final Runnable a;

    public final Object call()
        throws Exception
    {
        a.run();
        return null;
    }

    (Runnable runnable)
    {
        a = runnable;
        super();
    }
}
