// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.d;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.c.a.d:
//            f, e

static final class wable
    implements ct
{

    static final wable a = new <init>();

    public final void a(Closeable closeable, Throwable throwable, Throwable throwable1)
    {
        throwable = e.a;
        Level level = Level.WARNING;
        closeable = String.valueOf(String.valueOf(closeable));
        throwable.log(level, (new StringBuilder(closeable.length() + 42)).append("Suppressing exception thrown when closing ").append(closeable).toString(), throwable1);
    }


    wable()
    {
    }
}
