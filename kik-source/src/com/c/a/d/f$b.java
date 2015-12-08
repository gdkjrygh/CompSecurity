// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.d;

import java.io.Closeable;
import java.lang.reflect.Method;

// Referenced classes of package com.c.a.d:
//            f

static final class wable
    implements ct
{

    static final wable a = new <init>();
    static final Method b = b();

    static boolean a()
    {
        return b != null;
    }

    private static Method b()
    {
        Method method;
        try
        {
            method = java/lang/Throwable.getMethod("addSuppressed", new Class[] {
                java/lang/Throwable
            });
        }
        catch (Throwable throwable)
        {
            return null;
        }
        return method;
    }

    public final void a(Closeable closeable, Throwable throwable, Throwable throwable1)
    {
        if (throwable == throwable1)
        {
            return;
        }
        try
        {
            b.invoke(throwable, new Object[] {
                throwable1
            });
            return;
        }
        catch (Throwable throwable2)
        {
            a.a(closeable, throwable, throwable1);
        }
    }


    wable()
    {
    }
}
