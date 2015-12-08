// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.e.a;

// Referenced classes of package com.fitbit.util:
//            x

static final class it>
    implements ad.UncaughtExceptionHandler
{

    final ad.UncaughtExceptionHandler a;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        com.fitbit.e.a.f("FBExceptionLogger", String.format("FATAL EXCEPTION: %s", new Object[] {
            throwable
        }), throwable, new Object[0]);
        a.uncaughtException(thread, throwable);
    }

    Handler(ad.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        a = uncaughtexceptionhandler;
        super();
    }
}
