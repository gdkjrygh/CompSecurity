// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            hk, hl

public class hi
    implements hk
{

    private final Object a;
    private final hl b = new hl();

    public hi(Object obj)
    {
        a = obj;
        b.a();
    }

    public void a(Runnable runnable)
    {
        b.a(runnable);
    }

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public Object get()
    {
        return a;
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return a;
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        return true;
    }
}
