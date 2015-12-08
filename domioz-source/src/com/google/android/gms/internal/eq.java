// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            a, ek

final class eq
    implements Callable
{

    final Callable a;

    eq(Callable callable)
    {
        a = callable;
        super();
    }

    public final Object call()
    {
        Object obj;
        try
        {
            Process.setThreadPriority(10);
            obj = a.call();
        }
        catch (Exception exception)
        {
            com.google.android.gms.internal.a.f().a(exception);
            throw exception;
        }
        return obj;
    }
}
