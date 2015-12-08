// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzhn

static final class zzzn
    implements Callable
{

    final Runnable zzzn;

    public final Object call()
    {
        return zzer();
    }

    public final Void zzer()
    {
        zzzn.run();
        return null;
    }

    (Runnable runnable)
    {
        zzzn = runnable;
        super();
    }
}
