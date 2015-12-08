// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.io:
//            Closer, Closeables

static final class 
    implements 
{

    static final  INSTANCE = new <init>();

    public final void suppress(Closeable closeable, Throwable throwable, Throwable throwable1)
    {
        Closeables.logger.log(Level.WARNING, (new StringBuilder("Suppressing exception thrown when closing ")).append(closeable).toString(), throwable1);
    }


    ()
    {
    }
}
