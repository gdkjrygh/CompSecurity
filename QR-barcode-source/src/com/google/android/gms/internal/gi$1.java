// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            gi

static final class wj
    implements Callable
{

    final Runnable wj;

    public Object call()
        throws Exception
    {
        return dj();
    }

    public Void dj()
    {
        wj.run();
        return null;
    }

    (Runnable runnable)
    {
        wj = runnable;
        super();
    }
}
