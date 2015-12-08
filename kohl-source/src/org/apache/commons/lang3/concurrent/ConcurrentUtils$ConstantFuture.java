// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// Referenced classes of package org.apache.commons.lang3.concurrent:
//            ConcurrentUtils

static final class value
    implements Future
{

    private final Object value;

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public Object get()
    {
        return value;
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return value;
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        return true;
    }

    (Object obj)
    {
        value = obj;
    }
}
