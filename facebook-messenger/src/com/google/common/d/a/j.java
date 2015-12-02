// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.d.a:
//            ac, ad

final class j
    implements ac
{

    final Future a;

    public boolean cancel(boolean flag)
    {
        return a.cancel(flag);
    }

    public Object get()
    {
        return ad.a(a);
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return ad.a(a, l, timeunit);
    }

    public boolean isCancelled()
    {
        return a.isCancelled();
    }

    public boolean isDone()
    {
        return a.isDone();
    }
}
