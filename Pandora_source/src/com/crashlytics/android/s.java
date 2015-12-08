// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android:
//            bc

final class s
    implements Callable
{

    private bc a;

    s(bc bc1)
    {
        a = bc1;
        super();
    }

    public final Object call()
        throws Exception
    {
        if (!bc.a(a).get())
        {
            bc.b(a);
            bc.c(a);
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }
}
