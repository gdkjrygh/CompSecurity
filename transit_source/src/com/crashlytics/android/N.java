// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            aB, E

final class N
    implements Callable
{

    private Callable a;

    N(E e, Callable callable)
    {
        a = callable;
        super();
    }

    public final Object call()
        throws Exception
    {
        Object obj;
        try
        {
            obj = a.call();
        }
        catch (Exception exception)
        {
            aB.a("Failed to execute task.", exception);
            return null;
        }
        return obj;
    }
}
