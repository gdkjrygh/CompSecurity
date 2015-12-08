// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;


// Referenced classes of package com.skype.android.concurrent:
//            AsyncResult

public class CompletedAsyncResult
    implements AsyncResult
{

    private Object a;
    private Throwable b;
    private Object c;

    public CompletedAsyncResult(Object obj, Object obj1)
    {
        a = obj;
        c = obj1;
    }

    public CompletedAsyncResult(Throwable throwable)
    {
        b = throwable;
        c = null;
    }

    public final Object a()
    {
        return a;
    }

    public final Object b()
    {
        return c;
    }

    public final Throwable c()
    {
        return b;
    }

    public final boolean d()
    {
        return false;
    }

    public final boolean e()
    {
        return b == null;
    }
}
