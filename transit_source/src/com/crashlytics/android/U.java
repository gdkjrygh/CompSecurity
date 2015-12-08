// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android:
//            E

final class U
    implements Callable
{

    private E a;

    U(E e)
    {
        a = e;
        super();
    }

    public final Object call()
        throws Exception
    {
        if (!E.a(a).get())
        {
            E.b(a);
            E.c(a);
        }
        return null;
    }
}
