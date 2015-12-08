// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            bc

final class bf
    implements Callable
{

    private bc a;

    bf(bc bc1)
    {
        a = bc1;
        super();
    }

    public final Object call()
        throws Exception
    {
        if (!a.g())
        {
            bc.c(a);
        }
        return null;
    }
}
